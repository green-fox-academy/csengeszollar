import java.util.*;

public class Wallet {
    public static void main(String[] args) {


//    Írj egy functiont, ami kap egy HashMapet, ami azt mutatja,
//    hogy milyen értékű pénzből mennyi van a pénztárcádban,
//    és egy számot, hogy mennyi pénzt kell fizetned.
//    Ezek alapján a function kiszámolja, hogy hogyan tudod a legkevesebb darab pénzzel kifizetni az összeget,
//    majd visszaad a használandó pénzekkel egy új HashMapet. Ha nincs elég pénzed vagy nem tudsz pontosan adni,
//    üres HashMapet ad vissza.
//    Pl:
//    a pénztárcád: { 20000: 1, 10000: 1, 5000: 1, 2000: 3, 1000: 2, 500: 0, 200: 0, 100: 3, 50: 2, 20: 3, 10: 0, 5: 1 }
//    a fizetendő összeg: 33250
//    az eredmény: { 20000: 1, 10000: 1, 2000: 1, 1000: 1, 100: 2, 50: 1 }
//    ha ugyanezzel a pénztárcával pl 50000 a fizetendő összeg, akkor a válasz: {} (edited)

        HashMap<Integer, Integer> money = new HashMap<>();
        money.put(20000, 1);
        money.put(10000, 1);
        money.put(5000, 1);
        money.put(2000, 3);
        money.put(1000, 2);
        money.put(500, 0);
        money.put(200, 0);
        money.put(100, 3);
        money.put(50, 2);
        money.put(20, 3);
        money.put(10, 0);
        money.put(5, 1);

        int amount = 33250;

        System.out.println(wallet(money, amount));

    }

    public static HashMap wallet(HashMap<Integer, Integer> money, int amount) {
        List<Integer> denominationKeys = new ArrayList<>();
        int sumOfMyMoney = 0;

        for (Map.Entry<Integer, Integer> denomination : money.entrySet()) {
            sumOfMyMoney += denomination.getKey() * denomination.getValue();
            denominationKeys.add(denomination.getKey());
        }
        if (sumOfMyMoney < amount) {
            return new HashMap();
        }
        Collections.sort(denominationKeys, Collections.reverseOrder()); //sorting denominations in descending order

        HashMap<Integer, Integer> paying = new HashMap<>();
        for (int i = 0; i < denominationKeys.size(); i++) {
            Integer denomination = denominationKeys.get(i);
            while (amount - denomination >= 0 && money.get(denomination) > 0) {
                amount -= denomination;
                if (paying.containsKey(denomination)) {
                    paying.replace(denomination, paying.get(denomination) + 1);
                } else {
                    paying.put(denomination, 1);
                }
                money.replace(denomination, money.get(denomination) - 1);
            }
        }
        if (amount > 0) {
            return new HashMap();
        } else return paying;

    }
}


import java.util.ArrayList;

public class PersonalFinance {
    public static void main(String[] args) {


         ArrayList<Integer> moneyList = new ArrayList<>();
        moneyList.add(500);
        moneyList.add(1000);
        moneyList.add(1250);
        moneyList.add(175);
        moneyList.add(800);
        moneyList.add(120);


        int sum = 0;
        for (int i = 0; i < moneyList.size(); i++) {
            sum += moneyList.get(i);
        }
        System.out.println("We spent all together: " + sum);

        int greatestNumber = 0;
        for (int i = 0; i < moneyList.size(); i++) {
            if (moneyList.get(i) > greatestNumber) {
                greatestNumber = moneyList.get(i);
            }
        }
        System.out.println("Our greatest expense was: " + greatestNumber);

        int smallestNumber = greatestNumber;
        for (int i = 0; i < moneyList.size(); i++) {
            if (moneyList.get(i) < smallestNumber) {
                smallestNumber = moneyList.get(i);
            }
        }
        System.out.println("Our cheapest spending was: " + smallestNumber);

        System.out.println("The average of our spendings is: " + sum / moneyList.size());


    }
}

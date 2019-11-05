import java.util.ArrayList;

public class ListIntroduction {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<>();

        System.out.println(nameList.size());

        nameList.add("William");
        if (nameList.isEmpty()) {
            System.out.println("Name list is empty");
        } else System.out.println("Name list isn't empty");

        nameList.add("John");
        nameList.add("Amanda");

        System.out.println(nameList.size());

        System.out.println(nameList.get(2));

        for(int i=0;i<nameList.size();i++){
            System.out.println(nameList.get(i));
        }
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(i+1 + ". " + nameList.get(i));
        }
        nameList.remove(1);

        for (int i = nameList.size(); i > 0; i--) {
            System.out.println(nameList.get(i-1));
        }

        nameList.clear();
        System.out.println(nameList.size());

    }
}

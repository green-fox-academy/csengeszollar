import java.util.ArrayList;

public class Sum {
    public int sum(ArrayList<Integer> numbers) throws ListDoesNotExistException {
        if (numbers == null) {
            throw new ListDoesNotExistException();
        } else if (numbers.isEmpty()) {
            System.out.println("The list is empty");
            return 0;
        } else {
            int sum = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) == null) {
                    System.out.println("There is a 'null' element in the list");
                } else
                    sum += numbers.get(i);

            } return sum;

        }
    }
}


//vagy:
//public class Sum {
//
//    public int adder (ArrayList <Integer> list) {
//        int sum = 0;
//        for (Integer number: list) {
//            sum += number;
//        }
//        return sum;
//    }
//}

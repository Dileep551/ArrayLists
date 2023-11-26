import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "Bananas", "milk", "eggs"};

        List<String> list = List.of(items);

        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);

        groceries.add("yogurt");

        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
               List.of("Pickles", "Mustard", "Cheese"));

        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = "+groceries.get(2));

        if(groceries.contains("milks")){

            System.out.println("List has milk");

        }

    }
}

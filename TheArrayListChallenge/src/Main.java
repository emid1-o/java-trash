import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> groceries = new ArrayList<>();


        boolean flag = true;
        while (flag) {
            printActions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceries);
                case 2 -> removeItems(groceries);
                case 3 -> isInList(groceries);
                default -> flag = false;
        }
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);


            }

        }


    private static void printActions(){

        String textBlock = """
                Available actions:
                
                0 - to shutdown
                
                1 - to add item(s) to list (comma delimited list)
                
                2 - to remove any items (comma delimited list)
                
                3 - Check if element is in the list (comma delimited list)
                
                Enter a number for which action you want to do:""";
        System.out.print(textBlock + " ");
    }

    private static void removeItems(ArrayList<String> groceries){
        System.out.print("Type items to remove separated by comma: ");
        String toRemove = scanner.nextLine().trim();


        for(String element: toRemove.split(",")){
            groceries.remove(element);
        }

        System.out.println(groceries);
    }

    private static void addItems (ArrayList<String> groceries){


        System.out.print("Add items separated by comma: ");
        String toAdd = scanner.nextLine().trim();


        for (String element: toAdd.split(",")){
            if (groceries.contains(element)){
                System.out.println(element + " already in list.");
            } else {
                groceries.add(element);
            }
        }
        System.out.println(groceries);
    }

    public static void isInList(ArrayList<String> groceries){

        System.out.print("Type what items you wanna check if is in the list: ");
        String inList = scanner.nextLine().trim();

        for (String element: inList.split(",")){
            if (groceries.contains(element)){
                System.out.println(element + " is in the list!");
            } else {
                System.out.println(element + " is not on the list");
            }
        }
    }
}



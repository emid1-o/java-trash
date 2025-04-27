import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] myarray = readIntegers();
        System.out.println(Arrays.toString(myarray));
        System.out.println(findMin(myarray));

    }

    public static int[] readIntegers(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numbers separated by commas: ");
        String myArray = scanner.nextLine();


        String[] newArray = myArray.split(",");

        int[] actualArray = new int[newArray.length];

        for(int i =0; i < newArray.length; i++){
            int number = Integer.parseInt(newArray[i]);
            actualArray[i] = number;

        }

        return actualArray;

    }

    public static int findMin(int[] array){

        int minimum = array[0];

        for(int i:array){

            if(i < minimum){
                minimum = i;
            }
        }


        return  minimum;
    }



}

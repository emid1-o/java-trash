package dev.lpa;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {



        int[] arrayOne = getRandomArray(10);
        Arrays.sort(arrayOne);
        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(sortedArray(arrayOne)));




        }

        public static int[] getRandomArray(int len) {

        Random random = new Random();

        int[] randomArray = new int[len];

        for (int i = 0; i < randomArray.length; i++){
            randomArray[i] = random.nextInt(100);
        }

        return randomArray;
        }

        public static int[] sortedArray(int[] array){

        int[] newArray =new int[array.length];

        for (int i = 1; i < array.length + 1; i++){
            newArray[i - 1] = array[array.length - i];
        }

        return newArray;
        }


    }


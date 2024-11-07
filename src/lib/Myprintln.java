package lib;

import java.util.ArrayList;

public class Myprintln {
    public static void println(String Message){
        System.out.println(Message);
    }

    public static void println(int Message){
        System.out.println(Message);
    }

    public static void println(ArrayList<String> Message){
        System.out.println(Message);
    }

    public static void println(int[][] matrix){
        for (int[] ints : matrix) {
            System.out.print("\n");
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
        println("\n");
    }

    public static void println(int[] array){
        for (int anInt : array) {
            System.out.print(anInt + " ");
        }
    }
}

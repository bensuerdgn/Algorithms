package ınsertionsort_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class InsertionSort_1{

    public static void main(String[] args) throws IOException {
        int n = 10;
        int[] arr = new int[n];
        FileWriter fw = null;
        PrintWriter pw = null;
        Random rm = new Random();

        try {
            fw = new FileWriter("dosya.txt");
            pw = new PrintWriter(fw);
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rm.nextInt(10) + 1;
                System.out.print(arr[i] + " ");

                pw.print(arr[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        fw.close();
        pw.close();

        System.out.println("");
        insertionsort(arr);

    }

    private static void insertionsort(int[] arr) throws IOException {
        FileWriter fw2 = null;
        PrintWriter pw2 = null;
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        fw2 = new FileWriter("dosya2.txt");
        pw2 = new PrintWriter(fw2);
        for (int i = 0; i < arr.length; i++) {
            pw2.print(arr[i]);

        }
        fw2.close();
        pw2.close();
    }
}
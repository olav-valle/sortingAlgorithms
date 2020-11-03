package no.ntnu.valle;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int max = 100000000;
        int exp = 1;
        int n = 10;
        Random rng = new Random();
        while (n < max){
            int[] A = new int[n];
            for (int i = 0; i < n - 1; i++) {
                A[i] = rng.nextInt(n);
            }
            Long t1, t2;
            t1 = System.currentTimeMillis();
            InsertionSort.insertionSort(A);
            t2 = System.currentTimeMillis();
            System.out.println("Sorted " + n + " integers in " + (t2 - t1) + " milliseconds");
            exp++;
            n = (int) Math.pow(10, exp);

        }


    }
}

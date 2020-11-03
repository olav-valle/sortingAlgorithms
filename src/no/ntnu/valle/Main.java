package no.ntnu.valle;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int max = (int) Math.pow(10, 9);
        if (args.length != 0) {
            String arg = args[0];
            max = Integer.parseInt(arg);
        }
        int exp = 1;
        int n = 2;
        Random rng = new Random();
        while (n < max){
            Integer[] A = new Integer[n];
            for (int i = 0; i < n; i++) {
                A[i]=  rng.nextInt(n);
            }
            Long t1, t2, t3, t4;

            t3 = System.nanoTime();
            BucketSort.bucketSort(A);
            t4 = System.nanoTime();

            double bucketTime = (t4-t3)/1000000000.00;
            System.out.println("Bucket sorted "+ n + " integers in " + (t4-t3) + " nanoseconds. " + bucketTime + "seconds.");

//            t1 = System.nanoTime();
//            InsertionSort.insertionSort(A);
//            t2 = System.nanoTime();
//            double insertTime = (t2-t1)/1000000000000.00;
//            System.out.println("Insertion sorted same " + n + " integers in " + (t2 - t1) + " nanoseconds." + insertTime + "seconds.\n");

            exp++;
            n = (int) Math.pow(2, exp);

        }
    }

    private static boolean assertSorted(ArrayList<Integer> sorted)
    {
        int k = 0;
        boolean correct = true;
        while (correct && k < sorted.size()-1 ){
            if (sorted.get(k) > sorted.get(k+1)){
                correct = false;
                System.out.println("ERROR: " + sorted.get(k) + " > " + sorted.get(k+1));
            }
            k++;
        }
        return false;
    }
}

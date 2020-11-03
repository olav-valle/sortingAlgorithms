package no.ntnu.valle;

import java.util.ArrayList;
import java.util.List;

public class BucketSort {
    public static void bucketSort(Integer[] A)
    {
        int n = A.length;
        int bucketDivider = 100;
        int numBuckets = 1+(n/bucketDivider);
        List<List<Integer>> B = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++)
        {
            B.add(new ArrayList<>());
        }
        // sort input sequence into buckets
        // index of bucket is A[i]/bucketDivider, rounded down by casting to Integer
        for (int i = 0; i < n ; i++)
        {
            int aI = A[i];
            int bucketIdx = (Integer) (aI/bucketDivider);
            B.get(bucketIdx).add(aI);
        }

        // Send each bucket to get insertion sorted
        List<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < numBuckets; i++)
        {
            Integer[] bucket = B.get(i).toArray(new Integer[B.get(i).size()]);
            Integer[] sortedBucket = InsertionSort.insertionSort(bucket);
            for (int j = 0; j < sortedBucket.length; j++)
            {
                sorted.add(sortedBucket[j]);
            }
        }
        int k = 0;
        boolean correct = true;
        while (correct && k < sorted.size()-1 ){
            if (sorted.get(k) > sorted.get(k+1)){
                correct = false;
                System.out.println("ERROR: " + sorted.get(k) + " > " + sorted.get(k+1));
            }
            k++;
        }


//        sorted.forEach(System.out::println);
    }
}

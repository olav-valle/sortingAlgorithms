package no.ntnu.valle;

public class BucketSort {
    public static void bucketSort(int[] A)
    {
        int n = A.length;
        int bucketDivider = 10000;
        int numBuckets = n/bucketDivider;
        int[][] B = new int[numBuckets][n/2];
        //Let's start with n/2 sized buckets. Should be overkill since even distribution
        // should give not more than n/bucketDivider in each bucket...

        for (int i = 0; i < n-1 ; i++)
        {
            int bucketIdx = (int) (A[i]/bucketDivider);
            B[bucketIdx]
        }
    }
}

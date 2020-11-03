package no.ntnu.valle;

public class InsertionSort {

    public static Integer[] insertionSort(Integer[] A)
    {
        int n = A.length;
        for (int i = 1; i < n; i++)
        {
            int m = A[i]; //value to insert
            int idx = i; //index of value that preceded m
            while (idx > 0 && A[idx-1] > m) //while idx >= 0 and value to "left" of m is greater than m
            {
                A[idx] = A[idx-1];
                idx--;
            }
            //System.out.println(m);
            A[idx] = m;
        }
//        for (int i = 0; i < n-1; i++)
//        {
//            System.out.println(A[i]);
//        }
    return A;
    }

}

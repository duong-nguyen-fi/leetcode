

import java.util.Arrays;
import java.util.HashSet;

public class MissingInteger {
    int smallestInt(int[] A)
    {
        int smallest = 1;
        Arrays.sort(A);
        if (A[A.length-1] <= 0)
            return  1;
        HashSet set = new HashSet();
        for(int i=0; i<A.length; i++) {
            set.add(A[i]);
        }
        while (set.contains(smallest))
            smallest++;


        return smallest;
    }

    public boolean contains(final int[] array, final int key) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, key) >= 0;
    }

//    public static void main(String[] args) {
//            MissingInteger missingInteger = new MissingInteger();
//            int[] A = {1, 5,4, 7, 10, 2, 3};
//            System.out.println(missingInteger.smallestInt(A));
//    }

    int solution(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }

}

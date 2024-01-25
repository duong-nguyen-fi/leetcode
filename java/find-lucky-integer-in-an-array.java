/*
https://leetcode.com/problems/find-lucky-integer-in-an-array/submissions/1156386530/

Runtime 3 ms Beats 71.44% of users with Java
Memory 43.81 MB Beats 6.14% of users with Java
*/

// Solution 1: (Faster)
class Solution {
    public int findLucky(int[] arr) {
        int[] cntArr = new int[501];
        Arrays.sort(arr);
        for (int i=arr.length-1; i>=0; i--){
            int num = arr[i];
            cntArr[num]++;
            //System.out.println("i="+i+", key= "+num+", value= "+ cntArr[num]);
            if ( num == cntArr[num] )
                if ((i > 0 && arr[i-1] != num) || i==0)
                    return num;
        } 
        return -1;
    }
}

// Solution 2: (Easier to understand) frequency with map
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : arr){
            map.put(num, 1+ map.getOrDefault(num,0));
            System.out.println("key= "+num+", value= "+ map.get(num));

        }
        int res = -1;
        for (int num : map.keySet()){
            if (num == map.getOrDefault(num,-1))
                res = num;
        }
        return res;
    }
}

// Solution 3: Frequency with array
class Solution {
    public int findLucky(int[] arr) {
        int[] cntArr = new int[501];
        for (int num : arr){
            cntArr[num]++;
            System.out.println("key= "+num+", value= "+ cntArr[num]);

        }
        int res = -1;
        for (int i=1; i< cntArr.length; i++){
            if ( i == cntArr[i])
                res = i;
        }
        return res;
    }
}

/*
https://leetcode.com/problems/jewels-and-stones/description/

0 ms Beats 100.00% of users with Java
41.52 MB Beats 48.70% of users with Java
*/

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // ASCII https://en.wikipedia.org/wiki/ASCII#Printable_characters
        // 122 - 57 = 57 -> 58
        int[] arr = new int[58];

        int sum = 0;
        for (char c : stones.toCharArray()){
            arr[c - 'A']++;
        }

        for (char c:jewels.toCharArray()){
            sum+=arr[c - 'A'];
        }
        return sum;
    }
}

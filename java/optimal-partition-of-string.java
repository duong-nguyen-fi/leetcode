/*

https://leetcode.com/problems/optimal-partition-of-string/description/
50 ms    Beats 12.56% of users with Java
45.40 MB Beats 34.35% of users with Java
*/

class Solution {
    public int partitionString(String s) {
        int count=0;
        // left to right
        int i=0;
        while (i <= s.length()-1){
            String sub = "";
            for (int j=i+1; j<=s.length(); j++){
                String tmp = s.substring(i,j);
                if (validSubstring(tmp)){
                    sub = tmp;
                    continue;
                }
                else
                    break;               
            } // for j

            count++;
            i =i+sub.length();
        
        } // for i

        return count;
    }

    public boolean validSubstring(String s){
        int[] arr = new int[100];
        for (char c : s.toCharArray()){
            if (++arr[c-'a'] > 1)
                return false;
        }

        return true;
    }
}

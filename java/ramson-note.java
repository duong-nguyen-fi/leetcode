/*
Easy
https://leetcode.com/problems/ransom-note/
10ms Beats 57.94% of users with Java
Beats 20.43% of users with Java

*/
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> rans = countCharInString(ransomNote), mag = countCharInString(magazine);

        for (Character c : rans.keySet()){
            if (rans.get(c) > mag.getOrDefault(c,0))
                 return false;
        }
        return true;

    }

    private Map<Character, Integer> countCharInString(String s){
        Map<Character, Integer> res = new HashMap();
        for (Character c : s.toCharArray()){
            res.put(c, 1+ res.getOrDefault(c,0));
            //System.out.println("key= "+c+", value= "+ res.get(c));
        }
        return res;
    }
}

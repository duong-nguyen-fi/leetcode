https://www.hackerrank.com/challenges/palindrome-index


public static int palindromeIndex(String s) {

   int index;
   StringBuilder stringToCheck = new StringBuilder(s);
  
   for(index=0; index< s.length(); index++){
     if (s.charAt(index) != s.charAt(s.length()-index-1))
     {
       stringToCheck = new StringBuilder(s).deleteCharAt(index);
       if (isPalindrome(stringToCheck.toString()))
       {
         return index;
       }
       else
         return s.length()-index-1;
     }
   }
   return -1;
}
public static boolean isPalindrome(String s){

 StringBuilder reverseS2 = new StringBuilder(s.toString()).reverse();
 return reverseS2.toString().equals(s);
}

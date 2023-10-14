//Hackkerrank - Super Digit
// https://www.hackerrank.com/challenges/super-digit/problem
// Medium

//Recursive
    public static int superDigit(String n, int k) {
    // Write your code here
        
        
        long sum = sumOfAllNum(n)*k;

        if(sum%10 !=sum){
            return superDigit(sum+"", 1);
        }
        System.out.println("Will return: "+sum );
        return (int)sum;
    }
    
    private static int strToInt(String k){
        return Integer.parseInt(k);
    }
    
    private static long sumOfAllNum(String str){
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (char c : charArr) {
            sum += strToInt(c+"");
        }
        return sum;
    }

/*
16 ms Beats 56.23% of users with Java
40.52 MB Beats 59.54% of users with Java
*/
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int max=1;
        for (int num=lowLimit; num<=highLimit; num++){        
            max = Math.max(++arr[getBoxNum2(num)], max);
        }
        return max;
    }

    public int getBoxNum2(int num){
        int res=0;
        while (num > 0){
            res += num % 10;
            num = num/10;
        }
        return res;
    }
}

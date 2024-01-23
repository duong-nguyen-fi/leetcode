/*
Solution with Map (since I am studying Map topic)
31 ms Beats 34.35% of users with Java
44.25 MB Beats 21.63% of users with Java
*/

class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap(46);
        int max=1;
        for (int num=lowLimit; num<=highLimit; num++){
            int box = getBoxNum2(num);
            int value = map.getOrDefault(box,0);
            if ( ++value > max)
                max = value;
            map.put(box, value);
        }


        return max;
    }

    public int getBoxNum(int num){
        int res = 0;
        for (char numChar : (""+num).toCharArray()){
            res += Character.getNumericValue(numChar);
        }
        return res;
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

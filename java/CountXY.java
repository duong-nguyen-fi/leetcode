public class CountXY {
    // you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");


        public int solution(String S) {
            // Implement your solution here
            int ans=0;
            for (int i=1; i<S.length();i++)
            {
                //subStringA
                String subA = S.substring(0,i);
                //subStringB
                String subB = S.substring(i);
                //number of x in subA
                int countXSubA = count(subA,'x');
                //number of x i suba
                int countXSubB = count(subB,'x');
                //number of y in subA
                int countYSubA = count(subA,'y');
                //number of y in subA
                int countYSubB = count(subB,'y');

//System.out.println("ax="+countXSubA+"ay="+countYSubA);
//System.out.println("bx="+countXSubB+"by="+countYSubB);
                if (countXSubA == countYSubA || countXSubB == countYSubB || countXSubA + countYSubA ==0 || countXSubB + countYSubB ==0)
                    ans++;
            }
            return ans;
        }

//        public static void main(String[] args) {
//            String str = "ayxbx";
//            CountXY countXY = new CountXY();
//            System.out.println("count="+countXY.count(str,'y'));
//    }

        int count(String str, char charToCount){
            int count = 0;

            while(str.indexOf(charToCount) != -1){
                System.out.println(str);
                count++;
                str = str.substring(str.indexOf(charToCount)+1, str.length());

            }
            return count;
        }
}

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Flashlight {
    public int solution(String direction, int radius, int[] X, int[] Y) {
        // Implement your solution here
        int ans=0;
        HashSet<Integer> indexes;
        List<Integer> listX = IntStream.of(X)    // returns IntStream
                .boxed()
                .collect(Collectors.toList());
        List<Integer> listY = IntStream.of(Y)    // returns IntStream
                .boxed()
                .collect(Collectors.toList());

        switch (direction) {

            // Case 1
            case "U":
                indexes=indexesOfWrongDirection(Y,"less");
                break;
            case "D":
                indexes=indexesOfWrongDirection(Y,"greater");
                break;
            case "L":
                indexes=indexesOfWrongDirection(X,"greater");
                break;
            default:
                indexes=indexesOfWrongDirection(X,"less");
                break;
        }

        //remove indexes from x,y

        for (int i=0; i<X.length;i++){
            int distance = getDistance(0,0,X[i],Y[i]);
            System.out.println("Distance: "+X[i]+":"+Y[i]+"= "+distance);
            if (distance > (radius*radius))
                indexes.add(i);
        }

        List<Integer> indexesList = new ArrayList<Integer>(indexes);
        Collections.sort(indexesList);
        System.out.println("Indexes"+ indexesList);

        for(int i=indexes.size()-1; i>=0 ; i--){
            int index = indexesList.get(i);
            System.out.println("Index to be remove:"+ index);

            listX.remove(index);
            listY.remove(index);
        }
        System.out.println(listX);

        return listX.size();
    }

    int getDistance(int x1, int y1, int x2, int y2){
        return ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2));
    }

    public static void main(String[] args) {
// R,3 [-2,3] [0,1]
        //CountXY countXY = new CountXY();
        //System.out.println("count="+countXY.count(str,'y'));
        //D,10, {0,-3,2,0} {-10,-3,-7,-5}
        Flashlight flashlight = new Flashlight();
        //int[] X = {-2,3};
        //int[] Y = {0,1};

        //System.out.println(flashlight.solution("R",3, X, Y ));

//        int[] X= {0,-3,2,0};
//        int[] Y = {-10,-3,-7,-5};
//        System.out.println(flashlight.solution("D",10, X, Y ));

        int[] X= {-1,-2,4,1,3,0};
        int[] Y = {5,4,3,3,1,-1};
        System.out.println(flashlight.solution("U",5, X, Y ));
    }

    HashSet<Integer> indexesOfWrongDirection(int[] nums, String operator){
        HashSet<Integer> list = new HashSet<>();
        for(int i=0;i<nums.length;i++) {
            if (operator.equals("greater") && nums[i] > 0) {
                list.add(i);
            }
            if (operator.equals("less") && nums[i] < 0) {
                list.add(i);
            }
            System.out.println(operator+"i="+i+"-nums[i]="+nums[i]);
        }
        return list;
    }
}

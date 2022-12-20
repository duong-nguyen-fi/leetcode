import java.util.Arrays;
import java.util.List;

public class BinaryGap {
    public int solution(int N) {
        // Implement your solution here
        String binaryStr = Integer.toBinaryString(N);
        int max = 1;

        List<String> chunks = (List<String>) Arrays.asList(binaryStr.split("1"));
        if (chunks.size() <=2)
            return 0;
        for (String chunk : chunks){
            int count = countZerosInChunk(chunk);
            if ( count > max)
                max = count;
        }
        return max;

    }

    int countZerosInChunk(String chunk){
        int index=0;
        if (chunk.length() == 0)
            return 0;
        //System.out.println("chunk:"+ chunk);
        while (chunk.charAt(index)=='0' && index < chunk.length()-1){
            index++;
        }
        //System.out.println("chunk:"+ chunk + ",index="+index);
        return index+1;
    }
}

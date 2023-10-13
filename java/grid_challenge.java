https://www.hackerrank.com/challenges/grid-challenge/problem

public static String gridChallenge(List<String> grid) {
    // Write your code here
        List<String> sortedGrid = new ArrayList<>();
        for (int i=0; i<grid.size(); i++){
            String row = grid.get(i);
            String sortedRow = rearrangeString(row);
            sortedGrid.add(sortedRow);
            if (i>0){
                for (int j=0; j<row.length();j++){
                    if (sortedGrid.get(i).charAt(j)<sortedGrid.get(i-1).charAt(j))
                        return "NO";
                }
            }
        }
        
        return "YES";
    }
    
    private static String rearrangeString(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return new String(charArr);
    }

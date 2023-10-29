//https://www.hackerrank.com/challenges/truck-tour
// 100%


    public static int truckTour(List<List<Integer>> petrolpumps) {
    // Write your code here
        int petrolLeft = 0;
        int size = petrolpumps.size();
        int minPos = 0;
        for (int index =0; index < size;index++){
            int petrolPump = petrolpumps.get(index).get(0);
            int distanceToNext = petrolpumps.get(index).get(1);
            //System.out.println("petrolLeft: "+ petrolLeft +", petrolPump: "+petrolPump+", distanceNext: "+distanceToNext);
            //System.out.println("Passed: "+passed + ", Index: "+index);
            petrolLeft+=petrolPump-distanceToNext;
            if (petrolLeft<0){
                minPos = index+1;
                petrolLeft=0;
                continue;
            }
        }
        return minPos;
    }

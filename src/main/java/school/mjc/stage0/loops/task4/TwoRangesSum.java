package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
                int theoreticalSum = 0;
        int realSum = 0;
        if(numberToSkip>lastInRow){
            System.out.println("number to skip is bugger then the last");
        }
        else if(lastInRow<0){
            System.out.println("last number in row is negative");
        }
        else{
            for(int i=numberToSkip+1; i<lastInRow+1 ;i++){
                realSum+=i;
            }
            for (int i =0; i<numberToSkip+1;i++){
                theoreticalSum+=i;
            }
            System.out.println("skipped sum is "+theoreticalSum+"\ncounted sum is "+realSum);
        }

    }
}

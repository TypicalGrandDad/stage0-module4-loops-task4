package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {
       for(int i = 1; i+1<lastPrinted;i++){
            if (i%3==0){}
            else if(i<=0){}
            else {
                System.out.println(i);
            }
        }
    }
}

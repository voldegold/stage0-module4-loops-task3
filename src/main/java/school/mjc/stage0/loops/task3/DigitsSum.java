package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        int sum = 0;
        for (; Math.abs(t) / 10 > 0;t=Math.abs(t)/10) {

            sum+=(Math.abs(t) % 10);

        }
        sum+=Math.abs(t);

        System.out.println(sum);
    }
}

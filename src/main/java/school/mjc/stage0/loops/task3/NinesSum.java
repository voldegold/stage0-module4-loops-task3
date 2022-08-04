package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int max = 0;
        int sum = 0;
        if (lengthOfLastNumber > 0) {
            // loop for max value
            for (int i = 0; i < lengthOfLastNumber; i++) {
                max += 9*Math.pow(10,i);
                sum += max;

            }
            System.out.println(sum);
        }
        else System.out.println(sum);

    }
}

package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int n_2 = 0;
        int n_1 = 1;
        int n;
        if (lastFibonacci >= 2) {
            System.out.println(n_2);
            System.out.println(n_1);
            for (int i = 3; i <= lastFibonacci; i++) {
                n = n_2 + n_1;
                System.out.println(n);
                n_2 = n_1;
                n_1 = n;



            }
        }
        else for (int i = 0; i < lastFibonacci; i++) {
            System.out.println(i);

        }
    }
}

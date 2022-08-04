package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int result;
        if (first == 0) {
            System.out.println(second);
        }
        else if (second == 0) {
            System.out.println(first);
        }
        else if (first >= second) {
            if (first % second == 0) {
                System.out.println(second);
            } else {
                for (; first % second != 0; ) {
                    result = first % second;
                    second = first;
                    first = result;
                }
                System.out.println(second);
            }

        } else {
            if (second % first == 0) {
                System.out.println(first);
            } else {
                for (; second % first != 0; ) {
                    result = second % first;
                    first = second;
                    second = result;
                }
                System.out.println(first);
            }
        }
    }
}

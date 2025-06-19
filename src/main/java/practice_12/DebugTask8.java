package practice_12;

import org.decimal4j.util.DoubleRounder;

public class DebugTask8 {
    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;

        a = DoubleRounder.round(a, 1);

        if (a == b) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}


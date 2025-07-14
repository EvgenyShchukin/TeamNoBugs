package demo_mock;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOfThreeNumberDigit(123));
        System.out.println(sumOfThreeNumberDigit(-123));

        System.out.println("-------------------------------------");

        System.out.println(Arrays.deepToString(getMatrix(100)));

        System.out.println("-------------------------------------");

        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);

        System.out.println("Сумма: " + Fraction.addFraction(f1, f2));
    }



    static int sumOfThreeNumberDigit(int num) {
        int sum = 0;
        num = Math.abs(num);

        while (num > 0) {
            sum = sum + (num % 10);
            num = num / 10;
        }

        System.out.println("-------------------------------");
        return sum;
    }

    static int[][] getMatrix(int N) {
        if (N < 9) {
            throw new IllegalArgumentException("Некорректный входной параметр");
        }
        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        Random random = new Random();
        while (integers.size() < 9) {
            int number = random.nextInt(1, N);
            integers.add(number);
        }

        LinkedList<Integer> list = new LinkedList<>(integers);
        int[][] array = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = list.getFirst();
                list.removeFirst();
            }
        }

        return array;
    }

}

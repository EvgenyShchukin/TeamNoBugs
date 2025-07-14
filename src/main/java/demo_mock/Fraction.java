package demo_mock;

import java.util.Objects;

public class Fraction {
    int numerator;
    int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static Fraction addFraction(Fraction f1, Fraction f2) {
        int a = f1.numerator;
        int b = f1.denominator;
        int c = f2.numerator;
        int d = f2.denominator;

        int newNumerator = a * d + c * b;
        int newDenominator = b * d;

        return new Fraction(newNumerator, newDenominator);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}



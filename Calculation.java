package calculation.main;

import calculation.logic.CalculationLogic;

public class Calculation {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int total = CalculationLogic.tasu(a, b);
        int delta = CalculationLogic.hiku(a, b);
        System.out.println("足す: " + total + ", 引く: " + delta);
    }
}

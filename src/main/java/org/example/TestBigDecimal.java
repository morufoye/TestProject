package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class TestBigDecimal {

    public static void main(String[] args) {
        BigDecimal netPay = BigDecimal.valueOf(230595);
        BigDecimal currentNetPay = BigDecimal.valueOf(22.09);
        BigDecimal totalNumber = BigDecimal.valueOf(22);

        for(int i = 1; i < 1000000000; i++){
            double num = Math.random();
            double num2 = Math.random();
          BigDecimal res = roundToTwoDecimalPlaces(BigDecimal.valueOf(num2).add(BigDecimal.valueOf(num)).divide(BigDecimal.valueOf(i), 2, RoundingMode.HALF_UP));
            System.out.println(res);
        }
    }

    public static BigDecimal roundToTwoDecimalPlaces(BigDecimal input){
        return input.setScale(2, RoundingMode.CEILING);
    }
}

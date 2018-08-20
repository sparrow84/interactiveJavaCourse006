package com.company;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Logic {

    private static double x;
    private static double y;
    private static double res;
    private static String sign = "";
    private static boolean first = true;
//    Scanner scanner = new Scanner();

    private static StringBuffer stringBuffer = new StringBuffer();

    public static void getExpresoinPart(String sumbol) {


        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(sumbol);

        if (first) {
            if (m.matches()) {
                stringBuffer.append(sumbol);
            } else {
                first = false;
                x = Double.parseDouble(stringBuffer.toString());
                stringBuffer.setLength(0);
                sign = sumbol;
//                if (sumbol.equals("x²")) {
//                if (sumbol.equals("xⁿ")) {
//                    calc();
//                    System.out.println("Result = " + res + "   x = " + x + "   y = " + y);
//                }
            }
        } else {
            if (m.matches()) {
                stringBuffer.append(sumbol);
            } else if (sumbol.equals("=")) {
                y = Double.parseDouble(stringBuffer.toString());
                calc();
                System.out.println("Result = " + res + "   x = " + x + "   y = " + y);
            }
        }
    }


    public static void calc() {
        switch (sign) {
            case "+":
                res = x + y;
                break;
            case "-":
                res = x - y;
                break;
            case "*":
                res = x * y;
                break;
            case "/":
                res = x / y;
                break;
            case "xⁿ":
                res = Math.pow(x,y);
                break;
            default:
                System.err.println("Не тот знак: " + sign);
        }

    }

    public static void resetAll() {
        x = 0;
        y = 0;
        sign = "";
        res = 0;
        first = true;
        stringBuffer.setLength(0);
    }

    public static double getX() {
        return x;
    }

    public static void setX(double x) {
        Logic.x = x;
    }

    public static double getY() {
        return y;
    }

    public static void setY(double y) {
        Logic.y = y;
    }

    public static String getSign() {
        return sign;
    }

    public static void setSign(String sign) {
        Logic.sign = sign;
    }

    public static double getRes() {
        return res;
    }

    public static String getStringBufer() {
        return stringBuffer.toString();
    }
}

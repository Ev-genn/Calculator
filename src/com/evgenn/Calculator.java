package com.evgenn;

import java.util.Scanner;

public class Calculator {
    public static int a;
    public static int b;
    public static int znak;
    public  static double result;
    public static boolean romcalc;
    static {
        result = 0;
        romcalc = false;
    }



    public static void main(String[] args) {
        System.out.println("Числа римские I, V, X");
        Scanner con = new Scanner(System.in);
        String str = con.nextLine();
        char[] arr = str.toCharArray(); // перевод строки в код
        try {
        if (arr[0] >= 49 && arr[0] <= 57) Number.arabNumber(arr); // арабский калькулятор
        else if (arr[0] == 73 || arr[0] == 86 || arr[0] == 88) Number.romeNumber(arr); // римский калькулятор
        else {
            throw new Exception ("Числа должны быть от 1 до 10");
        }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
            System.exit(-1);
        }
        try {
            if (a > 0 && b > 0 && znak > 0) {         // должны быть 2 числа и знак
                getCalculate();
                if (romcalc) {
                    String res = Change.romResulte();
                    System.out.println(res);
                    return;
                }
                if (result % 1 == 0) System.out.println((int) result);
                else System.out.println(result);
            } else {
                throw new Exception ("Не корректный ввод");
            }
        }
        catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.exit(0);
        }
    }

    public static void getCalculate(){
        if(znak == 1) result = a*b;
        if(znak == 2) result = a+b;
        if(znak == 3) result = a-b;
        if(znak == 4) result = 1.0*a/b;
    }
}

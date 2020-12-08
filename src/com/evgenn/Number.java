package com.evgenn;

import java.util.Arrays;

public class Number extends Calculator{
    public static void main(String[] args) {

    }
    public static void arabNumber(char[] arr) {
        if(!Check.failOper(arr,1)) {
            System.out.println("Не допустимое выражение");
            System.exit(0);
        }
        int[] num = new int[2];
        int n = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 49 && arr[i] <= 57) {
                    if (i + 1 < arr.length) {
                        if (arr[i + 1] == 48 || arr[i + 1] == 42 || arr[i + 1] == 43 || arr[i + 1] == 45 || arr[i + 1] == 47) {
                            if (arr[i + 1] == 48) {
                                if (arr[i] == 49) { // проверка на число 10
                                    num[n] = 10;
                                    i++;
                                    continue;
                                } else {
                                    System.out.println("число больше 10");
                                    System.exit(-1);
                                }
                            }
                        }
                            else {
                                System.out.println("неправильная запись");
                                System.exit(-1);

                        }

                    }
                    num[n] = Character.getNumericValue(arr[i]);
                }
                if (arr[i] == 42 || arr[i] == 43 || arr[i] == 45 || arr[i] == 47) {
                    char symbol = arr[i];
                    switch (symbol) {
                        case (42):
                            znak = 1; // умножение
                            break;
                        case (43):
                            znak = 2; // сложение
                            break;
                        case (45):
                            znak = 3; // вычитание
                            break;
                        case (47):
                            znak = 4; // деление
                            break;
                    }
                    n++;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("неправильное выражение");
            System.exit(0);
        }
        a = num[0];
        b = num[1];
        if (a == 0 || b == 0) {
            System.out.println("неправильное выражение");
            System.exit(0);
        }
        }



    public static void romeNumber(char[] arr) {
        if(!Check.failOper(arr,2)) {
            System.out.println("Не допустимое выражение");
            System.exit(0); ;
        }
        int[][] num = new int[2][4];
        int n = 0, m = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 73 || arr[i] == 86 || arr[i] == 88) {
                    switch (arr[i]) {
                        case (73):
                            num[n][m] = 73;
                            m++;
                            break;
                        case (86):
                            num[n][m] = 86;
                            m++;
                            break;
                        case (88):
                            num[n][m] = 88;
                            m++;
                            break;

                    }
                }
                if (arr[i] == 42 || arr[i] == 43 || arr[i] == 45 || arr[i] == 47) {
                    switch (arr[i]) {
                        case (42):
                            znak = 1; // умножение
                            break;
                        case (43):
                            znak = 2; // сложение
                            break;
                        case (45):
                            znak = 3; // вычитание
                            break;
                        case (47):
                            znak = 4; // деление
                            break;
                    }
                    n++;
                    m = 0;
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("неправильное выражение");
            System.exit(0);
        }
        int[] firstNum= Arrays.copyOf(num[0],4);
        a = Change.arabChange(firstNum);
        int[] secNum = Arrays.copyOf(num[1],4);
        b = Change.arabChange(secNum);
        romcalc = true;
    }
}

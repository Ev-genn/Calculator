package com.evgenn;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Change {
    public static void main(String[] args) {

    }

    public static int arabChange (int[] arr){

        int [][] rNum = {{73,0,0,0},{73,73,0,0},{73,73,73,0},{73,86,0,0},{86,0,0,0},{86,73,0,0},{86,73,73,0},{86,73,73,73},{73,88,0,0},{88,0,0,0}};
        for(int i =0; i<rNum.length;i++){
            int[] arr1 = Arrays.copyOf(rNum[i],4);
            if (Arrays.equals(arr1,arr)) return (i+1);
        }
        return (-1);
    }
    public static String romResulte() {
        double result = Calculator.result;
        String str = "", str1 = " ";
        int n = 0;
        double rem = 0;
        boolean romRem = false;
        if (result % 1 != 0) {
            n = (int)Math.floor(result);
            rem = result%1; //записываем остаток от деления
            rem = Math.floor(rem/0.083);//извлекаем кол-во унций
            romRem = true;
            while (rem != 0){
                if (rem >=6){
                    rem -= 6;
                    str1 += "S";
                }
                if (rem>0){
                    rem -=1;
                    str1 += ".";
                }
            }
        }
        else n = (int) result;
        if (n<0) {
            str += "-";
            n = -n;
        }
        if (n == 0) {
            if (romRem) return  (str1);
            else return (str = "O");
        }
        for (;n!=0;) {
            if (n >= 50) {
                str += "L";
                n -= 50;
            }
            if (n >= 40 && n < 49) {
                str += "XL";
                n -= 40;
            }
            if (n >= 10 && n < 40) {
                str += "X";
                n -= 10;
            }
            if (n == 9) {
                str += "IX";
                n -= 9;
            }
            if (n >= 5 && n<9) {
                str += "V";
                n -= 5;
            }
            if (n == 4) {
                str += "IV";
                n -= 4;
            }
            if (n>=1 && n< 4){
                str += "I";
                n -=1;
            }
        }
        if (romRem) {
            str += str1;
            System.out.println("результат деления в римском исчислении округляется до унций");
            System.out.println("('S' - 6/12(или 0.5), '.' - 1/12");
        }
        return (str);
    }
}

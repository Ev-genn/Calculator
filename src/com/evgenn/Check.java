package com.evgenn;


public class Check {


    public static void main(String[] args) {

    }
    public static boolean failOper(char[] arr, int n){

        if (n==1) {
            for (int i = 0; i < arr.length; i++) {
                int coin = 0;
                for (SymbolArabEnum sym : SymbolArabEnum.values())
                {
                    if (arr[i] == sym.getCharCode()) coin = 1;
                }
                if (coin!=1) return (false);
            }
        }
        if(n==2){
            for (int i = 0; i < arr.length; i++) {
                int coin = 0;
                for (SymbolRomEnam sym : SymbolRomEnam.values())
                {
                    if (arr[i] == sym.getCharCode()) coin = 1;

                }
                if (coin!=1) return (false);
            }
        }
        return (true);
    }

}

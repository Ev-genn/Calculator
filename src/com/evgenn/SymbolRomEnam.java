package com.evgenn;

public enum SymbolRomEnam {
    ONE(73), FIVE(86), TEN(88), ADD(43), SUB(45),
    MULT(42), DIV(47);

     private int charCode;
    SymbolRomEnam(int charCode) {
        this.charCode = charCode;
    }

    public int getCharCode() {
        return charCode;
    }
}

package com.evgenn;

public enum SymbolArabEnum {
    ZERO(48) ,ONE(49),TWO(50), THREE(51), FOUR(52), FIVE(53),
    SIX(54), SEVEN(55), EIGHT(56),NINE(57),
    ADD(43), SUB(45), MULT(42), DIV(47);
    private int charCode;
    SymbolArabEnum(int charCode) {
        this.charCode = charCode;

    }

    public int getCharCode() {
        return charCode;
    }
}


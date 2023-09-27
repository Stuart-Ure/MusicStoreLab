package com.codebase;

public enum TypeOfInstrument {
    GUITAR("Guitar"),
    KEYBOARD("Keyboard");

    private final String type;
    TypeOfInstrument(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

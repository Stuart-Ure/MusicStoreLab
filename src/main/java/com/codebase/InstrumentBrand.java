package com.codebase;

public enum InstrumentBrand {
    YAMAHA("Yamaha"),
    FENDER("Fender"),
    GIBSON("Gibson"),
    ROLAND("Roland"),
    KING("King");

    private final String brand;

    public String getBrand() {
        return brand;
    }

    InstrumentBrand(String brand){
        this.brand = brand;
    }


}

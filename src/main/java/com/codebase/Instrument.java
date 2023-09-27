package com.codebase;

import java.lang.reflect.Type;

public class Instrument {
    InstrumentBrand brand;
    TypeOfInstrument type;
    double price;

    public Instrument(InstrumentBrand brand, TypeOfInstrument type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand.getBrand();
    }

    public String toString() {
        return "Instrument Type: " + type.toString();
    }

    public String getType(){
        return type.getType();
    }

}

package com.codebase;

import java.util.ArrayList;

public class Shop {
    private String name;
    ArrayList<Instrument> instruments;

    public Shop(String name) {
        this.name = name;
        this.instruments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Instrument> getInstruments() {
        return instruments;
    }

    public void addInstrument(Instrument instrument){
        this.instruments.add(instrument);

    }
}

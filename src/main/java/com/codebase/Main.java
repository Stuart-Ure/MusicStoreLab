package com.codebase;

import com.codebase.InstrumentBrand;
import com.codebase.Shop;
import com.codebase.TypeOfInstrument;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Instrument instrument1 = new Instrument(InstrumentBrand.YAMAHA, TypeOfInstrument.KEYBOARD, 350.00);
        Instrument instrument2 = new Instrument(InstrumentBrand.GIBSON, TypeOfInstrument.GUITAR, 500.00);
        Instrument instrument3 = new Instrument(InstrumentBrand.KING, TypeOfInstrument.GUITAR, 300.00);
        Instrument instrument4 = new Instrument(InstrumentBrand.ROLAND, TypeOfInstrument.GUITAR, 600.00);
        Instrument instrument5 = new Instrument(InstrumentBrand.FENDER, TypeOfInstrument.GUITAR, 700.00);
        Shop shop = new Shop("JamminWithJason");
        shop.addInstrument(instrument1);
        shop.addInstrument(instrument2);
        shop.addInstrument(instrument3);
        shop.addInstrument(instrument4);
        shop.addInstrument(instrument5);

        List<Instrument> instruments = shop.getInstruments();

        Scanner search = new Scanner(System.in);
        boolean orderPlaced = false;

        if (!instruments.isEmpty()) {
            while (!orderPlaced) {
                System.out.println("What Instrument are you looking for?");
                String searchInstrument = search.nextLine();
                if (searchInstrument.isEmpty()) {
                    System.out.println("Sorry, you must enter an Instrument");
                } else {
                    List<Instrument> matchingInstruments = new ArrayList<>();
                    for (Instrument instrument : instruments) {
                        if (instrument.getType().toString().equalsIgnoreCase(searchInstrument)) {
                            matchingInstruments.add(instrument);
                        }
                    }

                    if (!matchingInstruments.isEmpty()) {
                        System.out.println("Matching Instruments:");
                        for (int i = 0; i < matchingInstruments.size(); i++) {
                            System.out.println(i + 1 + ". " + matchingInstruments.get(i) + " | Brand: "
                                    + matchingInstruments.get(i).getBrand() + " | Price: "
                                    + matchingInstruments.get(i).getPrice());
                        }

                        System.out.println("Enter the number of the instrument you want to purchase:");
                        int selection = search.nextInt();

                        if (selection >= 1 && selection <= matchingInstruments.size()) {
                            Instrument selectedInstrument = matchingInstruments.get(selection - 1);
                            System.out.println("You have selected: " + selectedInstrument);
                            instruments.remove(selectedInstrument);
                            System.out.println("Instrument bought, cheers. Thank you for shopping at JamminWithJason :).");
                            orderPlaced = true;
                        } else {
                            System.out.println("Invalid selection. Please try again.");
                        }
                    } else {
                        System.out.println("Instrument not found. Please try again.");
                    }
                }
            }
        }
    }
}
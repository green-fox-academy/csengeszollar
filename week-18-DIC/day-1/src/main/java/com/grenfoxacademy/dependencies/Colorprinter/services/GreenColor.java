package com.grenfoxacademy.dependencies.Colorprinter.services;
import org.springframework.beans.factory.annotation.Autowired;

public class GreenColor implements MyColor {

    private Printer printer;

    @Autowired
    public GreenColor(Printer printer){
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("This is green in color...");
    }
}

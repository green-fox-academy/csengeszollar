package com.grenfoxacademy.dependencies.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

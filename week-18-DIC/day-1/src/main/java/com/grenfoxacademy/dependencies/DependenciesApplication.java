package com.grenfoxacademy.dependencies;

import com.grenfoxacademy.dependencies.Colorprinter.services.MyColor;
import com.grenfoxacademy.dependencies.Colorprinter.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependenciesApplication implements CommandLineRunner {

    private Printer printer;
    private MyColor color;

    @Autowired
    DependenciesApplication(Printer printer, MyColor color) {
        this.printer = printer;
        this.color = color;
    }

    public static void main(String[] args) {
        SpringApplication.run(DependenciesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        printer.log("hello");
        color.printColor();
    }
}

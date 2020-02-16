package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public AccountController() {
        bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    }

    @GetMapping("/show")
    public String showAccounts(Model model) {
        model.addAttribute("account", bankAccounts.get(0));
        return "index";
    }

    @GetMapping("/u-text")
    public String showUText(Model model) {
        model.addAttribute("code1", "<em>HTML</em>");
        model.addAttribute("code2", "<b>Enjoy yourself!</b>");
        return "HTMLception";
    }


}

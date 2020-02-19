package com.greenfox.bankofsimba.controllers;

import com.greenfox.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    public AccountController() {
        bankAccounts.add(new BankAccount("Simba", 2000, "lion", true, true));
        bankAccounts.add(new BankAccount("Pumbaa", 200, "warthog", false, true));
        bankAccounts.add(new BankAccount("Scar", 1600, "lion", true, false));
        bankAccounts.add(new BankAccount("Azizi", 1150, "hyena", false, false));
        bankAccounts.add(new BankAccount("Nala", 1700, "lion", false, true));
        bankAccounts.add(new BankAccount("Rafiki", 600, "mandrill", false, true));
    }

    @GetMapping("/show")
    public String showAccount(Model model) {
        model.addAttribute("account", bankAccounts.get(0));
        return "index";
    }

    @GetMapping("/u-text")
    public String showUText(Model model) {
        model.addAttribute("code1", "<em>HTML</em>");
        model.addAttribute("code2", "<b>Enjoy yourself!</b>");
        return "HTMLception";
    }

    @GetMapping("/show-all")
    public String showAccounts(Model model) {
        model.addAttribute("bankAccounts", bankAccounts);
        return "table";
    }


    @PostMapping("account-raise")
    public String raiseBalance(String nameSelected) {

        for (int i = 0; i < bankAccounts.size(); i++) {
            if (bankAccounts.get(i).getName().equals(nameSelected)) {
                if (bankAccounts.get(i).isKing()) {
                    bankAccounts.get(i).setBalance(bankAccounts.get(i).getBalance() + 100);
                } else {
                    bankAccounts.get(i).setBalance(bankAccounts.get(i).getBalance() + 10);
                }
            }
        }
        return "redirect:/show-all";
    }

    @GetMapping("/add-account")
    public String addAccount() {
        return "addAccount";
    }

    @PostMapping("/add-account")
    public String submitAccount(@ModelAttribute BankAccount account) {
        bankAccounts.add(account);
        return "redirect:/show-all";
    }
}


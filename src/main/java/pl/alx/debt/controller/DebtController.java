package pl.alx.debt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DebtController {

    @GetMapping("/debts")
    public String debtPage() {
        return "debt-list";

    }
}

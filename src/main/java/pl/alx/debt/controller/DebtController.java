package pl.alx.debt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.alx.debt.dao.DebtDao;
import pl.alx.debt.model.Debt;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DebtController {

    @Autowired
    private DebtDao debtDao;

    @GetMapping("/debts")
    public String debtPage(Model model) {

        List<Debt> debts = debtDao.findAll();

        model.addAttribute("debts", debts);                        // model dodaje  liste debtow z bazy danych -aby dodac do strony jsp

        return "debt-list";

    }
}

package pl.alx.debt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.alx.debt.dao.DebtorDao;
import pl.alx.debt.dao.UserDao;
import pl.alx.debt.model.Debtor;
import pl.alx.debt.model.User;

@Controller
public class DebtorController {

    @Autowired
    private DebtorDao debtorDao;

    @PostMapping("/debtor/create")
    public String createDebtor(@ModelAttribute DebtorForm debtorForm){

        //stworzyc obiekt Debtor  ( z informacji w DebtorForm)

        Debtor debtor = new Debtor(

            debtorForm.getFirstName(),
            debtorForm.getLastName(),
            debtorForm.getEmail()

        );


        //zapisac debtor do bazy

        debtorDao.save(debtor);


        return"redirect:/debts/create";
    }
}

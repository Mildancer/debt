package pl.alx.debt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.alx.debt.model.Debt;
import pl.alx.debt.model.User;

import java.util.List;

public interface DebtDao extends JpaRepository <Debt, Integer> {

    // spring data jpa-JpaRepository - zapytania do bazy danych bez pisania zapytan do bazy danych

List<Debt> findByLender(User lender);
}

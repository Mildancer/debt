package pl.alx.debt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.alx.debt.model.Debt;

public interface DebtDao extends JpaRepository <Debt, Integer> {

    // spring data jpa-JpaRepository - zapytania do bazy danych bez pisania zapytan do bazy danych


}

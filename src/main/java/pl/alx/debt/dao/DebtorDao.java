package pl.alx.debt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.alx.debt.model.Debtor;

public interface DebtorDao extends JpaRepository<Debtor, Integer> {                //rozmawia z baza danych i komunikuje sie z tabela debtor


}

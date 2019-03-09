package pl.alx.debt.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity                                 //mowi, ze ta klada ma tabele w bazie danych

public class Repayment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //baza danych decyduje o tym kto ma decydowac o dodaniu  danych do bazy  danych-w naszym przypadku jest to baza danych
    private Integer id;                 //zdefiniowanie primary key

    private LocalDateTime createdAt;

    private  BigDecimal   installment; //rata

    @ManyToOne
    @JoinColumn (name = "debt_id")
    private Debt debt;








}

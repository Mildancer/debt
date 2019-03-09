package pl.alx.debt.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter                     //adnotacja z Lomboka by gettery settery zrobic
@NoArgsConstructor
public class Debt {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //baza danych decyduje o tym kto ma decydowac o dodaniu  danych do bazy  danych-w naszym przypadku jest to baza danych
    private Integer id;                 //zdefiniowanie primary key


    private LocalDateTime createdAt;

    private BigDecimal amount;

    private boolean paidOff;            //

    @ManyToOne      //1 lender moze miec wiele pozyczek
    @JoinColumn (name = "lender_id")
    private User lender;

    @ManyToOne      //1 lender moze miec wiele pozyczek
    @JoinColumn (name="debtor_id") //odnosi sie do tabeli debtor i jest to id-polaczenie sie miedyz 2 tabelami
    private Debtor debtor;



}

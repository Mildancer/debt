package pl.alx.debt.model;


import javax.persistence.*;

@Entity                                 //mowi, ze ta klada ma tabele w bazie danych
//domyslna nazwa tabelki Debtor
// imie, nazwisko, id, email
public class Debtor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //baza danych decyduje o tym kto ma decydowac o dodaniu  danych do bazy  danych-w naszym przypadku jest to baza danych
    private Integer id;                 //zdefiniowanie primary key

    @Column(length = 45, unique = true, nullable = false)
    private String firstName;

    @Column(length = 45, unique = true, nullable = false)  // nullable-mowi, czy moze wiers pozostal pusty-niewypelniony
    private String lastName;

    @Column(length = 45, unique = true, nullable = true)                 //nullable = true       //
    private String email;



}

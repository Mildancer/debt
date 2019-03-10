package pl.alx.debt.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity                                 //mowi, ze ta klada ma tabele w bazie danych
@Table(name="user")                     //podaje tabele jakiej beda dane sie  zapisywac
@Getter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //baza danych decyduje o tym kto ma decydowac o dodaniu  danych do bazy  danych-w naszym przypadku jest to baza danych
    private Integer id;                 //zdefiniowanie primary key

    @Column(length = 45, unique = true, nullable = false)                       //
    private String email;

    private String password;

    @Column(length = 45, unique = false, nullable = false)
    private String firstName;

    @Column(length = 45, unique = false, nullable = false)
    private String lastName;

    public User (int id){
        this.id = id;
    }

    public User(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

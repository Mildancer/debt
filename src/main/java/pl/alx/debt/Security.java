package pl.alx.debt;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import pl.alx.debt.service.UserService;

@Configuration
@EnableWebSecurity
public class Security extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserService userService;

    @Bean //spring tym zarzadza
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10); // encoder hasla od 34do
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder()); //uzytkownik jest uwierzytelniony
    }

        @Override
        protected void configure(HttpSecurity http) throws Exception{
                 http.authorizeRequests()
                    .mvcMatchers("/register").permitAll()
                         .mvcMatchers("/users").hasRole("ADMIN") // tylko ADMIN moze wejsc na ta strone
                         .anyRequest().authenticated()
                    .and()
                    .formLogin()
                         .permitAll()
                        .loginPage("/login")//wyswietlona strona
                        .loginProcessingUrl("/login-process")//gdzie maja sie wyslac dane logowania, czy sprawdzic poprawny-action w formularzu login
                        .usernameParameter("email")
                        .passwordParameter("password")
                    .and()
                    .logout()
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                    .and()
                    .csrf().disable(); // wylaczenie zabezpieczenia
        }

    }


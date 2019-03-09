INSERT INTO user(id, email, first_name, last_name)
 VALUES (1, 't@email.com', 'Wojciech', 'Musial');

INSERT INTO debtor(id, email, first_name, last_name)
 VALUES (1, 'zuzanna@email.com', 'Zuzanna', 'Kowalska');

 INSERT INTO debtor(id, email, first_name, last_name)
 VALUES (2, 'zbychu@email.com', 'Zbychu', 'Kowalski');

INSERT INTO debt(amount, created_at, paid_off, debtor_id, lender_id) VALUES
(199.99, '2019-03-08', 0, 1, 1);
package Amigoscode;

import java.time.LocalDate;

public class MainClass {
    public static void main(String[] args) {
        Passport ukPassport = new Passport("86101", "England", LocalDate.of(2025,1,20));

        Passport usPassport = new Passport("10510", "USA", LocalDate.of(2022,12,25));
    }

    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}

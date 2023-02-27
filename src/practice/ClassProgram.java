package practice;

import java.time.LocalDate;

public class ClassProgram {
    public static void main(String[] args) {
        // Local Date Class

            // Constructor to get current year
        LocalDate date = LocalDate.now();
        System.out.println("Today's Year: " + date.getYear()); // getYear returns the parsed year from the date

        LocalDate covid = date.withYear(2020);
        System.out.println("Covid' Year: " + covid.getYear());

        if(date.isAfter(covid)){
            System.out.println("You made it past Covid!");
        } else {
            System.out.println("Not out of covid yet, hang in there :)");
        }
    }
}

package Exercices.recapitulare;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Employee employee1 = new Employee("Violeta", "violetaFrumusickaTha@gmail.com", 2500, LocalDate.of(2014, 2, 14));
        Employee employee2 = new Employee("Larisa", "larisa.larisuca@yahoo.com", 3000, LocalDate.of(2018,8,22));
        Employee employee3 = new Employee("Radu", "rradu@gmail.com", 2000,LocalDate.of(2016,3,5));

        Company consultingSrl = new Company(new Employee[]{employee1, employee2, employee3});
        consultingSrl.printAllEmployes();
        consultingSrl.printAllOldEmployes(5);




    }
}

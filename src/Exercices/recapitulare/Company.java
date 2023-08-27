package Exercices.recapitulare;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees){
        this.employees=employees;
    }

    public void printAllEmployes(){
        for(int i=0; i<employees.length; i++){
            System.out.println(employees[i]);
        }
    }
    public void printAllOldEmployes(int years){
        int count = 0;
        for(Employee employee : employees){
            if(Period.between(employee.gethireDate(), LocalDate.now()).getYears() >= years ){
                count++;
            }
        }
        System.out.println("Numarul de angajati cu o vechime mai mare de " + years+ " ani este " + count);
    }

}

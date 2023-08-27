package Exercices.recapitulare;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Employee {
    private String name;
    private String email;
    private int salary;
    private LocalDate hireDate;

    ///////////////////////////////////////

    public Employee(String name, String email, int salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
        if (isEmailValid(email)) {
            this.email = email;
        }else{
            System.out.println("Email invalid");
        }
    }
    private boolean isEmailValid(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void setNume(String name) {
        this.name = name;
    }

    public void setHireData(LocalDate hireData) {
        this.hireDate = hireData;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //////////////////////////////////////////////////////


    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public LocalDate gethireDate() {
        return hireDate;
    }

    public String getEmail() {
        return email;
    }

    //////////////////////////////////////


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                '}';
    }

}

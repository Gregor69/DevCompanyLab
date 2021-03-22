package management;

import staff.Employee;

public class Director extends Manager {

    private double budget;

    public Director(String name, String NI_No, int salary, String deptName, double budget){
        super(name, NI_No, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return this.getSalary() * 0.02;
    }
}

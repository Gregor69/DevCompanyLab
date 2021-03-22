package staff;

public abstract class Employee {

    private String name;
    private String NI_No;
    private int salary;

    public Employee(String name, String NI_No, int salary){
        this.name = name;
        this.NI_No = NI_No;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNI_No() {
        return NI_No;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        if(raise >= 0) {
            this.salary += raise;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }


}

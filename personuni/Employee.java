package personuni;

public class Employee extends Person {

    private final double salary;
    private static final String CURRENCY = "EUR";

    public Employee(String name, String mail, double salary) {
        super(name, mail);
        this.salary = salary;
       
    }

    public double getSalary() {
        return salary;

    }

    public String toString (){
        return super.toString()+ "," + salary + CURRENCY;
    }

}

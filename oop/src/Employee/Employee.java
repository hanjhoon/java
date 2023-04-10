package Employee;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;
    public Employee(int ID, String firstName, String lastName, int salary) {
        this.id = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName() {
        return this.firstName + " " + this.lastName;
    }
    public int getAnnualSalary() {
        return this.salary * 12;
    }
    public int raiseSalary(int percent) {
//        if (percent < 0) {
//            return 0;
//        }
        this.salary += (salary * percent / 100);
            return this.salary;
    }
    @Override
    public String toString() {
        return "Employee[id=" + id +
                ", firstName=" + firstName +
                ", lastName=" + lastName +
                ", salary=" + salary +
                ']';
    }
}

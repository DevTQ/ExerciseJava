public class Employee implements EmployeeInterface {
    private String name;
    private double salary_rate;

    public Employee() {
    }

    public Employee(String name, double salary_rate){
        this.name = name;
        this.salary_rate = salary_rate;
    }

    public void printInfor() {
        System.out.println("name "+ name);
        System.out.println("salary "+ getSalary());
    }

    public double getSalary() {
        return salary_rate * basic_salary;
    }



}
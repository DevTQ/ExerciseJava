public class Manager extends Employee  {
    private String name;
    private String department;
    public Manager() {
        super();
    }

    public Manager(String name, String department, double salary_rate) {
        super(name, salary_rate);
        this.name = name;
        this.department = department;
    }

    public void printInfor() {
        System.out.println("name "+ name);
        System.out.println("department "+ department);
    }



}
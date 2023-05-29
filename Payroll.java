import java.util.Scanner;

public class Payroll extends Exception {
    private String Name;
    private int numberID;
    private double hourlyPayRate;
    private double numberOfHoursWorked;

    public Payroll() {
       
    }

    public Payroll(String Name, int numberID) {
        this.Name = Name;
        this.numberID = numberID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getNumberID() {
        return numberID;
    }

    public void setNumberID(int numberID) {
        this.numberID = numberID;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public double grossPay() {
        return numberOfHoursWorked * hourlyPayRate;
    }

    public static boolean isValidName(String name) throws NullPointerException {
        if(name == "") {
            throw new NullPointerException("isValid Name");
        }
        else {
            return true;
        }
    }

    public static boolean isValidHourlyPayRate(double luongTheoGio) throws IllegalArgumentException {
        if(luongTheoGio < 0 || luongTheoGio > 25) {
            throw new IllegalArgumentException("isValid HourlyPayRate");
        }
        else {
            return true;
        }
    }

    public static boolean isValidNumberOfHoursWorked(double soGio) throws IllegalArgumentException {
        if(soGio < 0 || soGio > 84) {
            throw new IllegalArgumentException("isValid numberOfHoursWorked");
        }
        else {
            return true;
        }
    }

    public static boolean isValidNumberId(int id) throws IllegalArgumentException {
        if(id == 0 || id < 0) {
            throw new IllegalArgumentException("isValid id");
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Payroll pr = new Payroll();
        System.out.print("Enter the Name : ");
        pr.Name = sc.nextLine();
        try {
            if(isValidName(pr.Name)) {
                System.out.println("Name : " + pr.Name);
            }
        }catch(NullPointerException e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.print("Enter the numberID : ");
        pr.numberID = sc.nextInt();
        try {
            if(isValidNumberId(pr.numberID)) {
                System.out.println("numberID : " + pr.numberID);
            }
        }catch(IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.print("Enter the hourlyPayRate : ");
        pr.hourlyPayRate = sc.nextDouble();
        try {
            if(isValidHourlyPayRate(pr.hourlyPayRate)) {
                System.out.println("hourlyPayRate : " + pr.hourlyPayRate);
            }
        }catch(IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }
        System.out.print("Enter the numberOfHoursWorked : ");
        pr.numberOfHoursWorked = sc.nextDouble();
        try {
            if(isValidNumberOfHoursWorked(pr.numberOfHoursWorked)) {
                System.out.println("numberOfHoursWorked : " + pr.numberOfHoursWorked);
            }
        }catch(IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
        }
        if(isValidName(pr.getName()) && isValidNumberId(pr.getNumberID()) && isValidHourlyPayRate(pr.getHourlyPayRate()) && isValidNumberOfHoursWorked(pr.getNumberOfHoursWorked())) {
            System.out.println("amount of gross pay earned : " + pr.grossPay());
        }
        else {
            System.out.println("Error all invalid");
        }
        sc.close();
    }

}
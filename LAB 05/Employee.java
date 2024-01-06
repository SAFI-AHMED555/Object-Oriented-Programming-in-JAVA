
public class Employee {

    public String name;
    public int yearOfJoining;
    public double salary;
    public String address;

    public Employee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
    }

    public void display() {
        System.out.println("Name \t\t Year of Joining \t Address \t\t Salary");
    }

    public void output() {
        System.out.println(name + "\t\t " + yearOfJoining + "\t\t" + address + "\t" + salary);
    }

    public static void main(String[] args) {
        Employee robert = new Employee("Robert", 1994, 64000.00, "64C- WallsStreat");
        Employee sam = new Employee("Sam", 2000, 70000.00, "68D- WallsStreat");
        Employee john = new Employee("John", 1999, 55000.00, "26B- WallsStreat");

        Employee employee = new Employee("", 0, 0, "");
        employee.display();

        robert.output();
        sam.output();
        john.output();
    }
}








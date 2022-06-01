package bankEmployeeProgram;

public class Accountant extends Employee {

    public Accountant(String name, int id, String title, String dateOfBirth, double salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);
    }

    @Override
    public void createReport() {
        super.createReport();
        System.out.println("Accountant " + name + " will open a new account");
        System.out.println("Accountant " + name + " will close account");
        System.out.println("Accountant " + name + " will create reports");
    }

    @Override
    public void receiveSalary() {
        super.receiveSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

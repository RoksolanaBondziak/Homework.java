package bankEmployeeProgram;

public class Clerk extends Employee {

    public Clerk(String name, int id, String title, String dateOfBirth, double salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);
    }

    @Override
    public void createReport() {
        super.createReport();
        System.out.println("Clerk " + name + " will call a customer");
        System.out.println("Clerk " + name + " will answer incoming calls");
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

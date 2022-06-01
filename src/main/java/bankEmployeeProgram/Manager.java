package bankEmployeeProgram;

public class Manager extends Employee {
    public Manager(String name, int id, String title, String dateOfBirth, double salary, String address) {
        super(name, id, title, dateOfBirth, salary, address);

    }

    @Override
    public void createReport() {
        super.createReport();
        System.out.println("Manager " + name + " will hire employees");
        System.out.println("Manager " + name + " will fire employees");
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


package bankEmployeeProgram;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 1, "Manager", "03/01/1965", 10000, "Toronto");
        manager.createReport();
        manager.receiveSalary();
        manager.toString();


        Clerk clerk1 = new Clerk("Anna", 2, "Clerk", "08/24/1988", 3000, "Calgary");
        clerk1.createReport();
        clerk1.receiveSalary();
        clerk1.toString();

        Clerk clerk2 = new Clerk("Lucy", 3, "Clerk", "03/14/70", 3000, "New York");
        clerk2.createReport();
        clerk2.receiveSalary();
        clerk2.toString();

        Clerk clerk3 = new Clerk("Tom", 4, "Clerk", "12/17/1993", 3000, "Red Deer");
        clerk3.createReport();
        clerk3.receiveSalary();
        clerk3.toString();


        Accountant accountant1 = new Accountant("Kate", 5, "Accountant", "10/20/1985", 5000, "Toronto");
        accountant1.createReport();
        accountant1.receiveSalary();
        accountant1.toString();

        Accountant accountant2 = new Accountant("Sam", 6, "Accountant", "05/13/1977", 5000, "Edmonton");
        accountant2.createReport();
        accountant2.receiveSalary();
        accountant2.toString();

        Accountant accountant3 = new Accountant("Andrey", 7, "Accountant", "08/20/1990", 5000, "Ottawa");
        accountant3.createReport();
        accountant3.receiveSalary();
        accountant3.toString();

        Accountant accountant4 = new Accountant("Alex", 8, "Accountant", "10/01/1987", 5000, "Toronto");
        accountant4.createReport();
        accountant4.receiveSalary();
        accountant4.toString();

        Accountant accountant5 = new Accountant("Luis", 9, "Accountant", "02/22/1982", 5000, "Chicago");
        accountant5.createReport();
        accountant5.receiveSalary();
        accountant5.toString();
    }
}


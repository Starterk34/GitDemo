package w36;

public class Main {
    public static void main (String [] args){
        Employee employee1 = new Employee("Volodymyr Zelensiy", "Prezident", 2000);
        Employee employee2 = new Employee("Aleksei Arestovich", "pizdabol", 1000);
        System.out.println("Before review:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();

        employee1.salaryIncrease(200);
        employee2.salaryDecrese(99);

        System.out.println("After review:");
        employee1.printEmployeeDetails();
        employee2.printEmployeeDetails();


    }
}

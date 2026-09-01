public class Employee{
    String name;
    int salary;
}
class Manager extends Employee{
    String department;
    
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.name = "Noah";
        manager.salary = 50000;
        manager.department = "Sales";
        System.out.println("Name: " + manager.name);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}
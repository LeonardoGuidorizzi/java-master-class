package OOP.exercisesOOP;

public class ProgramEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("João Silva", 6000.00, 1000.00);
        System.out.println(employee.NetSalary());
        System.out.println(employee.IncreaseSalary(10));
    }


}

import java.util.Random;
public class EmployeeDriver {
    public static void main (String [] args){
        System.out.println("Running");
        Random gen = new Random();
        Employee []  employees;
        employees = new Employee[2];
        employees[0] = new Employee("Bob Joe",12345,10.00);
        employees[1] = new Employee("Joe Bob",12346,25.00);

        for (Employee emp: employees){
            int r1 = gen.nextInt(60);
            int r2 = gen.nextInt(60);
            double [] hoursWorked = {r1,r2};
            System.out.println("Bee Boop analyzing next employee: " + emp.toString());
            System.out.println(emp.getName() + " worked "+ r1 +" hours on week1 and " + r2 +"hours on week 2.");
            System.out.println(emp.getName() + "'s Paycheck is: " + emp.paycheck(hoursWorked));
            System.out.println(emp.getName() + "'s Yearly Salary is: " + emp.getYearlyWage());
            double raise = gen.nextInt(100);
            System.out.println(emp.getName() + "gets a raise of " + raise + " percent");
            emp.increaseSalary((double) raise);
            System.out.println(emp.getName()+ "'s mew Yearly Salary is: " +emp.getYearlyWage());


        }




    }
}

package practicaljava.lesson8;

import java.util.ArrayList;
import java.util.List;

public class Application {

    private static void makeEmployeeWork(List<? extends Employee> employeeList) {
        for(Employee emp: employeeList) {
            emp.work();
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Accountant acc = new Accountant();
        emp = acc;

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee());
        ArrayList<Accountant> accountants = new ArrayList<>();
        accountants.add(new Accountant());
        // employees = accountants;

        ArrayList<?> employees1 = new ArrayList<>();
        ArrayList<Accountant> accountants1 = new ArrayList<>();
        employees1 = accountants1;

        ArrayList<? extends Employee> employees2 = new ArrayList<>();
        ArrayList<Accountant> accountants2 = new ArrayList<>();
        employees2 = accountants2;

        ArrayList<? super Employee> employees3 = new ArrayList<>();
        ArrayList<Accountant> accountants3 = new ArrayList<>();
        // employees3 = accountants3;

        makeEmployeeWork(accountants);

    }
}

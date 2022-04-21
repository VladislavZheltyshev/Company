import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("abibas", 11_000_000);
        company.hire("Jim", Position.MANAGER);
        company.hire("Jim2", Position.OPERATOR);
        company.hire("Jim3", Position.TOP_MANAGER);
        List<Employee> employees = new ArrayList<>();
        Operator operator = new Operator("Bob");
        Manager manager = new Manager("Kev");
        TopManager topManager = new TopManager("Jhon", company.getIncome());
        employees.add(manager);
        employees.add(operator);
        employees.add(topManager);

        for (int i = 0; i < 59; i++) {
            company.hireAll(employees);
        }

        int mid = (int) (company.getEmployees().size() * 0.5);

        System.out.println(company.getEmployees().size());

        while (company.getEmployees().size() > mid) {
            int i = (int) ((Math.random() * company.getEmployees().size()) * 0.5 + company.getEmployees().size() * 0.5);
            company.fire(i);
        }

        System.out.println(company.getEmployees().size());

//        for (Employee e : company.getLowestSalaryStaff(89)
//        ) {
//            System.out.println(e.getMonthSalary());
//        }

//        List<Employee> topSalaryStaff = company.getTopSalaryStaff(50);
//        for (int i = topSalaryStaff.size()-1; i>0; i--){
//            System.out.println(topSalaryStaff.get(i).getMonthSalary());
//        }

        List<Employee> lowestSalaryStaff = company.getLowestSalaryStaff(50);
        for (int i = lowestSalaryStaff.size() - 1; i > 0; i--) {
            System.out.println(lowestSalaryStaff.get(i).getMonthSalary());
        }

    }
}

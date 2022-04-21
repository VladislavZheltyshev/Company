import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {


    private List<Employee> employees = new ArrayList<>();
    public String companyName;
    public double companyIncome;

    public Company(String companyName, double companyIncome) {
        this.companyName = companyName;
        this.companyIncome = companyIncome;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        employees.sort(new SalaryComparator());
        Collections.reverse(employees);
        return employees.subList((employees.size() - count - 1), employees.size());
    }

    public List<Employee> getTopSalaryStaff(int count) {
        employees.sort(new SalaryComparator());
        return employees.subList((employees.size() - count - 1), employees.size());
    }


    public void fire(int number) {
        employees.remove(number);
    }

    public void hire(String name, Position position) {
        switch (position) {
            case OPERATOR -> {
                Operator operator = new Operator(name);
                employees.add(operator);
            }
            case MANAGER -> {
                Manager manager = new Manager(name);
                employees.add(manager);
            }
            case TOP_MANAGER -> {
                TopManager topManager = new TopManager(name, companyIncome);
                employees.add(topManager);
            }
        }

    }

    public void hireAll(List<Employee> list) {
        for (Employee e : list
        ) {
            String name = e.getName();
            String position = e.getPosition();
            switch (position) {
                case "OPERATOR" -> {
                    Operator operator = new Operator(name);
                    employees.add(operator);
                }
                case "MANAGER" -> {
                    Manager manager = new Manager(name);
                    employees.add(manager);
                }
                case "TOP_MANAGER" -> {
                    TopManager topManager = new TopManager(name, companyIncome);
                    employees.add(topManager);
                }
            }
        }
    }

    public double getIncome() {
        return companyIncome;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

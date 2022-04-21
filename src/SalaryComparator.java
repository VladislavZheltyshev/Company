import java.util.Comparator;

class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getMonthSalary(), o2.getMonthSalary());
    }
}

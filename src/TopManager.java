public class TopManager implements Employee {

    private final String name;
    public String position = Position.TOP_MANAGER.toString();
    public double companyIncome;

    public TopManager(String name, double companyIncome) {
        this.name = name;
        this.companyIncome = companyIncome;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public double getMonthSalary() {
        double salary = fixCash * 2.5;
        if (companyIncome > 10_000_000) {
            salary = salary * 2.5; // Добавляем бонус
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Name - " + getName() + " " + "Salary: " + getMonthSalary();
    }
}

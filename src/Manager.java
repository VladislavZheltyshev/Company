public class Manager implements Employee {

    private final String name;
    public String position = Position.MANAGER.toString();
    private final double incomeForCompany = 115_000 + (25_000 * Math.random());
    private final double salary = fixCash * 1.5;

    public Manager(String name) {
        this.name = name;
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
        return Math.round(salary + incomeForCompany * 0.05);
    }

    @Override
    public String toString() {
        return "Name - " + getName() + " " + "Salary: " + getMonthSalary();
    }
}

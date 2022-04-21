public class Operator implements Employee {

    private final String name;
    private String position = Position.OPERATOR.toString();
    private final double salary = fixCash; // Зарплата состоит из фиксированной части

    public Operator(String name) {
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
        return salary;
    }

    @Override
    public String toString() {
        return "Name - " + getName() + " " + "Salary: " + getMonthSalary();
    }
}

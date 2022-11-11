public class Employee {
    private String name;
    private int hours;
    private int hourlyRate;

    public Employee() {
    }

    public Employee(String name, int hours, int hourlyRate) {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public int getRate() {
        return hourlyRate;

    }

    final double tax = 0.7;


    // calculate salary
    public int calculateSalary() {
        return (hours * hourlyRate);
    }

    // calculate net salary
    public double calculateNetSalary() {
        return (calculateSalary() * tax);
    }
}

// 3 getter och 3 setter
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double calculatePay() {
        return 0.0; // to be implemented by subclasses
    }
}

class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double calculatePay() {
        return salary / 12.0; // monthly salary
    }
}

class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked; // weekly pay
    }
}

class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", 5000.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Smith", 20.0, 40.0);

        System.out.println(salariedEmployee.getName() + "'s monthly salary is: " + salariedEmployee.calculatePay());
        System.out.println(hourlyEmployee.getName() + "'s weekly pay is: " + hourlyEmployee.calculatePay());
    }
}
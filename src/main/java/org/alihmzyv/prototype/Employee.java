package org.alihmzyv.prototype;

public class Employee extends Person {
    private String department;

    public Employee(String firstName, String lastName, String department) {
        super(firstName, lastName);
        this.department = department;
    }

    public Employee(Employee employee) {
        super(employee.firstName, employee.lastName);
        this.department = employee.department;
    }

    @Override
    public Person clone() {//or can override Object class's clone method
        return new Employee(this);
    }
}

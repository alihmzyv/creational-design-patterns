package org.alihmzyv.prototype;

public class Executive extends Person {
    private String area;

    public Executive(String firstName, String lastName, String area) {
        super(firstName, lastName);
        this.area = area;
    }

    public Executive(Executive executive) {
        super(executive.firstName, executive.lastName);
        this.area = executive.area;
    }

    @Override
    public Person clone() {
        return new Executive(this);
    }
}

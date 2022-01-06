package com.company;

public class Kitchen extends Employee {
    private long serviceCharge;

    public Kitchen(int id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "serviceCharge=" + serviceCharge +
                '}';
    }

    public long getServiceCharge() {
        return this.serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public long calculatorSalary() {
        return getBasicSalary() + getServiceCharge();
    }
}

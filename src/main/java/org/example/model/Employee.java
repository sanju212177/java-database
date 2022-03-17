package org.example.model;

public class Employee {
    int employeeId;
    String employeeName;
    String desig;

    public Employee(int employeeId, String employeeName, String desig) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.desig = desig;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", designation='" + desig + '\'' +
                '}';
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDesig() {
        return desig;
    }

    public void setDesig(String desig) {
        this.desig = desig;
    }
}

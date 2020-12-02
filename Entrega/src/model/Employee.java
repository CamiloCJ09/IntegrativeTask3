package model;

public abstract class Employee {
    private String name; //Employee name
    private String idNum; //Identification number
    private int salary; //Employee salary
    private Status status; //the status of the employee

    public Employee(String name, String idNum, int salary) {
        this.status = Status.ACTIVE;
        this.name = name;
        this.idNum = idNum;
        this.salary = salary;
    }
    /**
     * Method that let show the basic info from an employee
     * @return String with the information of the employee
     */
    public String employeeToString(){
        String msg ="Name: "+name+"\n"+
                    "ID number: "+idNum+"\n"+
                    "Salary: "+salary+"\n"+
                    "Status: "+status+"\n";
        return msg;
    }
    //! Setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}

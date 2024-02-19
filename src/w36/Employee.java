package w36;

public class Employee {
    private String name;
    private String jobTitle;
    private double salary;
    public Employee (String name, String jobTitle, double salary){
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setJobTitle (String jobTitle){
        this.jobTitle = jobTitle;
    }
    public String getJobTitle(){
        return jobTitle;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }

    public void salaryIncrease (double percent){
        salary = salary * (1+percent/100);
    }
    public void salaryDecrese (double percent){
        salary = salary * (1-percent/100);
    }
    public void printEmployeeDetails(){
        System.out.println (name + " is " + jobTitle + " and his salary is " + String.format("%.2f",salary));
    }


}

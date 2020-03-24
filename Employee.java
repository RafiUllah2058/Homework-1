
public class Employee {
   private String FirstName,LastName;
   private double MonthlySalary;

    public Employee(String FirstName, String LastName, double MonthlySalary) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.MonthlySalary = MonthlySalary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public double getMonthlySalary() {
        return MonthlySalary;
    }

    public void setMonthlySalary(double MonthlySalary) {
        this.MonthlySalary = MonthlySalary;
    }
   public double getYearlySalary()
   {
       return MonthlySalary*12;
   }
   public double getIncreaseInSalary()
   {
       return  (((0.1*MonthlySalary)+MonthlySalary)*12);
   }


    public String toString() {
        return "\n\n\nEmployee{" + "Your name is =" + getFirstName() + " " + getLastName() + "\nMonthlySalary=" + getMonthlySalary() + "\nYearly Salary="+ getYearlySalary()+"\nTen percent increase in salary="+getIncreaseInSalary()+'}';
    }
   
}

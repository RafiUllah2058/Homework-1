
public class EmployeeTest {

    public static void main(String[] args) {

        Employee obj1=new Employee("null","null",0.0);
        obj1.setFirstName("Sabir");
        obj1.setLastName("Ullah");
        obj1.setMonthlySalary(100000);
        
        Employee obj2=new Employee("null","null",0.0);
        obj2.setFirstName("Rafii");
        obj2.setLastName("Janii");
        obj2.setMonthlySalary(150000);
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        
        
    }
    
}

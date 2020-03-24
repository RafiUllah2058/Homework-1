
public class SavingAccountTest {

    public static void main(String[] args) {
        // TODO code application logic here
        SavingAccount obj1=new SavingAccount(0);
        obj1.setSavingBalance(2000);
        obj1.setAnnualInterestRate(4);
        
        SavingAccount obj2=new SavingAccount(0);
        obj2.setSavingBalance(3000);
        obj2.setAnnualInterestRate(5);
        
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
    }
    
}

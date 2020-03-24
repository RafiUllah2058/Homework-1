
public class InvoiceTest {

    public static void main(String[] args) {

        Invoice obj1=new Invoice("null","null",0,0.0,0.0);
        obj1.setPartDescription("Andoride Phone");
        obj1.setPartNumber("x775");
        obj1.setPricePerItem(50000);
        obj1.setQuantityOfItem(3);
        System.out.println(obj1.toString());
    }
    
}

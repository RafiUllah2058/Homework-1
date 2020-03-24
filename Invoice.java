
public class Invoice {

    private String PartNumber,PartDescription;
    private int QuantityOfItem;
    private double PricePerItem;
    private double amount;
    public Invoice(String PartNumber, String PartDescription, int QuantityOfItem, double PricePerItem,double amount) {
        this.PartNumber = PartNumber;
        this.PartDescription = PartDescription;
        this.QuantityOfItem = QuantityOfItem;
        this.PricePerItem = PricePerItem;
        this.amount=amount;
    }   

    public String getPartNumber() {
        return PartNumber;
    }

    public void setPartNumber(String PartNumber) {
        this.PartNumber = PartNumber;
    }

    public String getPartDescription() {
        return PartDescription;
    }

    public void setPartDescription(String PartDescription) {
        this.PartDescription = PartDescription;
    }

    public int getQuantityOfItem() {
        return QuantityOfItem;
    }

    public void setQuantityOfItem(int QuantityOfItem) {
        this.QuantityOfItem = QuantityOfItem;
    }

    public double getPricePerItem() {
        return PricePerItem;
    }

    public void setPricePerItem(double PricePerItem) {
        this.PricePerItem = PricePerItem;
    }
    public void setInvoiceAmount()
    {
        if(PricePerItem<=0)
            PricePerItem=0;
        if(QuantityOfItem<=0)
            QuantityOfItem=0;
        amount=(getPricePerItem()*getQuantityOfItem());
    }
    public double getInvoiceAmount()
    {
        return getPricePerItem()*getQuantityOfItem();
    }

    @Override
    public String toString() {
        return "\n\nInvoice{" + "Part Number=" + getPartNumber() + "\nPart Description=" + getPartDescription() + "\nQuantity Of Item=" + getQuantityOfItem() + "\nPrice Per Item=" + getPricePerItem() + "\nAmount=" + getInvoiceAmount() + '}';
    }
    
}

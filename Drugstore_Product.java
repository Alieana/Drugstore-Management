
public abstract class Drugstore_Product
{
    private String custName;
    private int member;
    private char productCode;
    
    public Drugstore_Product ()
    {
        custName = null;
        member = 0;
        productCode = 0;
    }
    
    public Drugstore_Product (String custName, int member, char productCode)
    {
        this.custName = custName;
        this.member = member;
        this.productCode = productCode;
    }
    
    public void setAll (String custName, int member, char productCode)
    {
        this.custName = custName;
        this.member = member;
        this.productCode = productCode;
    }
    
    public String getCustName ()
    {
         return custName;
    }
    
    public int getMember ()
    {
        return member;
    }
    
    public char getProductCode ()
    {
        return productCode;
    }
    //to determine discount for member and non member
    public double calcDiscount()
    {
        double discS;
        if (member==0)
        {
            discS = 0.05;
        }
        else 
        {
            discS = 0.1;
        }
        return discS;
    }
    
    public abstract double calcTotal();
    
    public String toString ()
    {
        return ("\nCustomer name : " + custName + "\nMember card : " + member + "\nProduct Code : " + productCode);
    }
}

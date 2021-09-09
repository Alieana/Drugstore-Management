import java.text.*;
public class Cosmetic extends Drugstore_Product
{  
    DecimalFormat df = new DecimalFormat("0.00");
    private String Ctype;
    private String Cbrand;
    private double Cprice;
    private int Cqty;

    public Cosmetic()
    {
        super();
        Ctype = null;
        Cbrand = null;
        Cprice = 0.00;
        Cqty = 0;
    }
    
    public Cosmetic (String custName, int member, char productCode, String Ctype, String Cbrand, double Cprice, int Cqty)
    {
        super(custName, member, productCode);
        this.Ctype = Ctype;
        this.Cbrand = Cbrand;
        this.Cprice = Cprice;
        this.Cqty = Cqty;
    }
    
    public String getCtype() 
    {
        return Ctype;
    }
    
    public String getCbrand()
    {
        return Cbrand;
    }
    
    public double getCprice()
    {
        return Cprice;
    }
    
    public int getCqty()
    {
        return Cqty;
    }
    
    public void setCosmetic (String custName, int member, char productCode, String Ctype, String Cbrand, double Cprice, int Cqty)
    {
        super.setAll(custName, member, productCode);
        this.Ctype = Ctype;
        this.Cbrand = Cbrand;
        this.Cprice = Cprice;
        this.Cqty = Cqty;
    }
    //to calculate total payment after discount for each product
     public double calcTotal()
    {
        double priceC = 0;
        priceC = (Cprice*Cqty) - ((Cprice*Cqty)*super.calcDiscount());
        return priceC;
    }
    
    public String toString()
    {
        return(super.toString() + "\n" + Ctype + Cbrand + "\tRM" + df.format(Cprice) + " x" + Cqty + "\nTotal Payment after discount RM" + df.format(calcTotal()));
    }
}
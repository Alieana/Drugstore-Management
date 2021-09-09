import java.text.*;
public class Skincare extends Drugstore_Product
{  
    DecimalFormat df = new DecimalFormat("0.00");
    private String Stype;
    private String Sbrand;
    private double Sprice;
    private int Sqty;

    public Skincare()
    {
        super();
        Stype = null;
        Sbrand = null;
        Sprice = 0.00;
        Sqty = 0;
    }
    
    public Skincare (String custName, int member, char productCode, String Stype, String Sbrand, double Sprice, int Sqty)
    {
        super(custName, member, productCode);
        this.Stype = Stype;
        this.Sbrand = Sbrand;
        this.Sprice = Sprice;
        this.Sqty = Sqty;
    }
    
    public String getStype()
    {
        return Stype;
    }
    
    public String getSbrand()
    {
        return Sbrand;
    }
    
    public double getSprice()
    {
        return Sprice;
    }
    
    public int getSqty()
    {
        return Sqty;
    }
    
    public void setSkincare (String custName, int member, char productCode, String Stype, String Sbrand, double Sprice, int Sqty)
    {
        super.setAll(custName, member, productCode);
        this.Stype = Stype;
        this.Sbrand = Sbrand;
        this.Sprice = Sprice;
        this.Sqty = Sqty;
    }
    //to calculate total payment after discount for each product
    public double calcTotal()
    {
        double priceS = 0;
        priceS = (Sprice*Sqty) - ((Sprice*Sqty)*super.calcDiscount());
        return priceS;
    }
    
    public String toString()
    {
        return(super.toString() + "\n" + Sbrand + "\t\tRM" + df.format(Sprice) + " x" + Sqty + "\nTotal Payment after discount RM" + df.format(calcTotal()));
    }
}

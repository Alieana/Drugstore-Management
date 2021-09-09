import java.text.*;
public class Health extends Drugstore_Product
{  
    DecimalFormat df = new DecimalFormat("0.00");
    private String Htype;
    private String Hbrand;
    private double Hprice;
    private int Hqty;

    public Health()
    {
        super();
        Htype = null;
        Hbrand = null;
        Hprice = 0.00;
        Hqty = 0;
    }
    
    public Health (String custName, int member, char productCode, String Htype, String Hbrand, double Hprice, int Hqty)
    {
        super(custName, member, productCode);
        this.Htype = Htype;
        this.Hbrand = Hbrand;
        this.Hprice = Hprice;
        this.Hqty = Hqty;
    }
    
    public String getHtype() 
    {
        return Htype;
    }
    
    public String getHbrand()
    {
        return Hbrand;
    }
    
    public double getHprice()
    {
        return Hprice;
    }
    
    public int getHqty()
    {
        return Hqty;
    }
    
    public void setHealth (String custName, int member, char productCode, String Htype, String Hbrand, double Hprice, int Hqty)
    {
        super.setAll(custName, member, productCode);
        this.Htype = Htype;
        this.Hbrand = Hbrand;
        this.Hprice = Hprice;
        this.Hqty = Hqty;
    }
    
        public double calcTotal()
    {
        double priceH = 0;
        priceH = (Hprice*Hqty) - ((Hprice*Hqty)*super.calcDiscount());
        return priceH;
    }
    
    
    public String toString()
    {
        return(super.toString() + "\n" + Htype + " " + Hbrand + "\tRM" + df.format(Hprice) + " x" + Hqty + "\nTotal Payment after discount RM" + df.format(calcTotal()));
    }
}
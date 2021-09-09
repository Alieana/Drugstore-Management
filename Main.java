import java.util.*;
import java.text.*;
//Staff can only record one product for each customer
//If the customer buy more than one product the customer detail will be recorded again with the new product
public class Main
{
    public static void main (String [] args) 
    {
        Scanner in = new Scanner (System.in);
        in.useDelimiter("\n");
        DecimalFormat df = new DecimalFormat("0.00");
       
        //menu
        System.out.println("------------------------Welcome to AlNa store------------------------");
        System.out.println("**************************************************************PRODUCT MENU**************************************************************");
        System.out.println("________________________________________________________________________________________________________________________________________");
        System.out.println("|                Health Care                 |                  Skincare                  |                   Cosmetic                 |");
        System.out.println("|____________________________________________|____________________________________________|____________________________________________|");
        System.out.println("|  Product Type  |   Product Brand (Price)   |  Product Type  |   Product Brand (Price)   |  Product Type  |   Product Brand (Price)   |");
        System.out.println("|________________|___________________________|________________|___________________________|________________|___________________________|");
        System.out.println("|                | Centrum vitamin (RM68.60) |                | Hada Labo       (RM 56.50)|                | LMK cosmetics    (RM56.00)|");
        System.out.println("|   Vitamins &   | Kino collagen   (RM259.00)|                | Laneige         (RM 75.80)|                | Becca           (RM183.00)|");
        System.out.println("|   Supplements  | Nutri dietary   (RM120.70)|    Cleanser    | Nano White      (RM 18.20)|  Highlighter   | Nars            (RM142.00)|");
        System.out.println("|                | App weight gain (RM163.90)|                | Innisfree       (RM 13.40)|                | Fenty Beauty    (RM136.00)|");
        System.out.println("|                | Best vitamin C  (RM56.40) |                | Safi            (RM 10.90)|                | Tarte           (RM116.00)|");
        System.out.println("|________________|___________________________|________________|___________________________|________________|___________________________|");
        System.out.println("|                | Demeter oil      (RM29.10)|                | Hada Labo       (RM 65.20)|                | IN2IT            (RM25.00)|");
        System.out.println("|     Bath &     | Innisfree lotion (RM84.40)|                | Olay           (RM 100.80)|                | Silky Girl       (RM28.90)|");
        System.out.println("|      Body      | Sephora shower   (RM40.00)|      Toner     | Nano White      (RM 24.50)|    Lipmatte    | Baby bright      (RM28.20)|");
        System.out.println("|                | L’occitane scrub (RM89.00)|                | Garnier         (RM 25.40)|                | Cathydoll        (RM30.00)|");
        System.out.println("|                | Body Works cream (RM57.00)|                | Safi             (RM 7.90)|                | Maybelline       (RM31.90)|");
        System.out.println("|________________|___________________________|________________|___________________________|________________|___________________________|");
        System.out.println("|                | Somxl            (RM99.00)|                | Himalaya         (RM15.20)|                | Silky Girl       (RM27.80)|");
        System.out.println("|      Wart      | Wartner          (RM63.90)|                | Thayers          (RM43.76)|                | Catrice          (RM25.30)|");
        System.out.println("|   Treatments   | Ellgy            (RM15.00)|  Moisturizer   | Caudalie         (RM25.00)|    Eyeshadow   | IN@IT            (RM23.90)|");
        System.out.println("|                | Tsubu            (RM73.90)|                | Cetaphill        (RM59.54)|                | Maybelline       (RM45.00)|");
        System.out.println("|                | Dr Scholl       (RM215.75)|                | Clinique         (RM66.00)|                | Huda Beauty     (RM189.00)|");
        System.out.println("|________________|___________________________|________________|___________________________|________________|___________________________|");
        System.out.println("|                | Evlu Nutrition   (RM81.00)|                | Nivea            (RM26.32)|                | FIT me           (RM30.00)|");
        System.out.println("|       Fat      | Nut Research    (RM124.40)|                | Biore UV         (RM25.80)|                | Maybelline       (RM58.00)|");
        System.out.println("|     Burners    | Cobra           (RM113.50)|    Sunscreen   | Wardah           (RM23.30)|   Foundation   | Catrice         (RM 35.57)|");
        System.out.println("|                | Elite            (RM83.00)|                | Banana Boat      (RM17.60)|                | Palladio         (RM35.80)|");
        System.out.println("|                | Uni Nutrition    (RM62.40)|                | Anessa           (RM20.90)|                | Silky Girl       (RM19.80)|");
        System.out.println("|________________|___________________________|________________|___________________________|________________|___________________________|");
        System.out.println("|                | Himalaya        (RM121.80)|                | Hanaka           (RM32.90)|                | Forest Colour    (RM20.40)|");
        System.out.println("|                | Percy & Reed    (RM108.10)|                | Benzac           (RM12.70)|                | Palladio         (RM29.80)|");
        System.out.println("|   Hair Care    | Nioxin          (RM165.50)|   Acne Cream   | Himalaya         (RM13.80)|     Mascara    | D-Up             (RM59.80)|");
        System.out.println("|                | Bain de Terre   (RM238.30)|                | Hiruscar         (RM36.00)|                | Revlon           (RM36.40)|");
        System.out.println("|                | Garnier         (RM257.00)|                | Bioaqua          (RM18.90)|                | L’oreal          (RM32.80)|");
        System.out.println("|________________|___________________________|________________|___________________________|________________|___________________________|");
        
        System.out.print("\nPlease enter date [DD/MM/YYYY] : ");
        String date = in.next();
        System.out.print("Enter the number of customer : ");
        int size = in.nextInt();
        int cntH = 0, cntS = 0, cntC = 0;
        //superclass array
        Drugstore_Product [] a = new Drugstore_Product[size];
        
         for(int i = 0; i<a.length; i++)
        {
            System.out.print("\n========================================================================");
            System.out.print("\nEnter customer name : ");
            String custName = in.next();
            System.out.print("Enter member card [if does not have enter '0'] : " );
            int member = in.nextInt();
            System.out.print("Enter product code [H = Health/ S = Skincare/ C = Cosmetic] : ");
            char productCode = in.next().charAt(0);
                
            switch (productCode)
            {
                //if customer enter H, it is refer to Health subclass
                case 'H' : System.out.print("Enter health care type : ");
                           String Htype = in.next();
                           System.out.print("Enter health care brand : ");
                           String Hbrand = in.next();
                           System.out.print("Enter product price RM: ");
                           double Hprice = in.nextDouble();
                           System.out.print("Enter product quantity : ");
                           int Hqty = in.nextInt();
                           cntH++;
                           a[i] = new Health (custName, member, productCode,Htype,Hbrand,Hprice,Hqty);
                           break;
                //if customer enter S, it is refer to Skincare subclass              
                case 'S' : System.out.print("Enter skincare type : ");
                           String Stype = in.next();
                           System.out.print("Enter skincare brand : ");
                           String Sbrand = in.next();
                           System.out.print("Enter product price RM: ");
                           double Sprice = in.nextDouble();
                           System.out.print("Enter product quantity : ");
                           int Sqty = in.nextInt();
                           cntS++;
                           a[i] = new Skincare (custName, member, productCode, Stype, Sbrand, Sprice, Sqty);
                           break;
                //if customer enter C, it is refer to Cosmetic subclass        
                case 'C' : System.out.print("Enter cosmetic type : ");
                           String Ctype = in.next();
                           System.out.print("Enter cosmetic brand : ");
                           String Cbrand = in.next();
                           System.out.print("Enter product price RM: ");
                           double Cprice = in.nextDouble();
                           System.out.print("Enter product quantity : ");
                           int Cqty = in.nextInt();
                           cntC++;
                           a[i] = new Cosmetic (custName, member, productCode,Ctype,Cbrand,Cprice,Cqty);
                           break;
                           
                default : System.out.println("Invalid product code. Please try again!");
            }
        }
    
    //to display receipt for the end of the day
    double totalH = 0;
    double totalS = 0;
    double totalC = 0;
    System.out.println("\n===============================Receipt===============================");
    System.out.println("Date -> " + date);
    for(int i = 0; i<a.length; i++)
    {
        System.out.println("======================================================================");
        System.out.println(a[i].toString());
        //to calculate total sales of each product code
        if (a[i] instanceof Health)
        {
            Health obj = (Health) a[i];
            totalH = totalH + obj.calcTotal();
        }
        else if (a[i] instanceof Skincare)
        {
            Skincare obj = (Skincare) a[i];
            totalS = totalS + obj.calcTotal();
        }
        else if (a[i] instanceof Cosmetic)
        {
            Cosmetic obj = (Cosmetic) a[i];
            totalC = totalC + obj.calcTotal();
        }
      
    }
    System.out.println("\n======================================================================");
     
    //to search a customer by name
    System.out.print("Enter a customer name to be search : ");
    String search = in.next();
    
    int i = 0;
    boolean found = false;
    while(i<a.length && !found)
    {
       if(a[i].getCustName().equals(search))
       {
           found = true;
       }
       else
       {
           i++;
       }
    }
    
    if(found)
    {
        System.out.print("-->Customer found!");
        System.out.print(a[i].toString());
    }
    else
    {
        System.out.print("-->Customer not found!");
    }
    
    //to find the highest payment made among the customers
    double highest = 0;
    int indexH = 0;
    for(int l = 0; l<a.length; l++)
    {
        if (a[l] instanceof Health)
        {
            Health obj = (Health) a[l];
            if (obj.calcTotal()>highest)
            {
                highest = obj.calcTotal();
                indexH = l;
            }
        }
        else if (a[l] instanceof Skincare)
        {
            Skincare obj = (Skincare) a[l];
            if (obj.calcTotal()>highest)
            {
                highest = obj.calcTotal();
                indexH = l;
            }
        }
        else if (a[l] instanceof Cosmetic)
        {
            Cosmetic obj = (Cosmetic) a[l];
            if (obj.calcTotal()>highest)
            {
                highest = obj.calcTotal();
                indexH = l;
            }
        }
    }
    
    //average sales of the products
    double avg = 0;
    avg = (totalH+totalS+totalC)/3;
    
    //to display result of the day
    System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Total Health product sold is " + cntH + " for RM" + df.format(totalH));
    System.out.println("Total Skincare product sold is " + cntS + " for RM" + df.format(totalS));
    System.out.println("Total Cosmetic product sold is " + cntC + " for RM" + df.format(totalC));
    System.out.println("Total sales of " + date + " is RM" + df.format((totalH+totalS+totalC)));
    System.out.println("The highest payment is RM" + df.format(highest) + " from customer " + a[indexH].getCustName());
    System.out.println("The average sales of the products for " + date + " is RM" + df.format(avg));
    
    System.out.println("\nThank you!");
    }

}
    



import java.util.Scanner;
public abstract class Property{
    double area,rate;
    String location;
    SaleType saleType;
    Scanner sc=new Scanner(System.in);

    public void accept(){
    
        System.out.println("Enter Area: ");
        area = sc.nextDouble();
        System.out.println("Enter Rate: ");
        rate = sc.nextDouble();
        
        System.out.println("Enter Location: "); 
        location = sc.nextLine();
        
        System.out.println("Choose 1.LEASE, 2. SALE, 3. RENT ");
        saleType = SaleType.values()[(sc.nextInt())-1] ;
    }

    public void show(){
        System.out.println("Area :"+area);
        System.out.println("Rate :"+rate);
        System.out.println("Address :"+location);
        System.out.println("Sale Type :"+saleType);
    }
}
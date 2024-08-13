/**
 * Flat
 */
public class Flat extends Property{
    int floor;
    double deposit;
    public void accept(){
        super.accept();
        System.out.println("Enter Floor Number: ");
        floor = sc.nextInt();
        System.out.println("Enter Deposit Amount: ");
        deposit = sc.nextDouble();

    }

    public void show(){
        super.show();
        System.out.println("floor :"+floor);        
        System.out.println("Deposit :"+deposit);
    }
    public double calculateMaintainence(){
        return 1.0;
    }
    
}
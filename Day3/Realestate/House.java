public class House extends Property{
    int bhk;
    boolean isParking;
    public void accept(){
        
        super.accept();
        System.out.println("Enter number of BHK");
        bhk= sc.nextInt();

        System.out.println("is parking available? (true/false)");
        isParking = sc.nextBoolean();

        
    }


    public void show(){
        super.show();
        System.out.println("parking :"+isParking);        
        System.out.println("Rooms: "+bhk + " BHK");
    }
}

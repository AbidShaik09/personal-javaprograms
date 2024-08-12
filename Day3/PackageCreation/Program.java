package realestate ;
class Program{
    public static void main(String ... args){
        System.out.println("Lease of building is: "+ new Building().calculateLease());
        System.out.println("Lease of flat is: "+ new Flat().calculateRent());
    }
}
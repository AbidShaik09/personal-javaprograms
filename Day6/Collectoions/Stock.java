public class Stock{
    int price;
    String type;
    String name;

    public Stock(String name,int price, String type){
        this.name=name;
        this.type= type;
        this.price = price;

    }
    public Stock(){};
    public String toString(){
        return "Name: "+name+", Price: "+price+", Type "+type;
    }
    
}
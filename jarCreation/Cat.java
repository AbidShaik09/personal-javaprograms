import java.util.Scanner;

class Animal{
    public String food;
    public String drinkk;
    public void eat(){
        System.out.println("I Eat "+ food);
    }
    public void drink(){
        System.out.println("I Drink "+ drinkk);
    }
}
class Cat{
    public static void main(String ... args){
        Animal cat = new Animal();
        cat.drinkk = "Milk";
        cat.food = "Meat";
        cat.eat();
        cat.drink();
        new Scanner(System.in).next();
    }
}

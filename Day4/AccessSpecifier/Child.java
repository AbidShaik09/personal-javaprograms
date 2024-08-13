package child;

import Vehicle.Car;

public class Child extends Car {
    public void show(){
        protectedVar = 10;
        System.out.println(protectedVar);
    }
}

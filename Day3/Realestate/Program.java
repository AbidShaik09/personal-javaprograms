import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        int c;
        Scanner sc = new Scanner(System.in);
        ArrayList<House> house = new ArrayList<House>();

        do{

            System.out.println("Choose : 1. Register   2. Show   3. Exit");
            c= sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("Choose: 1.Flat  2.House  3.Back" );
                    int n= sc.nextInt();
                    switch (n) {
                        case 1:
                            Flat f= new Flat();
                            f.accept();
                            break;
                        case 2:
                            House h = new House();
                            h.accept();
                            break;
                        default:
                            break;
                    }

                    break;
            
                default:
                    return;
            }
        } while(true);
    }
}

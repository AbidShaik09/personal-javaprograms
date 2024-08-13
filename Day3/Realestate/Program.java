import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String [] args){
        int c;
        Scanner sc = new Scanner(System.in);
        Property properties[] = new Property[5];
        int pointer = 0;

        do{

            System.out.println("Choose : 1. Register   2. Show   3. Exit");
            c= sc.nextInt();
            switch (c) {
                case 1:
                    
                    System.out.println("Choose: 1.Flat  2.House  3.Back" );
                    int n= sc.nextInt();
                    switch (n) {
                        case 1:
                            properties[pointer]=new Flat();
                            break;
                        case 2:
                            properties[pointer]=new House();
                            break;
                        default:
                            break;
                    }
                    properties[pointer].accept();
                    pointer++;

                    break;
                case 2:
                    System.out.println("--------------------------");
                    for(int y = 0;y<pointer;y++){
                            properties[y].show();
                            System.out.println("--------------------------");
                            
                    }
                    break;
                default:
                    System.exit(0);
            }
        } while(true);
    }
}

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Add a = new Add();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 integers");
        Object o = sc.nextInt();
        Object p = sc.nextInt();
        System.out.println(a.Add(o, p));

        System.out.println("Enter 2 Float");
        o = sc.nextFloat();
        p = sc.nextFloat();
        System.out.println(a.Add(o, p));

        System.out.println("Enter 2 String");
        o = sc.nextLine();
        p = sc.nextLine();
        System.out.println(a.Add(o, p));

    }
    
}

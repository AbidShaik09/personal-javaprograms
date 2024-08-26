import java.util.*;

public class Program {
    public static void main(String[] args) {
        List<Stock> s = new LinkedList();
        s.add(new Stock("Zomato", 240,"ismcp"));
        s.add(new Stock("Kmn", 240,"ismcp"));
        s.add(new Stock("TataSteel", 140,"fdcm"));
        s.add(new Stock("ipOla", 2400,"fdcm"));
        s.add(new Stock("ihdfc", 380,"fdcm"));
        s.stream().filter(p->p.name.startsWith("i") && p.name.length()==5).forEach(System.out :: println);

        
    }
}

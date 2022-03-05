import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListLearn {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Júlio");
        list.add("Lueni");
        list.add("Daniel");
        list.add("Danilo");
        
    
    System.out.println("ORIGINAL LIST");
    System.out.println(list.size());
    for (String x : list) {
        System.out.println(x);
    }

    System.out.println("ADD SOMEONE IN A SPECIFIC PLACE");
    System.out.println("UPDATED LIST");
    list.add(3, "Otaviano");
    for (String x : list) {
        System.out.println(x);
    }

    System.out.print("REMOVING SOMEONE... ");    
    list.removeIf(x -> x.charAt(0) != 'D' );
    System.out.println("DONE!");

    System.out.println("INDEXING SOMEONE");
    System.out.println("Index of Danilo :" + list.indexOf("Danilo"));

    List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
    for (String x : result) {
        System.out.println(x);
    }
}
}

public class ForEachVector {
    public static void main(String[] args) {
        String vect[] = new String[] {"Maria", "Bob", "Alex", "Juan", "Marcão", "Brenda"};
    

    for (int i=0; i<vect.length; i++) {
        System.out.println(vect[i]);
    }
    System.out.println("---------------------");

    for (String pqp : vect) {
        System.out.println(pqp);
    }

    
    
}
}

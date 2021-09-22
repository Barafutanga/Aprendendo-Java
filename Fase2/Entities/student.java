package Entities;

public class student {

    public String name;
    public double tri1, tri2, tri3;

    public double totalPoints() {
        return tri1 + tri2 + tri3;
    }
    public double missingPoints() {
        if (totalPoints() < 60) {
            return 60 - totalPoints();
        } else {
            return 0.0;
        }
    }
    public String toString() {
        return "FINAL GRADE: " + totalPoints();
        
        
    }
}

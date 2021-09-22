package Entities;

public class pimbaWorker {

    private String name;
    private Integer id;
    private Double sallary;

    public pimbaWorker(){
    }

    public pimbaWorker(String name, Integer id, Double sallary){
        this.name = name;
        this.id = id;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSallary() {
        return sallary;
    }
    public void setSallary(Double sallary) {
        this.sallary = sallary;
    }

    public void increaseSallary(double Percentage) {
        sallary += sallary * Percentage / 100;
    }

    public String toString() {
        return id 
        + ", " 
        + name 
        + ", " 
        + String.format("%.2f", sallary);
    }
}

package sweets;

public class Snickers extends AbstractBar {
    private String filler;
    public Snickers(int weight, String name, int calories){
        this.weight = weight;
        this.name = name;
        this.calories = calories;
        this.type = SweetType.SNICKERS;
    }
    public Snickers(){
        this.type = SweetType.SNICKERS;
    }
    public int coefficient = 4;
    public String getFiller() {
        return filler;
    }
    public void setFiller(String filler) {
        this.filler = filler;
    }
    public int getWeight(){
        return  coefficient * weight;
    }
}

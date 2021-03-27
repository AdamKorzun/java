package sweets;

public class Mars extends AbstractBar{
    private String filler;
    public int coefficient = 4;
    public Mars(int weight, String name, int calories){
        this.weight = weight;
        this.name = name;
        this.calories = calories;
        this.type = SweetType.MARS;
    }
    public Mars(){
        this.type = SweetType.MARS;
    }
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

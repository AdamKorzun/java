package sweets;

public class Spartak extends AbstractCandy{
    public String filler;
    public int coefficient = 2;
    public Spartak(int weight, String name, int calories){
        this.weight = weight;
        this.name = name;
        this.calories = calories;
        this.type = SweetType.SPARTAK;
    }
    public Spartak(){
        this.type = SweetType.SPARTAK;
    }
    public int getWeight(){
        return  coefficient * weight;
    }
}

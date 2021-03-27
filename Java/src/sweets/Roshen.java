package sweets;

public class Roshen extends AbstractCandy{
    private String texture;
    private int coefficient = 3;
    public Roshen(int weight, String name, int calories){
        this.weight = weight;
        this.name = name;
        this.calories = calories;
        this.type = SweetType.ROSHEN;
    }
    public Roshen(){
        this.type = SweetType.ROSHEN;

    }
    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }
    public int getWeight(){
        return  coefficient * this.weight;
    }
}

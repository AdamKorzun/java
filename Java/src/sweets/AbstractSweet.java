package sweets;

public abstract class AbstractSweet {
    protected int weight;
    protected String name;
    protected int calories;
    public SweetType type;
    public AbstractSweet(){

    }

    public int getCalories() {
        return calories;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
         {
        this.weight = weight;
    }

}

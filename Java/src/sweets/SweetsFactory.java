package sweets;

public class SweetsFactory {
    public static AbstractSweet getInstance(SweetType type){
        if (type == SweetType.SNICKERS){
            return new Snickers();
        }
        else if (type ==  SweetType.MARS){
            return new Mars();
        }
        else if (type ==  SweetType.SPARTAK){
            return new Spartak();
        }
        else if (type ==  SweetType.ROSHEN){
            return new Roshen();
        }
        else{
            return null;
        }

    }
    public static AbstractSweet getInstance(SweetType type, int calories, String name, int weight){
        if (type == SweetType.SNICKERS){
            return new Snickers(calories, name, weight);
        }
        else if (type ==  SweetType.MARS){
            return new Mars(calories, name, weight);
        }
        else if (type ==  SweetType.SPARTAK){
            return new Spartak(calories, name, weight);
        }
        else if (type ==  SweetType.ROSHEN){
            return new Roshen(calories, name, weight);
        }
        else{
            return null;
        }

    }
}

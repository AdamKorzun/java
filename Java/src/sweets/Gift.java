package sweets;

import java.util.*;
public class Gift {
     private  List<AbstractSweet> sweetsList = new ArrayList<AbstractSweet>();
     public int getWeight(){
          int totalWeight = 0;
          for(AbstractSweet sweetVar : sweetsList){
               totalWeight+=sweetVar.getWeight();
          }

          return totalWeight;
     }
     public void addSweet(AbstractSweet sweet){
          sweetsList.add(sweet);
     }
     public List<AbstractSweet> getSweetsList(){
          return sweetsList;
     }

}

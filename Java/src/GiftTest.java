import sweets.*;
import utils.Writer;

import java.util.*;
public class GiftTest {

    public static void printMenu(){
        System.out.println("1 - Add sweet");
        System.out.println("2 - View gift");
        System.out.println("3 - Get weight");
        System.out.println("4 - quit");
    }
    public static void main(String[] args) {
        AbstractSweet snickers = SweetsFactory.getInstance(SweetType.SNICKERS, 10, "sweet1", 11);
        AbstractSweet mars = SweetsFactory.getInstance(SweetType.MARS, 400, "sweet2", 6);
        AbstractSweet spartak = SweetsFactory.getInstance(SweetType.SPARTAK, 300, "sweet3", 13);
        AbstractSweet roshen = SweetsFactory.getInstance(SweetType.ROSHEN);

        Gift gift = GiftFactory.getInstance();
        snickers.setWeight(11);
        mars.setWeight(6);
        spartak.setWeight(13);
        roshen.setWeight(15);
        gift.addSweet(roshen);
        gift.addSweet(spartak);
        gift.addSweet(mars);
        gift.addSweet(snickers);
        Scanner  sc = new Scanner(System.in);
        while (true){
            printMenu();
            int input = sc.nextInt();
            if (input == 1){
                System.out.println("Brand: ");
                System.out.println("1 - sweets.Roshen\n2 - sweets.Snickers\n3 - sweets.Mars \n4 - sweets.Spartak");
                SweetType sweetType = null;
                int option = sc.nextInt();
                if (option == 1){
                    sweetType = SweetType.ROSHEN;
                }
                else if (option == 2){
                    sweetType = SweetType.SNICKERS;
                }
                else if (option == 3){
                    sweetType = SweetType.MARS;
                }
                else if (option == 4){
                    sweetType = SweetType.SPARTAK;
                }

                System.out.println("Volume: ");
                int weight = sc.nextInt();
                AbstractSweet sweet = SweetsFactory.getInstance(sweetType);
                sweet.setWeight(weight);
                gift.addSweet(sweet);
            }
            else if (input == 2){
                Writer.writeGift(gift);
            }
            else if (input == 3){
                System.out.println("Weight: " + Integer.toString(gift.getWeight()));
            }
            else if (input == 4){
                break;
            }


        }

        System.out.println(gift.getWeight());
    }
}

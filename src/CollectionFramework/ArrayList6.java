package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList6 {
    public static void main(String[] args) {
        List fruitsBasket = new ArrayList();
        fruitsBasket.add("Mango");
        fruitsBasket.add("Banana");
        fruitsBasket.add("Orange");
        fruitsBasket.add("Pineapple");
        fruitsBasket.add("Apple");

        //here we are doing sorting of the list using Collections Class method sort()....
        Collections.sort(fruitsBasket);

        Iterator itr = fruitsBasket.iterator();
        while (itr.hasNext()) {
            System.out.println("Fruit in the Basket is -> " + itr.next());
        }

        System.out.println("--------------------------------------------");

        List servingPlate = fruitsBasket.subList(1, 3);
        System.out.println("Fruits in my plate is ->  " + servingPlate);

    }
}

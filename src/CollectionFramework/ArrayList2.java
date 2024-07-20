package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");


        System.out.println("These are the elements in ArrayList: "+list);
        System.out.println("Below are the elements of this ArrayList: ");
        Iterator itr = list.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


        System.out.println("-----------------");
        System.out.println("Element on 2nd Index...."+list.get(2));
        list.set(2,"THREE");
        System.out.println("Updated list:  "+list);
    }
}

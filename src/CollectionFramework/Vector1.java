package CollectionFramework;

import java.util.Vector;

//all the functions/ methods will be same from List
//Legacy class (Old class)
//duplicates are allowed
//thread-safe and hence it's slow, all events are done one by one....so it'll be slow and hence we generally don't use Vector
public class Vector1 {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add("Adil");
        v.add("Shabnam");
        v.add("Sidra");

        System.out.println(v);
    }
}

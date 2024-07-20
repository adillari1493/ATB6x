package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList4 {
    public static void main(String[] args) {
        List list = new ArrayList();
        //using add() method
        list.add(0);//index:0
        list.add(10);
        list.add(45);
        list.add(23);

        System.out.println(list); //[0, 10, 45, 23]
        //using remove(atIndex) method
        System.out.println(list.remove(1)); //10
        System.out.println(list);//[0, 45, 23]
        //using remove(atIndex, valueOfElement) method
        System.out.println(list.remove(Integer.valueOf(0)));//true
        System.out.println(list);//[45,23]

    }
}

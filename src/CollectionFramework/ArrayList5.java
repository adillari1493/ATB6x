package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList5 {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List list2 = new ArrayList();
        list2.add(4);
        list2.add(5);
        list2.add(6);


        System.out.println(list1);//[1,2,3]
        System.out.println(list2);//[4,5,6]
        list1.addAll(list2);
        System.out.println(list1);//[1,2,3,4,5,6]
        list1.removeAll(list2);
        System.out.println(list1);
    }
}

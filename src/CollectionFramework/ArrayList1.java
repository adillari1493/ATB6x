package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Adil");
        myList.add("Shabnam");
        myList.add("Sidra");
        myList.add("Adil"); //duplication

        System.out.println("This is initial list:  "+myList);
        System.out.println("Initial size of list is:  "+myList.size());

        myList.remove("Adil");
        System.out.println("This is updated list:  "+myList);
        System.out.println("Updates size of list is:  "+myList.size());

        System.out.println("________________________");
        System.out.println("Below List is through For loop");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        System.out.println("________________________");
        System.out.println("Below list is through Iterator");
        //iterating each element from the list using Iterator
        Iterator<String> itr = myList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Check this element is present or not?? "+myList.contains("Adil"));

    }


}

package HashingPratice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPractice {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("Gfg");
        h.add("Course");
        h.add("ide");

        System.out.println(h);
        System.out.println(h.size());
        System.out.println(h.contains("ide"));
        Iterator<String> i= h.iterator();
        while (i.hasNext()){
            System.out.println(i.next()+ " ");
        }
    }
}

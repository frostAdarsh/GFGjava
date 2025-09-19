package HashingPratice;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<String,Integer> m = new HashMap<String,Integer>();
        m.put("gfg",10);
        m.put("ide",5);
        m.put("course",15);

        System.out.println(m);
        System.out.println(m.size());

        for(Map.Entry<String,Integer> e : m.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }
    }



}

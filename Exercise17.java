import java.util.Map;
import java.util.TreeMap;

public class Exercise17 {

    /*
Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if
every key in the first map is also contained in the second map and maps to the same value in the second map. For
example, {Smith=949–0504, Marty=206–9024} is a submap of {Marty=206–9024, Hawking=123–4567,
Smith=949–0504, Newton=123–4567}. The empty map is a submap of every map.
     */


    public static void main(String[] args)
    {


        Map<String,String> map1 = new TreeMap<String,String>();
        Map<String,String> map2 = new TreeMap<String,String>();

        map1.put("Smith","949-0504");
        map1.put("Marty","206-9024");

        System.out.println("Map1 er: " + map1);

        map2.put("Marty","206-9024");
        map2.put("Smith","949-0504");
        map2.put("Hawking","123-4567");
        map2.put("Newton","123-4567");

        boolean sandt;

        sandt = supMap(map1,map2);
        System.out.println("Sammen er det således: " + sandt);

        map1.clear();

        sandt = supMap(map1,map2);

        System.out.println("Når parene er fjernet: " + sandt);




    }

    private static boolean supMap (Map<String,String> map1, Map<String,String> map2)
    {
        // Laver en variable
        int counter = 0;

        if (map1.isEmpty())
        {
            return true;
        }
        for (String navn :
                map1.keySet()) {
            String v1 = map1.get(navn);
            String v2 = map2.get(navn);

            if (v1 == v2)
                counter =+ 1;
        }
        return map1.size() == counter;
    }
}

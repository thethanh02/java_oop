import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class J07029 {
    
    public static boolean isPrime(Integer x) {
        if (x < 2) return false;
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0) return false;
        return true;
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Map<Integer, Integer> map = new TreeMap<> ();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        for (Integer i : a) 
            if (isPrime(i)) {
                if (map.containsKey(i))
                    map.put(i, map.get(i)+1);
                else
                    map.put(i, 1);
            }
        
        List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.reverse(list);
        
        for (Integer i = 0; i < 10; i++) 
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());

    }
}

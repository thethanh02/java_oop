import java.io.*;
import java.util.*;

public class J07004 {
    static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        try (Scanner sc = new Scanner(new File("DATA.in"))) {
            while (sc.hasNextLine()) {
                String data = sc.nextLine().trim();
                String[] token = data.split("\\s+");
                for (String i : token) {
                    int x = Integer.valueOf(i);
                    if (map.containsKey(x))
                        map.put(x, map.get(x)+1);
                    else
                        map.put(x, 1);
                }
            }
            for (int i : map.keySet())
                System.out.println(i + " " + map.get(i));
        } catch (FileNotFoundException e) {
        }
    }
}

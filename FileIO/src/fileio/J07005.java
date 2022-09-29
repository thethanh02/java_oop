import java.io.*;
import java.util.*;

public class J07005 {
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
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("DATA.IN")))) {
            while (true) {
                int x = in.readInt();
                if (map.containsKey(x))
                    map.put(x, map.get(x)+1);
                else
                    map.put(x, 1);
            }
            
        } catch (FileNotFoundException | EOFException e) {
        } catch (IOException e) {
        } finally {
            for (int i : map.keySet()) {
                System.out.println(i + " " + map.get(i));
            }
        }
    }
}

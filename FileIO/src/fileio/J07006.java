import java.io.*;
import java.util.*;

public class J07006 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        int[] res = new int[1000];
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> a = (ArrayList<Integer>) ois.readObject();
        for (Integer i : a) 
            res[i]++;

        for (int i = 0; i < 1000; i++)
            System.out.println(i + " " + res[i]);
    }
}

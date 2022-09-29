package javaoop;

import java.io.*;
import java.util.*;

class GameThu {
    private String id, name, timeArrive, timeLeave;

    public GameThu(String id, String name, String timeArrive, String timeLeave) {
        this.id = id;
        this.name = name;
        this.timeArrive = timeArrive;
        this.timeLeave = timeLeave;
    }
    
    public int getDiffMinute() {
        return 60*(Integer.valueOf(timeLeave.substring(0, 2)) - Integer.valueOf(timeArrive.substring(0, 2))) + (Integer.valueOf(timeLeave.substring(3)) - Integer.valueOf(timeArrive.substring(3)));
    }

    public String getDiffTimeString() {
        int minute = getDiffMinute();
        return minute/60 + " gio " + minute%60 + " phut";
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getDiffTimeString();
    }
    
}
public class TinhGio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<GameThu> list = new ArrayList<>();
        while (t-- > 0) {
            GameThu gameThu = new GameThu(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            list.add(gameThu);
        }
        
        Collections.sort(list, new Comparator<GameThu>() {
            @Override
            public int compare(GameThu o1, GameThu o2) {
                return Double.compare(o2.getDiffMinute(), o1.getDiffMinute());
            }
        });
        
        for (GameThu GameThu : list)
            System.out.println(GameThu);
    }
}

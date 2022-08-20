/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class FileIO {
    public static void readFile(ArrayList listObj, String file) {
        FileInputStream fis;
        ObjectInputStream ois;  
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            Object obj = null;
            while ((obj = ois.readObject()) != null) {
                Object o = (Object) obj;
                listObj.add(o);
            }
            fis.close();
            ois.close();
        } catch (IOException|ClassNotFoundException e) {
        }
    }
    public static void writeFile(ArrayList listObj, String file) {
        FileOutputStream fos;
        ObjectOutputStream oos;  
        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            for (Object o:listObj) {
                oos.writeObject(o);
            }
            fos.close();
            oos.close();
        } catch (IOException e) {
        }
    }
}

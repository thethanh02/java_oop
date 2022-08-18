/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class FileIO {
    public static void readFile(ArrayList listObj, String file) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = null;
            while ((obj = ois.readObject()) != null) {
                listObj.add(obj);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        }
    }
    public static void writeFile(ArrayList listObj, String file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (Object obj:listObj) {
                oos.writeObject(obj);
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }
}

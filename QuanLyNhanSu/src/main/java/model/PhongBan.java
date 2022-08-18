/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.*;
import java.io.Serializable;

/**
 *
 * @author PC
 */
public class PhongBan implements Serializable{
    private int id;
    private String name, descript;
    private double coefficient;
    public static int currentId = 99;

    public PhongBan(String name, String descript, double coefficient) throws deTrongException, heSoCongViecException {
        if (name.equals("") || descript.equals("")) throw new deTrongException();
                
        if (coefficient < 0 || coefficient > 20) throw new heSoCongViecException();
        
        this.id = ++currentId;
        this.name = name;
        this.descript = descript;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        PhongBan.currentId = currentId;
    }
    
    public Object[] toObjects() {
        return new Object[] {id, name, descript, coefficient};
    }
    
    public boolean trungNhau(PhongBan phongBan) {
        if (phongBan.name.equals(this.name) && phongBan.descript.equals(this.descript)) return true;
        return false;
    }
}

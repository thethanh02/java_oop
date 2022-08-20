/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import controller.*;
import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author PC
 */
public class NhanVien implements Serializable {
    private int id, wage;
    private String name, address, phone;
    public static int currentId = 999;

    public NhanVien(String name, String address, String phone, int wage) throws deTrongException, hoTenException, soDienThoaiException{
        if (name.equals("") || address.equals("") || phone.equals("")) throw new deTrongException();
        StringTokenizer str = new StringTokenizer(name);
        
        if (str.countTokens() <= 1) throw new hoTenException();
        
        if (!phone.matches("0\\d{9}")) throw new soDienThoaiException();
        
        this.id = ++currentId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.wage = wage;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        NhanVien.currentId = currentId;
    }
    
    public Object[] toObjects() {
        return new Object[] {id, name, address, phone, wage};
    }
    
    public boolean trungNhau(NhanVien nhanVien) {
        if (nhanVien.name.equals(this.name) && nhanVien.phone.equals(this.phone)) return true;
        return false;
    }
}

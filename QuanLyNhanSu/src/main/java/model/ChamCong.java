/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author PC
 */
public class ChamCong implements Serializable{
    private NhanVien nhanVien;
    private PhongBan phongBan;
    private int workDays;

    public ChamCong(NhanVien nhanVien, PhongBan phongBan, int workDays) {
        this.nhanVien = nhanVien;
        this.phongBan = phongBan;
        this.workDays = workDays;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
    
    public Object[] toObjects() {
        return new Object[] {nhanVien.getId(), nhanVien.getName(), phongBan.getId(), phongBan.getName(), workDays};
    }
    
    public boolean trungNhau(ChamCong chamCong) {
        if (chamCong.nhanVien.getId() == this.nhanVien.getId() && chamCong.phongBan.getId() == this.phongBan.getId()) return true;
        return false;
    }
    
    public boolean dieuKien(ChamCong chamCong) {
        if (chamCong.nhanVien.getId() == this.nhanVien.getId() && chamCong.phongBan.getId() != this.phongBan.getId()) return true;
        return false;
    }
}

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
public class PhanCong implements Serializable {
    DuAn duAn;
    NhanVien nhanVien;
    String soNgayThamGia, viTriCongViec;

    public PhanCong(DuAn duAn, NhanVien nhanVien, String soNgayThamGia, String viTriCongViec) {
        this.duAn = duAn;
        this.nhanVien = nhanVien;
        this.soNgayThamGia = soNgayThamGia;
        this.viTriCongViec = viTriCongViec;
    }
    
    public Object[] toObjects() {
        return new Object[] {duAn.getId(), duAn.getName(), nhanVien.getId(), nhanVien.getName(), soNgayThamGia, viTriCongViec};
    }
}

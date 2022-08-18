/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.FileIO;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

/**
 *
 * @author PC
 */
public class QuanLy extends javax.swing.JFrame {

    /**
     * Creates new form QuanLy
     */
    public static final String fileNhanVien = "NV.TXT", fileDuAn = "DA.TXT", filePhanCong = "PHANCONG.TXT";
    ArrayList<NhanVien> listNhanVien;
    ArrayList<DuAn> listDuAn;
    ArrayList<PhanCong> listPhanCong;
    DefaultTableModel tableNhanVien, tableDuAn, tablePhanCong;
    public QuanLy() {
        initComponents();
        listNhanVien = new ArrayList<>();
        listDuAn = new ArrayList<>();
        tableNhanVien = (DefaultTableModel)jTable2.getModel();
        tableDuAn = (DefaultTableModel)jTable1.getModel();
        tablePhanCong = (DefaultTableModel)jTable3.getModel();
        loadDataToFile();
        loadDataToBox();
        
        addDuAn.addActionListener((e) -> {
            String name = getNameDA.getText();
            String type = getType.getItemAt(getType.getSelectedIndex());
            String cost = getCost.getText();
            DuAn duAn = new DuAn(name, type, cost);
            tableDuAn.addRow(duAn.toObjects());
            listDuAn.add(duAn);
            loadDataToBox();
        });
        
        addNhanVien.addActionListener((e) -> {
            String name = getNameNV.getText();
            String address = getAddress.getText();
            String major = getMajor.getText();
            NhanVien nhanVien = new NhanVien(name, address, major);
            tableNhanVien.addRow(nhanVien.toObjects());
            listNhanVien.add(nhanVien);
            loadDataToBox();
        });
        
        addPhanCong.addActionListener((e) -> {
            DuAn duAn = listDuAn.get(getIdDA.getSelectedIndex());
            NhanVien nhanVien = listNhanVien.get(getIdNv.getSelectedIndex());
            String soNgayThamGia = getSoNgayThamGia.getText();
            String viTriCongViec = getViTriCongViec.getText();
            PhanCong phanCong = new PhanCong(duAn, nhanVien, soNgayThamGia, viTriCongViec);
            tablePhanCong.addRow(phanCong.toObjects());
            listPhanCong.add(phanCong);
        });
        
        saveDataToFile(saveDuAn, listDuAn, fileDuAn);
        saveDataToFile(saveNhanVien, listNhanVien, fileNhanVien);
        saveDataToFile(savePhanCong, listPhanCong, filePhanCong);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        getNameDA = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        getType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        getCost = new javax.swing.JTextField();
        addDuAn = new javax.swing.JButton();
        saveDuAn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        getNameNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        getMajor = new javax.swing.JTextField();
        addNhanVien = new javax.swing.JButton();
        saveNhanVien = new javax.swing.JButton();
        getAddress = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        addPhanCong = new javax.swing.JButton();
        savePhanCong = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        getIdDA = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        getIdNv = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        getSoNgayThamGia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        getViTriCongViec = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        sortByBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ten du an");

        jLabel2.setText("Kieu du an");

        getType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "nho", "trung binh", "lon" }));

        jLabel3.setText("Tong kinh phi");

        addDuAn.setText("Them");

        saveDuAn.setText("Luu");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma du an", "Ten du an", "Kieu du an", "Tong kinh phi"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Dia chi");
            jTable1.getColumnModel().getColumn(3).setHeaderValue("Chuyen mon");
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addDuAn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(saveDuAn))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getNameDA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getCost, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getNameDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addDuAn)
                    .addComponent(saveDuAn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Du An", jPanel1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma nhan vien", "Ho ten", "Dia chi", "Chuyen mon"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Dia chi");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Chuyen mon");
        }

        jLabel4.setText("Ho ten");

        jLabel5.setText("Dia chi");

        jLabel6.setText("Chuyen mon");

        addNhanVien.setText("Them");

        saveNhanVien.setText("Luu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addNhanVien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(saveNhanVien))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getNameNV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getMajor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getNameNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNhanVien)
                    .addComponent(saveNhanVien))
                .addGap(166, 266, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nhan Vien", jPanel2);

        addPhanCong.setText("Them");

        savePhanCong.setText("Luu");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ma du an", "Ten du an", "Ma nhan vien", "Ho ten", "So ngay tham gia", "Vi tri cong viec"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jLabel7.setText("Ma du an");

        jLabel8.setText("Ma nhan vien");

        jLabel9.setText("So ngay tham gia");

        jLabel10.setText("Vi tri cong viec");

        jButton1.setText("Sap xep");

        sortByBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "theo Ho ten nhan vien", "theo So ngay tham gia" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(jLabel7)
                        .addComponent(getIdNv, 0, 162, Short.MAX_VALUE)
                        .addComponent(getIdDA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(addPhanCong)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(savePhanCong))
                        .addComponent(getSoNgayThamGia)
                        .addComponent(getViTriCongViec))
                    .addComponent(sortByBox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(570, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(192, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getIdDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getIdNv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getSoNgayThamGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(getViTriCongViec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sortByBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPhanCong)
                    .addComponent(savePhanCong))
                .addGap(125, 125, 125))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3)
                    .addContainerGap()))
        );

        jTabbedPane1.addTab("Phan Cong", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDuAn;
    private javax.swing.JButton addNhanVien;
    private javax.swing.JButton addPhanCong;
    private javax.swing.JTextField getAddress;
    private javax.swing.JTextField getCost;
    private javax.swing.JComboBox<String> getIdDA;
    private javax.swing.JComboBox<String> getIdNv;
    private javax.swing.JTextField getMajor;
    private javax.swing.JTextField getNameDA;
    private javax.swing.JTextField getNameNV;
    private javax.swing.JTextField getSoNgayThamGia;
    private javax.swing.JComboBox<String> getType;
    private javax.swing.JTextField getViTriCongViec;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton saveDuAn;
    private javax.swing.JButton saveNhanVien;
    private javax.swing.JButton savePhanCong;
    private javax.swing.JComboBox<String> sortByBox;
    // End of variables declaration//GEN-END:variables

    private void loadDataToFile() {
        FileIO.readFile(listDuAn, fileDuAn);
        FileIO.readFile(listNhanVien, fileNhanVien);
        for (NhanVien nv:listNhanVien) {
            tableNhanVien.addRow(nv.toObjects());
        }
        for (DuAn da:listDuAn) {
            tableDuAn.addRow(da.toObjects());
        }
    }

    private void loadDataToBox() {
        getIdDA.removeAllItems();
        getIdNv.removeAllItems();
        for (DuAn da:listDuAn) {
            getIdDA.addItem(da.getId()+"");
        }
        for (NhanVien nv:listNhanVien) {
            getIdNv.addItem(nv.getId()+"");
        }
    }

    private void saveDataToFile(JButton save, ArrayList list, String file) {
        save.addActionListener((e) -> {
            FileIO.writeFile(list, file);
            JOptionPane.showMessageDialog(null, "Da luu vao "+file);
        });
    }
    
}

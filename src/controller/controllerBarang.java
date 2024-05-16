/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.daoBarang;
import java.util.List;
import javax.swing.JOptionPane;
import model.*;
import view.FormBarang;

/**
 *
 * @author USER
 */
public class controllerBarang {
    FormBarang frame;
    List<Barang> listBrg;
    daoBarang daoBrg = new daoBarang();
    Barang brg = new Barang();
    
    public controllerBarang(FormBarang frame){
        this.frame = frame;
        listBrg = daoBrg.getData();
    }
    
    public void tampil_tabel(){
        TableModelBarang tabelBrg = new TableModelBarang(listBrg);
        frame.getTblBarang().setModel(tabelBrg);
    }
    
    public void tambahData(){
        if (frame.getTxtKode().getText().equals("")){
            JOptionPane.showMessageDialog(null, "Kode Barang beum diisi");
        } else {
            brg.setKode(frame.getTxtKode().getText());
            brg.setNama(frame.getTxtNama().getText());
            brg.setJumlah(Interger.parseInt(frame.getTxtJumlah().getText()));
            brg.setHarga(Integer.parseInt(frame.getTxtHarga().getText()));
            
        }
    }
}

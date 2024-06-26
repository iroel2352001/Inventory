/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author User
 */
public class TabelModelCariBarang extends AbstractTableModel {
    List<Barang> listCariBrg;
    
    public TabelModelCariBarang(List<Barang> listBrg){
        this.listCariBrg = listBrg;
    }
    
    @Override
    public int getRowCount(){
        return listCariBrg.size();
    }
    
    @Override
    public int getColumnCount(){
        return 5;
    }
    
    @Override
    public Object getValueAt(int row, int column){
        return switch (column){
            case 0 -> listCariBrg.get(row).getKode();
            case 1 -> listCariBrg.get(row).getNama();
            case 2 -> listCariBrg.get(row).getJumlah();
            case 3 -> listCariBrg.get(row).getHarga();
            case 4 -> listCariBrg.get(row).getMerek();
            default -> null;
        };
    }
    
    @Override
    public String getColumnName(int column){
        return switch(column){
            case 0 -> "Kode Barang";
            case 1 -> "Nama Barang";
            case 2 -> "Jumlah";
            case 3 -> "Harga";
            case 4 -> "Merek";
            default -> null;
        };
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.controllerMenuUtama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import view.FormBarang;
/**
 *
 * @author USER
 */
public class MenuUtama extends javax.swing.JFrame {
    controllerMenuUtama cMenuUtama;
    
    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        cMenuUtama = new controllerMenuUtama(this);
        jam();
        Tampil_Tanggal();
    }

        private void jam() {
           try {
               ActionListener taskPerformer = new ActionListener() {
               public void actionPerformed(ActionEvent ae) {
               String Vjam;
               String noljam = "";
               String nolmenit = "";
               String noldetik = "";
               Calendar dt = Calendar.getInstance();
               int jam = dt.get(Calendar.HOUR_OF_DAY);
                    int menit = dt.get(Calendar.MINUTE);
                    int detik = dt.get(Calendar.SECOND);
                    if (jam < 10) {
                        noljam = "0";
                    }
                    if (menit < 10) {
                        nolmenit = "0";
                    }
                    if (detik < 10) {
                        noldetik = "0";
                    }
                    String Sjam = noljam + Integer.toString(jam);
                    String Smenit = nolmenit + Integer.toString(menit);
                    String Sdetik = noldetik + Integer.toString(detik);
                    Vjam = Sjam + ":" + Smenit + ":" + Sdetik;
                    txtwaktu.setText(Vjam);
                    }};
                    new javax.swing.Timer(1000, taskPerformer).start();
                    } catch (Exception e) {
                    System.out.println("Error : " + e);
                    }
                    }
        
    public void Tampil_Tanggal() {
       java.util.Date tglsekarang = new java.util.Date();
       SimpleDateFormat smpdtfmt = new SimpleDateFormat("dd MMMMMMMMM yyyy", Locale.getDefault());
       String tanggal = smpdtfmt.format(tglsekarang);
       txttanggal.setText(tanggal);
}               

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtwaktu = new javax.swing.JTextField();
        txttanggal = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        master = new javax.swing.JMenu();
        masterBarang = new javax.swing.JMenuItem();
        masterPegawai = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        masterLupaPass = new javax.swing.JMenuItem();
        pencarian = new javax.swing.JMenu();
        cariBarang = new javax.swing.JMenuItem();
        cariPegawai = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtwaktu.setText("jTextField1");

        txttanggal.setText("jTextField1");

        master.setText("Master");

        masterBarang.setText("Barang");
        masterBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterBarangActionPerformed(evt);
            }
        });
        master.add(masterBarang);

        masterPegawai.setText("Pegawai");
        masterPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterPegawaiActionPerformed(evt);
            }
        });
        master.add(masterPegawai);
        master.add(jSeparator1);

        masterLupaPass.setText("Lupa Password");
        masterLupaPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masterLupaPassActionPerformed(evt);
            }
        });
        master.add(masterLupaPass);

        jMenuBar1.add(master);

        pencarian.setText("Pencarian");

        cariBarang.setText("Cari Barang");
        cariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariBarangActionPerformed(evt);
            }
        });
        pencarian.add(cariBarang);

        cariPegawai.setText("Cari Pegawai");
        pencarian.add(cariPegawai);

        jMenuBar1.add(pencarian);

        keluar.setText("Keluar");
        jMenuBar1.add(keluar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtwaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masterBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterBarangActionPerformed
        // TODO add your handling code here:
        cMenuUtama.masukFormBarang();      
              
    }//GEN-LAST:event_masterBarangActionPerformed

    private void masterPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterPegawaiActionPerformed
        // TODO add your handling code here:
        cMenuUtama.masukFormPegawai();
    }//GEN-LAST:event_masterPegawaiActionPerformed

    private void masterLupaPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masterLupaPassActionPerformed
        // TODO add your handling code here:
        cMenuUtama.masukFormLupaPass();
             
    }//GEN-LAST:event_masterLupaPassActionPerformed

    private void cariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariBarangActionPerformed
        // TODO add your handling code here:
        cMenuUtama.masukFormCariBarang();
    }//GEN-LAST:event_cariBarangActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cariBarang;
    private javax.swing.JMenuItem cariPegawai;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu keluar;
    private javax.swing.JMenu master;
    private javax.swing.JMenuItem masterBarang;
    private javax.swing.JMenuItem masterLupaPass;
    private javax.swing.JMenuItem masterPegawai;
    private javax.swing.JMenu pencarian;
    private javax.swing.JTextField txttanggal;
    private javax.swing.JTextField txtwaktu;
    // End of variables declaration//GEN-END:variables
}

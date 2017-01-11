/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ProductController;
import com.alee.laf.WebLookAndFeel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/**
 *
 * @author sulistiana
 */
public class CashierView extends javax.swing.JFrame {

    /**
     * Creates new form CashierView
     */
    
//    JButton tambahkanBtn = new JButton();
    ProductController productController = new ProductController();
    
    
    public CashierView() {
        
        initComponents();
        
        
        productController.populateTable(productTable, "");
    }
    
    public JTable getProductTable(){
       
        return productTable;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        deletedBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchText = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        tambahkanBtn = new javax.swing.JButton();
        qtyText = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableBeli = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        cancelBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(480, 430));
        setResizable(false);
        setSize(new java.awt.Dimension(480, 460));
        getContentPane().setLayout(null);

        deletedBtn.setText("Hapus");
        deletedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletedBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletedBtn);
        deletedBtn.setBounds(100, 400, 86, 26);

        jButton1.setBackground(new java.awt.Color(55, 238, 231));
        jButton1.setText("Bayar");
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 400, 107, 26);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Bagian KASIR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(182, 6, 108, 21);

        searchText.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        searchText.setText("Masukan Kode Produk atau Nama Produk");
        searchText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchTextMouseClicked(evt);
            }
        });
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });
        searchText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchTextKeyPressed(evt);
            }
        });
        getContentPane().add(searchText);
        searchText.setBounds(190, 40, 270, 39);

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Stok", "Haraga"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(13, 89, 452, 102);

        tambahkanBtn.setText("Tambahkan");
        tambahkanBtn.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tambahkanBtnMouseMoved(evt);
            }
        });
        tambahkanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahkanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(tambahkanBtn);
        tambahkanBtn.setBounds(357, 197, 108, 32);

        qtyText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                qtyTextMouseClicked(evt);
            }
        });
        qtyText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyTextActionPerformed(evt);
            }
        });
        qtyText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                qtyTextKeyPressed(evt);
            }
        });
        getContentPane().add(qtyText);
        qtyText.setBounds(311, 197, 40, 32);

        tableBeli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode Barang", "Nama Barang", "Harga", "Jumlah", "Total Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tableBeli);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(10, 280, 452, 107);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 239, 477, 10);

        cancelBtn.setText("Batalkan");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cancelBtn);
        cancelBtn.setBounds(10, 400, 83, 26);

        jButton4.setText("Ubah");
        getContentPane().add(jButton4);
        jButton4.setBounds(200, 400, 81, 26);

        jButton5.setBackground(new java.awt.Color(243, 22, 19));
        jButton5.setText("Logout");
        getContentPane().add(jButton5);
        jButton5.setBounds(400, 10, 60, 26);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jButton6.setText("Data Transaksi");
        getContentPane().add(jButton6);
        jButton6.setBounds(10, 10, 120, 26);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Daftar barang yang dibeli");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 250, 180, 17);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Jumlah :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 200, 80, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/bg1.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 480, 460);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 
    private void qtyTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_qtyTextKeyPressed
        // TODO add your handling code here:
        //        qtyText.setText("");
    }//GEN-LAST:event_qtyTextKeyPressed

    private void qtyTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyTextActionPerformed

    private void qtyTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_qtyTextMouseClicked
        // TODO add your handling code here:
        qtyText.setText("");
    }//GEN-LAST:event_qtyTextMouseClicked

    private void searchTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchTextKeyPressed
        // TODO add your handling code here:
            productController.populateTable(productTable, searchText.getText());
    }//GEN-LAST:event_searchTextKeyPressed

    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchTextActionPerformed

    private void searchTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchTextMouseClicked
        // TODO add your handling code here:
        searchText.setText("");
    }//GEN-LAST:event_searchTextMouseClicked

    private void tambahkanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahkanBtnActionPerformed
        // TODO add your handling code here:
         if (productTable.getSelectedRowCount()== 0) {
            JOptionPane.showMessageDialog(this, "Pilih salah satu baris tabel");     
        } else {
             productController.selectedProduct(productTable,tableBeli, qtyText);
        }
        
    }//GEN-LAST:event_tambahkanBtnActionPerformed

    private void tambahkanBtnMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahkanBtnMouseMoved

    }//GEN-LAST:event_tambahkanBtnMouseMoved

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        productController.deleteDataAll(tableBeli);
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void deletedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletedBtnActionPerformed
        // TODO add your handling code here:
        if (tableBeli.getSelectedRowCount()== 0) {
            JOptionPane.showMessageDialog(this, "Pilih salah satu baris tabel!");     
        } else {
             productController.selectedDataCashier(tableBeli);
        }
    }//GEN-LAST:event_deletedBtnActionPerformed
    
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
            
            UIManager.setLookAndFeel ( NimbusLookAndFeel.class.getCanonicalName () );
//                    WebLookAndFeel.initializeManagers ();
                    
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {         
                WebLookAndFeel.install(true);
                
                try {
                    UIManager.setLookAndFeel(WebLookAndFeel.class.getCanonicalName());
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CashierView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(CashierView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CashierView.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(CashierView.class.getName()).log(Level.SEVERE, null, ex);
                }

//                WebLookAndFeel.setDeco
                new CashierView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deletedBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField qtyText;
    private javax.swing.JTextField searchText;
    private javax.swing.JTable tableBeli;
    private javax.swing.JButton tambahkanBtn;
    // End of variables declaration//GEN-END:variables
}

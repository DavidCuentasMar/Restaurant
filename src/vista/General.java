/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Controlador;
import modelo.ListaProducto;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import modelo.*;

/**
 *
 * @author dacuentas
 */
public class General extends javax.swing.JFrame implements Runnable {

    int x = 10;
    int y = 10;
    int NroPedido = 1;
    boolean ft = true;
    private int seg = 0;
    private boolean continuar = true;
    private Time i;
    Controlador controlador;
    public void setFt(boolean ft) {
        this.ft = ft;
    }

    public General() {
        controlador = new Controlador();
        initComponents();
        TextSeg.setText(String.valueOf(seg));
        BtnCocinar.setEnabled(true);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        platosPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        postresPanel = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane5 = new javax.swing.JScrollPane();
        bebidasPanel = new javax.swing.JPanel();
        Cocina = new javax.swing.JFrame();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableCocina = new javax.swing.JTable();
        infoPedidoBtn = new javax.swing.JButton();
        BtnCocinar = new javax.swing.JButton();
        TextSeg = new javax.swing.JTextField();
        infoPedido = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        MeseroComb = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        MesaSpinner = new javax.swing.JSpinner();
        BtnPedidos = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablePedidos = new javax.swing.JTable();
        JKitchen = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/platos.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bebidas.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/postres.png"))); // NOI18N

        platosPanel.setToolTipText("");
        platosPanel.setLayout(new java.awt.GridLayout(2, 2));
        jScrollPane1.setViewportView(platosPanel);

        postresPanel.setLayout(new java.awt.GridLayout(2, 2));
        jScrollPane4.setViewportView(postresPanel);

        bebidasPanel.setLayout(new java.awt.GridLayout(2, 2));
        jScrollPane5.setViewportView(bebidasPanel);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu.getContentPane());
        Menu.getContentPane().setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MenuLayout.createSequentialGroup()
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5)))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        TableCocina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No.Pedido", "No.Mesa", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TableCocina);

        infoPedidoBtn.setText("Info. Pedido");
        infoPedidoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoPedidoBtnActionPerformed(evt);
            }
        });

        BtnCocinar.setText("Cocinar");
        BtnCocinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCocinarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CocinaLayout = new javax.swing.GroupLayout(Cocina.getContentPane());
        Cocina.getContentPane().setLayout(CocinaLayout);
        CocinaLayout.setHorizontalGroup(
            CocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CocinaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(CocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CocinaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infoPedidoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnCocinar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(CocinaLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(TextSeg, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CocinaLayout.setVerticalGroup(
            CocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CocinaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CocinaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CocinaLayout.createSequentialGroup()
                        .addComponent(infoPedidoBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnCocinar)
                        .addGap(70, 70, 70)
                        .addComponent(TextSeg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout infoPedidoLayout = new javax.swing.GroupLayout(infoPedido.getContentPane());
        infoPedido.getContentPane().setLayout(infoPedidoLayout);
        infoPedidoLayout.setHorizontalGroup(
            infoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        infoPedidoLayout.setVerticalGroup(
            infoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mesero:");

        MeseroComb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesero 1", "Mesero 2", "Mesero 3", "Mesero 4" }));
        MeseroComb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeseroCombActionPerformed(evt);
            }
        });

        jLabel5.setText("Mesa:");

        MesaSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));

        BtnPedidos.setText("Realizar Pedido");
        BtnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPedidosActionPerformed(evt);
            }
        });

        TablePedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Tipo", "Precio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablePedidos);

        JKitchen.setText("Ver Cocina");
        JKitchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JKitchenActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/menu.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnPedidos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JKitchen))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MeseroComb, 0, 94, Short.MAX_VALUE)
                            .addComponent(MesaSpinner))
                        .addGap(57, 57, 57)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(MeseroComb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(MesaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnPedidos)
                    .addComponent(JKitchen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPedidosActionPerformed
        DefaultTableModel model = (DefaultTableModel) TablePedidos.getModel();
        if (model.getRowCount() != 0) {
            ListaProducto lp = new ListaProducto();
            String numeroMesa = MesaSpinner.getValue().toString();
            String numeroMesero = MeseroComb.getSelectedItem().toString();
            Object[] Row = new Object[7];
            String nombreProducto, tipoProducto;

            for (int i = 0; i < TablePedidos.getRowCount(); i++) {
                nombreProducto = TablePedidos.getValueAt(i, 0).toString();
                tipoProducto = TablePedidos.getValueAt(i, 1).toString();
                Producto p = new Producto(nombreProducto, tipoProducto);
                lp.LlenarList(p); //Creo una lista con todos los productos que va a 
                // tener el pedido
            }
            Pedido p = new Pedido(NroPedido, numeroMesa, numeroMesero, lp);
//            p.showPedidoList();
            controlador.addPedidoToList(p); // Agrega el pedido a la lista de todos
            // los pedidos del restaurante

            DefaultTableModel modelo = (DefaultTableModel) TableCocina.getModel();
            Row[0] = NroPedido;
            Row[1] = numeroMesa;
            Row[2] = "En Espera";

            modelo.addRow(Row);
            for (int i = 0; i < TablePedidos.getRowCount(); i++) {//Limpiar tabla
                model.removeRow(i);
                i -= 1;
            }
            TablePedidos.setModel(model);
            NroPedido++;
        } else {
            System.out.println("Nada para agregar");
        }

    }//GEN-LAST:event_BtnPedidosActionPerformed
    private void addToTable(String p, String type) {
        DefaultTableModel model = (DefaultTableModel) TablePedidos.getModel();
        String precio = "";
        String ruta = "";
        if (type.equals("Bebida") || type.equals("Postre")) {
            ruta = "archivos/productos.txt";
        } else {
            ruta = "archivos/platos.txt";
        }
        controlador.MostrarPrecio(p, precio, ruta, TablePedidos, type);

        //abrir archivo, encontrar plato y poner precio.
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu.setVisible(true);
        Menu.setSize(500, 320);

        if (ft == true) { // para que cuando entren no se dupliquen datos
            controlador.FormarMenu(platosPanel, bebidasPanel, postresPanel);
            Component[] component = platosPanel.getComponents();
            for (Component component1 : component) {
                component1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        addToTable(e.getComponent().getName(), "Plato");
                    }
                });
            }
            Component[] component2 = bebidasPanel.getComponents();
            for (Component component1 : component2) {
                component1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        addToTable(e.getComponent().getName(), "Bebida");
                    }
                });
            }
            Component[] component3 = postresPanel.getComponents();
            for (Component component1 : component3) {
                component1.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent e) {
                        addToTable(e.getComponent().getName(), "Postre");
                    }
                });
            }
            ft = false;
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void MeseroCombActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeseroCombActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MeseroCombActionPerformed

    private void JKitchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JKitchenActionPerformed
        Cocina.setVisible(true);
        Cocina.setSize(400, 380);
    }//GEN-LAST:event_JKitchenActionPerformed

    private void infoPedidoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoPedidoBtnActionPerformed
        if (TableCocina.getSelectedRow()!=-1) {
            int row = TableCocina.getSelectedRow();
            System.out.println("No.Pedido: " + TableCocina.getValueAt(row, 0).toString());
            System.out.println("No.Mesa: " + TableCocina.getValueAt(row, 1).toString());
            Pedido p = controlador.findPedido(TableCocina.getValueAt(row, 0).toString());
    //        p.showPedidoList();
            String productosTxt = p.getProductosTxt();
            System.out.println("------\n" + productosTxt);
            JOptionPane.showMessageDialog(this,
                    "No.Pedido: " + TableCocina.getValueAt(row, 0).toString()
                    + "\nNo.Mesa: " + TableCocina.getValueAt(row, 1).toString()
                    + "\n----------\n" + productosTxt);            
        }        
    }//GEN-LAST:event_infoPedidoBtnActionPerformed

    private void BtnCocinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCocinarActionPerformed
        continuar = true;
        BtnCocinar.setEnabled(false);
        resetSeg();
        i = null;
        i = new Time(this);
        i.start();
        
    }//GEN-LAST:event_BtnCocinarActionPerformed

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
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(General.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new General().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCocinar;
    private javax.swing.JButton BtnPedidos;
    private javax.swing.JFrame Cocina;
    private javax.swing.JButton JKitchen;
    private javax.swing.JFrame Menu;
    private javax.swing.JSpinner MesaSpinner;
    private javax.swing.JComboBox<String> MeseroComb;
    private javax.swing.JTable TableCocina;
    private javax.swing.JTable TablePedidos;
    private javax.swing.JTextField TextSeg;
    private javax.swing.JPanel bebidasPanel;
    private javax.swing.JFrame infoPedido;
    private javax.swing.JButton infoPedidoBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel platosPanel;
    private javax.swing.JPanel postresPanel;
    // End of variables declaration//GEN-END:variables
      @Override
    public void run() {

    }

    public synchronized int aumentSeg() {
        seg++;
        TextSeg.setText(String.valueOf(seg));
        return seg;
    }

    public synchronized int getSeg() {
        return seg;
    }

    public void resetSeg() {
        TextSeg.setText(String.valueOf("0"));
        seg = 0;
    }

    public synchronized boolean isContinuar() {
        return continuar;
    }

    public synchronized void seguir() {
        continuar = true;
    }

    public synchronized void parar() {
        BtnCocinar.setEnabled(true);
        continuar = false;
        int row = TableCocina.getSelectedRow();
        TableCocina.setValueAt("Listo", row, 2);
    }
}

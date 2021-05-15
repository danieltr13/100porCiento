/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import control.FNegocio;
import control.INegocio;
import dominio.DetallePedido;
import dominio.Estado;
import dominio.Pedido;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MSI GF63
 */
public class BusquedaPedido extends javax.swing.JFrame {

    private final INegocio fnegocios;
    private List<Pedido> pedidos;
    private Pedido pedidoAux;

    /**
     * Creates new form BusquedaProducto
     */
    public BusquedaPedido() {
        initComponents();
        this.setLocationRelativeTo(null);        
        this.setTitle("Frm: Consulta rPedido");
        fnegocios = new FNegocio();
         pedidos = fnegocios.obtenerPedidos();
         this.cargarTabla();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtSearch = new javax.swing.JTextField();
        cbxTipos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedidos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCambiarEstado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));

        jPanel3.setBackground(new java.awt.Color(245, 235, 220));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 23)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dona32px.png"))); // NOI18N
        jLabel3.setText("100%");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, -1, 60));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 99, 57));
        jLabel6.setText("Consultar Pedidos");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, -1, 60));

        jtxtSearch.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jtxtSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        cbxTipos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cbxTipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Cliente", "Estado" }));
        cbxTipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTiposActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));

        tblPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));
        tblPedidos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Productos", "Total", "Cliente", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPedidos);
        if (tblPedidos.getColumnModel().getColumnCount() > 0) {
            tblPedidos.getColumnModel().getColumn(0).setResizable(false);
            tblPedidos.getColumnModel().getColumn(1).setResizable(false);
        }

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(230, 99, 57));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(230, 99, 57));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(230, 99, 57));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCambiarEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnCambiarEstado.setForeground(new java.awt.Color(230, 99, 57));
        btnCambiarEstado.setText("Cambiar estado");
        btnCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCambiarEstado)
                        .addGap(229, 229, 229)
                        .addComponent(btnEditar)
                        .addGap(15, 15, 15)
                        .addComponent(btnEliminar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(cbxTipos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbxTipos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnEditar)
                    .addComponent(btnCambiarEstado))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxTiposActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        this.eliminarPedido();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        this.cargarPedido();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPedidos menu = new MenuPedidos();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarEstadoActionPerformed
        this.cambiarEstado();
    }//GEN-LAST:event_btnCambiarEstadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.regresarAlMenu();
    }//GEN-LAST:event_jLabel3MouseClicked
     private void regresarAlMenu() {
        MenuPedidos menu = new MenuPedidos();
        this.dispose();
        menu.setVisible(true);
    }
    private void buscar(){
        switch (cbxTipos.getSelectedIndex()) {
            case 0:
                Pedido p= fnegocios.obtenerPedidoPorId(Long.valueOf(jtxtSearch.getText()));
                pedidos.clear();
                if (p!=null) {
                    pedidos.add(p);
                }
                if (pedidos.isEmpty()) {
                    JOptionPane.showMessageDialog(this,"No existen pedidos con ese id", "Error id", JOptionPane.ERROR_MESSAGE);
                } else{this.cargarTabla();}
                break;
            case 1:
                pedidos = fnegocios.obtenerPedidosCliente(jtxtSearch.getText());
                if (pedidos.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No se encontro al cliente"
                            + "o el cliente no contiene pedidos", "No se encontró cliente", JOptionPane.ERROR_MESSAGE);
                }else{
                    this.cargarTabla();
                }
                break;
            case 2:
                pedidos = fnegocios.obtenerPedidosEstado(jtxtSearch.getText().toUpperCase());
                this.cargarTabla();
            default:
                break;
        }
    }
    private void cambiarEstado() {
        int fila = this.tblPedidos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Pedido.",
                    "Precaución", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblPedidos.getModel();
            Long idPedido = (Long) modelo.getValueAt(fila, 0);
            //obtenerlo de memoria
            Pedido pedido = fnegocios.obtenerPedidoPorId(idPedido);
            if (pedido != null) {
                pedidoAux = pedido;
                if (!pedidoAux.getEstado().equals(Estado.LISTO)) {
                    EstadoPedido estado = new EstadoPedido(this, rootPaneCheckingEnabled, pedidoAux.getEstado(), this);
                    estado.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "El producto ya se encuentra listo :).",
                        "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el pedido.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void obtenerPedidos() {
        this.pedidos = fnegocios.obtenerPedidos();
    }

    private void eliminarPedido() {
        int fila = this.tblPedidos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Pedido.",
                    "Precaución", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblPedidos.getModel();
            Long idPedido = (Long) modelo.getValueAt(fila, 0);
            //obtenerlo de memoria
            Pedido pedido = fnegocios.obtenerPedidoPorId(idPedido);
            if (pedido != null) {
                if (fnegocios.eliminarPedido(pedido.getId())) {
                    JOptionPane.showMessageDialog(rootPane, "Pedido Eliminado");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el pedido\nSu estado ya no es esperando",
                            "Producto elaborandose", JOptionPane.ERROR_MESSAGE);
                }
                this.obtenerPedidos();
                this.cargarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el pedido.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarTabla() {
        if (pedidos != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblPedidos.getModel();
            modelo.setRowCount(0);
             for (Pedido c : pedidos) {
                modelo.addRow(this.toArray(c));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sin resultados.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private Object[] toArray(Pedido p) {
        return new Object[]{
            p.getId(),
            this.getTotalProducts(p),
            p.getTotal(),
            p.getCliente().getNombre(),
            p.getEstado()
        };
    }

    private int getTotalProducts(Pedido p) {
        int total = 0;
        for (DetallePedido detallePedido : p.getDetallePedido()) {
            total += detallePedido.getCantidad();
        }
        //System.out.println(p.getDetallePedido().get(0).getCantidad());
        return total;
    }

    private void cargarPedido() {
        int fila = this.tblPedidos.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Pedido.",
                    "Precaución", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblPedidos.getModel();
            Long idPedido = (Long) modelo.getValueAt(fila, 0);
            //obtenerlo de memoria
            Pedido pedido = fnegocios.obtenerPedidoPorId(idPedido);
            
            if (pedido != null) {
                if (pedido.getEstado()!=Estado.ESPERANDO) {
                    JOptionPane.showMessageDialog(this, "Solo se pueden editar pedidos con el estado de esperando"
                            + "", "Error editar pedido", JOptionPane.ERROR_MESSAGE);
                }else{
                    PedidoF p = new PedidoF();
                    p.setProductsAdded(new ArrayList<>(pedido.getDetallePedido()));
                    p.setPedidoActualizado(pedido);
                    p.setVisible(true);
                    this.dispose();
            }
               
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el pedido.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void cambiarEstado(Estado estado) {
        this.pedidoAux.setEstado(estado);
        this.actualizar();
    }

    public void actualizar() {
        if (fnegocios.actualizarPedido(pedidoAux)) {
            JOptionPane.showMessageDialog(rootPane, "Estado del pedido actualizado");
            this.obtenerPedidos();
            this.cargarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se puedo actualizar el estado del pedido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCambiarEstado;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbxTipos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtxtSearch;
    private javax.swing.JTable tblPedidos;
    // End of variables declaration//GEN-END:variables
}

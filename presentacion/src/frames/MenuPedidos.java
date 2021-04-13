/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author fermi
 */
public class MenuPedidos extends javax.swing.JFrame {

    /**
     * Creates new form MenuPedidos
     */
    public MenuPedidos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jpnAgregar = new javax.swing.JPanel();
        iconAgregar = new javax.swing.JLabel();
        lblAgregar = new javax.swing.JLabel();
        jpnConsultar = new javax.swing.JPanel();
        iconConsultar = new javax.swing.JLabel();
        lblConsultar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57), 3));

        jPanel2.setBackground(new java.awt.Color(245, 235, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 221, 221)));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dona64px.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 99, 57));
        jLabel6.setText("MENÚ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpnAgregar.setBackground(new java.awt.Color(255, 255, 255));
        jpnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));
        jpnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnAgregarMouseClicked(evt);
            }
        });

        iconAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Chef_icon-icons.com_53212 (2).png"))); // NOI18N
        iconAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconAgregarMouseClicked(evt);
            }
        });

        lblAgregar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblAgregar.setForeground(new java.awt.Color(230, 99, 57));
        lblAgregar.setText("Agregar Pedido");
        lblAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAgregarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnAgregarLayout = new javax.swing.GroupLayout(jpnAgregar);
        jpnAgregar.setLayout(jpnAgregarLayout);
        jpnAgregarLayout.setHorizontalGroup(
            jpnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(iconAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAgregar)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jpnAgregarLayout.setVerticalGroup(
            jpnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
            .addGroup(jpnAgregarLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnConsultar.setBackground(new java.awt.Color(255, 255, 255));
        jpnConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));
        jpnConsultar.setPreferredSize(new java.awt.Dimension(362, 112));
        jpnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpnConsultarMouseClicked(evt);
            }
        });

        iconConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/checklist_25365 (2).png"))); // NOI18N
        iconConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconConsultarMouseClicked(evt);
            }
        });

        lblConsultar.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        lblConsultar.setForeground(new java.awt.Color(230, 99, 57));
        lblConsultar.setText("Consultar Pedidos");
        lblConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConsultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpnConsultarLayout = new javax.swing.GroupLayout(jpnConsultar);
        jpnConsultar.setLayout(jpnConsultarLayout);
        jpnConsultarLayout.setHorizontalGroup(
            jpnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnConsultarLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnConsultarLayout.setVerticalGroup(
            jpnConsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
            .addGroup(jpnConsultarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblConsultar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jpnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAgregarMouseClicked
        mostrarAgregar();
    }//GEN-LAST:event_lblAgregarMouseClicked

    private void jpnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnAgregarMouseClicked
        mostrarAgregar();
    }//GEN-LAST:event_jpnAgregarMouseClicked

    private void iconAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconAgregarMouseClicked
        mostrarAgregar();
    }//GEN-LAST:event_iconAgregarMouseClicked

    private void jpnConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpnConsultarMouseClicked
        mostrarConsultar();
    }//GEN-LAST:event_jpnConsultarMouseClicked

    private void iconConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconConsultarMouseClicked
        mostrarConsultar();
    }//GEN-LAST:event_iconConsultarMouseClicked

    private void lblConsultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConsultarMouseClicked
        mostrarConsultar();
    }//GEN-LAST:event_lblConsultarMouseClicked

    private void mostrarAgregar() {
        PedidoF pedido = new PedidoF();
        pedido.setVisible(true);
        this.dispose();
    }

    private void mostrarConsultar() {
        BusquedaProducto buscar = new BusquedaProducto();
        buscar.setVisible(true);
        this.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAgregar;
    private javax.swing.JLabel iconConsultar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jpnAgregar;
    private javax.swing.JPanel jpnConsultar;
    private javax.swing.JLabel lblAgregar;
    private javax.swing.JLabel lblConsultar;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import com.sun.java.swing.plaf.windows.WindowsScrollBarUI;
import control.FNegocio;
import control.INegocio;
import dominio.Categoria;
import dominio.DetalleIngrediente;
import dominio.Ingrediente;
import dominio.Producto;
import dominio.ProductoListo;
import dominio.ProductoPreparado;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda Miranda
 */
public class RegistrarProducto extends javax.swing.JFrame {

    private ConsultarProductos busqueda;
    private INegocio fNegocio;
    private List<Categoria> categorias;
    private Producto productoActualizado;
    private List<Ingrediente> ingredientes;
    private List<DetalleIngrediente> ingredientesAgregados;
    private DefaultListModel modeloIngredientes;
    private final INegocio fnegocios;

    /**
     * Creates new form RegistrarPedido
     */
    public RegistrarProducto() {
        initComponents();
        this.setTitle("FrmRegistrarPedido");
        this.setLocationRelativeTo(null);
        this.fNegocio = new FNegocio();
        this.categorias = new ArrayList<>();
        this.ingredientes = new ArrayList<>();
        this.ingredientesAgregados = new ArrayList<>();
        this.modeloIngredientes = new DefaultListModel();
        this.jListIngredientes.setModel(modeloIngredientes);
        this.fnegocios = new FNegocio();
        this.setCategorias();
        this.obtenerIngredientes();
        this.cargarTabla();
        this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }

    private void setCategorias() {
        //SANDWICHES, LICUADOS, JUGO, CAFES, FRAPPES, SNACKS, POSTRES
        categorias.add(Categoria.SANDWICHES);
        categorias.add(Categoria.LICUADOS);
        categorias.add(Categoria.JUGOS);
        categorias.add(Categoria.CAFES);
        categorias.add(Categoria.FRAPPES);
        categorias.add(Categoria.SNACKS);
        categorias.add(Categoria.POSTRES);
        this.cboxCategoria.addItem(categorias.get(0));
        this.cboxCategoria.addItem(categorias.get(1));
        this.cboxCategoria.addItem(categorias.get(2));
        this.cboxCategoria.addItem(categorias.get(3));
        this.cboxCategoria.addItem(categorias.get(4));
        this.cboxCategoria.addItem(categorias.get(5));
        this.cboxCategoria.addItem(categorias.get(6));
    }

    private void modifyScrollsAdded() {

        jsingredientes.getVerticalScrollBar().setUI(new WindowsScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new java.awt.Color(219, 219, 219);
            }
        });
        jsingredientes.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
    }

    private void modifyScrollsAdded2() {

        jsproductos.getVerticalScrollBar().setUI(new WindowsScrollBarUI() {
            @Override
            protected void configureScrollBarColors() {
                this.thumbColor = new java.awt.Color(219, 219, 219);
            }
        });
        jsproductos.getVerticalScrollBar().setPreferredSize(new Dimension(10, 0));
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cboxCategoria = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnHGuardar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cboxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jsingredientes = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        jsproductos = new javax.swing.JScrollPane();
        jListIngredientes = new javax.swing.JList<>();
        btnAgregar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));

        jPanel2.setBackground(new java.awt.Color(245, 235, 220));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 221, 221)));
        jPanel2.setPreferredSize(new java.awt.Dimension(426, 70));

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(230, 99, 57));
        jLabel6.setText("Registrar Producto");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 23)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dona32px.png"))); // NOI18N
        jLabel7.setText("100%");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel7)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Nombre");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Categoría");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Precio");

        txtName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        cboxCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        txtPrecio.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(230, 99, 57));
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnHGuardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnHGuardar.setForeground(new java.awt.Color(230, 99, 57));
        btnHGuardar.setText("Guardar");
        btnHGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHGuardarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Tipo");

        cboxTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cboxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PREPARADO", "LISTO" }));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Cantidad");

        txtCantidad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        jsingredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));

        tblIngredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));
        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jsingredientes.setViewportView(tblIngredientes);

        jListIngredientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 99, 57)));
        jListIngredientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListIngredientesMouseClicked(evt);
            }
        });
        jListIngredientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jListIngredientesKeyTyped(evt);
            }
        });
        jsproductos.setViewportView(jListIngredientes);

        btnAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(230, 99, 57));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Lista ingredientes");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Ingredientes del producto");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(15, 15, 15)
                                        .addComponent(btnHGuardar))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel5))
                                            .addGap(15, 15, 15)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboxTipo, 0, 147, Short.MAX_VALUE)
                                                .addComponent(cboxCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jsproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)))))
                        .addGap(0, 40, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAgregar)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jsingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cboxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cboxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)
                        .addComponent(jsingredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(15, 15, 15)
                        .addComponent(jsproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnHGuardar)
                    .addComponent(btnAgregar))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHGuardarActionPerformed
        if (productoActualizado == null) {
            addProducto();
        } else {
            updateProducto();
        }
    }//GEN-LAST:event_btnHGuardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        this.cargarIngrediente();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.regresarAlMenu();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed

    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        if (txtName.getText().length() == 21) {
            evt.consume();
        }
        if (!Character.isLetter(evt.getKeyChar())) {
            if (!Character.isSpaceChar(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.') {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && txtPrecio.getText().contains(".")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        if (txtCantidad.getText().length() == 11) {
            evt.consume();
        }
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void jListIngredientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jListIngredientesKeyTyped

    }//GEN-LAST:event_jListIngredientesKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jListIngredientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListIngredientesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jListIngredientesMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MenuPedidos menu = new MenuPedidos();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    public void limpiar() {
        this.txtName.setText("");
        this.tblIngredientes.clearSelection();
        this.txtCantidad.setText("");
        this.txtPrecio.setText("");
    }

    private void regresarAlMenu() {
        MenuPedidos menu = new MenuPedidos();
        this.dispose();
        menu.setVisible(true);
    }

    private void agregarIngredientesActualizado() {
        for (DetalleIngrediente dIngrediente : productoActualizado.getDetalleIngredientes()) {
            this.agregarIngrediente(dIngrediente);
        }
    }

    private void cargarIngrediente() {
        int fila = this.tblIngredientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Ingrediente.",
                    "Precaución", JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) this.tblIngredientes.getModel();
            Long idIngrediente = (Long) modelo.getValueAt(fila, 0);
            Ingrediente ingrediente = fnegocios.obtenerIngredientePorId(idIngrediente);
            if (ingrediente != null) {
                /*
                    CAMBIAR TOSTRING DE INGREDIENTE PARA QUE SALGA BIEN EN LA LISTA
                    O CAMBIAR MODELO PARA QUE SEA UN STRING, CREAR UN METODO PARA BUSCAR Y LUEGO HACER CUALQUIER OTRA OPCIÓN.
                 */
                agregarIngrediente(crearDetalleIngredientes(ingrediente));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el producto.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void agregarIngrediente(DetalleIngrediente ingrediente) {
        this.ingredientesAgregados.add(ingrediente);
        this.modeloIngredientes.addElement(ingrediente.getIngrediente());
    }

    private void obtenerIngredientes() {
        this.ingredientes = fNegocio.obtenerIngredientes();
    }

    private void cargarTabla() {
        if (ingredientes != null) {
            DefaultTableModel modelo = (DefaultTableModel) tblIngredientes.getModel();
            modelo.setRowCount(0);
            for (Ingrediente c : ingredientes) {
                modelo.addRow(this.toArray(c));
            }
        } else {
            JOptionPane.showMessageDialog(this, "Sin resultados.",
                    "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private Object[] toArray(Ingrediente p) {
        return new Object[]{
            p.getId(),
            p.getNombre()
        };
    }

    public void cargarProducto(Producto producto) {
        this.productoActualizado = producto;
        this.txtName.setText(producto.getNombre());
        this.cboxCategoria.setSelectedItem(producto.getCategoria());
        this.txtPrecio.setText(producto.getPrecio().toString());
        this.cboxTipo.setEnabled(false);
        this.txtCantidad.setText(producto.getCantidad().toString());
        this.agregarIngredientesActualizado();
    }

    private void addProducto() {
        String nombre = this.txtName.getText();
        Categoria categoria = (Categoria) this.cboxCategoria.getSelectedItem();
        float precio = Float.parseFloat(this.txtPrecio.getText());
        String tipo = this.cboxTipo.getSelectedItem().toString();
        int cantidad = Integer.valueOf(this.txtCantidad.getText());
        Producto producto;
        if (categoria.equals("PREPARADO")) {
            producto = new ProductoPreparado(tipo, nombre, precio, cantidad, categoria);
        } else {
            producto = new ProductoListo(nombre, precio, cantidad, categoria);
        }
        addProductoToDetalle(producto);
        producto.setDetalleIngredientes(ingredientesAgregados);
        if (fNegocio.guardarProducto(producto)) {
            JOptionPane.showMessageDialog(rootPane, "Producto guardado");
            this.ingredientesAgregados = new ArrayList<>();
            this.regresarBusquedaProducto();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al guardar");
        }
    }

    private void regresarBusquedaProducto() {
        this.busqueda = new ConsultarProductos();
        busqueda.setVisible(true);
        this.dispose();
    }

    private void addProductoToDetalle(Producto producto) {
        for (DetalleIngrediente ia : ingredientesAgregados) {
            ia.setProducto(producto);
        }
    }

    private DetalleIngrediente crearDetalleIngredientes(Ingrediente ingrediente) {
        DetalleIngrediente dt = new DetalleIngrediente();
        dt.setIngrediente(ingrediente);
        return dt;
    }

    private void updateProducto() {
        String nombre = this.txtName.getText();
        Categoria categoria = (Categoria) this.cboxCategoria.getSelectedItem();
        float precio = Float.parseFloat(this.txtPrecio.getText());
        int cantidad = Integer.valueOf(this.txtCantidad.getText());
        this.productoActualizado.setNombre(nombre);
        this.productoActualizado.setCategoria(categoria);
        this.productoActualizado.setPrecio(precio);
        this.productoActualizado.setCantidad(cantidad);
        addProductoToDetalle(productoActualizado);
        this.productoActualizado.setDetalleIngredientes(ingredientesAgregados);
        System.out.println(ingredientesAgregados);
        if (fNegocio.actualizarProducto(productoActualizado)) {
            this.productoActualizado = null;
            JOptionPane.showMessageDialog(rootPane, "Producto actualizado");
            this.regresarBusquedaProducto();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al actualizar producto");
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnHGuardar;
    private javax.swing.JComboBox<Categoria> cboxCategoria;
    private javax.swing.JComboBox<String> cboxTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListIngredientes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jsingredientes;
    private javax.swing.JScrollPane jsproductos;
    private javax.swing.JTable tblIngredientes;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

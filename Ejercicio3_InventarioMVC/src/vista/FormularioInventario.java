package vista;

import modelo.Producto;
import controlador.ControladorProducto;
import javax.swing.JOptionPane;




public class FormularioInventario extends javax.swing.JFrame {

  
    public FormularioInventario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INVENTARIO");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Precio:");

        jLabel3.setText("Cantidad:");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("ID:");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar inventario");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("INVENTARIO");

        jLabel6.setText("inventario...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID)
                                    .addComponent(txtNombre)
                                    .addComponent(txtPrecio)
                                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addGap(28, 28, 28)
                                .addComponent(btnMostrar)
                                .addGap(22, 22, 22)))
                        .addContainerGap(49, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnMostrar))
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
     String id = txtID.getText();
    String nombre = txtNombre.getText();
    String precioTexto = txtPrecio.getText();
    String cantidadTexto = txtCantidad.getText();
    
    // Validar campos vacíos
    if(id.isEmpty() || nombre.isEmpty() || precioTexto.isEmpty() || cantidadTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "❌ Todos los campos son obligatorios");
        return;
    }
    
    // Validar que precio sea número positivo
    double precio;
    try {
        precio = Double.parseDouble(precioTexto);
        if(precio <= 0) {
            JOptionPane.showMessageDialog(this, "❌ El precio debe ser un número positivo");
            return;
        }
    } catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "❌ El precio debe ser un número válido");
        return;
    }
    
    // Validar que cantidad sea número entero positivo
    int cantidad;
    try {
        cantidad = Integer.parseInt(cantidadTexto);
        if(cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "❌ La cantidad debe ser un número positivo");
            return;
        }
    } catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "❌ La cantidad debe ser un número entero");
        return;
    }
    
    ControladorProducto controlador = new ControladorProducto();
    
    // Validar que no exista el ID
    if(controlador.existeID(id)) {
        JOptionPane.showMessageDialog(this, "❌ Ya existe un producto con ese ID");
        return;
    }
    
    // Crear producto y registrar
    Producto nuevoProducto = new Producto(id, nombre, precio, cantidad);
    controlador.registrar(nuevoProducto);
    
    // Limpiar campos
    txtID.setText("");
    txtNombre.setText("");
    txtPrecio.setText("");
    txtCantidad.setText("");
    
    JOptionPane.showMessageDialog(this, "✅ Producto guardado correctamente");
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
     ControladorProducto controlador = new ControladorProducto();
    
    // Obtener todos los productos del controlador
    java.util.ArrayList<Producto> productos = controlador.obtenerTodos();
    
    txtArea.setText(""); // Limpiar área
    
    StringBuilder contenido = new StringBuilder();
    contenido.append("=== INVENTARIO ===\n");
    contenido.append("================================\n\n");
    contenido.append("ID | Nombre | Precio | Cantidad | Valor Total\n");
    contenido.append("------------------------------------------------\n");
    
    if(productos.isEmpty()) {
        txtArea.setText("No hay productos registrados aún");
        return;
    }
    
    int contador = 1;
    for(Producto p : productos) {
        contenido.append(contador++).append(". ");
        contenido.append(p.mostrarInfo());
        contenido.append("\n   💰 Valor total: $").append(String.format("%.2f", p.valorTotal()));
        contenido.append("\n------------------------------------------------\n");
    }
    
    contenido.append("\n ESTADÍSTICAS DEL INVENTARIO:\n");
    contenido.append("    Productos diferentes: ").append(controlador.totalProductos()).append("\n");
    contenido.append("    Total de unidades: ").append(controlador.totalUnidades()).append("\n");
    contenido.append("    Valor total del inventario: $").append(String.format("%.2f", controlador.valorTotalInventario()));
    
    txtArea.setText(contenido.toString());
    }//GEN-LAST:event_btnMostrarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        new FormularioInventario().setVisible(true);
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

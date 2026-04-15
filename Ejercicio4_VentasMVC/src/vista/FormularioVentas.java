
package vista;

import controlador.ControladorVenta;
import javax.swing.JOptionPane;
import modelo.Venta;

public class FormularioVentas extends javax.swing.JFrame {

    public FormularioVentas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtProducto = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtTotal = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVer = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE VENTAS");

        jLabel1.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jLabel1.setText("Fecha");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        btnRegistrar.setText("Registrar venta");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnVer.setBackground(new java.awt.Color(0, 153, 153));
        btnVer.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        btnVer.setText("Ver ventas");
        btnVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 51));
        jLabel5.setText("REGISTRO DE VENTAS");

        jLabel6.setText("Historial");

        jLabel7.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jLabel7.setText("producto ");

        jLabel8.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jLabel8.setText("cantidad");

        jLabel9.setFont(new java.awt.Font("Lucida Fax", 3, 12)); // NOI18N
        jLabel9.setText("Total ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(btnRegistrar)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFecha)
                                    .addComponent(txtProducto)
                                    .addComponent(txtCantidad)
                                    .addComponent(txtTotal)
                                    .addComponent(btnVer, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVer)
                    .addComponent(btnRegistrar))
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
    String fecha = txtFecha.getText();
    String producto = txtProducto.getText();
    String cantidadTexto = txtCantidad.getText();
    String totalTexto = txtTotal.getText();
    
    // Validar campos vacíos
    if(fecha.isEmpty() || producto.isEmpty() || cantidadTexto.isEmpty() || totalTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "❌ Todos los campos son obligatorios");
        return;
    }
    
    // Validar que cantidad sea número
    int cantidad;
    try {
        cantidad = Integer.parseInt(cantidadTexto);
        if(cantidad <= 0) {
            JOptionPane.showMessageDialog(this, "❌ La cantidad debe ser positiva");
            return;
        }
    } catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "❌ La cantidad debe ser un número");
        return;
    }
    
    // Validar que total sea número
    double total;
    try {
        total = Double.parseDouble(totalTexto);
        if(total <= 0) {
            JOptionPane.showMessageDialog(this, "❌ El total debe ser positivo");
            return;
        }
    } catch(NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "❌ El total debe ser un número");
        return;
    }
    
    ControladorVenta controlador = new ControladorVenta();
    Venta nuevaVenta = new Venta(fecha, producto, cantidad, total);
    controlador.registrar(nuevaVenta);
    
    // Limpiar campos
    txtFecha.setText("");
    txtProducto.setText("");
    txtCantidad.setText("");
    txtTotal.setText("");
    
    JOptionPane.showMessageDialog(this, "✅ Venta registrada");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerActionPerformed
    ControladorVenta controlador = new ControladorVenta();
    java.util.ArrayList<Venta> ventas = controlador.obtenerTodas();
    
    txtArea.setText("");
    
    StringBuilder contenido = new StringBuilder();
    contenido.append("=== HISTORIAL DE VENTAS ===\n");
    contenido.append("================================\n\n");
    
    if(ventas.isEmpty()) {
        txtArea.setText("No hay ventas registradas aún");
        return;
    }
    
    int contador = 1;
    for(Venta v : ventas) {
        contenido.append(contador++).append(". ");
        contenido.append(v.mostrarInfo());
        contenido.append("\n----------------------------------------\n");
    }
    
    contenido.append("\n📊 TOTAL RECAUDADO: $").append(String.format("%.2f", controlador.totalVentas()));
    
    txtArea.setText(contenido.toString());
    }//GEN-LAST:event_btnVerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
       java.awt.EventQueue.invokeLater(() -> {
            new FormularioVentas().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtProducto;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

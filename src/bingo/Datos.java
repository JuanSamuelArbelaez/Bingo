package bingo;

/**
 * Ingresa los datos de un usuario al sistema.
 * @author Diego Alejandro Pastrana y Juan Samuel Arbeláez
 */

public class Datos extends javax.swing.JDialog {
    public static String n1="", n2="", n3="", n4="", n5="";
    public static String a1="", a2="", a3="", a4="", a5="";
    public static String c1, c2, c3, c4, c5;
    
    public static int n=1;
    
    /**
     *Contructor de la ventana Datos. 
     */
    
    public Datos() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Apellido = new javax.swing.JTextField();
        Cedula = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Ingrese su Nombre:");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese su Apellido:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese su Cédula:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setText("Ingreso de Datos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(Guardar)
                        .addGap(44, 44, 44)
                        .addComponent(Volver))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Apellido, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1)))))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Volver))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CedulaActionPerformed
    
    /**
     * Asocia los datos ingresados por JTextFields, a una secuencia de clientes (max 5).
     * @param evt Clic registrado.
     */
    
    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        
        if(n==1)
        {
            n1=jTextField1.getText();
            a1=Apellido.getText();
            c1=Cedula.getText();

            Comprar.jComboBox2.addItem(n1+" "+a1);
            
            Menu1.imprimir("Los datos del cliente "+n+" fueron guardados");
            Menu1.data=true;
        }
        
        if(n==2)
        {
            n2=jTextField1.getText();
            a2=Apellido.getText();
            c2=Cedula.getText();
            
            Comprar.jComboBox2.addItem(n2+" "+a2);
            
            Menu1.imprimir("Los datos del cliente "+n+" fueron guardados");
            Menu1.data=true;
        }
        
        if(n==3)
        {
            n3=jTextField1.getText();
            a3=Apellido.getText();
            c3=Cedula.getText();
            
            Comprar.jComboBox2.addItem(n3+" "+a3);
            
            Menu1.imprimir("Los datos del cliente "+n+" fueron guardados");
            Menu1.data=true;
        }
        if(n==4)
        {
            n4=jTextField1.getText();
            a4=Apellido.getText();
            c4=Cedula.getText();
            
            Comprar.jComboBox2.addItem(n4+" "+a4);
            
            Menu1.imprimir("Los datos del cliente "+n+" fueron guardados");
            Menu1.data=true;
        }
        if(n==5)
        {
            n5=jTextField1.getText();
            a5=Apellido.getText();
            c5=Cedula.getText();
            
            Comprar.jComboBox2.addItem(n5+" "+a5);
            
            Menu1.imprimir("Los datos del cliente "+n+" fueron guardados");
            Menu1.data=true;
        }
        if(n>5) Menu1.imprimir("Límite de clientes alcanzado");
        n++;
    }//GEN-LAST:event_GuardarActionPerformed
    
    /**
     * Permite volver al menu principal.
     * Al desplegar el menu principal, deshecha esta ventana.
     * @param evt Clic registrado.
     */
    
    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        Menu1.imprimir("Los datos no guardados se perderán");
        this.setVisible(false);
    }//GEN-LAST:event_VolverActionPerformed

    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Cedula;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    */
    
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField Apellido;
    private javax.swing.JTextField Cedula;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
}
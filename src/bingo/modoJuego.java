package bingo;

/**
 * Despliega la ventana que selecciona el modo de juego.
 * @author Diego Alejandro Pastrana y Juan Samuel Arbeláez
 */

public class modoJuego extends javax.swing.JDialog {
    public static String tipo="";
    public modoJuego() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "En 'X'", "Cuadrado", "Completo" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Seleccione un Modo de Juego:");

        jButton1.setText("Seleccionar");
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
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Define el valor de la matriz de modo, como el modo X.
     * @return Devuelve la matriz de modo.
     */
    
    public static String[][] leerX()
    {
        String a[][]=new String [5][5];
        a[0][0]="X";
        a[0][1]="";
        a[0][2]="";
        a[0][3]="";
        a[0][4]="X";
        
        a[1][0]="";
        a[1][1]="X";
        a[1][2]="";
        a[1][3]="X";
        a[1][4]="";
        
        a[2][0]="";
        a[2][1]="";
        a[2][2]="X";
        a[2][3]="";
        a[2][4]="";
        
        a[3][0]="";
        a[3][1]="X";
        a[3][2]="";
        a[3][3]="X";
        a[3][4]="";
        
        a[4][0]="X";
        a[4][1]="";
        a[4][2]="";
        a[4][3]="";
        a[4][4]="X";
        return a;
    }
    
    /**
     * Define el valor de la matriz de modo, como el modo Todo
     * @return Devuelve la matriz de modo.
     */
    
    public static String[][] leerTot()
    {
        String a[][]=new String [5][5];
        a[0][0]="X";
        a[0][1]="X";
        a[0][2]="X";
        a[0][3]="X";
        a[0][4]="X";
        
        a[1][0]="X";
        a[1][1]="X";
        a[1][2]="X";
        a[1][3]="X";
        a[1][4]="X";
        
        a[2][0]="X";
        a[2][1]="X";
        a[2][2]="X";
        a[2][3]="X";
        a[2][4]="X";
        
        a[3][0]="X";
        a[3][1]="X";
        a[3][2]="X";
        a[3][3]="X";
        a[3][4]="X";
        
        a[4][0]="X";
        a[4][1]="X";
        a[4][2]="X";
        a[4][3]="X";
        a[4][4]="X";
        return a;
    }
    
    /**
     * Define el valor de la matriz de modo, como el modo Cuadrado.
     * @return Devuelve la matriz de modo.
     */
    
    public static String[][] leerSqr()
    {
        String a[][]=new String [5][5];
        a[0][0]="X";
        a[0][1]="X";
        a[0][2]="X";
        a[0][3]="X";
        a[0][4]="X";
        
        a[1][0]="X";
        a[1][1]="";
        a[1][2]="";
        a[1][3]="";
        a[1][4]="X";
        
        a[2][0]="X";
        a[2][1]="";
        a[2][2]="";
        a[2][3]="";
        a[2][4]="X";
        
        a[3][0]="X";
        a[3][1]="";
        a[3][2]="";
        a[3][3]="";
        a[3][4]="X";
        
        a[4][0]="X";
        a[4][1]="X";
        a[4][2]="X";
        a[4][3]="X";
        a[4][4]="X";
        return a;
    }
    
    /**
     * Define el modo de juego, y actualiza el tablero de modo de juego.
     * @param evt Clic registrado
     */
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem()=="En 'X'")
        {
            tipo+=jComboBox1.getSelectedItem();
            Menu1.modoJuego=leerX();
            Jugar.actualizarTableroModo(Menu1.modoJuego);
            Menu1.mod=true;
        }
        if(jComboBox1.getSelectedItem()=="Cuadrado")
        {
            tipo+=jComboBox1.getSelectedItem();
            Menu1.modoJuego=leerSqr();
            Jugar.actualizarTableroModo(Menu1.modoJuego);
            Menu1.mod=true;
        }
        if(jComboBox1.getSelectedItem()=="Completo")
        {
            tipo+=jComboBox1.getSelectedItem();
            Menu1.modoJuego=leerTot();
            Jugar.actualizarTableroModo(Menu1.modoJuego);
            Menu1.mod=true;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * Valida la selección de un modo de juego.
     * Al validar la selección, se deshecha esta ventana.
     * @param evt Clic registrado.
     */
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!Menu1.mod) Menu1.imprimir("No se selccionó un modo de juego");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

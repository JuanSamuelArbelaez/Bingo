package bingo;

/**
 * Menu que permite comprar un tablero de Bingo, por un usuario.
 * @author Diego Alejandro Pastrana y Juan Samuel Arbeláez
 */

public class Comprar extends javax.swing.JDialog {
    public static int c=0;
    public Comprar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B0 = new javax.swing.JTextField();
        I0 = new javax.swing.JTextField();
        N0 = new javax.swing.JTextField();
        G0 = new javax.swing.JTextField();
        O0 = new javax.swing.JTextField();
        I1 = new javax.swing.JTextField();
        N1 = new javax.swing.JTextField();
        G1 = new javax.swing.JTextField();
        O1 = new javax.swing.JTextField();
        B2 = new javax.swing.JTextField();
        I2 = new javax.swing.JTextField();
        N2 = new javax.swing.JTextField();
        G2 = new javax.swing.JTextField();
        O2 = new javax.swing.JTextField();
        B3 = new javax.swing.JTextField();
        I3 = new javax.swing.JTextField();
        I4 = new javax.swing.JTextField();
        O4 = new javax.swing.JTextField();
        G4 = new javax.swing.JTextField();
        B4 = new javax.swing.JTextField();
        O3 = new javax.swing.JTextField();
        G3 = new javax.swing.JTextField();
        N4 = new javax.swing.JTextField();
        N3 = new javax.swing.JTextField();
        B1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Comprar = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("B");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("I");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("N");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("G");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("O");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione un carton", "Tabla 1", "Tabla 2", "Tabla 3", "Tabla 4", "Tabla 5" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        Comprar.setText("Comprar");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione un comprador" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(Comprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(volver)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(B0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(I2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(I4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(O4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Comprar)
                    .addComponent(volver))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1ActionPerformed
    
    /**
     * Toma el elemento seleccionada del JCOmboBox.
     * Según el elemento seleccionado, depliega los valores de las casillas de una matriz.
     * @param evt Clic registrado
     */
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if(jComboBox1.getSelectedItem()=="Tabla 1") 
        {
            B0.setText(""+Menu1.t1[0][0]);
            I0.setText(""+Menu1.t1[0][1]);
            N0.setText(""+Menu1.t1[0][2]);
            G0.setText(""+Menu1.t1[0][3]);
            O0.setText(""+Menu1.t1[0][4]);
            
            B1.setText(""+Menu1.t1[1][0]);
            I1.setText(""+Menu1.t1[1][1]);
            N1.setText(""+Menu1.t1[1][2]);
            G1.setText(""+Menu1.t1[1][3]);
            O1.setText(""+Menu1.t1[1][4]);
            
            B2.setText(""+Menu1.t1[2][0]);
            I2.setText(""+Menu1.t1[2][1]);
            N2.setText(""+Menu1.t1[2][2]);
            G2.setText(""+Menu1.t1[2][3]);
            O2.setText(""+Menu1.t1[2][4]);
            
            B3.setText(""+Menu1.t1[3][0]);
            I3.setText(""+Menu1.t1[3][1]);
            N3.setText(""+Menu1.t1[3][2]);
            G3.setText(""+Menu1.t1[3][3]);
            O3.setText(""+Menu1.t1[3][4]);
            
            B4.setText(""+Menu1.t1[4][0]);
            I4.setText(""+Menu1.t1[4][1]);
            N4.setText(""+Menu1.t1[4][2]);
            G4.setText(""+Menu1.t1[4][3]);
            O4.setText(""+Menu1.t1[4][4]);
        }
        if(jComboBox1.getSelectedItem()=="Tabla 2")
        {
            B0.setText(""+Menu1.t2[0][0]);
            I0.setText(""+Menu1.t2[0][1]);
            N0.setText(""+Menu1.t2[0][2]);
            G0.setText(""+Menu1.t2[0][3]);
            O0.setText(""+Menu1.t2[0][4]);
            
            B1.setText(""+Menu1.t2[1][0]);
            I1.setText(""+Menu1.t2[1][1]);
            N1.setText(""+Menu1.t2[1][2]);
            G1.setText(""+Menu1.t2[1][3]);
            O1.setText(""+Menu1.t2[1][4]);
            
            B2.setText(""+Menu1.t2[2][0]);
            I2.setText(""+Menu1.t2[2][1]);
            N2.setText(""+Menu1.t2[2][2]);
            G2.setText(""+Menu1.t2[2][3]);
            O2.setText(""+Menu1.t2[2][4]);
            
            B3.setText(""+Menu1.t2[3][0]);
            I3.setText(""+Menu1.t2[3][1]);
            N3.setText(""+Menu1.t2[3][2]);
            G3.setText(""+Menu1.t2[3][3]);
            O3.setText(""+Menu1.t2[3][4]);
            
            B4.setText(""+Menu1.t2[4][0]);
            I4.setText(""+Menu1.t2[4][1]);
            N4.setText(""+Menu1.t2[4][2]);
            G4.setText(""+Menu1.t2[4][3]);
            O4.setText(""+Menu1.t2[4][4]);
        }
        if(jComboBox1.getSelectedItem()=="Tabla 3")
        {
            B0.setText(""+Menu1.t3[0][0]);
            I0.setText(""+Menu1.t3[0][1]);
            N0.setText(""+Menu1.t3[0][2]);
            G0.setText(""+Menu1.t3[0][3]);
            O0.setText(""+Menu1.t3[0][4]);
           
            B1.setText(""+Menu1.t3[1][0]);
            I1.setText(""+Menu1.t3[1][1]);
            N1.setText(""+Menu1.t3[1][2]);
            G1.setText(""+Menu1.t3[1][3]);
            O1.setText(""+Menu1.t3[1][4]);
            
            B2.setText(""+Menu1.t3[2][0]);
            I2.setText(""+Menu1.t3[2][1]);
            N2.setText(""+Menu1.t3[2][2]);
            G2.setText(""+Menu1.t3[2][3]);
            O2.setText(""+Menu1.t3[2][4]);
            
            B3.setText(""+Menu1.t3[3][0]);
            I3.setText(""+Menu1.t3[3][1]);
            N3.setText(""+Menu1.t3[3][2]);
            G3.setText(""+Menu1.t3[3][3]);
            O3.setText(""+Menu1.t3[3][4]);
            
            B4.setText(""+Menu1.t3[4][0]);
            I4.setText(""+Menu1.t3[4][1]);
            N4.setText(""+Menu1.t3[4][2]);
            G4.setText(""+Menu1.t3[4][3]);
            O4.setText(""+Menu1.t3[4][4]);
        }
        if(jComboBox1.getSelectedItem()=="Tabla 4")
        {
            B0.setText(""+Menu1.t4[0][0]);
            I0.setText(""+Menu1.t4[0][1]);
            N0.setText(""+Menu1.t4[0][2]);
            G0.setText(""+Menu1.t4[0][3]);
            O0.setText(""+Menu1.t4[0][4]);
            
            B1.setText(""+Menu1.t4[1][0]);
            I1.setText(""+Menu1.t4[1][1]);
            N1.setText(""+Menu1.t4[1][2]);
            G1.setText(""+Menu1.t4[1][3]);
            O1.setText(""+Menu1.t4[1][4]);
            
            B2.setText(""+Menu1.t4[2][0]);
            I2.setText(""+Menu1.t4[2][1]);
            N2.setText(""+Menu1.t4[2][2]);
            G2.setText(""+Menu1.t4[2][3]);
            O2.setText(""+Menu1.t4[2][4]);
            
            B3.setText(""+Menu1.t4[3][0]);
            I3.setText(""+Menu1.t4[3][1]);
            N3.setText(""+Menu1.t4[3][2]);
            G3.setText(""+Menu1.t4[3][3]);
            O3.setText(""+Menu1.t4[3][4]);
            
            B4.setText(""+Menu1.t4[4][0]);
            I4.setText(""+Menu1.t4[4][1]);
            N4.setText(""+Menu1.t4[4][2]);
            G4.setText(""+Menu1.t4[4][3]);
            O4.setText(""+Menu1.t4[4][4]);
        }
        if(jComboBox1.getSelectedItem()=="Tabla 5")
        {
            B0.setText(""+Menu1.t5[0][0]);
            I0.setText(""+Menu1.t5[0][1]);
            N0.setText(""+Menu1.t5[0][2]);
            G0.setText(""+Menu1.t5[0][3]);
            O0.setText(""+Menu1.t5[0][4]);
            
            B1.setText(""+Menu1.t5[1][0]);
            I1.setText(""+Menu1.t5[1][1]);
            N1.setText(""+Menu1.t5[1][2]);
            G1.setText(""+Menu1.t5[1][3]);
            O1.setText(""+Menu1.t5[1][4]);
            
            B2.setText(""+Menu1.t5[2][0]);
            I2.setText(""+Menu1.t5[2][1]);
            N2.setText(""+Menu1.t5[2][2]);
            G2.setText(""+Menu1.t5[2][3]);
            O2.setText(""+Menu1.t5[2][4]);
            
            B3.setText(""+Menu1.t5[3][0]);
            I3.setText(""+Menu1.t5[3][1]);
            N3.setText(""+Menu1.t5[3][2]);
            G3.setText(""+Menu1.t5[3][3]);
            O3.setText(""+Menu1.t5[3][4]);
            
            B4.setText(""+Menu1.t5[4][0]);
            I4.setText(""+Menu1.t5[4][1]);
            N4.setText(""+Menu1.t5[4][2]);
            G4.setText(""+Menu1.t5[4][3]);
            O4.setText(""+Menu1.t5[4][4]);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed
    
    /**
     * Asocia un tablero con un usuario, y lo vuelve su comprador.
     * Al comprar un tablero, elimina el tablero y el usuario de las opciones de compra.
     * @param evt Clic registrado.
     */
    
    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        if(c<5)
        {
            if(jComboBox1.getSelectedItem().equals("Tabla 1") &&  Menu1.t1_C.equals(""))
            {
                Menu1.t1_C+=jComboBox2.getSelectedItem();
                VerTablas.p1.setText("Propietario: "+Menu1.t1_C);
                Jugar.p1.setText("Propietario: "+Menu1.t1_C);
                Menu1.mostrarMatriz(Menu1.t1);
            }
            
            if(jComboBox1.getSelectedItem().equals("Tabla 2") && Menu1.t2_C.equals(""))
            {
                Menu1.t2_C+=jComboBox2.getSelectedItem();
                VerTablas.p2.setText("Propietario: "+Menu1.t2_C);
                Jugar.p2.setText("Propietario: "+Menu1.t2_C);
                Menu1.mostrarMatriz(Menu1.t2);
            }
            
            if(jComboBox1.getSelectedItem().equals("Tabla 3") && Menu1.t3_C.equals(""))
            {
                Menu1.t3_C+=jComboBox2.getSelectedItem();
                VerTablas.p3.setText("Propietario: "+Menu1.t3_C);
                Jugar.p3.setText("Propietario: "+Menu1.t3_C);
                Menu1.mostrarMatriz(Menu1.t3);
            }
            
            if(jComboBox1.getSelectedItem().equals("Tabla 4") && Menu1.t4_C.equals(""))
            {
                Menu1.t4_C+=jComboBox2.getSelectedItem();
                VerTablas.p4.setText("Propietario: "+Menu1.t4_C);
                Jugar.p4.setText("Propietario: "+Menu1.t4_C);
                Menu1.mostrarMatriz(Menu1.t4);
            }
            
            if(jComboBox1.getSelectedItem().equals("Tabla 5") && Menu1.t5_C.equals(""))
            {
                Menu1.t5_C+=jComboBox2.getSelectedItem();
                VerTablas.p5.setText("Propietario: "+Menu1.t5_C);
                Jugar.p5.setText("Propietario: "+Menu1.t5_C);
                Menu1.mostrarMatriz(Menu1.t5);
            }
            
            if(jComboBox1.getSelectedItem()!="seleccione un carton")jComboBox1.removeItem(jComboBox1.getSelectedItem());
            if(jComboBox2.getSelectedItem()!="seleccione un comprador")jComboBox2.removeItem(jComboBox2.getSelectedItem());
            
            c++;
            
            Menu1.comprado=true;
        }
        if(c>=5) Menu1.imprimir("Tableros Agotados");
        
    }//GEN-LAST:event_ComprarActionPerformed
    
    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
    }//GEN-LAST:event_jComboBox2ActionPerformed
    
    /**
     * Permite volver al menu principal.
     * Al desplegar el menu principal, deshecha esta ventana.
     * @param evt Clic registrado.
     */
    
    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_volverActionPerformed
    
    /*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B0;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField B2;
    private javax.swing.JTextField B3;
    private javax.swing.JTextField B4;
    private javax.swing.JButton Comprar;
    private javax.swing.JTextField G0;
    private javax.swing.JTextField G1;
    private javax.swing.JTextField G2;
    private javax.swing.JTextField G3;
    private javax.swing.JTextField G4;
    private javax.swing.JTextField I0;
    private javax.swing.JTextField I1;
    private javax.swing.JTextField I2;
    private javax.swing.JTextField I3;
    private javax.swing.JTextField I4;
    private javax.swing.JTextField N0;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JTextField N3;
    private javax.swing.JTextField N4;
    private javax.swing.JTextField O0;
    private javax.swing.JTextField O1;
    private javax.swing.JTextField O2;
    private javax.swing.JTextField O3;
    private javax.swing.JTextField O4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
    */
    private javax.swing.JTextField B0;
    private javax.swing.JTextField B1;
    private javax.swing.JTextField B2;
    private javax.swing.JTextField B3;
    private javax.swing.JTextField B4;
    private javax.swing.JButton Comprar;
    private javax.swing.JTextField G0;
    private javax.swing.JTextField G1;
    private javax.swing.JTextField G2;
    private javax.swing.JTextField G3;
    private javax.swing.JTextField G4;
    private javax.swing.JTextField I0;
    private javax.swing.JTextField I1;
    private javax.swing.JTextField I2;
    private javax.swing.JTextField I3;
    private javax.swing.JTextField I4;
    private javax.swing.JTextField N0;
    private javax.swing.JTextField N1;
    private javax.swing.JTextField N2;
    private javax.swing.JTextField N3;
    private javax.swing.JTextField N4;
    private javax.swing.JTextField O0;
    private javax.swing.JTextField O1;
    private javax.swing.JTextField O2;
    private javax.swing.JTextField O3;
    private javax.swing.JTextField O4;
    private javax.swing.JComboBox<String> jComboBox1;
    public static javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton volver;
}
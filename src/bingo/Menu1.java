/**
 * @windowtitle Programa de Bingo
 * 
*/
package bingo;

import javax.swing.JOptionPane;

/**
 * Menú principal del programa 'Bingo'.
 * Permite que el usuario compre un tablero, y juege.
 * Se determina al ganador, mediante el modo de juego seleccionado.
 * El premio se determina por los datos del ganador.
 * 
 * Creado en Apache Netbeans 12.4
 * @author Diego Alejandro Pastrana y Juan Samuel Arbeláez
 * @version Version 1.0
 */

public class Menu1 extends javax.swing.JFrame {
    public static int t1[][]=new int [5][5], t2[][]=new int [5][5], t3[][]=new int [5][5], t4[][]=new int [5][5], t5[][]=new int [5][5]; 
    public static boolean tGenerados=false, data=false, comprado=false, mod=false, ready=false;
    public static String t1_C="", t2_C="", t3_C="", t4_C="", t5_C="", modoJuego[][]=new String[5][5];
    
    private Datos datos;
    private datos2 datos2;
    private Comprar comprar;
    private Comprar2 comprar2;
    private modoJuego modo;
    private VerTablas vt;
    private Jugar jugar;
    public Menu1() {
        initComponents();
        datos=new Datos();
        comprar=new Comprar();
        datos2=new datos2();
        comprar2=new Comprar2();
        modo=new modoJuego();
        vt=new VerTablas();
        jugar=new Jugar();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        Datos = new javax.swing.JButton();
        Comprar = new javax.swing.JButton();
        Generar = new javax.swing.JButton();
        Modo = new javax.swing.JButton();
        Titulo = new javax.swing.JTextField();
        VerTablero = new javax.swing.JButton();
        play = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Datos.setText("Ingresar Datos");
        Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatosActionPerformed(evt);
            }
        });

        Comprar.setText("Comprar un Tablero");
        Comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComprarActionPerformed(evt);
            }
        });

        Generar.setText("Generar Tableros");
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });

        Modo.setText("Seleccionar Modo de Juego");
        Modo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModoActionPerformed(evt);
            }
        });

        Titulo.setEditable(false);
        Titulo.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Titulo.setText("Bingo");

        VerTablero.setText("Ver Tableros");
        VerTablero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerTableroActionPerformed(evt);
            }
        });

        play.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        play.setText("Jugar");
        play.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Comprar)
                    .addComponent(VerTablero)
                    .addComponent(Generar)
                    .addComponent(play, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modo)
                    .addComponent(Datos)
                    .addComponent(Titulo))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Generar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Comprar)
                .addGap(12, 12, 12)
                .addComponent(VerTablero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modo)
                .addGap(18, 18, 18)
                .addComponent(play)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Llena un tablero de Bingo de manera aleatoria y sin repetición, según los rangos de las columnas.
     * @return Devuelve un tablero de Bingo, en forma de matriz.
     */
    
    public static int[][] llenarTableroBingo()
    {
        int matriz[][]=new int[5][5], f, c, j, a, n=1, max=15;
        boolean bandera;
        
        for(c=0; c<matriz[0].length; c++)
        {
            for(f=0; f<matriz.length; f++)
            {
                a=(int)(Math.random()*(max-n)+n);
                do
                {
                    bandera=false;
                    for(j=0; j<matriz.length; j++) 
                    {
                        if(matriz[j][c]==a)
                        {
                            bandera=true;
                            a=(int)(Math.random()*(max-n)+n);
                        }
                    }
                } while(bandera);
                matriz[f][c]=a;
            }
            max+=15;
            n+=15;
        }
        matriz[2][2]=0;
        return matriz;
    }
    
    /**
     * Valida que 2 tableros sean diferentes.
     * 
     * @param tObjetivo Tablero que se va a comparar con una referencia.
     * @param tFuente Tablero referencia.
     * @return Devuelve una representación booleana de la repetición.
     */
    
    public static boolean validar_TablerosIguales(int[][] tObjetivo, int[][] tFuente)
    {
        boolean repeticion=true;
        int f, c;
        
        
        for(f=0; f<tObjetivo.length && repeticion; f++)
        {
            for(c=0; c<tObjetivo[f] .length && repeticion; c++)
            {
                if(tObjetivo[f][c] != tFuente[f][c])repeticion=false;
            }
        }
        return repeticion;
    }
    
    /**
     * Devuelve un mensaje por pantalla.
     * @param m Cadena para mostrar.
     */
    
    public static void imprimir(String m)
    {
        JOptionPane.showMessageDialog(null, m);
    }
    
    /**
     * Metodo llamado por el boton 'Generar', en el JFrame de Menu1.
     * Genera los tableros de Bingo.
     * @param evt Clic registrado.
     */
    
    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
        generar();
    }//GEN-LAST:event_GenerarActionPerformed
    
    /**
     * Genera 5 tableros de Bingo y valida su no repetición.
     */
    
    public static void generar()
    {
        t1=llenarTableroBingo();

        t2=llenarTableroBingo();
        do
        {
            if(validar_TablerosIguales(t2, t1))
            {
                t2=llenarTableroBingo();
            }
        } while(validar_TablerosIguales(t2, t1));

        t3=llenarTableroBingo();
        do
        {
            if(validar_TablerosIguales(t3, t2)
            || validar_TablerosIguales(t3, t1))
            {
                t3=llenarTableroBingo();
            }
        }while(validar_TablerosIguales(t3, t2)
            || validar_TablerosIguales(t3, t1));

        t4=llenarTableroBingo();
        do
        {
            if(validar_TablerosIguales(t4, t3)
            || validar_TablerosIguales(t4, t2)
            || validar_TablerosIguales(t4, t1))
            {
                t4=llenarTableroBingo();
            }
        }while(validar_TablerosIguales(t4, t3)
            || validar_TablerosIguales(t4, t2)
            || validar_TablerosIguales(t4, t1));

        t5=llenarTableroBingo();
        do
        {
            if(validar_TablerosIguales(t5, t4)
            || validar_TablerosIguales(t5, t3)
            || validar_TablerosIguales(t5, t2)
            || validar_TablerosIguales(t5, t1))
            {
                t5=llenarTableroBingo();
            }
        }while(validar_TablerosIguales(t5, t4)
            || validar_TablerosIguales(t5, t3)
            || validar_TablerosIguales(t5, t2)
            || validar_TablerosIguales(t5, t1));
        imprimir("Tableros generados con éxito");
        tGenerados=true;
        
        actualizarTablero1();
        actualizarTablero2();
        actualizarTablero3();
        actualizarTablero4();
        actualizarTablero5();
        VerTablas.noEditable();
    }
    
    /**
     * Actualiza las casillas del tablero de Bingo 1, en los frames VerTablas y Jugar.
     */
    
    public static void actualizarTablero1()
    {
        VerTablas.B0T1.setText(""+t1[0][0]);
        VerTablas.I0T1.setText(""+t1[0][1]);
        VerTablas.N0T1.setText(""+t1[0][2]);
        VerTablas.G0T1.setText(""+t1[0][3]);
        VerTablas.O0T1.setText(""+t1[0][4]);
        Jugar.B0T1.setText(""+t1[0][0]);
        Jugar.I0T1.setText(""+t1[0][1]);
        Jugar.N0T1.setText(""+t1[0][2]);
        Jugar.G0T1.setText(""+t1[0][3]);
        Jugar.O0T1.setText(""+t1[0][4]);
        
        VerTablas.B1T1.setText(""+t1[1][0]);
        VerTablas.I1T1.setText(""+t1[1][1]);
        VerTablas.N1T1.setText(""+t1[1][2]);
        VerTablas.G1T1.setText(""+t1[1][3]);
        VerTablas.O1T1.setText(""+t1[1][4]);
        Jugar.B1T1.setText(""+t1[1][0]);
        Jugar.I1T1.setText(""+t1[1][1]);
        Jugar.N1T1.setText(""+t1[1][2]);
        Jugar.G1T1.setText(""+t1[1][3]);
        Jugar.O1T1.setText(""+t1[1][4]);
        
        VerTablas.B2T1.setText(""+t1[2][0]);
        VerTablas.I2T1.setText(""+t1[2][1]);
        VerTablas.N2T1.setText(""+t1[2][2]);
        VerTablas.G2T1.setText(""+t1[2][3]);
        VerTablas.O2T1.setText(""+t1[2][4]);
        Jugar.B2T1.setText(""+t1[2][0]);
        Jugar.I2T1.setText(""+t1[2][1]);
        Jugar.N2T1.setText(""+t1[2][2]);
        Jugar.G2T1.setText(""+t1[2][3]);
        Jugar.O2T1.setText(""+t1[2][4]);
        
        VerTablas.B3T1.setText(""+t1[3][0]);
        VerTablas.I3T1.setText(""+t1[3][1]);
        VerTablas.N3T1.setText(""+t1[3][2]);
        VerTablas.G3T1.setText(""+t1[3][3]);
        VerTablas.O3T1.setText(""+t1[3][4]);
        Jugar.B3T1.setText(""+t1[3][0]);
        Jugar.I3T1.setText(""+t1[3][1]);
        Jugar.N3T1.setText(""+t1[3][2]);
        Jugar.G3T1.setText(""+t1[3][3]);
        Jugar.O3T1.setText(""+t1[3][4]);
        
        VerTablas.B4T1.setText(""+t1[4][0]);
        VerTablas.I4T1.setText(""+t1[4][1]);
        VerTablas.N4T1.setText(""+t1[4][2]);
        VerTablas.G4T1.setText(""+t1[4][3]);
        VerTablas.O4T1.setText(""+t1[4][4]);
        Jugar.B4T1.setText(""+t1[4][0]);
        Jugar.I4T1.setText(""+t1[4][1]);
        Jugar.N4T1.setText(""+t1[4][2]);
        Jugar.G4T1.setText(""+t1[4][3]);
        Jugar.O4T1.setText(""+t1[4][4]);
    }
    
    /**
     * Actualiza las casillas del tablero de Bingo 2, en los frames VerTablas y Jugar.
     */
    
    public static void actualizarTablero2()
    {
        VerTablas.B0T2.setText(""+t2[0][0]);
        VerTablas.I0T2.setText(""+t2[0][1]);
        VerTablas.N0T2.setText(""+t2[0][2]);
        VerTablas.G0T2.setText(""+t2[0][3]);
        VerTablas.O0T2.setText(""+t2[0][4]);
        Jugar.B0T2.setText(""+t2[0][0]);
        Jugar.I0T2.setText(""+t2[0][1]);
        Jugar.N0T2.setText(""+t2[0][2]);
        Jugar.G0T2.setText(""+t2[0][3]);
        Jugar.O0T2.setText(""+t2[0][4]);
        
        VerTablas.B1T2.setText(""+t2[1][0]);
        VerTablas.I1T2.setText(""+t2[1][1]);
        VerTablas.N1T2.setText(""+t2[1][2]);
        VerTablas.G1T2.setText(""+t2[1][3]);
        VerTablas.O1T2.setText(""+t2[1][4]);
        Jugar.B1T2.setText(""+t2[1][0]);
        Jugar.I1T2.setText(""+t2[1][1]);
        Jugar.N1T2.setText(""+t2[1][2]);
        Jugar.G1T2.setText(""+t2[1][3]);
        Jugar.O1T2.setText(""+t2[1][4]);
        
        VerTablas.B2T2.setText(""+t2[2][0]);
        VerTablas.I2T2.setText(""+t2[2][1]);
        VerTablas.N2T2.setText(""+t2[2][2]);
        VerTablas.G2T2.setText(""+t2[2][3]);
        VerTablas.O2T2.setText(""+t2[2][4]);
        Jugar.B2T2.setText(""+t2[2][0]);
        Jugar.I2T2.setText(""+t2[2][1]);
        Jugar.N2T2.setText(""+t2[2][2]);
        Jugar.G2T2.setText(""+t2[2][3]);
        Jugar.O2T2.setText(""+t2[2][4]);
        
        VerTablas.B3T2.setText(""+t2[3][0]);
        VerTablas.I3T2.setText(""+t2[3][1]);
        VerTablas.N3T2.setText(""+t2[3][2]);
        VerTablas.G3T2.setText(""+t2[3][3]);
        VerTablas.O3T2.setText(""+t2[3][4]);
        Jugar.B3T2.setText(""+t2[3][0]);
        Jugar.I3T2.setText(""+t2[3][1]);
        Jugar.N3T2.setText(""+t2[3][2]);
        Jugar.G3T2.setText(""+t2[3][3]);
        Jugar.O3T2.setText(""+t2[3][4]);
        
        VerTablas.B4T2.setText(""+t2[4][0]);
        VerTablas.I4T2.setText(""+t2[4][1]);
        VerTablas.N4T2.setText(""+t2[4][2]);
        VerTablas.G4T2.setText(""+t2[4][3]);
        VerTablas.O4T2.setText(""+t2[4][4]);
        Jugar.B4T2.setText(""+t2[4][0]);
        Jugar.I4T2.setText(""+t2[4][1]);
        Jugar.N4T2.setText(""+t2[4][2]);
        Jugar.G4T2.setText(""+t2[4][3]);
        Jugar.O4T2.setText(""+t2[4][4]);
        
    }
    
    /**
     * Actualiza las casillas del tablero de Bingo 3, en los frames VerTablas y Jugar.
     */
    
    public static void actualizarTablero3()
    {
        VerTablas.B0T3.setText(""+t3[0][0]);
        VerTablas.I0T3.setText(""+t3[0][1]);
        VerTablas.N0T3.setText(""+t3[0][2]);
        VerTablas.G0T3.setText(""+t3[0][3]);
        VerTablas.O0T3.setText(""+t3[0][4]);
        Jugar.B0T3.setText(""+t3[0][0]);
        Jugar.I0T3.setText(""+t3[0][1]);
        Jugar.N0T3.setText(""+t3[0][2]);
        Jugar.G0T3.setText(""+t3[0][3]);
        Jugar.O0T3.setText(""+t3[0][4]);
        
        VerTablas.B1T3.setText(""+t3[1][0]);
        VerTablas.I1T3.setText(""+t3[1][1]);
        VerTablas.N1T3.setText(""+t3[1][2]);
        VerTablas.G1T3.setText(""+t3[1][3]);
        VerTablas.O1T3.setText(""+t3[1][4]);
        Jugar.B1T3.setText(""+t3[1][0]);
        Jugar.I1T3.setText(""+t3[1][1]);
        Jugar.N1T3.setText(""+t3[1][2]);
        Jugar.G1T3.setText(""+t3[1][3]);
        Jugar.O1T3.setText(""+t3[1][4]);
        
        VerTablas.B2T3.setText(""+t3[2][0]);
        VerTablas.I2T3.setText(""+t3[2][1]);
        VerTablas.N2T3.setText(""+t3[2][2]);
        VerTablas.G2T3.setText(""+t3[2][3]);
        VerTablas.O2T3.setText(""+t3[2][4]);
        Jugar.B2T3.setText(""+t3[2][0]);
        Jugar.I2T3.setText(""+t3[2][1]);
        Jugar.N2T3.setText(""+t3[2][2]);
        Jugar.G2T3.setText(""+t3[2][3]);
        Jugar.O2T3.setText(""+t3[2][4]);
       
        VerTablas.B3T3.setText(""+t3[3][0]);
        VerTablas.I3T3.setText(""+t3[3][1]);
        VerTablas.N3T3.setText(""+t3[3][2]);
        VerTablas.G3T3.setText(""+t3[3][3]);
        VerTablas.O3T3.setText(""+t3[3][4]);
        Jugar.B3T3.setText(""+t3[3][0]);
        Jugar.I3T3.setText(""+t3[3][1]);
        Jugar.N3T3.setText(""+t3[3][2]);
        Jugar.G3T3.setText(""+t3[3][3]);
        Jugar.O3T3.setText(""+t3[3][4]);
        
        VerTablas.B4T3.setText(""+t3[4][0]);
        VerTablas.I4T3.setText(""+t3[4][1]);
        VerTablas.N4T3.setText(""+t3[4][2]);
        VerTablas.G4T3.setText(""+t3[4][3]);
        VerTablas.O4T3.setText(""+t3[4][4]);
        Jugar.B4T3.setText(""+t3[4][0]);
        Jugar.I4T3.setText(""+t3[4][1]);
        Jugar.N4T3.setText(""+t3[4][2]);
        Jugar.G4T3.setText(""+t3[4][3]);
        Jugar.O4T3.setText(""+t3[4][4]);
    }
    
    /**
     * Actualiza las casillas del tablero de Bingo 4, en los frames VerTablas y Jugar.
     */
    
    public static void actualizarTablero4()
    {
        VerTablas.B0T4.setText(""+t4[0][0]);
        VerTablas.I0T4.setText(""+t4[0][1]);
        VerTablas.N0T4.setText(""+t4[0][2]);
        VerTablas.G0T4.setText(""+t4[0][3]);
        VerTablas.O0T4.setText(""+t4[0][4]);
        Jugar.B0T4.setText(""+t4[0][0]);
        Jugar.I0T4.setText(""+t4[0][1]);
        Jugar.N0T4.setText(""+t4[0][2]);
        Jugar.G0T4.setText(""+t4[0][3]);
        Jugar.O0T4.setText(""+t4[0][4]);
        
        VerTablas.B1T4.setText(""+t4[1][0]);
        VerTablas.I1T4.setText(""+t4[1][1]);
        VerTablas.N1T4.setText(""+t4[1][2]);
        VerTablas.G1T4.setText(""+t4[1][3]);
        VerTablas.O1T4.setText(""+t4[1][4]);
        Jugar.B1T4.setText(""+t4[1][0]);
        Jugar.I1T4.setText(""+t4[1][1]);
        Jugar.N1T4.setText(""+t4[1][2]);
        Jugar.G1T4.setText(""+t4[1][3]);
        Jugar.O1T4.setText(""+t4[1][4]);
        
        VerTablas.B2T4.setText(""+t4[2][0]);
        VerTablas.I2T4.setText(""+t4[2][1]);
        VerTablas.N2T4.setText(""+t4[2][2]);
        VerTablas.G2T4.setText(""+t4[2][3]);
        VerTablas.O2T4.setText(""+t4[2][4]);
        Jugar.B2T4.setText(""+t4[2][0]);
        Jugar.I2T4.setText(""+t4[2][1]);
        Jugar.N2T4.setText(""+t4[2][2]);
        Jugar.G2T4.setText(""+t4[2][3]);
        Jugar.O2T4.setText(""+t4[2][4]);
        
        VerTablas.B3T4.setText(""+t4[3][0]);
        VerTablas.I3T4.setText(""+t4[3][1]);
        VerTablas.N3T4.setText(""+t4[3][2]);
        VerTablas.G3T4.setText(""+t4[3][3]);
        VerTablas.O3T4.setText(""+t4[3][4]);
        Jugar.B3T4.setText(""+t4[3][0]);
        Jugar.I3T4.setText(""+t4[3][1]);
        Jugar.N3T4.setText(""+t4[3][2]);
        Jugar.G3T4.setText(""+t4[3][3]);
        Jugar.O3T4.setText(""+t4[3][4]);
        
        VerTablas.B4T4.setText(""+t4[4][0]);
        VerTablas.I4T4.setText(""+t4[4][1]);
        VerTablas.N4T4.setText(""+t4[4][2]);
        VerTablas.G4T4.setText(""+t4[4][3]);
        VerTablas.O4T4.setText(""+t4[4][4]);
        Jugar.B4T4.setText(""+t4[4][0]);
        Jugar.I4T4.setText(""+t4[4][1]);
        Jugar.N4T4.setText(""+t4[4][2]);
        Jugar.G4T4.setText(""+t4[4][3]);
        Jugar.O4T4.setText(""+t4[4][4]);
    }
    
    /**
     * Actualiza las casillas del tablero de Bingo 5, en los frames VerTablas y Jugar.
     */
    
    public static void actualizarTablero5()
    {
        VerTablas.B0T5.setText(""+t5[0][0]);
        VerTablas.I0T5.setText(""+t5[0][1]);
        VerTablas.N0T5.setText(""+t5[0][2]);
        VerTablas.G0T5.setText(""+t5[0][3]);
        VerTablas.O0T5.setText(""+t5[0][4]);
        Jugar.B0T5.setText(""+t5[0][0]);
        Jugar.I0T5.setText(""+t5[0][1]);
        Jugar.N0T5.setText(""+t5[0][2]);
        Jugar.G0T5.setText(""+t5[0][3]);
        Jugar.O0T5.setText(""+t5[0][4]);
        
        VerTablas.B1T5.setText(""+t5[1][0]);
        VerTablas.I1T5.setText(""+t5[1][1]);
        VerTablas.N1T5.setText(""+t5[1][2]);
        VerTablas.G1T5.setText(""+t5[1][3]);
        VerTablas.O1T5.setText(""+t5[1][4]);
        Jugar.B1T5.setText(""+t5[1][0]);
        Jugar.I1T5.setText(""+t5[1][1]);
        Jugar.N1T5.setText(""+t5[1][2]);
        Jugar.G1T5.setText(""+t5[1][3]);
        Jugar.O1T5.setText(""+t5[1][4]);
        
        VerTablas.B2T5.setText(""+t5[2][0]);
        VerTablas.I2T5.setText(""+t5[2][1]);
        VerTablas.N2T5.setText(""+t5[2][2]);
        VerTablas.G2T5.setText(""+t5[2][3]);
        VerTablas.O2T5.setText(""+t5[2][4]);
        Jugar.B2T5.setText(""+t5[2][0]);
        Jugar.I2T5.setText(""+t5[2][1]);
        Jugar.N2T5.setText(""+t5[2][2]);
        Jugar.G2T5.setText(""+t5[2][3]);
        Jugar.O2T5.setText(""+t5[2][4]);
        
        VerTablas.B3T5.setText(""+t5[3][0]);
        VerTablas.I3T5.setText(""+t5[3][1]);
        VerTablas.N3T5.setText(""+t5[3][2]);
        VerTablas.G3T5.setText(""+t5[3][3]);
        VerTablas.O3T5.setText(""+t5[3][4]);
        Jugar.B3T5.setText(""+t5[3][0]);
        Jugar.I3T5.setText(""+t5[3][1]);
        Jugar.N3T5.setText(""+t5[3][2]);
        Jugar.G3T5.setText(""+t5[3][3]);
        Jugar.O3T5.setText(""+t5[3][4]);
        
        VerTablas.B4T5.setText(""+t5[4][0]);
        VerTablas.I4T5.setText(""+t5[4][1]);
        VerTablas.N4T5.setText(""+t5[4][2]);
        VerTablas.G4T5.setText(""+t5[4][3]);
        VerTablas.O4T5.setText(""+t5[4][4]);
        Jugar.B4T5.setText(""+t5[4][0]);
        Jugar.I4T5.setText(""+t5[4][1]);
        Jugar.N4T5.setText(""+t5[4][2]);
        Jugar.G4T5.setText(""+t5[4][3]);
        Jugar.O4T5.setText(""+t5[4][4]);
    }
    
    /**
     * Muestra 2 recorridos personalizados de una matriz.
     * @param mat Matriz a recorrer.
     */
    
    public static void mostrarMatriz(int[][] mat)
    {
        int f, c;
        String a="", b="";
        
        for(c=mat[0].length-1; c>=0; c--)
        {
            if (c%2==0)
            {
                for(f=mat.length-1; f>=0; f--)
                {
                    a+=mat[f][c]+ "\n";
                }
            }
            else
            {
                for(f=0; f < mat.length; f++)
                {
                    a+=mat[f][c]+"\n";
                }
            }
        }
        
        imprimir("El recorrido de la forma A, del tablero de Bingo es:\n\n"+a);
        
        for(f=mat.length-1; f>=0; f--)
        {
            if (f%2==0)
            {
                for(c=0; c < mat[0].length; c++)
                {
                    b+=mat[f][c]+ "\n";
                }
            }
            else
            {
                for(c=mat[0].length-1; c>=0; c--)
                {
                    b+=mat[f][c]+ "\n";
                }
            }
        }
        imprimir("El recorrido de la forma B, del tablero de Bingo es:\n\n"+b);
    }
    
    /**
     * Despliega la ventana de dialogo Datos.
     * @param evt Clic registrado.
     */
    
    private void DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatosActionPerformed
        datos.setVisible(true);
    }//GEN-LAST:event_DatosActionPerformed
    
    /**
     * Despliega la ventana de dialogo Comprar.
     * Para desplegar la ventana, se deben cumplir ciertas condiciones.
     * De no cumplirse, se depliegan 2 ventanas de dialogo, para permitirle al usuario cumplir las condiciones.
     * @param evt Clic registrado
     */
    
    private void ComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComprarActionPerformed
        comprar2.setVisible(!tGenerados);
        datos2.setVisible(!data);
        comprar.setVisible(data && tGenerados);
    }//GEN-LAST:event_ComprarActionPerformed
    
    /**
     * Despliega la ventana de dialogo VerTablas.
     * Al llamarse el metodo, se actualizan las casillas de los tableros.
     * @param evt Clic registrado.
     */
    
    private void VerTableroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerTableroActionPerformed
        actualizarTablero1();
        actualizarTablero2();
        actualizarTablero3();
        actualizarTablero4();
        actualizarTablero5();
        VerTablas.noEditable();
        vt.setVisible(true);
    }//GEN-LAST:event_VerTableroActionPerformed
    
    /**
     * Despliega la ventana Modo.
     * @param evt Clic registrado.
     */
    
    private void ModoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModoActionPerformed
        modo.setVisible(true);
        mod=true;
    }//GEN-LAST:event_ModoActionPerformed
    
    /**
     * Despliega la ventana de dialogo Jugar.
     * Al desplegar la ventana, se inicializan las matrices corespondientes a los 5 tableros, para que se pueda validar si alguno gana.
     * Al desplegar la ventana, la ventana Menu1 será deshechada.
     * 
     * Para desplegar la ventana, se deben cumplir ciertas condiciones.
     * De no cumplirse, se depliegan una ventana de dialogo que le informa al usuario que no se puede desplegar la ventana.
     * @param evt Clic registrado.
     */
    
    private void playActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playActionPerformed
        String a="No es posible iniciar el juego. Errores encontrados:\n\n";
        if(tGenerados && comprado && mod)
        {
            Jugar.setNums();
            Jugar.setG1();
            Jugar.setG2();
            Jugar.setG3();
            Jugar.setG4();
            Jugar.setG5();
            Jugar.t13.setText("");
            jugar.setVisible(true);
            this.setVisible(false);
        }
        else
        {
            if(!mod)a+="Modo de juego no seleccionado\n";
            if(!tGenerados)a+="Tableros no Generados\n";
            Menu1.imprimir(a);
        }
    }//GEN-LAST:event_playActionPerformed

    /**
     * Constructor de la ventana Menu1.
     * @param args Llamado automático del constructor.
     */
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Comprar;
    private javax.swing.JButton Datos;
    private javax.swing.JButton Generar;
    private javax.swing.JButton Modo;
    private javax.swing.JTextField Titulo;
    private javax.swing.JButton VerTablero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JButton play;
    // End of variables declaration//GEN-END:variables
}
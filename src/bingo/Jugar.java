package bingo;

/**
 * Ventana de juego.
 * @author Diego Alejandro Pastrana y Juan Samuel Arbeláez
 */

public class Jugar extends javax.swing.JDialog {
    public static boolean nums[]=new boolean[75];
    public static String g1[][]=new String[5][5], g2[][]=new String[5][5], g3[][]=new String[5][5], g4[][]=new String[5][5], g5[][]=new String[5][5];
    public static boolean rep=true, gana1=false, gana2=false, gana3=false, gana4=false, gana5=false;
    public static String reg="";
    
    /**
     * Constructor de la ventana Jugar.
     */
    public Jugar() {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        B0T2 = new javax.swing.JTextField();
        N4T2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        G1T5 = new javax.swing.JTextField();
        O1T5 = new javax.swing.JTextField();
        B2T5 = new javax.swing.JTextField();
        I2T5 = new javax.swing.JTextField();
        N2T5 = new javax.swing.JTextField();
        B3T2 = new javax.swing.JTextField();
        G2T5 = new javax.swing.JTextField();
        I3T3 = new javax.swing.JTextField();
        O2T5 = new javax.swing.JTextField();
        I4T3 = new javax.swing.JTextField();
        O4T3 = new javax.swing.JTextField();
        G4T3 = new javax.swing.JTextField();
        B4T3 = new javax.swing.JTextField();
        O3T3 = new javax.swing.JTextField();
        I0T2 = new javax.swing.JTextField();
        G3T3 = new javax.swing.JTextField();
        N3T2 = new javax.swing.JTextField();
        B0T3 = new javax.swing.JTextField();
        N0T2 = new javax.swing.JTextField();
        N4T3 = new javax.swing.JTextField();
        B1T2 = new javax.swing.JTextField();
        G0T2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        O0T2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        I1T2 = new javax.swing.JTextField();
        N1T2 = new javax.swing.JTextField();
        I0T3 = new javax.swing.JTextField();
        N3T3 = new javax.swing.JTextField();
        N0T3 = new javax.swing.JTextField();
        B1T3 = new javax.swing.JTextField();
        G0T3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        O0T3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        I1T3 = new javax.swing.JTextField();
        N1T3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        G1T3 = new javax.swing.JTextField();
        O1T3 = new javax.swing.JTextField();
        B2T3 = new javax.swing.JTextField();
        I2T3 = new javax.swing.JTextField();
        N2T3 = new javax.swing.JTextField();
        G2T3 = new javax.swing.JTextField();
        O2T3 = new javax.swing.JTextField();
        B3T3 = new javax.swing.JTextField();
        I3T4 = new javax.swing.JTextField();
        I4T4 = new javax.swing.JTextField();
        O4T4 = new javax.swing.JTextField();
        G4T4 = new javax.swing.JTextField();
        B4T4 = new javax.swing.JTextField();
        O3T4 = new javax.swing.JTextField();
        G3T4 = new javax.swing.JTextField();
        B0T4 = new javax.swing.JTextField();
        N4T4 = new javax.swing.JTextField();
        I0T4 = new javax.swing.JTextField();
        N3T4 = new javax.swing.JTextField();
        N0T4 = new javax.swing.JTextField();
        B1T4 = new javax.swing.JTextField();
        G0T4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        O0T4 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        I1T4 = new javax.swing.JTextField();
        N1T4 = new javax.swing.JTextField();
        I3T1 = new javax.swing.JTextField();
        I4T1 = new javax.swing.JTextField();
        O4T1 = new javax.swing.JTextField();
        G4T1 = new javax.swing.JTextField();
        B4T1 = new javax.swing.JTextField();
        O3T1 = new javax.swing.JTextField();
        G3T1 = new javax.swing.JTextField();
        B0T1 = new javax.swing.JTextField();
        N4T1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        G1T4 = new javax.swing.JTextField();
        O1T4 = new javax.swing.JTextField();
        B2T4 = new javax.swing.JTextField();
        I2T4 = new javax.swing.JTextField();
        N2T4 = new javax.swing.JTextField();
        B3T5 = new javax.swing.JTextField();
        G2T4 = new javax.swing.JTextField();
        p3 = new javax.swing.JLabel();
        O2T4 = new javax.swing.JTextField();
        p2 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        I0T1 = new javax.swing.JTextField();
        N3T1 = new javax.swing.JTextField();
        N0T1 = new javax.swing.JTextField();
        B1T1 = new javax.swing.JTextField();
        G0T1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        O0T1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        I1T1 = new javax.swing.JTextField();
        N1T1 = new javax.swing.JTextField();
        B3T4 = new javax.swing.JTextField();
        I3T5 = new javax.swing.JTextField();
        I4T5 = new javax.swing.JTextField();
        O4T5 = new javax.swing.JTextField();
        G4T5 = new javax.swing.JTextField();
        B4T5 = new javax.swing.JTextField();
        O3T5 = new javax.swing.JTextField();
        G3T5 = new javax.swing.JTextField();
        B0T5 = new javax.swing.JTextField();
        N4T5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        G1T1 = new javax.swing.JTextField();
        O1T1 = new javax.swing.JTextField();
        B2T1 = new javax.swing.JTextField();
        I2T1 = new javax.swing.JTextField();
        N2T1 = new javax.swing.JTextField();
        G2T1 = new javax.swing.JTextField();
        O2T1 = new javax.swing.JTextField();
        I0T5 = new javax.swing.JTextField();
        N3T5 = new javax.swing.JTextField();
        N0T5 = new javax.swing.JTextField();
        B1T5 = new javax.swing.JTextField();
        G0T5 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        O0T5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        I1T5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        N1T5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        G1T2 = new javax.swing.JTextField();
        O1T2 = new javax.swing.JTextField();
        B2T2 = new javax.swing.JTextField();
        I2T2 = new javax.swing.JTextField();
        B3T1 = new javax.swing.JTextField();
        N2T2 = new javax.swing.JTextField();
        I3T2 = new javax.swing.JTextField();
        G2T2 = new javax.swing.JTextField();
        I4T2 = new javax.swing.JTextField();
        O2T2 = new javax.swing.JTextField();
        O4T2 = new javax.swing.JTextField();
        G4T2 = new javax.swing.JTextField();
        B4T2 = new javax.swing.JTextField();
        O3T2 = new javax.swing.JTextField();
        G3T2 = new javax.swing.JTextField();
        t23 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t18 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t22 = new javax.swing.JTextField();
        t25 = new javax.swing.JTextField();
        t24 = new javax.swing.JTextField();
        t21 = new javax.swing.JTextField();
        t20 = new javax.swing.JTextField();
        t19 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        modo = new javax.swing.JLabel();
        registro = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        añadir = new javax.swing.JButton();
        lista = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        B0T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N4T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("N");

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("G");

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("O");

        G1T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G1T5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1T5ActionPerformed(evt);
            }
        });

        O1T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B2T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I2T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N2T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B3T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G2T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I3T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O2T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I4T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O4T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G4T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B4T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O3T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I0T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G3T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N3T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B0T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N0T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N4T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B1T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G0T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("B");

        O0T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("I");

        I1T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N1T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I0T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N3T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N0T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B1T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G0T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("B");

        O0T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("I");

        I1T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N1T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("N");

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("G");

        jLabel15.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("O");

        G1T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G1T3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1T3ActionPerformed(evt);
            }
        });

        O1T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B2T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I2T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N2T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G2T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O2T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B3T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I3T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I4T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O4T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G4T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B4T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O3T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G3T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B0T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N4T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I0T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N3T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N0T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B1T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G0T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel16.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("B");

        O0T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("I");

        I1T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N1T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I3T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I4T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O4T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G4T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B4T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O3T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G3T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B0T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N4T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("N");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("G");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("O");

        G1T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G1T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1T4ActionPerformed(evt);
            }
        });

        O1T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B2T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I2T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N2T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B3T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G2T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        p3.setBackground(new java.awt.Color(153, 153, 153));
        p3.setText("Propietario:");

        O2T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        p2.setBackground(new java.awt.Color(153, 153, 153));
        p2.setText("Propietario:");

        p4.setBackground(new java.awt.Color(153, 153, 153));
        p4.setText("Propietario:");

        p5.setBackground(new java.awt.Color(153, 153, 153));
        p5.setText("Propietario:");

        p1.setBackground(new java.awt.Color(153, 153, 153));
        p1.setText("Propietario:");

        I0T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N3T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N0T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B1T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G0T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("B");

        O0T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("I");

        I1T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N1T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B3T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I3T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I4T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O4T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G4T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B4T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O3T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G3T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B0T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N4T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("N");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("G");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("O");

        G1T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G1T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1T1ActionPerformed(evt);
            }
        });

        O1T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B2T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I2T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N2T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G2T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O2T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I0T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N3T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N0T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B1T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G0T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("B");

        O0T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("I");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("N");

        I1T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("G");

        N1T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("O");

        G1T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        G1T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1T2ActionPerformed(evt);
            }
        });

        O1T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B2T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I2T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B3T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        N2T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I3T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G2T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        I4T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O2T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O4T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G4T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        B4T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        O3T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        G3T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t23.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("B");

        t5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("I");

        t7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel28.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("N");

        jLabel29.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("G");

        jLabel30.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("O");

        t9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t9ActionPerformed(evt);
            }
        });

        t10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t22.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t25.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t24.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t21.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t20.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        t1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        modo.setBackground(new java.awt.Color(153, 153, 153));
        modo.setText("Modo de Juego:");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Registro de Entrada");

        añadir.setText("Añadir");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B4T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B3T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B2T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B0T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(I2T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I3T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I4T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I0T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N0T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N2T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N3T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N4T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G0T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G2T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G3T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G4T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O0T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O1T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O2T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O3T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O4T4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B4T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B3T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B2T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B0T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(I2T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I3T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I4T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I0T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N0T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N2T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N3T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N4T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G0T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G2T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G3T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G4T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O0T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O1T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O2T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O3T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O4T5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t24, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(t25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(modo, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B4T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B3T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B2T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B0T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(I2T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I3T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I4T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I0T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N0T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N2T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N3T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N4T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G0T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G2T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G3T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G4T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O0T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O1T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O2T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O3T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O4T1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(21, 21, 21))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B4T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B3T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B2T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B0T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(I2T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I3T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I4T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I0T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N0T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N2T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N3T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N4T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G0T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G2T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G3T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G4T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O0T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O1T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O2T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O3T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O4T2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(32, 32, 32)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B4T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B3T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B2T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(B0T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(I2T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I3T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I4T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I0T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(I1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N0T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N2T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N3T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(N4T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G0T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G2T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G3T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(G4T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O0T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O1T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O2T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O3T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(O4T3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(262, 262, 262)
                                        .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(234, 234, 234))
                                    .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 701, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(añadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B0T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I0T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N0T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G0T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O0T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O1T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(I2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N3T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O4T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B0T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I0T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N0T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G0T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O0T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O1T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(I2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N3T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B4T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I4T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N4T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G4T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O4T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B0T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I0T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N0T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G0T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O0T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O1T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(I2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N3T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O4T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(p2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(p1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B0T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I0T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N0T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G0T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O0T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O1T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(I2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N3T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B4T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I4T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N4T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G4T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O4T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B0T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I0T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N0T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G0T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O0T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O1T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(I2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B2T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(B3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N3T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(B4T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(I4T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N4T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(G4T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(O4T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(p4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadir)
                    .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void G1T5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1T5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1T5ActionPerformed

    private void G1T3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1T3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1T3ActionPerformed

    private void G1T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1T4ActionPerformed

    private void G1T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1T1ActionPerformed

    private void G1T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_G1T2ActionPerformed

    private void t9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t9ActionPerformed

    
    /**
     * Inicializa la matriz nums.
     */
    public static void setNums()
    {
        int i;
        
        for(i=0;i<75;i++)
        {
            nums[i]=false;
        }
    }
    
    /**
     * Inicializa la matriz g1.
     */
    
    public static void setG1()
    {
        int i, c;
        
        for(i=0;i<5;i++)
        {
            for(c=0;c<5; c++)
            {
                g1[i][c]="";
            }
        }
    }
    
    /**
     * Inicializa la matriz g2.
     */
    
    public static void setG2()
    {
        int i, c;
        
        for(i=0;i<5;i++)
        {
            for(c=0;c<5; c++)
            {
                g2[i][c]="";
            }
        }
    }
    
    /**
     * Inicializa la matriz g3.
     */
    
    public static void setG3()
    {
        int i, c;
        
        for(i=0;i<5;i++)
        {
            for(c=0;c<5; c++)
            {
                g3[i][c]="";
            }
        }
    }
    
    /**
     * Inicializa la matriz g4.
     */
    
    public static void setG4()
    {
        int i, c;
        
        for(i=0;i<5;i++)
        {
            for(c=0;c<5; c++)
            {
                g4[i][c]="";
            }
        }
    }
    
    /**
     * Inicializa la matiz g5.
     */
    
    public static void setG5()
    {
        int i, c;
        
        for(i=0;i<5;i++)
        {
            for(c=0;c<5; c++)
            {
                g5[i][c]="";
            }
        }
    }
    
    /**
     * Valida que el parametro ingresado, de tipo int, se encuentre entre 1 y 75
     * @param m Parametro. De tipo int.
     * @return Devuelve el numero validado.
     */
    
    public static int validarIntervalo(int m)
    {
        int n=m, i;
        
        do
        {
            if(m>75 || m<1) Menu1.imprimir("El numero ingresado no es valido, intente nuevamente");
        } while(m>75 || m<1);
        return m;
    }
    
    /**
     * Valida que el numero ingresado por parametro no se haya ingresado previemente.
     * @param m Parametro. De tipo Int.
     * @return Devuelve una representación booleana de la repetición.
     */
    
    public static boolean filtrarRepeticion(int m)
    {
        int i, n=m;
        boolean presente=false, b=true;
        String a="";
        
        for(i=0; i<75 && !presente && b; i++)
        {
            if(n==(i+1))
            {
                if(nums[i])
                {
                    Menu1.imprimir("El numero ingresado ya se encuentra en la lista");
                    presente=true;
                }
                else
                {
                    nums[i]=true;
                    a+=n+"   ";
                }  
                b=false;
            }
        }
        return  !presente;
    }
    
    /**
     * Marca los elementos del tablero uno con una X, si la boleta asociada al elemento fué registrada.
     * Al marcar los elementos, asocia su valor positivo a su matriz.
     */
    
    public static void revisarTablero1()
    {
        if(validar2(Integer.parseInt(VerTablas.B0T1.getText())))
        {
            B0T1.setText(B0T1.getText()+" X");
            g1[0][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I0T1.getText())))
        {
            I0T1.setText(I0T1.getText()+" X");
            g1[0][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N0T1.getText())))
        {
            N0T1.setText(N0T1.getText()+" X");
            g1[0][2]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.G0T1.getText())))
        {
            G0T1.setText(G0T1.getText()+" X");
            g1[0][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O0T1.getText())))
        {
            O0T1.setText(O0T1.getText()+" X");
            g1[0][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B1T1.getText())))
        {
            B1T1.setText(B1T1.getText()+" X");
            g1[1][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I1T1.getText())))
        {
            I1T1.setText(I1T1.getText()+" X");
            g1[1][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N1T1.getText())))
        {
            N1T1.setText(N1T1.getText()+" X");
            g1[1][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G1T1.getText())))
        {
            G1T1.setText(G1T1.getText()+" X");
            g1[1][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O1T1.getText())))
        {
            O1T1.setText(O1T1.getText()+" X");
            g1[1][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B2T1.getText())))
        {
            B2T1.setText(B2T1.getText()+" X");
            g1[2][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I2T1.getText())))
        {
            I2T1.setText(I2T1.getText()+" X");
            g1[2][1]="X";
        }
        
        g1[2][2]="X";
        
        if(validar2(Integer.parseInt(VerTablas.G2T1.getText())))
        {
            G2T1.setText(G2T1.getText()+" X");
            g1[2][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O2T1.getText())))
        {
            O2T1.setText(O2T1.getText()+" X");
            g1[2][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B3T1.getText())))
        {
            B3T1.setText(B3T1.getText()+" X");
            g1[3][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I3T1.getText())))
        {
            I3T1.setText(I3T1.getText()+" X");
            g1[3][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N3T1.getText())))
        {
            N3T1.setText(N3T1.getText()+" X");
            g1[3][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G3T1.getText())))
        {
            G3T1.setText(G3T1.getText()+" X");
            g1[3][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O3T1.getText())))
        {
            O3T1.setText(O3T1.getText()+" X");
            g1[3][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B4T1.getText())))
        {
            B4T1.setText(B4T1.getText()+" X");
            g1[4][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I4T1.getText())))
        {
            I4T1.setText(I4T1.getText()+" X");
            g1[4][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N4T1.getText())))
        {
            N4T1.setText(N4T1.getText()+" X");
            g1[4][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G4T1.getText())))
        {
            G4T1.setText(G4T1.getText()+" X");
            g1[4][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O4T1.getText())))
        {
            O4T1.setText(O4T1.getText()+" X");
            g1[4][4]="X";
        }
    }
    
    /**
     * Marca los elementos del tablero uno con una X, si la boleta asociada al elemento fué registrada.
     * Al marcar los elementos, asocia su valor positivo a su matriz.
     */
    
    public static void revisarTablero2()
    {
        if(validar2(Integer.parseInt(VerTablas.B0T2.getText())))
        {
            B0T2.setText(B0T2.getText()+" X");
            g2[0][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I0T2.getText())))
        {
            I0T2.setText(I0T2.getText()+" X");
            g2[0][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N0T2.getText())))
        {
            N0T2.setText(N0T2.getText()+" X");
            g2[0][2]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.G0T2.getText())))
        {
            G0T2.setText(G0T2.getText()+" X");
            g2[0][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O0T2.getText())))
        {
            O0T2.setText(O0T2.getText()+" X");
            g2[0][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B1T2.getText())))
        {
            B1T2.setText(B1T2.getText()+" X");
            g2[1][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I1T2.getText())))
        {
            I1T2.setText(I1T2.getText()+" X");
            g2[1][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N1T2.getText())))
        {
            N1T2.setText(N1T2.getText()+" X");
            g2[1][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G1T2.getText())))
        {
            G1T2.setText(G1T2.getText()+" X");
            g2[1][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O1T2.getText())))
        {
            O1T2.setText(O1T2.getText()+" X");
            g2[1][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B2T2.getText())))
        {
            B2T2.setText(B2T2.getText()+" X");
            g2[2][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I2T2.getText())))
        {
            I2T2.setText(I2T2.getText()+" X");
            g2[2][1]="X";
        }
        
        g2[2][2]="X";
            
        if(validar2(Integer.parseInt(VerTablas.G2T2.getText())))
        {
            G2T2.setText(G2T2.getText()+" X");
            g2[2][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O2T2.getText())))
        {
            O2T2.setText(O2T2.getText()+" X");
            g2[2][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B3T2.getText())))
        {
            B3T2.setText(B3T2.getText()+" X");
            g2[3][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I3T2.getText())))
        {
            I3T2.setText(I3T2.getText()+" X");
            g2[3][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N3T2.getText())))
        {
            N3T2.setText(N3T2.getText()+" X");
            g2[3][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G3T2.getText())))
        {
            G3T2.setText(G3T2.getText()+" X");
            g2[3][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O3T2.getText())))
        {
            O3T2.setText(O3T2.getText()+" X");
            g2[3][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B4T2.getText())))
        {
            B4T2.setText(B4T2.getText()+" X");
            g2[4][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I4T2.getText())))
        {
            I4T2.setText(I4T2.getText()+" X");
            g2[4][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N4T2.getText())))
        {
            N4T2.setText(N4T2.getText()+" X");
            g1[4][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G4T2.getText())))
        {
            G4T2.setText(G4T2.getText()+" X");
            g2[4][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O4T2.getText())))
        {
            O4T2.setText(O4T2.getText()+" X");
            g2[4][4]="X";
        }
    }
    
    /**
     * Marca los elementos del tablero uno con una X, si la boleta asociada al elemento fué registrada.
     * Al marcar los elementos, asocia su valor positivo a su matriz.
     */
    
    public static void revisarTablero3()
    {
        if(validar2(Integer.parseInt(VerTablas.B0T3.getText())))
        {
            B0T3.setText(B0T3.getText()+" X");
            g3[0][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I0T3.getText())))
        {
            I0T3.setText(I0T3.getText()+" X");
            g3[0][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N0T3.getText())))
        {
            N0T3.setText(N0T3.getText()+" X");
            g3[0][2]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.G0T3.getText())))
        {
            G0T3.setText(G0T3.getText()+" X");
            g3[0][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O0T3.getText())))
        {
            O0T3.setText(O0T3.getText()+" X");
            g3[0][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B1T3.getText())))
        {
            B1T3.setText(B1T3.getText()+" X");
            g3[1][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I1T3.getText())))
        {
            I1T3.setText(I1T3.getText()+" X");
            g3[1][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N1T3.getText())))
        {
            N1T3.setText(N1T3.getText()+" X");
            g3[1][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G1T3.getText())))
        {
            G1T3.setText(G1T3.getText()+" X");
            g3[1][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O1T3.getText())))
        {
            O1T3.setText(O1T3.getText()+" X");
            g3[1][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B2T3.getText())))
        {
            B2T3.setText(B2T3.getText()+" X");
            g3[2][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I2T3.getText())))
        {
            I2T3.setText(I2T3.getText()+" X");
            g3[2][1]="X";
        }

        g3[2][2]="X";

        if(validar2(Integer.parseInt(VerTablas.G2T3.getText())))
        {
            G2T3.setText(G2T3.getText()+" X");
            g3[2][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O2T3.getText())))
        {
            O2T3.setText(O2T3.getText()+" X");
            g3[2][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B3T3.getText())))
        {
            B3T3.setText(B3T3.getText()+" X");
            g3[3][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I3T3.getText())))
        {
            I3T3.setText(I3T3.getText()+" X");
            g3[3][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N3T3.getText())))
        {
            N3T3.setText(N3T3.getText()+" X");
            g3[3][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G3T3.getText())))
        {
            G3T3.setText(G3T3.getText()+" X");
            g3[3][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O3T3.getText())))
        {
            O3T3.setText(O3T3.getText()+" X");
            g3[3][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B4T3.getText())))
        {
            B4T3.setText(B4T3.getText()+" X");
            g3[4][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I4T3.getText())))
        {
            I4T3.setText(I4T3.getText()+" X");
            g3[4][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N4T3.getText())))
        {
            N4T3.setText(N4T3.getText()+" X");
            g3[4][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G4T3.getText())))
        {
            G4T3.setText(G4T3.getText()+" X");
            g3[4][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O4T3.getText())))
        {
            O4T3.setText(O4T3.getText()+" X");
            g3[4][4]="X";
        }
    }
    
    /**
     * Marca los elementos del tablero uno con una X, si la boleta asociada al elemento fué registrada.
     * Al marcar los elementos, asocia su valor positivo a su matriz.
     */
    
    public static void revisarTablero4()
    {
        if(validar2(Integer.parseInt(VerTablas.B0T4.getText())))
        {
            B0T4.setText(B0T4.getText()+" X");
            g4[0][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I0T4.getText())))
        {
            I0T4.setText(I0T4.getText()+" X");
            g4[0][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N0T4.getText())))
        {
            N0T4.setText(N0T4.getText()+" X");
            g4[0][2]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.G0T4.getText())))
        {
            G0T4.setText(G0T4.getText()+" X");
            g4[0][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O0T4.getText())))
        {
            O0T4.setText(O0T4.getText()+" X");
            g4[0][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B1T4.getText())))
        {
            B1T4.setText(B1T4.getText()+" X");
            g4[1][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I1T4.getText())))
        {
            I1T4.setText(I1T4.getText()+" X");
            g4[1][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N1T4.getText())))
        {
            N1T4.setText(N1T4.getText()+" X");
            g4[1][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G1T4.getText())))
        {
            G1T4.setText(G1T4.getText()+" X");
            g4[1][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O1T4.getText())))
        {
            O1T4.setText(O1T4.getText()+" X");
            g4[1][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B2T4.getText())))
        {
            B2T4.setText(B2T4.getText()+" X");
            g4[2][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I2T4.getText())))
        {
            I2T4.setText(I2T4.getText()+" X");
            g4[2][1]="X";
        }
            
            g4[2][2]="X";
        
        if(validar2(Integer.parseInt(VerTablas.G2T4.getText())))
        {
            G2T4.setText(G2T4.getText()+" X");
            g4[2][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O2T4.getText())))
        {
            O2T4.setText(O2T4.getText()+" X");
            g4[2][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B3T4.getText())))
        {
            B3T4.setText(B3T4.getText()+" X");
            g4[3][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I3T4.getText())))
        {
            I3T4.setText(I3T4.getText()+" X");
            g4[3][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N3T4.getText())))
        {
            N3T4.setText(N3T4.getText()+" X");
            g4[3][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G3T4.getText())))
        {
            G3T4.setText(G3T4.getText()+" X");
            g4[3][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O3T4.getText())))
        {
            O3T4.setText(O3T4.getText()+" X");
            g4[3][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B4T4.getText())))
        {
            B4T4.setText(B4T4.getText()+" X");
            g4[4][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I4T4.getText())))
        {
            I4T4.setText(I4T4.getText()+" X");
            g4[4][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N4T4.getText())))
        {
            N4T4.setText(N4T4.getText()+" X");
            g4[4][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G4T4.getText())))
        {
            G4T4.setText(G4T4.getText()+" X");
            g4[4][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O4T4.getText())))
        {
            O4T4.setText(O4T4.getText()+" X");
            g4[4][4]="X";
        }
    }
    
    /**
     * Marca los elementos del tablero uno con una X, si la boleta asociada al elemento fué registrada.
     * Al marcar los elementos, asocia su valor positivo a su matriz.
     */
    
    public static void revisarTablero5()
    {
        if(validar2(Integer.parseInt(VerTablas.B0T5.getText())))
        {
            B0T5.setText(B0T5.getText()+" X");
            g5[0][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I0T5.getText())))
        {
            I0T5.setText(I0T5.getText()+" X");
            g5[0][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N0T5.getText())))
        {
            N0T5.setText(N0T5.getText()+" X");
            g5[0][2]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.G0T5.getText())))
        {
            G0T5.setText(G0T5.getText()+" X");
            g5[0][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O0T5.getText())))
        {
            O0T5.setText(O0T5.getText()+" X");
            g5[0][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B1T5.getText())))
        {
            B1T1.setText(B1T5.getText()+" X");
            g5[1][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I1T5.getText())))
        {
            I1T5.setText(I1T5.getText()+" X");
            g5[1][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N1T5.getText())))
        {
            N1T5.setText(N1T5.getText()+" X");
            g5[1][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G1T5.getText())))
        {
            G1T5.setText(G1T5.getText()+" X");
            g5[1][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O1T5.getText())))
        {
            O1T5.setText(O1T5.getText()+" X");
            g5[1][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B2T5.getText())))
        {
            B2T5.setText(B2T5.getText()+" X");
            g5[2][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I2T5.getText())))
        {
            I2T5.setText(I2T5.getText()+" X");
            g5[2][1]="X";
        }
        
        g5[2][2]="X";
        
        if(validar2(Integer.parseInt(VerTablas.G2T5.getText())))
        {
            G2T5.setText(G2T5.getText()+" X");
            g5[2][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O2T5.getText())))
        {
            O2T5.setText(O2T5.getText()+" X");
            g5[2][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B3T5.getText())))
        {
            B3T5.setText(B3T5.getText()+" X");
            g5[3][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I3T5.getText())))
        {
            I3T5.setText(I3T5.getText()+" X");
            g5[3][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N3T5.getText())))
        {
            N3T5.setText(N3T5.getText()+" X");
            g5[3][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G3T5.getText())))
        {
            G3T5.setText(G3T5.getText()+" X");
            g5[3][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O3T5.getText())))
        {
            O3T5.setText(O3T5.getText()+" X");
            g5[3][4]="X";
        }
        
        if(validar2(Integer.parseInt(VerTablas.B4T5.getText())))
        {
            B4T5.setText(B4T5.getText()+" X");
            g5[4][0]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.I4T5.getText())))
        {
            I4T5.setText(I4T5.getText()+" X");
            g5[4][1]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.N4T5.getText())))
        {
            N4T5.setText(N4T5.getText()+" X");
            g5[4][2]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.G4T5.getText())))
        {
            G4T5.setText(G4T5.getText()+" X");
            g5[4][3]="X";
        }
        if(validar2(Integer.parseInt(VerTablas.O4T5.getText())))
        {
            O4T5.setText(O4T5.getText()+" X");
            g5[4][4]="X";
        }
    }
    
    /**
     * Revisa si un tablero ha ganado.
     */
    
    public static void revisarGanador()
    {
        Menu1.modoJuego[2][2]="X";
        if(verificar(g1, Menu1.modoJuego))
        {
            gana1=true;
            Victoria.setGanador(1);   
        }
        if(verificar(g2, Menu1.modoJuego))
        {
            gana2=true;
            Victoria.setGanador(2);
        }
        if(verificar(g3, Menu1.modoJuego))
        {
            gana3=true;
            Victoria.setGanador(3);
        }
        if(verificar(g4, Menu1.modoJuego))
        {
            gana4=true;
            Victoria.setGanador(4);
            
        }
        if(verificar(g5, Menu1.modoJuego))
        {
            gana5=true;
            Victoria.setGanador(5);
        }
    }
    
    /**
     * Verifica que una matiz contenga almenos los valores de otra.
     * Valida que en las posiciones en las que en la matriz fuente se encuentre una X, tambien se encuentre en la matriz objetivo. 
     * 
     * @param m Parametetro. Matriz a comparar con una referencia.
     * @param n Parametro. Matriz de referencia
     * @return Devuelve una representación booleana de su igualdad.
     */
    
    public static boolean verificar(String[][] m, String[][] n)
    {
        int i, c;
        boolean b=true;
        
        for(i=0; i<5; i++)
        {
            for(c=0; c<5; c++)
            {
                if (n[i][c]=="X")
                {
                    if(n[i][c]!=m[i][c]) b=false;
                }
            }
        }
        return b;
    }
    
    /**
     * Valida que un parámtero sea igual al elemento de una lista.
     * @param n Parametro. De tipo int.
     * @return Devuelve una representación booleana de la igualdad.
     */
    
    public static boolean validar2(int n)
    {
        boolean m=false;
        
        if(n==Integer.parseInt(""+lista.getSelectedItem()))m=true;
        
        return m;
    }
    
    /**
     * Añade un número al registro de balotas.
     * Al añadir el numero, revisa su presencia en los tableros, y si hay un ganador.
     * Al añadir el numero, lo elimina de la lista de balotas.
     * @param evt Clic registrado.
     */
    
    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        boolean presente=filtrarRepeticion(validarIntervalo(Integer.parseInt(""+lista.getSelectedItem())));
        if(presente)
        {
            registro.setText(registro.getText()+lista.getSelectedItem()+"  ");
            revisarTablero1();
            revisarTablero2();
            revisarTablero3();
            revisarTablero4();
            revisarTablero5();
            lista.removeItem(lista.getSelectedItem());
            revisarGanador();
        }
        
    }//GEN-LAST:event_añadirActionPerformed
    
    /**
     * Actualiza la representación del modo de juego seleccionado.
     * @param m Parametro. La matriz del modo de juego seleccionado.
     */
    
    public static void actualizarTableroModo(String[][] m)
    {
        t1.setText(""+m[0][0]);
        t2.setText(""+m[0][1]);
        t3.setText(""+m[0][2]);
        t4.setText(""+m[0][3]);
        t5.setText(""+m[0][4]);
        
        t6.setText(""+m[1][0]);
        t7.setText(""+m[1][1]);
        t8.setText(""+m[1][2]);
        t9.setText(""+m[1][3]);
        t10.setText(""+m[1][4]);
        
        t11.setText(""+m[2][0]);
        t12.setText(""+m[2][1]);
        t13.setText(""+m[2][2]);
        t14.setText(""+m[2][3]);
        t15.setText(""+m[2][4]);
        
        t16.setText(""+m[3][0]);
        t17.setText(""+m[3][1]);
        t18.setText(""+m[3][2]);
        t19.setText(""+m[3][3]);
        t20.setText(""+m[3][4]);
        
        t21.setText(""+m[4][0]);
        t22.setText(""+m[4][1]);
        t23.setText(""+m[4][2]);
        t24.setText(""+m[4][3]);
        t25.setText(""+m[4][4]);
        
        modo.setText("Modo de Juego: "+modoJuego.tipo);
    }
    
/*
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B0T1;
    private javax.swing.JTextField B0T2;
    private javax.swing.JTextField B0T3;
    private javax.swing.JTextField B0T4;
    private javax.swing.JTextField B0T5;
    private javax.swing.JTextField B1T1;
    private javax.swing.JTextField B1T2;
    private javax.swing.JTextField B1T3;
    private javax.swing.JTextField B1T4;
    private javax.swing.JTextField B1T5;
    private javax.swing.JTextField B2T1;
    private javax.swing.JTextField B2T2;
    private javax.swing.JTextField B2T3;
    private javax.swing.JTextField B2T4;
    private javax.swing.JTextField B2T5;
    private javax.swing.JTextField B3T1;
    private javax.swing.JTextField B3T2;
    private javax.swing.JTextField B3T3;
    private javax.swing.JTextField B3T4;
    private javax.swing.JTextField B3T5;
    private javax.swing.JTextField B4T1;
    private javax.swing.JTextField B4T2;
    private javax.swing.JTextField B4T3;
    private javax.swing.JTextField B4T4;
    private javax.swing.JTextField B4T5;
    private javax.swing.JTextField G0T1;
    private javax.swing.JTextField G0T2;
    private javax.swing.JTextField G0T3;
    private javax.swing.JTextField G0T4;
    private javax.swing.JTextField G0T5;
    private javax.swing.JTextField G1T1;
    private javax.swing.JTextField G1T2;
    private javax.swing.JTextField G1T3;
    private javax.swing.JTextField G1T4;
    private javax.swing.JTextField G1T5;
    private javax.swing.JTextField G2T1;
    private javax.swing.JTextField G2T2;
    private javax.swing.JTextField G2T3;
    private javax.swing.JTextField G2T4;
    private javax.swing.JTextField G2T5;
    private javax.swing.JTextField G3T1;
    private javax.swing.JTextField G3T2;
    private javax.swing.JTextField G3T3;
    private javax.swing.JTextField G3T4;
    private javax.swing.JTextField G3T5;
    private javax.swing.JTextField G4T1;
    private javax.swing.JTextField G4T2;
    private javax.swing.JTextField G4T3;
    private javax.swing.JTextField G4T4;
    private javax.swing.JTextField G4T5;
    private javax.swing.JTextField I0T1;
    private javax.swing.JTextField I0T2;
    private javax.swing.JTextField I0T3;
    private javax.swing.JTextField I0T4;
    private javax.swing.JTextField I0T5;
    private javax.swing.JTextField I1T1;
    private javax.swing.JTextField I1T2;
    private javax.swing.JTextField I1T3;
    private javax.swing.JTextField I1T4;
    private javax.swing.JTextField I1T5;
    private javax.swing.JTextField I2T1;
    private javax.swing.JTextField I2T2;
    private javax.swing.JTextField I2T3;
    private javax.swing.JTextField I2T4;
    private javax.swing.JTextField I2T5;
    private javax.swing.JTextField I3T1;
    private javax.swing.JTextField I3T2;
    private javax.swing.JTextField I3T3;
    private javax.swing.JTextField I3T4;
    private javax.swing.JTextField I3T5;
    private javax.swing.JTextField I4T1;
    private javax.swing.JTextField I4T2;
    private javax.swing.JTextField I4T3;
    private javax.swing.JTextField I4T4;
    private javax.swing.JTextField I4T5;
    private javax.swing.JTextField N0T1;
    private javax.swing.JTextField N0T2;
    private javax.swing.JTextField N0T3;
    private javax.swing.JTextField N0T4;
    private javax.swing.JTextField N0T5;
    private javax.swing.JTextField N1T1;
    private javax.swing.JTextField N1T2;
    private javax.swing.JTextField N1T3;
    private javax.swing.JTextField N1T4;
    private javax.swing.JTextField N1T5;
    private javax.swing.JTextField N2T1;
    private javax.swing.JTextField N2T2;
    private javax.swing.JTextField N2T3;
    private javax.swing.JTextField N2T4;
    private javax.swing.JTextField N2T5;
    private javax.swing.JTextField N3T1;
    private javax.swing.JTextField N3T2;
    private javax.swing.JTextField N3T3;
    private javax.swing.JTextField N3T4;
    private javax.swing.JTextField N3T5;
    private javax.swing.JTextField N4T1;
    private javax.swing.JTextField N4T2;
    private javax.swing.JTextField N4T3;
    private javax.swing.JTextField N4T4;
    private javax.swing.JTextField N4T5;
    private javax.swing.JTextField O0T1;
    private javax.swing.JTextField O0T2;
    private javax.swing.JTextField O0T3;
    private javax.swing.JTextField O0T4;
    private javax.swing.JTextField O0T5;
    private javax.swing.JTextField O1T1;
    private javax.swing.JTextField O1T2;
    private javax.swing.JTextField O1T3;
    private javax.swing.JTextField O1T4;
    private javax.swing.JTextField O1T5;
    private javax.swing.JTextField O2T1;
    private javax.swing.JTextField O2T2;
    private javax.swing.JTextField O2T3;
    private javax.swing.JTextField O2T4;
    private javax.swing.JTextField O2T5;
    private javax.swing.JTextField O3T1;
    private javax.swing.JTextField O3T2;
    private javax.swing.JTextField O3T3;
    private javax.swing.JTextField O3T4;
    private javax.swing.JTextField O3T5;
    private javax.swing.JTextField O4T1;
    private javax.swing.JTextField O4T2;
    private javax.swing.JTextField O4T3;
    private javax.swing.JTextField O4T4;
    private javax.swing.JTextField O4T5;
    private javax.swing.JButton añadir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> lista;
    private javax.swing.JLabel modo;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JTextField registro;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t19;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t20;
    private javax.swing.JTextField t21;
    private javax.swing.JTextField t22;
    private javax.swing.JTextField t23;
    private javax.swing.JTextField t24;
    private javax.swing.JTextField t25;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
*/
    public static javax.swing.JTextField B0T1;
    public static javax.swing.JTextField B0T2;
    public static javax.swing.JTextField B0T3;
    public static javax.swing.JTextField B0T4;
    public static javax.swing.JTextField B0T5;
    public static javax.swing.JTextField B1T1;
    public static javax.swing.JTextField B1T2;
    public static javax.swing.JTextField B1T3;
    public static javax.swing.JTextField B1T4;
    public static javax.swing.JTextField B1T5;
    public static javax.swing.JTextField B2T1;
    public static javax.swing.JTextField B2T2;
    public static javax.swing.JTextField B2T3;
    public static javax.swing.JTextField B2T4;
    public static javax.swing.JTextField B2T5;
    public static javax.swing.JTextField B3T1;
    public static javax.swing.JTextField B3T2;
    public static javax.swing.JTextField B3T3;
    public static javax.swing.JTextField B3T4;
    public static javax.swing.JTextField B3T5;
    public static javax.swing.JTextField B4T1;
    public static javax.swing.JTextField B4T2;
    public static javax.swing.JTextField B4T3;
    public static javax.swing.JTextField B4T4;
    public static javax.swing.JTextField B4T5;
    public static javax.swing.JTextField G0T1;
    public static javax.swing.JTextField G0T2;
    public static javax.swing.JTextField G0T3;
    public static javax.swing.JTextField G0T4;
    public static javax.swing.JTextField G0T5;
    public static javax.swing.JTextField G1T1;
    public static javax.swing.JTextField G1T2;
    public static javax.swing.JTextField G1T3;
    public static javax.swing.JTextField G1T4;
    public static javax.swing.JTextField G1T5;
    public static javax.swing.JTextField G2T1;
    public static javax.swing.JTextField G2T2;
    public static javax.swing.JTextField G2T3;
    public static javax.swing.JTextField G2T4;
    public static javax.swing.JTextField G2T5;
    public static javax.swing.JTextField G3T1;
    public static javax.swing.JTextField G3T2;
    public static javax.swing.JTextField G3T3;
    public static javax.swing.JTextField G3T4;
    public static javax.swing.JTextField G3T5;
    public static javax.swing.JTextField G4T1;
    public static javax.swing.JTextField G4T2;
    public static javax.swing.JTextField G4T3;
    public static javax.swing.JTextField G4T4;
    public static javax.swing.JTextField G4T5;
    public static javax.swing.JTextField I0T1;
    public static javax.swing.JTextField I0T2;
    public static javax.swing.JTextField I0T3;
    public static javax.swing.JTextField I0T4;
    public static javax.swing.JTextField I0T5;
    public static javax.swing.JTextField I1T1;
    public static javax.swing.JTextField I1T2;
    public static javax.swing.JTextField I1T3;
    public static javax.swing.JTextField I1T4;
    public static javax.swing.JTextField I1T5;
    public static javax.swing.JTextField I2T1;
    public static javax.swing.JTextField I2T2;
    public static javax.swing.JTextField I2T3;
    public static javax.swing.JTextField I2T4;
    public static javax.swing.JTextField I2T5;
    public static javax.swing.JTextField I3T1;
    public static javax.swing.JTextField I3T2;
    public static javax.swing.JTextField I3T3;
    public static javax.swing.JTextField I3T4;
    public static javax.swing.JTextField I3T5;
    public static javax.swing.JTextField I4T1;
    public static javax.swing.JTextField I4T2;
    public static javax.swing.JTextField I4T3;
    public static javax.swing.JTextField I4T4;
    public static javax.swing.JTextField I4T5;
    public static javax.swing.JTextField N0T1;
    public static javax.swing.JTextField N0T2;
    public static javax.swing.JTextField N0T3;
    public static javax.swing.JTextField N0T4;
    public static javax.swing.JTextField N0T5;
    public static javax.swing.JTextField N1T1;
    public static javax.swing.JTextField N1T2;
    public static javax.swing.JTextField N1T3;
    public static javax.swing.JTextField N1T4;
    public static javax.swing.JTextField N1T5;
    public static javax.swing.JTextField N2T1;
    public static javax.swing.JTextField N2T2;
    public static javax.swing.JTextField N2T3;
    public static javax.swing.JTextField N2T4;
    public static javax.swing.JTextField N2T5;
    public static javax.swing.JTextField N3T1;
    public static javax.swing.JTextField N3T2;
    public static javax.swing.JTextField N3T3;
    public static javax.swing.JTextField N3T4;
    public static javax.swing.JTextField N3T5;
    public static javax.swing.JTextField N4T1;
    public static javax.swing.JTextField N4T2;
    public static javax.swing.JTextField N4T3;
    public static javax.swing.JTextField N4T4;
    public static javax.swing.JTextField N4T5;
    public static javax.swing.JTextField O0T1;
    public static javax.swing.JTextField O0T2;
    public static javax.swing.JTextField O0T3;
    public static javax.swing.JTextField O0T4;
    public static javax.swing.JTextField O0T5;
    public static javax.swing.JTextField O1T1;
    public static javax.swing.JTextField O1T2;
    public static javax.swing.JTextField O1T3;
    public static javax.swing.JTextField O1T4;
    public static javax.swing.JTextField O1T5;
    public static javax.swing.JTextField O2T1;
    public static javax.swing.JTextField O2T2;
    public static javax.swing.JTextField O2T3;
    public static javax.swing.JTextField O2T4;
    public static javax.swing.JTextField O2T5;
    public static javax.swing.JTextField O3T1;
    public static javax.swing.JTextField O3T2;
    public static javax.swing.JTextField O3T3;
    public static javax.swing.JTextField O3T4;
    public static javax.swing.JTextField O3T5;
    public static javax.swing.JTextField O4T1;
    public static javax.swing.JTextField O4T2;
    public static javax.swing.JTextField O4T3;
    public static javax.swing.JTextField O4T4;
    public static javax.swing.JTextField O4T5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel p1;
    public static javax.swing.JLabel p2;
    public static javax.swing.JLabel p3;
    public static javax.swing.JLabel p4;
    public static javax.swing.JLabel p5;
    public static javax.swing.JLabel modo;
    public static javax.swing.JTextField t1;
    public static javax.swing.JTextField t2;
    public static javax.swing.JTextField t3;
    public static javax.swing.JTextField t4;
    public static javax.swing.JTextField t5;
    public static javax.swing.JTextField t6;
    public static javax.swing.JTextField t7;
    public static javax.swing.JTextField t8;
    public static javax.swing.JTextField t09;
    public static javax.swing.JTextField t9;
    public static javax.swing.JTextField t10;
    public static javax.swing.JTextField t11;
    public static javax.swing.JTextField t12;
    public static javax.swing.JTextField t13;
    public static javax.swing.JTextField t14;
    public static javax.swing.JTextField t15;
    public static javax.swing.JTextField t16;
    public static javax.swing.JTextField t17;
    public static javax.swing.JTextField t18;
    public static javax.swing.JTextField t19;
    public static javax.swing.JTextField t20;
    public static javax.swing.JTextField t21;
    public static javax.swing.JTextField t22;
    public static javax.swing.JTextField t23;
    public static javax.swing.JTextField t24;
    public static javax.swing.JTextField t25;
    public static javax.swing.JTextField registro;
    public static javax.swing.JButton añadir;
    public static javax.swing.JComboBox lista;
    private javax.swing.JLabel jLabel31;
}
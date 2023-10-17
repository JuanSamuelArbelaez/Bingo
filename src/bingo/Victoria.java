package bingo;

/**
 * Despliega el nombre del ganador, y el monto ganado.
 * @author Diego Alejandro Pastrana y Juan Samuel Arbeláez
 */

public class Victoria extends javax.swing.JDialog {
    public static Jugar play;
    public Victoria() {
        initComponents();
        play=new Jugar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Define el nombre del ganador y el monto.
     * @param m Numero de tablero ganador.
     */
    
    public static void setGanador(int m)
    {
        int a=500000, b;
        String nomGanador="", apGanador="", temp="";
        
        switch(m)
        {
            case 1:
                temp=""+Menu1.t1_C;
                break;
                
            case 2:
                temp=""+Menu1.t2_C;
                break;
                
            case 3:
                temp=""+Menu1.t3_C;
                break;
                
            case 4:
                temp=""+Menu1.t4_C;
                break;
                
            case 5:
                temp=""+Menu1.t5_C;
                break;
        }
        
        if((Datos.n1+" "+Datos.a1).equals(temp))
        {
            nomGanador=Datos.n1;
            apGanador=Datos.a1;
        }
        if((Datos.n2+" "+Datos.a2).equals(temp))
        {
            nomGanador=Datos.n2;
            apGanador=Datos.a2;
        }
        if((Datos.n3+" "+Datos.a3).equals(temp))
        {
            nomGanador=Datos.n3;
            apGanador=Datos.a3;
        }
        if((Datos.n4+" "+Datos.a4).equals(temp))
        {
            nomGanador=Datos.n4;
            apGanador=Datos.a4;
        }
        if((Datos.n5+" "+Datos.a5).equals(temp))
        {
            nomGanador=Datos.n5;
            apGanador=Datos.a5;
        }
        
        if(validarPalindrome(nomGanador))a+=150000;
        if(validarNombre(nomGanador))a+=100000;
        b=validarApellido(apGanador, a);
        Menu1.imprimir(nomGanador+" "+apGanador+" ha cantado BINGO, por un total de "+b+" pesos");
    }
    
    /**
     * Define en nuevo valor del monto, en base a las propiedades de su apellido.
     * Suma 50000 cada vez que una consonante es seguida de una vocal.
     * 
     * @param apellido Apellido del ganador.
     * @param n Valor inicial del monto.
     * @return Nuevo valor del monto.
     */
    
    public static int validarApellido(String apellido, int n)
    {
        int i, c, suma=0;
        boolean cons=false, voc=true;
        String ap[]=new String [2], a1;
        
        if(apellido.contains(" "))
        {
            ap=apellido.split(" ");
            a1=ap[0];
        }
        else
        {
            a1=apellido;
        }
        
        c=a1.length()-1;
        for(i=1;i<c; i++)
        {
            if(a1.toUpperCase().charAt(i-1)!='A'
            || a1.toUpperCase().charAt(i-1)!='E'
            || a1.toUpperCase().charAt(i-1)!='I'
            || a1.toUpperCase().charAt(i-1)!='O'
            || a1.toUpperCase().charAt(i-1)!='U'
            || a1.toUpperCase().charAt(i-1)!=' ') cons=true;
            else cons=false;

            if(a1.toUpperCase().charAt(i)=='A'
            || a1.toUpperCase().charAt(i)=='E'
            || a1.toUpperCase().charAt(i)=='I'
            || a1.toUpperCase().charAt(i)=='O'
            || a1.toUpperCase().charAt(i)=='U') voc=true;
            else voc=false;

            if(voc&&cons) suma+=50000;
        }
        return suma+n;
    }
    
    /**
     * Valida si el nombre del usuario termina en una de las letras de BINGO.
     * 
     * @param nombre Nombre del ganador.
     * @return Representación booleana del nombre.
     */
    
    public static boolean validarNombre(String nombre)
    {
        int i, c;
        boolean bandera=false;
        String noms[]=new String [2], n1;
        
        if(nombre.contains(" "))
        {
            noms=nombre.split(" ");
            n1=noms[0];
        }
        else n1=nombre;
        
        if(n1.toUpperCase().endsWith("B")
        || n1.toUpperCase().endsWith("I")
        || n1.toUpperCase().endsWith("N")
        || n1.toUpperCase().endsWith("G")
        || n1.toUpperCase().endsWith("O"))
        {
            bandera=true;
        }
        return bandera;
    }
    
    /**
     * Valida si el segundo nombre del ganador es palindrome.
     * @param nombre Segundo nombre del ganador.
     * @return Representación booleana de la validación.
     */
    
    public static boolean validarPalindrome(String nombre)
    {
        int i, c;
        boolean bandera=true;
        String noms[]=new String [2], n1, n2;
        
        if(nombre.contains(" "))
        {
            noms=nombre.split(" ");
            n1=noms[0];
            n2=noms[1];

            c=n2.length()-1;
            for(i=0;i<c && bandera; i++)
            {
                if(n2.toUpperCase().charAt(i)!=n2.toUpperCase().charAt(c))
                {
                    bandera=false;
                }
                c--;
            }
        }
        else bandera=false;
        return bandera;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
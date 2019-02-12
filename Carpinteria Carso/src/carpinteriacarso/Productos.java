package carpinteriacarso;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Calendar;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

public class Productos extends javax.swing.JFrame {
    DefaultTableModel modelo;
    private String Nombre1,Registro,Operacion;
    public Integer Contrasena,cont;
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    public FileInputStream fis;
    public int longitudBytes;

    /** Creates new form Productos */
    public Productos() {
        initComponents();
         ImagenG.setVisible(false);
        TextoG.setVisible(false);
        FalloEnlace.setVisible(false);
        TextoFallo.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
        Otro.setVisible(false);
        Folio.setOpaque(false);
        Producto.setOpaque(false);
        Existencias.setOpaque(false);
        PU.setOpaque(false);
        FI.setOpaque(false);
        Otro.setOpaque(false);
        Tabla.setOpaque(false);
        String Cabecera[]={"Fecha","Hora","Operacion","Folio","Producto","Existencias","PU","FI"};
        String Datos [][]={};
        modelo=new DefaultTableModel(Datos,Cabecera);
        Tabla.setModel(modelo);

         Toolkit t=Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/carpinteriacarso/imagenes/log.jpg")));

        setTitle("Productos");
         Calendar cal=Calendar.getInstance();
          String fecha=cal.get(cal.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
          String hora=cal.get(cal.HOUR_OF_DAY)+":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
          this.Fecha.setText(fecha);
          this.Hora.setText(hora);
          JOptionPane.showMessageDialog(rootPane,"Acceso: "+fecha+ ".... A la Hora: "+hora);
          JOptionPane.showMessageDialog(rootPane,"Datos Almacenados");
          String Nom = JOptionPane.showInputDialog(rootPane, "Introduce tu Nombre");
        Registro = String.valueOf(String.valueOf(Nom));
        Nombre2.setText(String.valueOf(Registro));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        Producto = new javax.swing.JTextField();
        Existencias = new javax.swing.JTextField();
        PU = new javax.swing.JTextField();
        FI = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ImagenG = new javax.swing.JLabel();
        FalloEnlace = new javax.swing.JLabel();
        ConExi = new javax.swing.JLabel();
        TextoFallo = new javax.swing.JLabel();
        TextoExi = new javax.swing.JLabel();
        TextoG = new javax.swing.JLabel();
        Otro = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        His = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        Ope = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 48));
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Productos");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 220, 60));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Altas.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Bajas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 70, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Bajas.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabel7.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Consultas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Consultas.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Altas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 70, 40));

        jLabel9.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Guardar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Actualizar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Actualizar.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Guardar.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Modificar");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 70, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Modificar.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 110, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/go-back64.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 570, -1, -1));

        Folio.setBackground(new java.awt.Color(0, 0, 0));
        Folio.setForeground(new java.awt.Color(240, 240, 240));
        Folio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numero de Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Folio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FolioKeyTyped(evt);
            }
        });
        getContentPane().add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 180, -1));

        Producto.setBackground(new java.awt.Color(0, 0, 0));
        Producto.setForeground(new java.awt.Color(240, 240, 240));
        Producto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Producto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ProductoKeyTyped(evt);
            }
        });
        getContentPane().add(Producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 230, -1));

        Existencias.setBackground(new java.awt.Color(0, 0, 0));
        Existencias.setForeground(new java.awt.Color(240, 240, 240));
        Existencias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Existencias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Existencias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ExistenciasKeyTyped(evt);
            }
        });
        getContentPane().add(Existencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 230, -1));

        PU.setBackground(new java.awt.Color(0, 0, 0));
        PU.setForeground(new java.awt.Color(240, 240, 240));
        PU.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Precio Unitario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        PU.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PUKeyTyped(evt);
            }
        });
        getContentPane().add(PU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 230, -1));

        FI.setBackground(new java.awt.Color(0, 0, 0));
        FI.setForeground(new java.awt.Color(240, 240, 240));
        FI.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de Ingreso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        FI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FIKeyTyped(evt);
            }
        });
        getContentPane().add(FI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 230, -1));

        jLabel18.setFont(new java.awt.Font("Viner Hand ITC", 0, 36));
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Bienvenido");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 200, 60));

        Nombre2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        Nombre2.setForeground(new java.awt.Color(240, 240, 240));
        Nombre2.setText("Registro");
        getContentPane().add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 350, 40));

        Fecha.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        Fecha.setForeground(new java.awt.Color(240, 240, 240));
        Fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 150, 60));

        Hora.setFont(new java.awt.Font("Viner Hand ITC", 0, 18)); // NOI18N
        Hora.setForeground(new java.awt.Color(240, 240, 240));
        Hora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 140, 60));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/salir.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel17MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 570, -1, -1));

        ImagenG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/AgregadoExi.png"))); // NOI18N
        getContentPane().add(ImagenG, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 140, -1));

        FalloEnlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Fallo Enlace.png"))); // NOI18N
        getContentPane().add(FalloEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 140, -1));

        ConExi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/ConsultaExitosa.png"))); // NOI18N
        getContentPane().add(ConExi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        TextoFallo.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        TextoFallo.setForeground(new java.awt.Color(240, 240, 240));
        TextoFallo.setText("Error de enlace con la Base de Datos");
        getContentPane().add(TextoFallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 300, 30));

        TextoExi.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        TextoExi.setForeground(new java.awt.Color(240, 240, 240));
        TextoExi.setText("Consulta Exitosa");
        getContentPane().add(TextoExi, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 200, 40));

        TextoG.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        TextoG.setForeground(new java.awt.Color(240, 240, 240));
        TextoG.setText("Dato Agregado Exitosamente");
        getContentPane().add(TextoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 290, -1, -1));

        Tabla.setBackground(new java.awt.Color(240, 240, 240));
        Tabla.setFont(new java.awt.Font("Arial", 0, 12));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Otro.setViewportView(Tabla);

        getContentPane().add(Otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 750, 140));

        His.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        His.setForeground(new java.awt.Color(240, 240, 240));
        His.setText("Historial");
        getContentPane().add(His, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 110, -1));

        jLabel16.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Tu foto");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 70, -1, -1));

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Foto.png"))); // NOI18N
        Foto.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FotoMouseClicked(evt);
            }
        });
        getContentPane().add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 250, 310));

        Ope.setFont(new java.awt.Font("Arial", 0, 18));
        Ope.setForeground(new java.awt.Color(240, 240, 240));
        Ope.setText("Operacion");
        getContentPane().add(Ope, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Fon5T.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, -1, 1220));

        jMenu1.setText("Archivo");

        jCheckBoxMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Nuevo");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Actualizar");
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
 // Altas
        //Folio.disable();//DESHABILITAR LA CAJA DE TEXTO DE BUSCAR
        String O = JOptionPane.showInputDialog(rootPane, "Introduce la Accion a Realizar");
        Operacion= String.valueOf(String.valueOf(O));
        Ope.setText(String.valueOf(Operacion));
        int res = JOptionPane.showConfirmDialog( this,"¿Usted es Administrador",
                "Sistema Carpinteria Carso",JOptionPane.YES_NO_OPTION );
        if( res == JOptionPane.NO_OPTION ) {
            JOptionPane.showMessageDialog(rootPane,"Acceso Denegado");
            new Clientes().setVisible(true);
        this.dispose();
        }
        if( res == JOptionPane.YES_OPTION ) {
        String Nom = JOptionPane.showInputDialog(rootPane,"Introduce tu Usuario");
        Nombre1 = String.valueOf(String.valueOf(Nom));
        String Con = JOptionPane.showInputDialog(rootPane,"Introduce tu Contaseña");
        Contrasena= Integer.parseInt(String.valueOf(Con));
        if(Nom.equals("Joel")&& Con.equals("123") ){
            JOptionPane.showMessageDialog(rootPane,"Contraseña Correcta");
        Folio.setText("");
        //HABILITAR TODOS LOS TEXTFIELDS PARA EL INGRESO DE DATOS
        Producto.enable(true);
        Existencias.enable(true);
        PU.enable(true);
        FI.enable(true);
        Otro.setVisible(true);
                String F=Folio.getText();
                String p=Producto.getText();
                String Op=Ope.getText();
                String E=Existencias.getText();
                String pu=PU.getText();
                String fi=FI.getText();
                String H=Hora.getText();
                String Fe=Fecha.getText();
               Object Datos[]={Fe,H,Op,F,p,E,pu,fi};
                 modelo.addRow(Datos);
        //Se limpia cajas de texto
        Producto.setText("");
        Existencias.setText("");
        PU.setText("");
        FI.setText("");    
        }}
        //FINALIZACION DE LIMPIEZA DE CAJAS DE TEXTO        // TODO add your handling code here:
}//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
// Bajas
        try {
            Class.forName(  "com.mysql.jdbc.Driver" );
        } catch( Exception eve ) {
            JOptionPane.showMessageDialog(null,"Fallo Enlace, Sistema ");
            FalloEnlace.setVisible(true);
            TextoFallo.setVisible(true);
            ImagenG.setVisible(false);
        TextoG.setVisible(false);
        FalloEnlace.setVisible(false);
        ConExi.setVisible(false);
            return;
        }
        try{
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/cc","root", "123");
            sentencia=conexion.createStatement();

        String O = JOptionPane.showInputDialog(rootPane, "Introduce la Accion a Realizar");
        Operacion = String.valueOf(String.valueOf(O));
        Ope.setText(String.valueOf(Operacion));

       int res1 = JOptionPane.showConfirmDialog( this,"¿Usted es Administrador",
       "Sistema Carpinteria Carso",JOptionPane.YES_NO_OPTION );

        if( res1 == JOptionPane.NO_OPTION ) {
        JOptionPane.showMessageDialog(rootPane,"Acceso Denegado");
        new Clientes().setVisible(true);
        this.dispose();
        }


        if( res1 == JOptionPane.YES_OPTION ) {
        String Nom = JOptionPane.showInputDialog(rootPane,"Introduce tu Usuario");
        Nombre1 = String.valueOf(String.valueOf(Nom));
        String Con = JOptionPane.showInputDialog(rootPane,"Introduce tu Contaseña");
        Contrasena= Integer.parseInt(String.valueOf(Con));


        if(Nom.equals("Joel")&& Con.equals("123") ){
            JOptionPane.showMessageDialog(rootPane,"Contraseña Correcta");

             int res = JOptionPane.showConfirmDialog( this,"¿Esta Usted Seguro de dar de Baja",
             "Sistema Farmacia Alex",JOptionPane.YES_NO_OPTION );
        if( res == JOptionPane.NO_OPTION ) {
            JOptionPane.showMessageDialog(null,"Baja Cancelada...!!!");
            sentencia.execute("DELETE FROM productos WHERE id_Producto = "+Folio.getText());
            sentencia.close();
        }
           if( res == JOptionPane.YES_OPTION ) {
            Otro.setVisible(true);
             String F=Folio.getText();
                String p=Producto.getText();
                String Op=Ope.getText();
                String E=Existencias.getText();
                String pu=PU.getText();
                String fi=FI.getText();
                String H=Hora.getText();
                String Fe=Fecha.getText();
               Object Datos[]={Fe,H,Op,F,p,E,pu,fi};
                 modelo.addRow(Datos);
                 sentencia.close();
           Producto.setText("");
           Existencias.setText("");
           PU.setText("");
           FI.setText("");
            }}}
        } catch(SQLException x){JOptionPane.showMessageDialog(null,"Fallo Enlace, Sistema  ");
        FalloEnlace.setVisible(true);
        TextoFallo.setVisible(true);
        ImagenG.setVisible(false);
        TextoG.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
        }
}//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
// Consultar

        try  {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch( Exception eve ) {
            JOptionPane.showMessageDialog(null,"Error en el Enlace, Sistema ");
            FalloEnlace.setVisible(true);
        TextoFallo.setVisible(true);
        ImagenG.setVisible(false);
        TextoFallo.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
            return;
        }
        try{
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/cc","root", "123");
            sentencia=conexion.createStatement();
             String O = JOptionPane.showInputDialog(rootPane, "Introduce la Accion a Realizar");
        Operacion = String.valueOf(String.valueOf(O));
        Ope.setText(String.valueOf(Operacion));
            int res = JOptionPane.showConfirmDialog( this,"¿Usted es Administrador",
                "Sistema Farmacia Alex",JOptionPane.YES_NO_OPTION );
        if( res == JOptionPane.NO_OPTION ) {
            JOptionPane.showMessageDialog(rootPane,"Acceso Denegado");
            new Clientes().setVisible(true);
        this.dispose();
        }
        if( res == JOptionPane.YES_OPTION ) {
        String Nom = JOptionPane.showInputDialog(rootPane,"Introduce tu Usuario");
        Nombre1 = String.valueOf(String.valueOf(Nom));
        String Con = JOptionPane.showInputDialog(rootPane,"Introduce tu Contaseña");
        Contrasena= Integer.parseInt(String.valueOf(Con));
        if(Nom.equals("Joel")&& Con.equals("123") ){
            JOptionPane.showMessageDialog(rootPane,"Contraseña Correcta");
            resultado=sentencia.executeQuery("SELECT * FROM productos WHERE id_Producto =" + Folio.getText());
            if (resultado.next()){

                Producto.setText(String.valueOf(resultado.getString(2)));
                Existencias.setText(String.valueOf(resultado.getString(3)));
                PU.setText(String.valueOf(resultado.getString(4)));
                FI.setText(String.valueOf(resultado.getString(5)));

                String F=Folio.getText();
                String p=Producto.getText();
                String Op=Ope.getText();
                String E=Existencias.getText();
                String pu=PU.getText();
                String fi=FI.getText();
                String H=Hora.getText();
                String Fe=Fecha.getText();
               Object Datos[]={Fe,H,Op,F,p,E,pu,fi};
                 modelo.addRow(Datos);
               
                 Otro.setVisible(true);
                TextoExi.setVisible(true);
                ConExi.setVisible(true);
                ImagenG.setVisible(false);
                TextoG.setVisible(false);
                FalloEnlace.setVisible(false);
                TextoFallo.setVisible(false);
                Tabla.setVisible(true);
                sentencia.close();
            } else {
                JOptionPane.showMessageDialog(null,"No existe el Producto");
            }}}
        } catch(SQLException exp){
        JOptionPane.showMessageDialog(null,"Error en la Conexion, Sistema ");
        FalloEnlace.setVisible(true);
        TextoFallo.setVisible(true);
        ImagenG.setVisible(false);
        TextoG.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
        }
}//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
// Guardar
 if(Folio.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo Folio esta vacio");
 }
 if(Producto.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo Producto de Operaciones está vacío ");
 }
if(Existencias.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo Existencias está vacío ");
 }
if(PU.getText().trim().length()==0)
 {
 JOptionPane.showMessageDialog(this, "El campo de Precio Unitario está vacío ");
 }
if(FI.getText().trim().length()==0)
 {
 JOptionPane.showMessageDialog(this, "El campo de Fecha de Ingreso está vacío ");
 }

        try {
            Class.forName(  "com.mysql.jdbc.Driver" );
        } catch( Exception eve ) {
            JOptionPane.showMessageDialog(null,"Fallo Enlace del Puente, Sistema"+eve);
            FalloEnlace.setVisible(true);
        TextoFallo.setVisible(true);
        ImagenG.setVisible(false);
        TextoG.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
            return;
        }
        if(Producto.getText()=="") {
            Producto.setText("");
        }
        if(Existencias.getText()=="") {
            Existencias.setText("");
        }
        if(PU.getText()=="") {
            PU.setText("");
        }
      if(FI.getText()=="") {
            FI.setText("");
        }

            try{
        String O = JOptionPane.showInputDialog(rootPane, "Introduce la Accion a Realizar");
        Operacion = String.valueOf(String.valueOf(O));
        Ope.setText(String.valueOf(Operacion));
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/cc","root", "123");
            sentencia=conexion.createStatement();
            sentencia.executeUpdate("INSERT INTO productos"+
                    " VALUES ('"+Folio.getText()+"',"+
                    "'"+Producto.getText()+"',"+
                    "'"+Existencias.getText()+"',"+
                    "'"+PU.getText()+"',"+
                    "'"+FI.getText()+"')");
             Otro.setVisible(true);
              String F=Folio.getText();
                String p=Producto.getText();
                String Op=Ope.getText();
                String E=Existencias.getText();
                String pu=PU.getText();
                String fi=FI.getText();
                String H=Hora.getText();
                String Fe=Fecha.getText();
               Object Datos[]={Fe,H,Op,F,p,E,pu,fi};
                 modelo.addRow(Datos);

                 Folio.setText("");
                 Producto.setText("");
                 Existencias.setText("");
                 PU.setText("");
                 FI.setText("");

             conexion.close();
            JOptionPane.showMessageDialog(null,"Empleado Guardado ");
        ImagenG.setVisible(true);
        TextoG.setVisible(true);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
         FalloEnlace.setVisible(false);
        TextoFallo.setVisible(false);
        } catch(SQLException p){ JOptionPane.showMessageDialog(null,"Error en el enlace, Sistema"+p);
        FalloEnlace.setVisible(true);
        TextoFallo.setVisible(true);
        ImagenG.setVisible(false);
        TextoG.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);}

//        //LIMPIAR CAJA DE TEXTO UNA VEZ GUARDADA LA INFORMACION.
//         Folio.setText("");
//         Nombre.setText("");
//         IniciodeOperacion.setText("");
//         Edad.setText("");
//         Sexo.setText("");
//         Puesto.setText("");
//         Salario.setText("");
//         CP.setText("");
//         Calle.setText("");
//         Colonia.setText("");
//         Mz.setText("");
//         Lt.setText("");
//         TP.setText("");
//         TC.setText("");
//         TR.setText("");
//         Email.setText("");
//         curp.setText("");
//        //HABILITAR LA CAJA DE TEXTO DE BUSCAR.
        Folio.enable();        // TODO add your handling code here:
}//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
try  {
            Class.forName( "com.mysql.jdbc.Driver" );
        } catch( Exception eve ) {
            JOptionPane.showMessageDialog(null,"Error en el Enlace, Sistema ");
            FalloEnlace.setVisible(true);
            TextoFallo.setVisible(true);
            ImagenG.setVisible(false);
        TextoG.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
            return;
        }
        try{
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/cc","root", "123");
            sentencia=conexion.createStatement();
             String O = JOptionPane.showInputDialog(rootPane, "Introduce la Accion a Realizar");
        Operacion = String.valueOf(String.valueOf(O));
        Ope.setText(String.valueOf(Operacion));
             int res = JOptionPane.showConfirmDialog( this,"¿Usted es Administrador",
                "Sistema Carpinteria Carso",JOptionPane.YES_NO_OPTION );
        if( res == JOptionPane.NO_OPTION ) {
            JOptionPane.showMessageDialog(rootPane,"Acceso Denegado");
            new Clientes().setVisible(true);
        this.dispose();
        }
        if( res == JOptionPane.YES_OPTION ) {
        String Nom = JOptionPane.showInputDialog(rootPane,"Introduce tu Usuario");
        Nombre1 = String.valueOf(String.valueOf(Nom));
        String Con = JOptionPane.showInputDialog(rootPane,"Introduce tu Contaseña");
        Contrasena= Integer.parseInt(String.valueOf(Con));
        if(Nom.equals("Joel")&& Con.equals("123") ){
            JOptionPane.showMessageDialog(rootPane,"Contraseña Correcta");
            sentencia.execute("UPDATE productos SET Nombre=('"+Producto.getText()+"'),"
                    + "Edad=("+Existencias.getText()+"),"
                    + "Puesto=('"+PU.getText()+"'),"
                    + "puesto=('"+FI.getText()+"')"
                    + " WHERE Id_Cliente=" + Folio.getText());
             Otro.setVisible(true);
               String F=Folio.getText();
                String p=Producto.getText();
                String Op=Ope.getText();
                String E=Existencias.getText();
                String pu=PU.getText();
                String fi=FI.getText();
                String H=Hora.getText();
                String Fe=Fecha.getText();
               Object Datos[]={Fe,H,Op,F,p,E,pu,fi};
                 modelo.addRow(Datos);
             JOptionPane.showMessageDialog(null,"Cambios Realizados, Registro Guardado ");
        }}
            sentencia.close();
        } catch (SQLException e2){
            JOptionPane.showMessageDialog(null,"Fallo Enlace, Sistema "+e2);
         FalloEnlace.setVisible(true);
        TextoFallo.setVisible(true);
        ImagenG.setVisible(false);
        TextoG.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
        }
}//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
 // Modificar
//        Menu.setEnabled(false);
//        Modificar.setEnabled(false);
//        Guardar.setEnabled(false);
//        Actualizar.setVisible(true);//se pone accesible el boton de guardar cambios
        //habilitar cajas de Texto
         String O = JOptionPane.showInputDialog(rootPane, "Introduce la Accion a Realizar");
        Operacion = String.valueOf(String.valueOf(O));
        Ope.setText(String.valueOf(Operacion));
        int res = JOptionPane.showConfirmDialog( this,"¿Usted es Administrador",
                "Sistema Farmacia Alex",JOptionPane.YES_NO_OPTION );
        if( res == JOptionPane.NO_OPTION ) {
            JOptionPane.showMessageDialog(rootPane,"Acceso Denegado");
            new Clientes().setVisible(true);
        this.dispose();
        }
        if( res == JOptionPane.YES_OPTION ) {
        String Nom = JOptionPane.showInputDialog(rootPane,"Introduce tu Usuario");
        Nombre1 = String.valueOf(String.valueOf(Nom));
        String Con = JOptionPane.showInputDialog(rootPane,"Introduce tu Contaseña");
        Contrasena= Integer.parseInt(String.valueOf(Con));
        if(Nom.equals("Joel")&& Con.equals("123") ){
            JOptionPane.showMessageDialog(rootPane,"Contraseña Correcta");
        Producto.enable(true);
        Existencias.enable(true);
        PU.enable(true);
        FI.enable(true);
        Otro.setVisible(true);
        String F=Folio.getText();
                String p=Producto.getText();
                String Op=Ope.getText();
                String E=Existencias.getText();
                String pu=PU.getText();
                String fi=FI.getText();
                String H=Hora.getText();
                String Fe=Fecha.getText();
               Object Datos[]={Fe,H,Op,F,p,E,pu,fi};
                 modelo.addRow(Datos);

        }
        }       
}//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Menu().setVisible(true);
        this.dispose();
}//GEN-LAST:event_jLabel15MouseClicked

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int res = JOptionPane.showConfirmDialog(this, "¿Esta Usted Seguro de Salir del Sistema Carpiteria Carso?",
                "Sistema Carpinteria Carso",JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Gracias por usar el Sistema");
            new Salir().setVisible(true);
            this.dispose();
        }
}//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseReleased
        // TODO add your handling code here:
}//GEN-LAST:event_jLabel17MouseReleased

    private void FotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FotoMouseClicked
        JFileChooser se= new JFileChooser();
        se.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int estado = se.showOpenDialog(null);
        if(estado == JFileChooser.APPROVE_OPTION) {
            try {

                fis =  new FileInputStream(se.getSelectedFile());
                this.longitudBytes = (int)se.getSelectedFile().length();

                Image icono = ImageIO.read(se.getSelectedFile()).getScaledInstance(Foto.getWidth(), Foto.getHeight(), Image.SCALE_DEFAULT);
                Foto.setIcon(new ImageIcon(icono));
                Foto.updateUI();

            } catch (FileNotFoundException ex) {ex.printStackTrace();} catch (IOException ex){ex.printStackTrace();}
        }
}//GEN-LAST:event_FotoMouseClicked

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
 new Productos().setVisible(true);
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
 new Productos().setVisible(true);
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void FolioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FolioKeyTyped
  char c= evt.getKeyChar();
        if(c<'0'||c>'9') {
            getToolkit().beep();
            evt.consume();
            getToolkit().beep();
        }

        Folio.addKeyListener((KeyListener) new KeyListener(){
            int limite  = 2;
            public void keyTyped(KeyEvent e) {
                if (Folio.getText().length()== limite){
                    getToolkit().beep();
                    e.consume();}
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});        // TODO add your handling code here:
    }//GEN-LAST:event_FolioKeyTyped

    private void ProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ProductoKeyTyped
  char c= evt.getKeyChar();
        if(c<'a'||c>'z') {
            getToolkit().beep();
            evt.consume();
            getToolkit().beep();
        }

        Folio.addKeyListener((KeyListener) new KeyListener(){
            int limite  = 15;
            public void keyTyped(KeyEvent e) {
                if (Folio.getText().length()== limite){
                    getToolkit().beep();
                    e.consume();}
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoKeyTyped

    private void ExistenciasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExistenciasKeyTyped
char c= evt.getKeyChar();
        if(c<'0'||c>'9') {
            getToolkit().beep();
            evt.consume();
            getToolkit().beep();
        }

        Folio.addKeyListener((KeyListener) new KeyListener(){
            int limite  = 3;
            public void keyTyped(KeyEvent e) {
                if (Folio.getText().length()== limite){
                    getToolkit().beep();
                    e.consume();}
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
    }//GEN-LAST:event_ExistenciasKeyTyped

    private void PUKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PUKeyTyped
char c= evt.getKeyChar();
        if(c<'0'||c>'9') {
            getToolkit().beep();
            evt.consume();
            getToolkit().beep();
        }

        Folio.addKeyListener((KeyListener) new KeyListener(){
            int limite  = 15;
            public void keyTyped(KeyEvent e) {
                if (Folio.getText().length()== limite){
                    getToolkit().beep();
                    e.consume();}
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});        // TODO add your handling co        // TODO add your handling code here:
    }//GEN-LAST:event_PUKeyTyped

    private void FIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FIKeyTyped
char c= evt.getKeyChar();
        if(c<'0'||c>'9') {
            getToolkit().beep();
            evt.consume();
            getToolkit().beep();
        }

        Folio.addKeyListener((KeyListener) new KeyListener(){
            int limite  = 15;
            public void keyTyped(KeyEvent e) {
                if (Folio.getText().length()== limite){
                    getToolkit().beep();
                    e.consume();}
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});        // TODO add your handling co        // TODO add your handling code here:
    }//GEN-LAST:event_FIKeyTyped

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConExi;
    private javax.swing.JTextField Existencias;
    private javax.swing.JTextField FI;
    private javax.swing.JLabel FalloEnlace;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTextField Folio;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel His;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel ImagenG;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Ope;
    private javax.swing.JScrollPane Otro;
    private javax.swing.JTextField PU;
    private javax.swing.JTextField Producto;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel TextoExi;
    private javax.swing.JLabel TextoFallo;
    private javax.swing.JLabel TextoG;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}

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


 
public class Empleados extends javax.swing.JFrame {
    DefaultTableModel modelo;
    private String Nombre1,Registro,Operacion;
    public Integer Contrasena,cont;
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;
    public FileInputStream fis;
    public int longitudBytes;

    /** Creates new form Empleados */
    public Empleados() {
        initComponents();
        ImagenG.setVisible(false);
        TextoG.setVisible(false);
        FalloEnlace.setVisible(false);
        TextoFallo.setVisible(false);
        TextoExi.setVisible(false);
        ConExi.setVisible(false);
        Otro.setVisible(false);
        Folio.setOpaque(false);
        IniciodeOperacion.setOpaque(false);
        Nombre.setOpaque(false);
        Edad.setOpaque(false);
        Salario.setOpaque(false);
        Calle.setOpaque(false);
        Mz.setOpaque(false);
        Lt.setOpaque(false);
        Colonia.setOpaque(false);
        CP.setOpaque(false);
        TP.setOpaque(false);
        TC.setOpaque(false);
        TR.setOpaque(false);
        Email.setOpaque(false);
        curp.setOpaque(false);
        Sexo.setOpaque(false);
        puesto.setOpaque(false);
        Otro.setOpaque(false);
        Tabla.setOpaque(false);
        String Cabecera[]={"Fecha","Hora","Operacion","Folio","Inicio de operacion","Nombre","Edad","Salario","Calle","Mz","Lt","Colonia","CP","TP","TC","TR","Email","CURP","SEXO","Puesto"};
        String Datos [][]={};
        modelo=new DefaultTableModel(Datos,Cabecera);
        Tabla.setModel(modelo);

          Toolkit t=Toolkit.getDefaultToolkit();
        setIconImage(t.getImage(getClass().getResource("/carpinteriacarso/imagenes/log.jpg")));

        setTitle("Empleados");
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

        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Nombre2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        IniciodeOperacion = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Edad = new javax.swing.JTextField();
        Se = new javax.swing.JComboBox();
        Sexo = new javax.swing.JLabel();
        Salario = new javax.swing.JTextField();
        CP = new javax.swing.JTextField();
        Calle = new javax.swing.JTextField();
        Colonia = new javax.swing.JTextField();
        Mz = new javax.swing.JTextField();
        Lt = new javax.swing.JTextField();
        TP = new javax.swing.JTextField();
        TC = new javax.swing.JTextField();
        TR = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        curp = new javax.swing.JTextField();
        pu = new javax.swing.JComboBox();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        puesto = new javax.swing.JLabel();
        ImagenG = new javax.swing.JLabel();
        FalloEnlace = new javax.swing.JLabel();
        ConExi = new javax.swing.JLabel();
        TextoG = new javax.swing.JLabel();
        TextoExi = new javax.swing.JLabel();
        TextoFallo = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        His = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        Otro = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Ope = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Altas.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Bajas.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Altas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 70, 40));

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Bajas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 70, -1));

        jLabel2.setFont(new java.awt.Font("Viner Hand ITC", 0, 48));
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Empleados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 240, 60));

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

        jLabel9.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Guardar");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, -1, -1));

        jLabel10.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Actualizar");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 70, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Guardar.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Actualizar.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/go-back64.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 570, -1, -1));

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

        Nombre2.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        Nombre2.setForeground(new java.awt.Color(240, 240, 240));
        Nombre2.setText("Registro");
        getContentPane().add(Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 350, 40));

        jLabel18.setFont(new java.awt.Font("Viner Hand ITC", 0, 36));
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Bienvenido");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, 60));

        Fecha.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        Fecha.setForeground(new java.awt.Color(240, 240, 240));
        Fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 150, 60));

        Hora.setFont(new java.awt.Font("Viner Hand ITC", 0, 18));
        Hora.setForeground(new java.awt.Color(240, 240, 240));
        Hora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Hora de Acceso", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(240, 240, 240))); // NOI18N
        getContentPane().add(Hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 140, 60));

        Folio.setBackground(new java.awt.Color(0, 0, 0));
        Folio.setFont(new java.awt.Font("Arial", 0, 12));
        Folio.setForeground(new java.awt.Color(240, 240, 240));
        Folio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Folio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(240, 240, 240))); // NOI18N
        Folio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FolioActionPerformed(evt);
            }
        });
        Folio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FolioKeyTyped(evt);
            }
        });
        getContentPane().add(Folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 222, -1));

        IniciodeOperacion.setBackground(new java.awt.Color(0, 0, 0));
        IniciodeOperacion.setFont(new java.awt.Font("Arial", 0, 12));
        IniciodeOperacion.setForeground(new java.awt.Color(240, 240, 240));
        IniciodeOperacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inicio de Operacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(240, 240, 240))); // NOI18N
        IniciodeOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciodeOperacionActionPerformed(evt);
            }
        });
        IniciodeOperacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IniciodeOperacionKeyTyped(evt);
            }
        });
        getContentPane().add(IniciodeOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 130, 51));

        Nombre.setBackground(new java.awt.Color(0, 0, 0));
        Nombre.setForeground(new java.awt.Color(240, 240, 240));
        Nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre Completo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreKeyTyped(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 50));

        Edad.setBackground(new java.awt.Color(0, 0, 0));
        Edad.setForeground(new java.awt.Color(240, 240, 240));
        Edad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdadActionPerformed(evt);
            }
        });
        Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EdadKeyTyped(evt);
            }
        });
        getContentPane().add(Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 110, 44));

        Se.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        Se.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeActionPerformed(evt);
            }
        });
        getContentPane().add(Se, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 90, -1));

        Sexo.setFont(new java.awt.Font("Arial", 0, 14));
        Sexo.setForeground(new java.awt.Color(240, 240, 240));
        Sexo.setText("Sexo");
        getContentPane().add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 90, 20));

        Salario.setBackground(new java.awt.Color(0, 0, 0));
        Salario.setForeground(new java.awt.Color(240, 240, 240));
        Salario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Salario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioActionPerformed(evt);
            }
        });
        Salario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalarioKeyTyped(evt);
            }
        });
        getContentPane().add(Salario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 110, -1));

        CP.setBackground(new java.awt.Color(0, 0, 0));
        CP.setForeground(new java.awt.Color(240, 240, 240));
        CP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "C.P.", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        CP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CPKeyTyped(evt);
            }
        });
        getContentPane().add(CP, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 110, -1));

        Calle.setBackground(new java.awt.Color(0, 0, 0));
        Calle.setForeground(new java.awt.Color(240, 240, 240));
        Calle.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Calle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Calle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalleActionPerformed(evt);
            }
        });
        Calle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CalleKeyTyped(evt);
            }
        });
        getContentPane().add(Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 250, -1));

        Colonia.setBackground(new java.awt.Color(0, 0, 0));
        Colonia.setForeground(new java.awt.Color(240, 240, 240));
        Colonia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Colonia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Colonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColoniaActionPerformed(evt);
            }
        });
        Colonia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ColoniaKeyTyped(evt);
            }
        });
        getContentPane().add(Colonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 250, -1));

        Mz.setBackground(new java.awt.Color(0, 0, 0));
        Mz.setForeground(new java.awt.Color(240, 240, 240));
        Mz.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manzana", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Mz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MzActionPerformed(evt);
            }
        });
        Mz.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MzKeyTyped(evt);
            }
        });
        getContentPane().add(Mz, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 79, -1));

        Lt.setBackground(new java.awt.Color(51, 51, 51));
        Lt.setForeground(new java.awt.Color(240, 240, 240));
        Lt.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lote", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Lt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LtActionPerformed(evt);
            }
        });
        Lt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LtKeyTyped(evt);
            }
        });
        getContentPane().add(Lt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 410, 80, -1));

        TP.setBackground(new java.awt.Color(0, 0, 0));
        TP.setForeground(new java.awt.Color(240, 240, 240));
        TP.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono Personal", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        TP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TPKeyTyped(evt);
            }
        });
        getContentPane().add(TP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 160, -1));

        TC.setBackground(new java.awt.Color(0, 0, 0));
        TC.setForeground(new java.awt.Color(240, 240, 240));
        TC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono de Casa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        TC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TCKeyTyped(evt);
            }
        });
        getContentPane().add(TC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 160, -1));

        TR.setBackground(new java.awt.Color(0, 0, 0));
        TR.setForeground(new java.awt.Color(240, 240, 240));
        TR.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono Recados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        TR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TRKeyTyped(evt);
            }
        });
        getContentPane().add(TR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 160, -1));

        Email.setBackground(new java.awt.Color(0, 0, 0));
        Email.setForeground(new java.awt.Color(240, 240, 240));
        Email.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });
        getContentPane().add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 530, 240, -1));

        curp.setBackground(new java.awt.Color(0, 0, 0));
        curp.setForeground(new java.awt.Color(240, 240, 240));
        curp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CURP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(240, 240, 240))); // NOI18N
        curp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curpActionPerformed(evt);
            }
        });
        curp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                curpKeyTyped(evt);
            }
        });
        getContentPane().add(curp, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 590, 240, -1));

        pu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Puesto", "Gerente general", "Gerente Recursos humanos", "Gerente  ventas", "Gerente de almacen", "Administrador", "Licenciado en contabilidad", "Auxiliar de almacen", "Carpintero" }));
        getContentPane().add(pu, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 240, 180, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/salir.png"))); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 570, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Vaciar.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel17MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, -1, -1));

        puesto.setFont(new java.awt.Font("Arial", 0, 14));
        puesto.setForeground(new java.awt.Color(240, 240, 240));
        puesto.setText("Puesto");
        getContentPane().add(puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 160, 20));

        ImagenG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/AgregadoExi.png"))); // NOI18N
        getContentPane().add(ImagenG, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 140, -1));

        FalloEnlace.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Fallo Enlace.png"))); // NOI18N
        getContentPane().add(FalloEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, 140, -1));

        ConExi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/ConsultaExitosa.png"))); // NOI18N
        getContentPane().add(ConExi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, -1, -1));

        TextoG.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        TextoG.setForeground(new java.awt.Color(240, 240, 240));
        TextoG.setText("Dato Agregado Exitosamente");
        getContentPane().add(TextoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, -1));

        TextoExi.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        TextoExi.setForeground(new java.awt.Color(240, 240, 240));
        TextoExi.setText("Consulta Exitosa");
        getContentPane().add(TextoExi, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 200, 40));

        TextoFallo.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        TextoFallo.setForeground(new java.awt.Color(240, 240, 240));
        TextoFallo.setText("Error de enlace con la Base de Datos");
        getContentPane().add(TextoFallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 300, 30));

        jLabel16.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Tu foto");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 80, -1, -1));

        His.setFont(new java.awt.Font("Viner Hand ITC", 0, 24));
        His.setForeground(new java.awt.Color(240, 240, 240));
        His.setText("Historial");
        getContentPane().add(His, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 110, -1));

        Foto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Foto.png"))); // NOI18N
        Foto.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Foto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FotoMouseClicked(evt);
            }
        });
        getContentPane().add(Foto, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, 250, 310));

        Tabla.setBackground(new java.awt.Color(240, 240, 240));
        Tabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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

        getContentPane().add(Otro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 500, 750, 140));

        Ope.setFont(new java.awt.Font("Arial", 0, 18));
        Ope.setForeground(new java.awt.Color(240, 240, 240));
        Ope.setText("Operacion");
        getContentPane().add(Ope, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/Fon5T.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, 1240));

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Actualizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

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
       IniciodeOperacion.enable(true);
        Nombre.enable(true);
        Edad.enable(true);
        Salario.enable(true);
        Calle.enable(true);
        Mz.enable(true);
        Lt.enable(true);
        Colonia.enable(true);
        CP.enable(true);
        TP.enable(true);
        TC.enable(true);
        TR.enable(true);
        Email.enable(true);
        curp.enable(true);
        Sexo.enable(true);
        puesto.enable(true);
        Otro.setVisible(true);
                String F=Folio.getText();
                String I=IniciodeOperacion.getText();
                String Op=Ope.getText();
                String N=Nombre.getText();
                String E=Edad.getText();
                String S=Salario.getText();
                String C=Calle.getText();
                String M=Mz.getText();
                String L=Lt.getText();
                String Co=Colonia.getText();
                String Cp=CP.getText();
                String Tp=TP.getText();
                String Tc1=TC.getText();
                String Tr=TR.getText();
                String Em=Email.getText();
                String Cu=curp.getText();
                String Si=Se.getSelectedItem().toString();
                String p=pu.getSelectedItem().toString();
                String H=Hora.getText();
                String Fe=Fecha.getText();
                Object Datos[]={Fe,H,Op,F,I,N,E,S,C,M,L,Co,Cp,Tp,Tc1,Tr,Em,Cu,Si,p};
                modelo.addRow(Datos);        
        //Se limpia cajas de texto
        IniciodeOperacion.setText("");
        Nombre.setText("");
        Edad.setText("");
        Salario.setText("");
        Calle.setText("");
        Mz.setText("");
        Lt.setText("");
        Colonia.setText("");
        CP.setText("");
        TP.setText("");
        TC.setText("");
        TR.setText("");
        Email.setText("");
        curp.setText("");
        Sexo.setText("");
        puesto.setText("");
        }}
        //FINALIZACION DE LIMPIEZA DE CAJAS DE TEXTO
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
            sentencia.execute("DELETE FROM empleados WHERE id_Folio = "+Folio.getText());
            sentencia.close();
        }
           if( res == JOptionPane.YES_OPTION ) {
            Otro.setVisible(true);
               String F=Folio.getText();
                String I=IniciodeOperacion.getText();
                String Op=Ope.getText();
                String N=Nombre.getText();
                String E=Edad.getText();
                String S=Salario.getText();
                String C=Calle.getText();
                String M=Mz.getText();
                String L=Lt.getText();
                String Co=Colonia.getText();
                String Cp=CP.getText();
                String Tp=TP.getText();
                String Tc1=TC.getText();
                String Tr=TR.getText();
                String Em=Email.getText();
                String Cu=curp.getText();
                String Si=Se.getSelectedItem().toString();
                String p=pu.getSelectedItem().toString();
                String H=Hora.getText();
                String Fe=Fecha.getText();
                Object Datos[]={Fe,H,Op,F,I,N,E,S,C,M,L,Co,Cp,Tp,Tc1,Tr,Em,Cu,Si,p};
                modelo.addRow(Datos);
            sentencia.close();
            IniciodeOperacion.setText("");
            Nombre.setText("");
            Edad.setText("");
            Salario.setText("");
            Calle.setText("");
            Mz.setText("");
            Lt.setText("");
            Colonia.setText("");
            CP.setText("");
            TP.setText("");
            TC.setText("");
            TR.setText("");
            Email.setText("");
            curp.setText("");
            Sexo.setText("");
            puesto.setText("");
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
            resultado=sentencia.executeQuery("SELECT * FROM empleados WHERE id_Folio =" + Folio.getText());
            if (resultado.next()){


                IniciodeOperacion.setText(String.valueOf(resultado.getString(2)));
                Nombre.setText(String.valueOf(resultado.getString(3)));
                Edad.setText(String.valueOf(resultado.getString(4)));
                Salario.setText(String.valueOf(resultado.getString(5)));
                Calle.setText(String.valueOf(resultado.getString(6)));
                Mz.setText(String.valueOf(resultado.getString(7)));
                Lt.setText(String.valueOf(resultado.getString(8)));
                Colonia.setText(String.valueOf(resultado.getString(9)));
                CP.setText(String.valueOf(resultado.getString(10)));
                TP.setText(String.valueOf(resultado.getString(11)));
                TC.setText(String.valueOf(resultado.getString(12)));
                TR.setText(String.valueOf(resultado.getString(13)));
                Email.setText(String.valueOf(resultado.getString(14)));
                curp.setText(String.valueOf(resultado.getString(15)));
                Sexo.setText(String.valueOf(resultado.getString(16)));
                puesto.setText(String.valueOf(resultado.getString(17)));

                String F=Folio.getText();
                String I=IniciodeOperacion.getText();
                String Op=Ope.getText();
                String N=Nombre.getText();
                String E=Edad.getText();
                String S=Salario.getText();
                String C=Calle.getText();
                String M=Mz.getText();
                String L=Lt.getText();
                String Co=Colonia.getText();
                String Cp=CP.getText();
                String Tp=TP.getText();
                String Tc1=TC.getText();
                String Tr=TR.getText();
                String Em=Email.getText();
                String Cu=curp.getText();
                String Si=Se.getSelectedItem().toString();
                String p=pu.getSelectedItem().toString();
                String H=Hora.getText();
                String Fe=Fecha.getText();
                Object Datos[]={Fe,H,Op,F,I,N,E,S,C,M,L,Co,Cp,Tp,Tc1,Tr,Em,Cu,Si,p};
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
                JOptionPane.showMessageDialog(null,"No existe el Empleado ");
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
        if(IniciodeOperacion.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo Inicio de Operaciones está vacío ");
 }
if(Nombre.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo Nombre está vacío ");
 }
if(Edad.getText().trim().length()==0)
 {
 JOptionPane.showMessageDialog(this, "El campo de Edad está vacío ");
 }
if(Salario.getText().trim().length()==0)
 {
 JOptionPane.showMessageDialog(this, "El campo de Salario está vacío ");
 }
if(Calle.getText().trim().length()==0)
 {
 JOptionPane.showMessageDialog(this, "El campo de Calle está vacío ");
 }
if(Mz.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de MZ está vacío ");
 }
        if(Lt.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de LT está vacío ");
 }
        if(Colonia.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de Colonia está vacío ");
 }
        if(CP.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de CP está vacío ");
 }
        if(TP.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de Telefono personal está vacío ");
 }
        if(TC.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de Telefono de casa está vacío ");
 }
              if(TR.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de Telefono de Recados está vacío ");
 }
              if(Email.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de Email está vacío ");
 }
              if(curp.getText().trim().length()==0)
 {
       JOptionPane.showMessageDialog(this, "El campo de Curp está vacío ");
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
        if(IniciodeOperacion.getText()=="") {
            IniciodeOperacion.setText("");
        }
        if(Nombre.getText()=="") {
            Nombre.setText("");
        }
        if(Edad.getText()=="") {
            Edad.setText("");
        }
        if(Salario.getText()=="") {
            Salario.setText("");
        }
        if(Calle.getText()=="") {
            Calle.setText("");
        }
        if( Mz.getText()=="") {
            Mz.setText("");
        }
        if( Lt.getText()=="") {
            Lt.setText("");
        }
        if(Colonia.getText()=="") {
            Colonia.setText("");
        }
        if(CP.getText()=="") {
            CP.setText("");
        }
        if(TP.getText()=="") {
            TP.setText("");
        }
         if(TC.getText()=="") {
           TC.setText("");
        }
         if(TR.getText()=="") {
            TR.setText("");
        }
         if( Email.getText()=="") {
           Email.setText("");
        }

         if( curp.getText()=="") {
            curp.setText("");
        }

         if(  Sexo.getText()=="") {
            Sexo.setText("");
        }

         if( puesto.getText()=="") {
            puesto.setText("");
        }


        try{
        String O = JOptionPane.showInputDialog(rootPane, "Introduce la Accion a Realizar");
        Operacion = String.valueOf(String.valueOf(O));
        Ope.setText(String.valueOf(Operacion));
            conexion=DriverManager.getConnection("jdbc:mysql://localhost/cc","root", "123");
            sentencia=conexion.createStatement();
            sentencia.executeUpdate("INSERT INTO empleados"+
                    " VALUES ('"+Folio.getText()+"',"+
                    "'"+IniciodeOperacion.getText()+"',"+
                    "'"+Nombre.getText()+"',"+
                    "'"+Edad.getText()+"',"+                    
                    "'"+Salario.getText()+"',"+
                    "'"+Calle.getText()+"',"+
                    "'"+Mz.getText()+"',"+
                    "'"+Lt.getText()+"',"+
                    "'"+Colonia.getText()+"',"+
                    "'"+CP.getText()+"',"+
                    "'"+TP.getText()+"',"+
                    "'"+TC.getText()+"',"+
                    "'"+TR.getText()+"',"+
                    "'"+Email.getText()+"',"+
                    "'"+curp.getText()+"',"+
                    "'"+Sexo.getText()+"')");
              Otro.setVisible(true);
             String F=Folio.getText();
                String I=IniciodeOperacion.getText();
                String Op=Ope.getText();
                String N=Nombre.getText();
                String E=Edad.getText();
                String S=Salario.getText();
                String C=Calle.getText();
                String M=Mz.getText();
                String L=Lt.getText();
                String Co=Colonia.getText();
                String Cp=CP.getText();
                String Tp=TP.getText();
                String Tc1=TC.getText();
                String Tr=TR.getText();
                String Em=Email.getText();
                String Cu=curp.getText();
                String Si=Se.getSelectedItem().toString();
                String p=pu.getSelectedItem().toString();
                String H=Hora.getText();
                String Fe=Fecha.getText();
                Object Datos[]={Fe,H,Op,F,I,N,E,S,C,M,L,Co,Cp,Tp,Tc1,Tr,Em,Cu,Si,p};
                modelo.addRow(Datos);
        Folio.setText("");
        IniciodeOperacion.setText("");
        Nombre.setText("");
        Edad.setText("");
        Salario.setText("");
        Calle.setText("");
        Mz.setText("");
        Lt.setText("");
        Colonia.setText("");
        CP.setText("");
        TP.setText("");
        TC.setText("");
        TR.setText("");
        Email.setText("");
        curp.setText("");
        Sexo.setText("");
        puesto.setText("");


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
        Folio.enable();
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
            sentencia.execute("UPDATE empleados SET Nombre=('"+Nombre.getText()+"'),"
                    + "Edad=("+Edad.getText()+"),"                    
                    + "Salario=('"+Salario.getText()+"'),"
                    + "Calle=("+Calle.getText()+"),"
                    + "Mz=('"+Mz.getText()+"'),"
                    + "Lt=('"+Lt.getText()+"'),"
                    + "Colonia=('"+Colonia.getText()+"'),"
                    + "CP=('"+CP.getText()+"')"
                    + "TP=('"+TP.getText()+"')"
                    + "TC=('"+TC.getText()+"')"
                    + "TR=('"+TR.getText()+"')"
                    + "Email=('"+Email.getText()+"')"
                    + "curp=('"+curp.getText()+"')"
                    + "Sexo=('"+Sexo.getText()+"')"
                    + "puesto=('"+puesto.getText()+"')"
                    + " WHERE Id_Cliente=" + Folio.getText());
            Otro.setVisible(true);
                String F=Folio.getText();
                String I=IniciodeOperacion.getText();
                String Op=Ope.getText();
                String N=Nombre.getText();
                String E=Edad.getText();
                String S=Salario.getText();
                String C=Calle.getText();
                String M=Mz.getText();
                String L=Lt.getText();
                String Co=Colonia.getText();
                String Cp=CP.getText();
                String Tp=TP.getText();
                String Tc1=TC.getText();
                String Tr=TR.getText();
                String Em=Email.getText();
                String Cu=curp.getText();
                String Si=Se.getSelectedItem().toString();
                String p=pu.getSelectedItem().toString();
                String H=Hora.getText();
                String Fe=Fecha.getText();
                Object Datos[]={Fe,H,Op,F,I,N,E,S,C,M,L,Co,Cp,Tp,Tc1,Tr,Em,Cu,Si,p};
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
        IniciodeOperacion.enable(true);
        Nombre.enable(true);
        Edad.enable(true);     
        Salario.enable(true);
        Calle.enable(true);
        Mz.enable(true);
        Lt.enable(true);
        Colonia.enable(true);
        CP.enable(true);
        TP.enable(true);
        TC.enable(true);
        TR.enable(true);
        Email.enable(true);
        curp.enable(true);
        Sexo.enable(true);
        puesto.enable(true);
 Otro.setVisible(true);
              String F=Folio.getText();
                String I=IniciodeOperacion.getText();
                String Op=Ope.getText();
                String N=Nombre.getText();
                String E=Edad.getText();
                String S=Salario.getText();
                String C=Calle.getText();
                String M=Mz.getText();
                String L=Lt.getText();
                String Co=Colonia.getText();
                String Cp=CP.getText();
                String Tp=TP.getText();
                String Tc1=TC.getText();
                String Tr=TR.getText();
                String Em=Email.getText();
                String Cu=curp.getText();
                String Si=Se.getSelectedItem().toString();
                String p=pu.getSelectedItem().toString();
                String H=Hora.getText();
                String Fe=Fecha.getText();
                Object Datos[]={Fe,H,Op,F,I,N,E,S,C,M,L,Co,Cp,Tp,Tc1,Tr,Em,Cu,Si,p};
                modelo.addRow(Datos);
        }
        }        // TODO add your handling code here:
}//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Menu().setVisible(true);
        JOptionPane.showMessageDialog(rootPane,"Guardando Cambios Necesarios");
        this.dispose();
    }//GEN-LAST:event_jLabel15MouseClicked

    private void FolioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FolioActionPerformed

}//GEN-LAST:event_FolioActionPerformed

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
            }});
}//GEN-LAST:event_FolioKeyTyped

    private void IniciodeOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciodeOperacionActionPerformed

        //JOptionPane.showMessageDialog(rootPane,"Formato DD/MM/YYYY, Ejemplo: 14/12/1991");
}//GEN-LAST:event_IniciodeOperacionActionPerformed

    private void IniciodeOperacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IniciodeOperacionKeyTyped
        char c= evt.getKeyChar();
        if((c<'0'||c>'9') && (c!=(char)KeyEvent.VK_SPACE)) evt.consume();
        IniciodeOperacion.addKeyListener(new KeyListener(){
            int limite  = 8;
            public void keyTyped(KeyEvent e) {
                if (IniciodeOperacion.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_IniciodeOperacionKeyTyped

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
  String Cadena = Nombre.getText();
        Nombre.setText(Cadena.toUpperCase());
}//GEN-LAST:event_NombreActionPerformed

    private void NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'||c>'z') && (c!=(char)KeyEvent.VK_SPACE)) evt.consume();
        Nombre.addKeyListener(new KeyListener(){
            int limite  = 25;
            public void keyTyped(KeyEvent e) {
                if (Nombre.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_NombreKeyTyped

    private void EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdadActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_EdadActionPerformed

    private void EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EdadKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        Edad.addKeyListener(new KeyListener(){
            int limite  = 2;
            public void keyTyped(KeyEvent e) {
                if (Edad.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_EdadKeyTyped

    private void SalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_SalarioActionPerformed

    private void SalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalarioKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        Salario.addKeyListener(new KeyListener(){
            int limite  = 9;
            public void keyTyped(KeyEvent e) {
                if (Salario.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_SalarioKeyTyped

    private void CPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CPKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9')  evt.consume();
        CP.addKeyListener(new KeyListener(){
            int limite  = 5;
            public void keyTyped(KeyEvent e) {
                if (CP.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_CPKeyTyped

    private void CalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalleActionPerformed
        String Cadena = Calle.getText();
        Calle.setText(Cadena.toUpperCase());
}//GEN-LAST:event_CalleActionPerformed

    private void CalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CalleKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'||c>'z')  && (c!=(char)KeyEvent.VK_SPACE)) evt.consume();
        Calle.addKeyListener(new KeyListener(){
            int limite  = 15;
            public void keyTyped(KeyEvent e) {
                if (Calle.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_CalleKeyTyped

    private void ColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColoniaActionPerformed
        String Cadena = Colonia.getText();
        Colonia.setText(Cadena.toUpperCase());
}//GEN-LAST:event_ColoniaActionPerformed

    private void ColoniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ColoniaKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'||c>'z') && (c!=(char)KeyEvent.VK_SPACE)) evt.consume();
        Colonia.addKeyListener(new KeyListener(){
            int limite  = 15;
            public void keyTyped(KeyEvent e) {
                if (Colonia.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_ColoniaKeyTyped

    private void MzActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MzActionPerformed
     // TODO add your handling code here:
}//GEN-LAST:event_MzActionPerformed

    private void MzKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MzKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9')  evt.consume();
        Mz.addKeyListener(new KeyListener(){
            int limite  = 3;
            public void keyTyped(KeyEvent e) {
                if (Mz.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_MzKeyTyped

    private void LtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LtKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9')  evt.consume();
        Lt.addKeyListener(new KeyListener(){
            int limite  = 3;
            public void keyTyped(KeyEvent e) {
                if (Lt.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_LtKeyTyped

    private void TPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TPKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        TP.addKeyListener(new KeyListener(){
            int limite  = 10;
            public void keyTyped(KeyEvent e) {
                if (TP.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_TPKeyTyped

    private void TCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TCKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        TC.addKeyListener(new KeyListener(){
            int limite  = 10;
            public void keyTyped(KeyEvent e) {
                if (TC.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_TCKeyTyped

    private void TRKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TRKeyTyped
        char c= evt.getKeyChar();
        if(c<'0'||c>'9') evt.consume();
        TR.addKeyListener(new KeyListener(){
            int limite  = 10;
            public void keyTyped(KeyEvent e) {
                if (TR.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_TRKeyTyped

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        String Cadena = Email.getText();
        Email.setText(Cadena.toUpperCase());
}//GEN-LAST:event_EmailActionPerformed

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'|| c>'z') && (c<'0'|| c>'9') && (c<'!' || c>'.') && (c!=(char)KeyEvent.VK_SPACE)) evt.consume();
        Email.addKeyListener(new KeyListener(){
            int limite  = 20;
            public void keyTyped(KeyEvent e) {
                if (Email.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_EmailKeyTyped

    private void curpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curpActionPerformed
        String Cadena = curp.getText();
        curp.setText(Cadena.toUpperCase());
}//GEN-LAST:event_curpActionPerformed

    private void curpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_curpKeyTyped
        char c= evt.getKeyChar();
        if((c<'a'||c>'z') && (c<'0'||c>'9')  && (c!=(char)KeyEvent.VK_SPACE)) evt.consume();

        curp.addKeyListener(new KeyListener(){
            int limite  = 18;
            public void keyTyped(KeyEvent e) {
                if (curp.getText().length()== limite)
                    e.consume();
            }
            public void keyPressed(KeyEvent arg0) {
            }
            public void keyReleased(KeyEvent arg0) {
            }});
}//GEN-LAST:event_curpKeyTyped

    private void LtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LtActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        int S=Se.getSelectedIndex();
        if(S==0){
            Sexo.setText("Masculino");
        }
        if(S==1){
            Sexo.setText("Femenino");
        }

        int P=pu.getSelectedIndex();
        if(P==0){
            puesto.setText("Gerente general");
        }
        if(P==1){
            puesto.setText("Gerente Recursos humanos");
        }
         if(P==0){
            puesto.setText("Gerente  ventas");
        }
         if(P==1){
            puesto.setText("Gerente de almacen");
        }
         if(P==0){
            puesto.setText("Administrador");
        }
         if(P==1){
            puesto.setText("Licenciado en contabilidad");
        }
         if(P==0){
            puesto.setText("Auxiliar de almacen");
        }
         if(P==1){
            puesto.setText("Auxiliar de almacen Carpintero");
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseEntered
        // TODO add your handling code here:
}//GEN-LAST:event_jLabel17MouseEntered

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        int res = JOptionPane.showConfirmDialog(this, "¿Esta Usted Seguro de Salir del Sistema Carpinterias Carso?",
                "Carpinterias Carso", JOptionPane.YES_NO_OPTION);
        if (res == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(rootPane, "Gracias por usar el sistema Carpinterias Carso");
            new Salir().setVisible(true);
            this.dispose();
        }
}//GEN-LAST:event_jLabel19MouseClicked

    private void SeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeActionPerformed

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

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
 new  Empleados().setVisible(true);
            this.dispose();
                                   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
 new  Empleados().setVisible(true);
            this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CP;
    private javax.swing.JTextField Calle;
    private javax.swing.JTextField Colonia;
    private javax.swing.JLabel ConExi;
    private javax.swing.JTextField Edad;
    private javax.swing.JTextField Email;
    private javax.swing.JLabel FalloEnlace;
    private javax.swing.JLabel Fecha;
    private javax.swing.JTextField Folio;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel His;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel ImagenG;
    private javax.swing.JTextField IniciodeOperacion;
    private javax.swing.JTextField Lt;
    private javax.swing.JTextField Mz;
    private javax.swing.JTextField Nombre;
    private javax.swing.JLabel Nombre2;
    private javax.swing.JLabel Ope;
    private javax.swing.JScrollPane Otro;
    private javax.swing.JTextField Salario;
    private javax.swing.JComboBox Se;
    private javax.swing.JLabel Sexo;
    private javax.swing.JTextField TC;
    private javax.swing.JTextField TP;
    private javax.swing.JTextField TR;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel TextoExi;
    private javax.swing.JLabel TextoFallo;
    private javax.swing.JLabel TextoG;
    private javax.swing.JTextField curp;
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
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JComboBox pu;
    private javax.swing.JLabel puesto;
    // End of variables declaration//GEN-END:variables

}

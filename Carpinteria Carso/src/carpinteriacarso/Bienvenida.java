package carpinteriacarso;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author J.h
 */
public class Bienvenida extends javax.swing.JFrame {
    Hilo hi = new Hilo();

    /** Creates new form Bienvenida */
    public Bienvenida() {
        initComponents();
         hi.start();
        final JFrame frame = new JFrame("Bienvenida");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(false);
    }
    class Hilo extends Thread {
        public void run() {
            int c = 0;
            try {
                do {
                    c = c + 1;

                    Thread.sleep(1000);
                } while (c <= 3);
                Acceso o = new Acceso();
                 JOptionPane.showMessageDialog(rootPane,"Bienvenido");
                 JOptionPane.showMessageDialog(rootPane,"Carpinterias Carso");
                o.setLocationRelativeTo(null);
                o.show();
                dispose();
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
        }
    }
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/barra_de_progreso.gif"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carpinteriacarso/imagenes/FondoU.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(jLabel2))
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(jLabel2))
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bienvenida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}

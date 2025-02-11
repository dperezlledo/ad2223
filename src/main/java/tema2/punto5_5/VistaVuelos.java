/*
  COD_VUELO VARCHAR2(10) PRIMARY KEY,
  HORA_SALIDA VARCHAR2(15),
  DESTINO VARCHAR2(15),
  PROCEDENCIA VARCHAR2(15),
  PLAZAS_FUMADOR NUMBER(3),
  PLAZAS_NO_FUMADOR NUMBER(3),
  PLAZAS_TURISTA NUMBER(3),
  PLAZAS_PRIMERA NUMBER(3)
 */
package tema2.punto5_5;

/**
 *
 * @author ProfVespertino
 */
public class VistaVuelos extends javax.swing.JFrame {

    /**
     * Creates new form VistaPasajeros
     */
    public VistaVuelos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigoVuelo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldHoraSalida = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldDestino = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldProcedencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerPlazasFumador = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerPlazasNOFumador = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerPlazasTurista = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerPlazasPrimera = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonAlta = new javax.swing.JButton();
        jButtonConsulta = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jButtonModificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Vuelos");
        getContentPane().setLayout(new java.awt.BorderLayout(25, 25));

        jPanel1.setLayout(new java.awt.GridLayout(8, 2, 10, 10));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Código Vuelo");
        jPanel1.add(jLabel1);
        jPanel1.add(jTextFieldCodigoVuelo);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Hora Salida");
        jPanel1.add(jLabel2);
        jPanel1.add(jTextFieldHoraSalida);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Destino");
        jPanel1.add(jLabel3);
        jPanel1.add(jTextFieldDestino);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Procedencia");
        jPanel1.add(jLabel4);
        jPanel1.add(jTextFieldProcedencia);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Plazas de Fumador");
        jPanel1.add(jLabel5);
        jPanel1.add(jSpinnerPlazasFumador);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Plazas de NO Fumador");
        jPanel1.add(jLabel6);
        jPanel1.add(jSpinnerPlazasNOFumador);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Plazas Disponibles Turista");
        jPanel1.add(jLabel7);
        jPanel1.add(jSpinnerPlazasTurista);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Plazas Disponibles 1ª Clase");
        jPanel1.add(jLabel8);
        jPanel1.add(jSpinnerPlazasPrimera);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 0));

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonLimpiar);

        jButtonAlta.setText("Alta");
        jPanel2.add(jButtonAlta);

        jButtonConsulta.setText("Consulta");
        jPanel2.add(jButtonConsulta);

        jButtonBaja.setText("Baja");
        jPanel2.add(jButtonBaja);

        jButtonModificacion.setText("Modificación");
        jPanel2.add(jButtonModificacion);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // Inicializamos las cajas de texto
        jTextFieldCodigoVuelo.setText("");
        jTextFieldDestino.setText("");
        jTextFieldHoraSalida.setText("");
        jTextFieldProcedencia.setText("");
        // Inicializamos los Spinners
        jSpinnerPlazasFumador.setValue(0);
        jSpinnerPlazasNOFumador.setValue(0);
        jSpinnerPlazasPrimera.setValue(0);
        jSpinnerPlazasTurista.setValue(0);
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonConsulta;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JButton jButtonModificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinnerPlazasFumador;
    private javax.swing.JSpinner jSpinnerPlazasNOFumador;
    private javax.swing.JSpinner jSpinnerPlazasPrimera;
    private javax.swing.JSpinner jSpinnerPlazasTurista;
    private javax.swing.JTextField jTextFieldCodigoVuelo;
    private javax.swing.JTextField jTextFieldDestino;
    private javax.swing.JTextField jTextFieldHoraSalida;
    private javax.swing.JTextField jTextFieldProcedencia;
    // End of variables declaration//GEN-END:variables
}

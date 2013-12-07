package graficadora.de.polinomios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.BoxLayout;

public class GraficadoraPolinomios extends javax.swing.JApplet {

    private Graphics g;

    @Override
    public void init() {
        this.setSize(783, 600);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraficadoraPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficadoraPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficadoraPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficadoraPolinomios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                public void run() {
                    initComponents();
                }
            });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Point punto = new Point(150, 250);
        this.jScrollPane2.getViewport().setViewPosition(punto);
    }

    void inicializar() {

        g = this.jPGrafica.getGraphics();
        int px2 = this.jPGrafica.getWidth() / 2;
        int py2 = this.jPGrafica.getHeight() / 2;
        int px = this.jPGrafica.getWidth();
        int py = this.jPGrafica.getHeight();
        g.setColor(Color.red);
        g.drawLine(px2, 0, px2, py);
        g.drawLine(0, py2, px, py2);
        for (int x = 0; x < this.jPGrafica.getWidth(); x+=10) {
            g.setColor(Color.black);
            g.drawLine(x, py2-2, x, py2+2);
            g.drawLine(px2-2,x,px2+2,x);
        }
        g.setColor(Color.blue);
        int[] arreglo = {0,0,1};
        for(int punto = 0; punto < this.jPGrafica.getWidth();punto++){
            for(int coeficientes = 0; coeficientes <  arreglo.length; coeficientes++){
               
                
               
            }   
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jBOk = new javax.swing.JButton();
        jTFGradoEcuacion = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPGrafica = new javax.swing.JPanel();

        jBOk.setText("Ok");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        jTFGradoEcuacion.setText("Inserta el grado de la ecuación");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTFGradoEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jBOk)
                .addContainerGap(439, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBOk)
                    .addComponent(jTFGradoEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jScrollPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane2AncestorAdded(evt);
            }
        });

        jPGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jPGrafica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPGrafica.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPGrafica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPGraficaComponentMoved(evt);
            }
        });

        javax.swing.GroupLayout jPGraficaLayout = new javax.swing.GroupLayout(jPGrafica);
        jPGrafica.setLayout(jPGraficaLayout);
        jPGraficaLayout.setHorizontalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPGraficaLayout.setVerticalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPGrafica);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed

    }//GEN-LAST:event_jBOkActionPerformed

    private void jScrollPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane2AncestorAdded
        inicializar();
    }//GEN-LAST:event_jScrollPane2AncestorAdded

    private void jPGraficaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPGraficaComponentMoved
        inicializar();
    }//GEN-LAST:event_jPGraficaComponentMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBOk;
    private javax.swing.JPanel jPGrafica;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFGradoEcuacion;
    // End of variables declaration//GEN-END:variables
}

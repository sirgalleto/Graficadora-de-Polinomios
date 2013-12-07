package graficadora.de.polinomios;

import graficadora.logica.Derivadora;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GraficadoraPolinomios extends javax.swing.JApplet {

    private Graphics g;
    private JTextField[] jTOk;
    private double[] coeficientes;
    private boolean graficando = false;
    private HashMap<Point, Integer> cartesianas;

    @Override
    public void init() {
        this.setSize(816, 578);
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
        this.jBGraficar.setVisible(false);
        this.jBReiniciar.setVisible(false);
        jPanel2.setLayout(new GridLayout(0, 2));
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
        for (int x = 0; x < this.jPGrafica.getWidth(); x += 10) {
            g.setColor(Color.black);
            g.drawLine(x, py2 - 2, x, py2 + 2);
            g.drawLine(px2 - 2, x, px2 + 2, x);
        }
        if (this.graficando == true) {
            g.setColor(Color.blue);
            int[] xs = new int[this.jPGrafica.getWidth()];
            int[] ys = new int[this.jPGrafica.getWidth()];
            
            cartesianas = new HashMap<Point, Integer>();
            
            double[] arreglo = this.coeficientes;
            for (int punto = 0; punto < this.jPGrafica.getWidth(); punto++) {
                xs[punto] = punto;
                int xCalc = punto - py2;
                int sum = 0;
                for (int coeficientes = 0; coeficientes < arreglo.length; coeficientes++) {
                    sum += (arreglo[coeficientes]/64.0) * Math.pow(xCalc, coeficientes);
                }
                int res = px2 - sum;
                g.setColor(Color.red);
                g.fillOval(punto, res, 4, 4);
                for (int i = punto - 4; i <= punto + 4; i++) {
                    for (int j = res - 4; j <= res + 4; j++) {
                        cartesianas.put(new Point(i, j), xCalc);
                    }
                }
                g.setColor(Color.blue);
                cartesianas.put(new Point(punto, res), xCalc);
                ys[punto] = res;
            }

            g.drawPolyline(xs, ys, this.jPGrafica.getWidth());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jTFGradoEcuacion = new javax.swing.JTextField();
        jBOk = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPGrafica = new javax.swing.JPanel();
        jBReiniciar = new javax.swing.JButton();
        jBGraficar = new javax.swing.JButton();

        jTFGradoEcuacion.setText("Inserta el grado de la ecuación");

        jBOk.setText("Ok");
        jBOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTFGradoEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jBOk)
                .addContainerGap(489, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFGradoEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBOk))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jScrollPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jScrollPane2AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jPGrafica.setBackground(new java.awt.Color(255, 255, 255));
        jPGrafica.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPGrafica.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jPGrafica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPGraficaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPGraficaMouseReleased(evt);
            }
        });
        jPGrafica.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                jPGraficaComponentMoved(evt);
            }
        });

        javax.swing.GroupLayout jPGraficaLayout = new javax.swing.GroupLayout(jPGrafica);
        jPGrafica.setLayout(jPGraficaLayout);
        jPGraficaLayout.setHorizontalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );
        jPGraficaLayout.setVerticalGroup(
            jPGraficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 994, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPGrafica);

        jBReiniciar.setText("Reiniciar");
        jBReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReiniciarActionPerformed(evt);
            }
        });

        jBGraficar.setText("Graficar");
        jBGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 804, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBGraficar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBReiniciar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBReiniciar)
                    .addComponent(jBGraficar)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBOkActionPerformed
        try {
            jTOk = new JTextField[Integer.parseInt(this.jTFGradoEcuacion.getText()) + 1];
            this.jPanel2.remove(this.jBOk);
            this.jPanel2.remove(this.jTFGradoEcuacion);
            jPanel2.setLayout(new GridLayout(0, this.jTOk.length));
            for (int x = 0; x < jTOk.length; x++) {
                jTOk[x] = new JTextField();
                jTOk[x].setText("x^" + x);
                this.jPanel2.add(jTOk[x]);
            }
            this.jBGraficar.setVisible(true);
            this.jBReiniciar.setVisible(true);
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_jBOkActionPerformed

    private void jScrollPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jScrollPane2AncestorAdded
        inicializar();
    }//GEN-LAST:event_jScrollPane2AncestorAdded

    private void jPGraficaComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPGraficaComponentMoved
        inicializar();
    }//GEN-LAST:event_jPGraficaComponentMoved

    private void jBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReiniciarActionPerformed
        this.graficando = false;
        g.clearRect(0, 0, jPGrafica.getWidth(), jPGrafica.getHeight());
        inicializar();
        jPanel2.setLayout(new GridLayout(0, 2));
        for (int x = 0; x < jTOk.length; x++) {
            this.jPanel2.remove(jTOk[x]);
        }
        this.jPanel2.add(this.jTFGradoEcuacion);
        this.jTFGradoEcuacion.setText("Inserta el grado de la ecuación");
        this.jPanel2.add(this.jBOk);
        this.jBGraficar.setVisible(false);
        this.jBReiniciar.setVisible(false);
    }//GEN-LAST:event_jBReiniciarActionPerformed

    private void jBGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGraficarActionPerformed
        try {
            this.graficando = true;
            g.clearRect(0, 0, jPGrafica.getWidth(), jPGrafica.getHeight());

            coeficientes = new double[this.jTOk.length];
            for (int x = 0; x < this.coeficientes.length; x++) {
                this.coeficientes[x] = Double.parseDouble(this.jTOk[x].getText());
            }
            inicializar();
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_jBGraficarActionPerformed

    private void jPGraficaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGraficaMouseReleased
        g.clearRect(0, 0, jPGrafica.getWidth(), jPGrafica.getHeight());
        inicializar();
    }//GEN-LAST:event_jPGraficaMouseReleased

    private void jPGraficaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPGraficaMousePressed
        if (jPGrafica.contains(evt.getPoint())) {
            int pt = cartesianas.get(evt.getPoint());
            double d = Derivadora.derivar(new double[]{0, 0, 1 / 64.0, 0}, cartesianas.get(evt.getPoint()));
            g.drawString("Pendiente: " + d, evt.getX() + 5, evt.getY() + 5);
        }
    }//GEN-LAST:event_jPGraficaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGraficar;
    private javax.swing.JButton jBOk;
    private javax.swing.JButton jBReiniciar;
    private javax.swing.JPanel jPGrafica;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFGradoEcuacion;
    // End of variables declaration//GEN-END:variables
}

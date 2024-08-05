package cap4_ej23;

public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ec2doP = new javax.swing.JPanel();
        ec2doL = new javax.swing.JLabel();
        datosL = new javax.swing.JLabel();
        nAL = new javax.swing.JLabel();
        nBL = new javax.swing.JLabel();
        nCL = new javax.swing.JLabel();
        nA = new javax.swing.JTextField();
        nB = new javax.swing.JTextField();
        nC = new javax.swing.JTextField();
        calcularsln = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        resultado = new javax.swing.JTextArea();
        formulaec2do = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ec2doP.setBackground(new java.awt.Color(201, 234, 249));

        ec2doL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ec2doL.setForeground(new java.awt.Color(0, 0, 153));
        ec2doL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ec2doL.setText("Ecuación de segundo grado");

        datosL.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        datosL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosL.setText("Ingrese el valor de A, B y C");

        nAL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nAL.setForeground(new java.awt.Color(0, 0, 153));
        nAL.setText("A");

        nBL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nBL.setForeground(new java.awt.Color(0, 0, 153));
        nBL.setText("B");

        nCL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nCL.setForeground(new java.awt.Color(0, 0, 153));
        nCL.setText("C");

        nA.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        nB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        nC.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        calcularsln.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcularsln.setForeground(new java.awt.Color(0, 0, 153));
        calcularsln.setText("Calcular soluciones");
        calcularsln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularslnActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(153, 0, 0));
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resultado.setLineWrap(true);
        resultado.setRows(4);
        resultado.setWrapStyleWord(true);

        formulaec2do.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        formulaec2do.setForeground(new java.awt.Color(0, 0, 153));
        formulaec2do.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formulaec2do.setText("Ax² + Bx + C = 0, A ≠ 0");

        javax.swing.GroupLayout ec2doPLayout = new javax.swing.GroupLayout(ec2doP);
        ec2doP.setLayout(ec2doPLayout);
        ec2doPLayout.setHorizontalGroup(
            ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ec2doPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(formulaec2do, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ec2doPLayout.createSequentialGroup()
                        .addComponent(nAL)
                        .addGap(18, 18, 18)
                        .addComponent(nA))
                    .addComponent(datosL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ec2doPLayout.createSequentialGroup()
                        .addGroup(ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ec2doPLayout.createSequentialGroup()
                                .addComponent(nBL)
                                .addGap(18, 18, 18)
                                .addComponent(nB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ec2doPLayout.createSequentialGroup()
                                .addComponent(nCL)
                                .addGap(18, 18, 18)
                                .addComponent(nC))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ec2doPLayout.createSequentialGroup()
                                .addComponent(calcularsln, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(borrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(resultado, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(ec2doL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        ec2doPLayout.setVerticalGroup(
            ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ec2doPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(ec2doL)
                .addGap(15, 15, 15)
                .addComponent(formulaec2do)
                .addGap(15, 15, 15)
                .addComponent(datosL)
                .addGap(15, 15, 15)
                .addGroup(ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nAL)
                    .addComponent(nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nBL)
                    .addComponent(nB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nCL)
                    .addComponent(nC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(ec2doPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcularsln)
                    .addComponent(borrar))
                .addGap(15, 15, 15)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ec2doP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ec2doP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularslnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularslnActionPerformed
        double A = Double.parseDouble(nA.getText());
        double B = Double.parseDouble(nB.getText());
        double C = Double.parseDouble(nC.getText());
        Ecuacion2doGrado ec = new Ecuacion2doGrado(A,B,C);
        resultado.setText(ec.SolucionEc());
    }//GEN-LAST:event_calcularslnActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        nA.setText("");
        nB.setText("");
        nC.setText("");
        resultado.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton calcularsln;
    private javax.swing.JLabel datosL;
    private javax.swing.JLabel ec2doL;
    private javax.swing.JPanel ec2doP;
    private javax.swing.JLabel formulaec2do;
    private javax.swing.JTextField nA;
    private javax.swing.JLabel nAL;
    private javax.swing.JTextField nB;
    private javax.swing.JLabel nBL;
    private javax.swing.JTextField nC;
    private javax.swing.JLabel nCL;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}

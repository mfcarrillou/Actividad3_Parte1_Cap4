package cap4_ej10;

public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        valmatP = new javax.swing.JPanel();
        matricula = new javax.swing.JLabel();
        ninsL = new javax.swing.JLabel();
        nombresL = new javax.swing.JLabel();
        patrimonioL = new javax.swing.JLabel();
        estsocL = new javax.swing.JLabel();
        nins = new javax.swing.JTextField();
        nombres = new javax.swing.JTextField();
        patrimonio = new javax.swing.JTextField();
        estsoc = new javax.swing.JTextField();
        calcular = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        datosL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        valmatP.setBackground(new java.awt.Color(201, 234, 249));

        matricula.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        matricula.setForeground(new java.awt.Color(0, 0, 102));
        matricula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        matricula.setText("Valor de matrícula");

        ninsL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ninsL.setForeground(new java.awt.Color(0, 0, 102));
        ninsL.setText("Número de inscripción");

        nombresL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nombresL.setForeground(new java.awt.Color(0, 0, 102));
        nombresL.setText("Nombres");

        patrimonioL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        patrimonioL.setForeground(new java.awt.Color(0, 0, 102));
        patrimonioL.setText("Patrimonio");

        estsocL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        estsocL.setForeground(new java.awt.Color(0, 0, 102));
        estsocL.setText("Estrato social");

        nins.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        nombres.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        patrimonio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        estsoc.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        calcular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        calcular.setForeground(new java.awt.Color(0, 0, 102));
        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(102, 0, 0));
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
        resultado.setBorder(null);
        jScrollPane1.setViewportView(resultado);

        datosL.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        datosL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        datosL.setText("Ingrese los siguientes datos");

        javax.swing.GroupLayout valmatPLayout = new javax.swing.GroupLayout(valmatP);
        valmatP.setLayout(valmatPLayout);
        valmatPLayout.setHorizontalGroup(
            valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valmatPLayout.createSequentialGroup()
                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, valmatPLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(valmatPLayout.createSequentialGroup()
                                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(calcular)
                                    .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ninsL)
                                        .addComponent(nombresL)
                                        .addComponent(patrimonioL)
                                        .addComponent(estsocL)))
                                .addGap(20, 20, 20)
                                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nins, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(nombres)
                                    .addComponent(patrimonio)
                                    .addComponent(estsoc)
                                    .addGroup(valmatPLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(borrar))))))
                    .addGroup(valmatPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(datosL, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        valmatPLayout.setVerticalGroup(
            valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(valmatPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(matricula)
                .addGap(15, 15, 15)
                .addComponent(datosL)
                .addGap(15, 15, 15)
                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ninsL)
                    .addComponent(nins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nombresL)
                    .addComponent(nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(patrimonioL)
                    .addComponent(patrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(estsocL)
                    .addComponent(estsoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(valmatPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcular)
                    .addComponent(borrar))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valmatP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(valmatP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        String NI = nins.getText();
        String NOM = nombres.getText();
        double PAT = Double.parseDouble(patrimonio.getText());
        int EST = Integer.parseInt(estsoc.getText());
        Matricula estudiante = new Matricula(NI,NOM,PAT,EST);
        String resultadotxt = 
                "\nEl estudiante con número de inscripción " + estudiante.NI 
                + " y nombre " + estudiante.NOM + " debe pagar $ " 
                + estudiante.pagoMatricula();
        resultado.setText(resultadotxt);
    }//GEN-LAST:event_calcularActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        nins.setText("");
        nombres.setText("");
        patrimonio.setText("");
        estsoc.setText("");
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
    private javax.swing.JButton calcular;
    private javax.swing.JLabel datosL;
    private javax.swing.JTextField estsoc;
    private javax.swing.JLabel estsocL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel matricula;
    private javax.swing.JTextField nins;
    private javax.swing.JLabel ninsL;
    private javax.swing.JTextField nombres;
    private javax.swing.JLabel nombresL;
    private javax.swing.JTextField patrimonio;
    private javax.swing.JLabel patrimonioL;
    private javax.swing.JTextArea resultado;
    private javax.swing.JPanel valmatP;
    // End of variables declaration//GEN-END:variables
}

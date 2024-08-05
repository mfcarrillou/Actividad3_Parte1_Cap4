package cap4_ej07;

public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        compnumP = new javax.swing.JPanel();
        numeros = new javax.swing.JLabel();
        nAL = new javax.swing.JLabel();
        nBL = new javax.swing.JLabel();
        AyB = new javax.swing.JLabel();
        nA = new javax.swing.JTextField();
        nB = new javax.swing.JTextField();
        comparar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        compnumP.setBackground(new java.awt.Color(201, 234, 249));

        numeros.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        numeros.setForeground(new java.awt.Color(0, 0, 153));
        numeros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        numeros.setText("¿Mayor, menor o igual?");

        nAL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nAL.setForeground(new java.awt.Color(0, 0, 153));
        nAL.setText("A");

        nBL.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        nBL.setForeground(new java.awt.Color(0, 0, 153));
        nBL.setText("B");

        AyB.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        AyB.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AyB.setText("Ingrese el valor de A y B");

        nA.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        nB.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        comparar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        comparar.setForeground(new java.awt.Color(0, 0, 153));
        comparar.setText("Comparar");
        comparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compararActionPerformed(evt);
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

        resultado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resultado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultado.setBorder(null);

        javax.swing.GroupLayout compnumPLayout = new javax.swing.GroupLayout(compnumP);
        compnumP.setLayout(compnumPLayout);
        compnumPLayout.setHorizontalGroup(
            compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compnumPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(compnumPLayout.createSequentialGroup()
                        .addGroup(compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nBL)
                            .addComponent(nAL))
                        .addGap(18, 18, 18)
                        .addGroup(compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nA)
                            .addComponent(nB)))
                    .addComponent(numeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AyB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(compnumPLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultado)
                            .addGroup(compnumPLayout.createSequentialGroup()
                                .addComponent(comparar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(borrar)))))
                .addGap(30, 30, 30))
        );
        compnumPLayout.setVerticalGroup(
            compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(compnumPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(numeros)
                .addGap(15, 15, 15)
                .addComponent(AyB)
                .addGap(15, 15, 15)
                .addGroup(compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nAL)
                    .addComponent(nA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nBL)
                    .addComponent(nB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(compnumPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comparar)
                    .addComponent(borrar))
                .addGap(18, 18, 18)
                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(compnumP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(compnumP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void compararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compararActionPerformed
        double A = Double.parseDouble(nA.getText());
        double B = Double.parseDouble(nB.getText());
        resultado.setText(Numeros.Comparar(A, B));
    }//GEN-LAST:event_compararActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        nA.setText("");
        nB.setText("");
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
    private javax.swing.JLabel AyB;
    private javax.swing.JButton borrar;
    private javax.swing.JButton comparar;
    private javax.swing.JPanel compnumP;
    private javax.swing.JTextField nA;
    private javax.swing.JLabel nAL;
    private javax.swing.JTextField nB;
    private javax.swing.JLabel nBL;
    private javax.swing.JLabel numeros;
    private javax.swing.JTextField resultado;
    // End of variables declaration//GEN-END:variables
}

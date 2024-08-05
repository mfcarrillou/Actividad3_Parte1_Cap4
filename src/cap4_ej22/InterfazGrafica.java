package cap4_ej22;

public class InterfazGrafica extends javax.swing.JFrame {

    public InterfazGrafica() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        empleadoP = new javax.swing.JPanel();
        empleadoL = new javax.swing.JLabel();
        nomL = new javax.swing.JLabel();
        sal_horaL = new javax.swing.JLabel();
        horas_mesL = new javax.swing.JLabel();
        horas_mes = new javax.swing.JTextField();
        sal_hora = new javax.swing.JTextField();
        nom = new javax.swing.JTextField();
        mostrar = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        resultadoP = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        comentario1 = new javax.swing.JLabel();
        comentario2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        empleadoP.setBackground(new java.awt.Color(201, 234, 249));

        empleadoL.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        empleadoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        empleadoL.setText("Empleado");

        nomL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        nomL.setText("Nombre del empleado");

        sal_horaL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sal_horaL.setText("Salario básico por hora");

        horas_mesL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        horas_mesL.setText("Horas trabajadas en el mes");

        horas_mes.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        sal_hora.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        nom.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        mostrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mostrar.setForeground(new java.awt.Color(11, 95, 133));
        mostrar.setText("Mostrar");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });

        borrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        borrar.setForeground(new java.awt.Color(140, 49, 49));
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        resultado.setRows(4);
        resultadoP.setViewportView(resultado);

        comentario1.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        comentario1.setText("*El salario mensual del empleado solo se mostrará si es ");

        comentario2.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        comentario2.setText("mayor a $450000.");

        javax.swing.GroupLayout empleadoPLayout = new javax.swing.GroupLayout(empleadoP);
        empleadoP.setLayout(empleadoPLayout);
        empleadoPLayout.setHorizontalGroup(
            empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadoPLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(borrar)
                .addGap(80, 80, 80))
            .addGroup(empleadoPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empleadoPLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(comentario2))
                    .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(empleadoPLayout.createSequentialGroup()
                            .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(horas_mesL)
                                .addComponent(sal_horaL)
                                .addComponent(nomL))
                            .addGap(15, 15, 15)
                            .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nom, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(sal_hora)
                                .addComponent(horas_mes)))
                        .addComponent(empleadoL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(resultadoP)
                        .addComponent(comentario1, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        empleadoPLayout.setVerticalGroup(
            empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empleadoPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(empleadoL)
                .addGap(15, 15, 15)
                .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nomL)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(sal_horaL)
                    .addComponent(sal_hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(horas_mesL)
                    .addComponent(horas_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(empleadoPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mostrar)
                    .addComponent(borrar))
                .addGap(15, 15, 15)
                .addComponent(resultadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comentario1)
                .addGap(0, 0, 0)
                .addComponent(comentario2)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(empleadoP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        String nombre = nom.getText();
        double salario_hora = Double.parseDouble(sal_hora.getText());
        double horas_trabajadas = Double.parseDouble(horas_mes.getText());
        Empleado empleado = new Empleado(nombre,salario_hora,horas_trabajadas);
        resultado.setText(empleado.infoEmpleado());
    }//GEN-LAST:event_mostrarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        nom.setText("");
        sal_hora.setText("");
        horas_mes.setText("");
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
    private javax.swing.JLabel comentario1;
    private javax.swing.JLabel comentario2;
    private javax.swing.JLabel empleadoL;
    private javax.swing.JPanel empleadoP;
    private javax.swing.JTextField horas_mes;
    private javax.swing.JLabel horas_mesL;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextField nom;
    private javax.swing.JLabel nomL;
    private javax.swing.JTextArea resultado;
    private javax.swing.JScrollPane resultadoP;
    private javax.swing.JTextField sal_hora;
    private javax.swing.JLabel sal_horaL;
    // End of variables declaration//GEN-END:variables
}

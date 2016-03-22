package br.guiireal.metodosdeordenacao.janelas;

/**
 * JANELA DO MÉTODO INSERÇÃO
 * 
 * @author Guilherme
 */
public class JanelaInsercao extends javax.swing.JFrame {

    /**
     * CONSTRUTOR CRIA A JANELA
     */
    public JanelaInsercao() {
        initComponents();
    }

    /**
     * CÓDIGO GERADO AUTOMATICAMENTE (COMPONENTES DA JANELA)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnTeclado = new javax.swing.JButton();
        btnArquivo = new javax.swing.JButton();
        btnBaseDados = new javax.swing.JButton();
        lblSubTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Métodos de Ordenação");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 102, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MÉTODO INSERÇÃO");

        btnTeclado.setText("TECLADO");
        btnTeclado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarMetodoTeclado(evt);
            }
        });

        btnArquivo.setText("ARQUIVO");
        btnArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarMetodoArquivo(evt);
            }
        });

        btnBaseDados.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnBaseDados.setText("BASE DADOS");

        lblSubTitulo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitulo.setText("Por onde deseja realizar o método inserção ?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSubTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTeclado)
                        .addGap(18, 18, 18)
                        .addComponent(btnArquivo)
                        .addGap(18, 18, 18)
                        .addComponent(btnBaseDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(btnTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBaseDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iniciarMetodoTeclado(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarMetodoTeclado
        JanelaInsercaoTeclado jit = new JanelaInsercaoTeclado();
        jit.setVisible(true);
    }//GEN-LAST:event_iniciarMetodoTeclado

    private void iniciarMetodoArquivo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarMetodoArquivo
        JanelaInsercaoArquivo jia = new JanelaInsercaoArquivo();
        jia.setVisible(true);
    }//GEN-LAST:event_iniciarMetodoArquivo

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArquivo;
    private javax.swing.JButton btnBaseDados;
    private javax.swing.JButton btnTeclado;
    private javax.swing.JLabel lblSubTitulo;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}

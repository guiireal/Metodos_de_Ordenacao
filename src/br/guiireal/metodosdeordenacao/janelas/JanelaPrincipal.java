package br.guiireal.metodosdeordenacao.janelas;

import javax.swing.JOptionPane;

/**
 * JANELA PRINCIPAL
 * 
 * @author Guilherme
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * CONSTRUTOR CRIA A JANELA
     */
    public JanelaPrincipal() {
        initComponents();
    }

    /**
     * CÓDIGO GERADO AUTOMATICAMENTE (COMPONENTES DA JANELA)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        btnMetodoSelecao = new javax.swing.JButton();
        btnMetodoBolha = new javax.swing.JButton();
        btnMetodoInsercao = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnTestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Métodos de Ordenação");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 102, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MÉTODOS DE ORDENAÇÃO");

        btnMetodoSelecao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMetodoSelecao.setText("SELEÇÃO");
        btnMetodoSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoSelecao(evt);
            }
        });

        btnMetodoBolha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMetodoBolha.setText("BOLHA");
        btnMetodoBolha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoBolha(evt);
            }
        });

        btnMetodoInsercao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnMetodoInsercao.setText("INSERÇÃO");
        btnMetodoInsercao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metodoInsercao(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Desenvolvido por: Guilherme França | Universidade Nove de Julho");

        btnTestar.setText("TESTE DE VELOCIDADE");
        btnTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnMetodoBolha, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMetodoSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMetodoInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnTestar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMetodoBolha, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMetodoSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMetodoInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTestar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void metodoBolha(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoBolha
        JanelaBolha jb = new JanelaBolha();
        jb.setVisible(true);
    }//GEN-LAST:event_metodoBolha

    private void metodoSelecao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoSelecao
        JanelaSelecao js = new JanelaSelecao();
        js.setVisible(true);
    }//GEN-LAST:event_metodoSelecao

    private void metodoInsercao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metodoInsercao
        JanelaInsercao ji = new JanelaInsercao();
        ji.setVisible(true);
    }//GEN-LAST:event_metodoInsercao

    private void btnTestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestarActionPerformed
        br.guiireal.metodosdeordenacao.aplicacao.TesteVelocidade teste = 
        new br.guiireal.metodosdeordenacao.aplicacao.TesteVelocidade();
        teste.executarBolha();
        long tempoBolha = teste.getTempoB();
        teste.executarSelecao();
        long tempoSelecao = teste.getTempoS();
        teste.executarInsercao();
        long tempoInsercao = teste.getTempoI();
        JOptionPane.showMessageDialog(null, "Resultado (baseado em um vetor de 50 mil elementos)\n"
                + "Método Bolha : " + tempoBolha + " segundos\n"
                + "Método Selecao : " + tempoSelecao + " segundos\n"
                + "Método Insercao : " + tempoInsercao + " segundos\n", "Teste", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnTestarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMetodoBolha;
    private javax.swing.JButton btnMetodoInsercao;
    private javax.swing.JButton btnMetodoSelecao;
    private javax.swing.JButton btnTestar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}

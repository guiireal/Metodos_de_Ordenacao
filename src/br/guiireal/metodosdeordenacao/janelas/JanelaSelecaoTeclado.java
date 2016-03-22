package br.guiireal.metodosdeordenacao.janelas;

import br.guiireal.metodosdeordenacao.aplicacao.MetodosOrdenacao;
import javax.swing.JOptionPane;

/**
 * JANELA DO MÉTODO SELEÇÃO VIA TECLADO (LÓGICA)
 * 
 * @author Guilherme
 */
public class JanelaSelecaoTeclado extends javax.swing.JFrame {
    
    /*
     * ATRIBUTOS
     */
    private final MetodosOrdenacao ordenar = new MetodosOrdenacao();
    private int tamanho;
    private int[] vetor;
    
    /**
     * CONSTRUTOR CRIA A JANELA
     */
    public JanelaSelecaoTeclado() {
        initComponents();
        lblInfo3.setVisible(false);
        lblInfo4.setVisible(false);
        lblInfo5.setVisible(false);
    }

    /**
     * CÓDIGO GERADO AUTOMATICAMENTE (COMPONENTES DA JANELA)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jpnCodigo = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblInfo2 = new javax.swing.JLabel();
        spnDefinirTamVetor = new javax.swing.JSpinner();
        btnIniciarAlgoritmo = new javax.swing.JButton();
        lblInfo3 = new javax.swing.JLabel();
        lblInfo4 = new javax.swing.JLabel();
        lblOriginal = new javax.swing.JLabel();
        lblDecrescente = new javax.swing.JLabel();
        lblInfo5 = new javax.swing.JLabel();
        lblCrescente = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Métodos de Ordenação");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 102, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MÉTODO SELEÇÃO VIA TECLADO");

        jpnCodigo.setBackground(new java.awt.Color(0, 0, 0));

        lblCodigo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(0, 204, 0));
        lblCodigo.setText("<html> \n<body>         \n        for (int i = 0; i < tamanho-1; i++) {  <br/>        \n        &nbsp &nbsp indice = i; <br/>         \n        &nbsp &nbsp for (int j = i + 1; j < tamanho; j++) { <br/>\n        &nbsp &nbsp &nbsp &nbsp if (vetor[indice] > vetor[j]) { <br/>   \n        &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp  indice = j; <br/>                 \n        &nbsp &nbsp &nbsp &nbsp  } <br/>        \n        &nbsp &nbsp } <br/>          \n        &nbsp &nbsp if (index != i) { <br/>         \n        &nbsp &nbsp &nbsp &nbsp aux = vetor[i]; <br/>        \n        &nbsp &nbsp &nbsp &nbsp vetor[i] = vetor[indice]; <br/>          \n        &nbsp &nbsp &nbsp &nbsp vetor[indice] = aux; <br/>    \n        &nbsp &nbsp } <br/>    \n         } \n</body> \n</html>");
        lblCodigo.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jpnCodigoLayout = new javax.swing.GroupLayout(jpnCodigo);
        jpnCodigo.setLayout(jpnCodigoLayout);
        jpnCodigoLayout.setHorizontalGroup(
            jpnCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnCodigoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        jpnCodigoLayout.setVerticalGroup(
            jpnCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCodigo)
                .addContainerGap())
        );

        lblInfo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInfo2.setText("Tam vetor:");

        spnDefinirTamVetor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        spnDefinirTamVetor.setModel(new javax.swing.SpinnerNumberModel(2, 2, 10, 1));
        spnDefinirTamVetor.setName(""); // NOI18N
        spnDefinirTamVetor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                definirTamanhoVetor(evt);
            }
        });

        btnIniciarAlgoritmo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIniciarAlgoritmo.setText("INICIAR !");
        btnIniciarAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarSolucao(evt);
            }
        });

        lblInfo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo3.setForeground(new java.awt.Color(0, 153, 153));
        lblInfo3.setText("ORDEM ORIGINAL: ");

        lblInfo4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo4.setForeground(new java.awt.Color(0, 0, 153));
        lblInfo4.setText("ORDEM CRESC: ");

        lblOriginal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOriginal.setForeground(new java.awt.Color(0, 153, 153));

        lblDecrescente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDecrescente.setForeground(new java.awt.Color(102, 0, 102));

        lblInfo5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo5.setForeground(new java.awt.Color(102, 0, 102));
        lblInfo5.setText("ORDEM DECRESC: ");

        lblCrescente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCrescente.setForeground(new java.awt.Color(0, 0, 153));

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("CÓDIGO FONTE (LINGUAGEM C)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblInfo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblInfo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblInfo5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDecrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnDefinirTamVetor, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                            .addComponent(btnIniciarAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spnDefinirTamVetor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnIniciarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jpnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDecrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void definirTamanhoVetor(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_definirTamanhoVetor
        try {
            this.setTamanho(Integer.parseInt(spnDefinirTamVetor.getValue().toString()));
        } catch (NullPointerException npe) {
            this.setTamanho(2);
        }
    }//GEN-LAST:event_definirTamanhoVetor

    private void executarSolucao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarSolucao
        this.setVetor(new int[this.getTamanho()]);
        String original = "", crescente = "", decrescente = "";
        for (int i = 0; i < this.getVetor().length; i++) {
            this.getVetor()[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Valor da posicao [" + (i + 1) + "]"));
        }
        for (int i = 0; i < this.getVetor().length; i++) {
            original = original + Integer.toString(this.getVetor()[i]) + "  ";
        }
        this.ordenar.metodoSelecao(this.getVetor(), this.getTamanho(), "crescente");
        for (int i = 0; i < this.getVetor().length; i++) {
            crescente = crescente + Integer.toString(this.getVetor()[i]) + "  ";
        }
        this.ordenar.metodoSelecao(this.getVetor(), this.getTamanho(), "decrescente");
        for (int i = 0; i < this.getVetor().length; i++) {
            decrescente = decrescente + Integer.toString(this.getVetor()[i]) + "  ";
        }
        lblInfo3.setVisible(true);
        lblInfo4.setVisible(true);
        lblInfo5.setVisible(true);
        lblOriginal.setText(original);
        lblCrescente.setText(crescente);
        lblDecrescente.setText(decrescente);
    }//GEN-LAST:event_executarSolucao
    
    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int[] getVetor() {
        return vetor;
    }

    public void setVetor(int[] vetor) {
        this.vetor = vetor;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciarAlgoritmo;
    private javax.swing.JPanel jpnCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCrescente;
    private javax.swing.JLabel lblDecrescente;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblInfo4;
    private javax.swing.JLabel lblInfo5;
    private javax.swing.JLabel lblOriginal;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JSpinner spnDefinirTamVetor;
    // End of variables declaration//GEN-END:variables

}

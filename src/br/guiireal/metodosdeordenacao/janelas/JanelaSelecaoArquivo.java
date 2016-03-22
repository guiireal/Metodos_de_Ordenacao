package br.guiireal.metodosdeordenacao.janelas;

import br.guiireal.metodosdeordenacao.aplicacao.MetodosOrdenacao;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 * JANELA DO MÉTODO SELECAO VIA ARQUIVO (LÓGICA)
 * 
 * @author Guilherme
 */
public class JanelaSelecaoArquivo extends javax.swing.JFrame {

    /*
     * ATRIBUTOS
     */
    private final MetodosOrdenacao ordenar = new MetodosOrdenacao();
    private int tamanho;
    private int[] vetor;
    private String diretorioArquivo;
    private String linhaVetor;
    
    /**
     * CONSTRUTOR CRIA A JANELA
     */
    public JanelaSelecaoArquivo() {
        initComponents();
        lblStatus.setVisible(false);
        lblInfo2.setVisible(false);
        lblInfo3.setVisible(false);
        lblInfo4.setVisible(false);
    }

    /**
     * CÓDIGO GERADO AUTOMATICAMENTE (COMPONENTES DA JANELA)
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtDiretorio = new javax.swing.JTextField();
        lblInfo = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        jpnResultados = new javax.swing.JPanel();
        lblInfo2 = new javax.swing.JLabel();
        lblInfo3 = new javax.swing.JLabel();
        lblInfo4 = new javax.swing.JLabel();
        lblOriginal = new javax.swing.JLabel();
        lblCrescente = new javax.swing.JLabel();
        lblDecrescente = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnAjuda = new javax.swing.JButton();
        btnGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Métodos de Ordenação");
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 102, 0));
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("MÉTODO SELEÇÃO VIA ARQUIVO");

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblInfo.setText("Insira o caminho do arquivo absoluto: ");

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(51, 204, 0));
        lblStatus.setText("OK");

        lblInfo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo2.setForeground(new java.awt.Color(0, 153, 153));
        lblInfo2.setText("ORDEM ORIGINAL:");

        lblInfo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo3.setForeground(new java.awt.Color(0, 0, 153));
        lblInfo3.setText("ORDEM CRESC:");

        lblInfo4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo4.setForeground(new java.awt.Color(102, 0, 102));
        lblInfo4.setText("ORDEM DESCRESC:");

        lblOriginal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblOriginal.setForeground(new java.awt.Color(0, 153, 153));

        lblCrescente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCrescente.setForeground(new java.awt.Color(0, 0, 153));

        lblDecrescente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDecrescente.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jpnResultadosLayout = new javax.swing.GroupLayout(jpnResultados);
        jpnResultados.setLayout(jpnResultadosLayout);
        jpnResultadosLayout.setHorizontalGroup(
            jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnResultadosLayout.createSequentialGroup()
                        .addComponent(lblInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnResultadosLayout.createSequentialGroup()
                        .addComponent(lblInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpnResultadosLayout.createSequentialGroup()
                        .addComponent(lblInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDecrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpnResultadosLayout.setVerticalGroup(
            jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInfo2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCrescente, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInfo4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDecrescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLimpar.setText("LIMPAR");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpar(evt);
            }
        });

        btnAjuda.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAjuda.setForeground(new java.awt.Color(0, 0, 153));
        btnAjuda.setText("?");
        btnAjuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajuda(evt);
            }
        });

        btnGerar.setText("GERAR !");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executarSolucao(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStatus)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnGerar)
                                .addGap(18, 18, 18)
                                .addComponent(btnLimpar)
                                .addGap(47, 47, 47)
                                .addComponent(btnAjuda))
                            .addComponent(txtDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(50, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblInfo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAjuda)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void executarSolucao(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executarSolucao
        this.configurarDiretorio(txtDiretorio.getText());
        this.tratarArquivo(this.recuperarDiretorio());
        this.converter(this.linhaVetor);
        String original = "", crescente = "", decrescente = "";
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
        lblInfo2.setVisible(true);
        lblInfo3.setVisible(true);
        lblInfo4.setVisible(true);
        lblOriginal.setText(original);
        lblCrescente.setText(crescente);
        lblDecrescente.setText(decrescente);
    }//GEN-LAST:event_executarSolucao

    private void ajuda(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajuda
        JOptionPane.showMessageDialog(null, "Insira o diretório (caminho absoluto) do seu \n"
                + "arquivo de texto e em seguida clique em \"GERAR !\"", "Ajuda", JOptionPane.QUESTION_MESSAGE);
    }//GEN-LAST:event_ajuda

    private void limpar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpar
        txtDiretorio.setText(null);
    }//GEN-LAST:event_limpar
    
    private void configurarDiretorio(String diretorio) {
        this.diretorioArquivo = diretorio;
    }
    
    private String recuperarDiretorio() {
        return this.diretorioArquivo;
    }
    
    private void tratarArquivo(String diretorio) {
        boolean ok = true;
        try {
            FileReader arquivo = new FileReader(diretorio);
            BufferedReader leitor = new BufferedReader(arquivo);
            this.linhaVetor = leitor.readLine();
            leitor.close();
            arquivo.close();
        } catch (FileNotFoundException ex) {
            ok = false;
            this.modificarStatus("ERRO");
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            ok = false;
            this.modificarStatus("ERRO");
            JOptionPane.showMessageDialog(null, "Erro desconhecido", "Erro", JOptionPane.ERROR_MESSAGE);       
        }
        if (ok) {
            this.modificarStatus("OK");
        }
    }
    
    private void converter(String texto) {
        int indice = 0;
        String[] arrayDeStringsNumericas = texto.split(" ");
        this.setVetor(new int[arrayDeStringsNumericas.length]);
        this.setTamanho(this.getVetor().length);
        for (String numero : arrayDeStringsNumericas) {
            this.getVetor()[indice] = Integer.parseInt(numero);
            indice++;
        }
    }
      
    private void modificarStatus(String tipo) {
        switch (tipo) {
            case "OK":
                lblStatus.setVisible(true);
                lblStatus.setText("OK");
                lblStatus.setForeground(new java.awt.Color(51, 204, 0));
                break;
            case "ERRO":
                lblStatus.setVisible(true);
                lblStatus.setText("ERRO");
                lblStatus.setForeground(new java.awt.Color(255, 0, 0));
                break;
        } // FIM DO SWITCH
    }
    
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
    private javax.swing.JButton btnAjuda;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JPanel jpnResultados;
    private javax.swing.JLabel lblCrescente;
    private javax.swing.JLabel lblDecrescente;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblInfo2;
    private javax.swing.JLabel lblInfo3;
    private javax.swing.JLabel lblInfo4;
    private javax.swing.JLabel lblOriginal;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtDiretorio;
    // End of variables declaration//GEN-END:variables

}

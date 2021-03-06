/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package buscacep;
import java.awt.Toolkit;
import java.net.URL;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
/**
 *
 * @author cassi
 */
public class TelaBuscaCep extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public TelaBuscaCep() {
        initComponents();
        setIcon();
        jtxBairro.setEditable(false);
        jtxCidade.setEditable(false);
        jtxEndereco.setEditable(false);
        jcbUf.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbCep = new javax.swing.JLabel();
        jtxCep = new javax.swing.JTextField();
        jlbEndereco = new javax.swing.JLabel();
        jtxEndereco = new javax.swing.JTextField();
        jlbBairro = new javax.swing.JLabel();
        jtxBairro = new javax.swing.JTextField();
        jtxCidade = new javax.swing.JTextField();
        jlbCidade = new javax.swing.JLabel();
        jlbUf = new javax.swing.JLabel();
        jcbUf = new javax.swing.JComboBox<>();
        jbLimpar = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbSobre = new javax.swing.JButton();
        jlbOk = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscador de CEP");
        setBackground(java.awt.SystemColor.control);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jlbCep.setText("CEP :");

        jtxCep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCepActionPerformed(evt);
            }
        });
        jtxCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxCepKeyTyped(evt);
            }
        });

        jlbEndereco.setText("Endere??o :");

        jtxEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxEnderecoActionPerformed(evt);
            }
        });

        jlbBairro.setText("Bairro :");

        jtxBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxBairroActionPerformed(evt);
            }
        });

        jtxCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxCidadeActionPerformed(evt);
            }
        });

        jlbCidade.setText("Cidade :");

        jlbUf.setText("UF :");

        jcbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));
        jcbUf.setSelectedItem(".");
        jcbUf.setToolTipText("");
        jcbUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbUfActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbSobre.setBackground(java.awt.SystemColor.control);
        jbSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sobre.png"))); // NOI18N
        jbSobre.setToolTipText("Sobre");
        jbSobre.setBorder(null);
        jbSobre.setBorderPainted(false);
        jbSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSobreActionPerformed(evt);
            }
        });

        jlbOk.setForeground(new java.awt.Color(51, 255, 51));
        jlbOk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbOk.setToolTipText("");
        jlbOk.setPreferredSize(new java.awt.Dimension(29, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jlbCep)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlbBairro)
                            .addComponent(jlbCidade))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtxCep, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlbOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlbUf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSobre)
                        .addGap(28, 28, 28))
                    .addComponent(jtxEndereco)
                    .addComponent(jtxBairro)
                    .addComponent(jtxCidade))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jbLimpar)
                .addGap(80, 80, 80)
                .addComponent(jbPesquisar)
                .addContainerGap(178, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbCep)
                    .addComponent(jtxCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUf)
                    .addComponent(jcbUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSobre)
                    .addComponent(jlbOk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbEndereco)
                    .addComponent(jtxEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbBairro))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbCidade))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpar)
                    .addComponent(jbPesquisar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxEnderecoActionPerformed

    private void jtxBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxBairroActionPerformed

    private void jtxCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCidadeActionPerformed

    private void jcbUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbUfActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        jtxBairro.setText("");
        jtxCep.setText("");
        jtxCidade.setText("");
        jtxEndereco.setText("");
        jcbUf.setSelectedItem(".");
        jlbOk.setVisible(false);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        if(jtxCep.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Informe o Cep Corretamente.");
            jtxCep.requestFocus();
        }else{
            buscarCep();
        }
        
            
    }//GEN-LAST:event_jbPesquisarActionPerformed

    private void jtxCepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxCepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxCepActionPerformed

    private void jtxCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxCepKeyTyped
        char c = evt.getKeyChar();
        boolean max = jtxCep.getText().length() < 8;
        if((Character.isDigit(c)) && max){
        } else {
            evt.consume();
        }
        //Filtro de leitura de n??meros e tamanho de 8 digitos.
    }//GEN-LAST:event_jtxCepKeyTyped

    private void jbSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSobreActionPerformed
        Sobre sobre = new Sobre();
        sobre.setModal(true);
        sobre.setVisible(true);
        
    }//GEN-LAST:event_jbSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBuscaCep.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaBuscaCep().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSobre;
    private javax.swing.JComboBox<String> jcbUf;
    private javax.swing.JLabel jlbBairro;
    private javax.swing.JLabel jlbCep;
    private javax.swing.JLabel jlbCidade;
    private javax.swing.JLabel jlbEndereco;
    private javax.swing.JLabel jlbOk;
    private javax.swing.JLabel jlbUf;
    private javax.swing.JTextField jtxBairro;
    private javax.swing.JTextField jtxCep;
    private javax.swing.JTextField jtxCidade;
    private javax.swing.JTextField jtxEndereco;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/iconeendereco.png")));
        
    }
    
    private void buscarCep(){
        String logradouro = "";
        String tipoLogradouro = "";
        String resultado = null;
        String cep = jtxCep.getText();
        
        try{
            URL url = new URL("http://cep.republicavirtual.com.br/web_cep.php?cep=" + cep + "&formato=xml");
            //Classe modelo para cria????o de vari??veis xml
            SAXReader xml = new SAXReader();
            //Captura os dados do xml e atribui ao documento
            Document documento = xml.read(url);
            //Apoio para fazer a varredura do documento
            Element root = documento.getRootElement();
            for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
                Element element = it.next();
                if(element.getQualifiedName().equals("cidade")){
                    jtxCidade.setText(element.getText());
                }
                if(element.getQualifiedName().equals("cidade")){
                    jtxCidade.setText(element.getText());
                }
                if(element.getQualifiedName().equals("bairro")){
                    jtxBairro.setText(element.getText());
                }
                if(element.getQualifiedName().equals("uf")){
                    jcbUf.setSelectedItem(element.getText());
                }
                if(element.getQualifiedName().equals("tipo_logradouro")){
                    tipoLogradouro = element.getText();
                }
                if(element.getQualifiedName().equals("logradouro")){
                   logradouro = element.getText();
                }
                if(element.getQualifiedName().equals("resultado")){
                   resultado = element.getText();
                   if(resultado.equals("1") || resultado.equals("2")){
                       jlbOk.setVisible(true);
                       jlbOk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checked.png")));
                       
                   }else {
                       JOptionPane.showMessageDialog(null, "CEP Inv??lido");
                       jtxCep.setText("");
                       jlbOk.setVisible(false);
                   }
                }
            }
            jtxEndereco.setText(tipoLogradouro + " " + logradouro);

        }catch (Exception e){
            System.out.println(e);
        }
        
    }
    
    
    
}

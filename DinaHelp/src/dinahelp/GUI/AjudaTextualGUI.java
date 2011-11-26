package dinahelp.GUI;

import dinahelp.negocio.AjudaTextualNegocio;
import dinahelp.pojo.AjudaTextual;
import dinahelp.util.Validador;
import javax.swing.JOptionPane;

/**
 * @author Guilherme Taffarel Bergamin
 * @author Akanbi Strossi de Jesus
 * @author Felipe Bochehin
 */
public class AjudaTextualGUI extends javax.swing.JFrame {

	private String caminho;
	private static final long serialVersionUID = 1L;

	/** Creates new form AjudaTextualGUI */
	public AjudaTextualGUI() {
		initComponents();
		caminho = InicialGUI.aProjetos.getCaminho();
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaEditTexto = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnSalva = new javax.swing.JButton();
        txfTitulo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnSalvaSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda Textual");

        txaEditTexto.setColumns(20);
        txaEditTexto.setRows(5);
        jScrollPane1.setViewportView(txaEditTexto);

        jLabel1.setText("Titulo: ");

        btnSalva.setText("Salvar");
        btnSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvaSair.setText("Salvar e Sair");
        btnSalvaSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvaSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalvaSair, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(txfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalva)
                    .addComponent(btnSalvaSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
		dispose();
	}//GEN-LAST:event_btnCancelarActionPerformed

        private void btnSalvaSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvaSairActionPerformed
			// VER COMO FAZER PARA ELE NÃO ESCREVER POR CIMA CASO ESTIVER ABRINDO UM NOVO COM O MESMO NOME
			if (Validador.caminhoValido(txfTitulo.getText())) {
				if(!Validador.caminhoExistente(InicialGUI.aProjetos.getCaminho()+"\\"+txfTitulo.getText() + ".doc"))
					InicialGUI.aProjetos.addFilho(txfTitulo.getText() + ".doc");AjudaTextualNegocio gravaAjudaTextual = new AjudaTextualNegocio();
				AjudaTextual ajudaTextual = new AjudaTextual();
				ajudaTextual.setNomeAjuda(txfTitulo.getText() + ".doc");
				ajudaTextual.setTexto(txaEditTexto.getText());
				//Pegar o getNome() da funcionalidade para passar o caminho
				gravaAjudaTextual.geraArquivoAjudaTextual(caminho, ajudaTextual.getNomeAjuda(), ajudaTextual.getTexto());
				dispose();
			}
        }//GEN-LAST:event_btnSalvaSairActionPerformed

	private void btnSalvaActionPerformed(java.awt.event.ActionEvent evt) {
		if(txfTitulo.getText().isEmpty()){
			JOptionPane.showMessageDialog(null, "O nome do arquivo deve ser preenchido");
		}else{
			if (Validador.caminhoValido(txfTitulo.getText())) {
				if(!Validador.caminhoExistente(InicialGUI.aProjetos.getCaminho()+"\\"+txfTitulo.getText() + ".doc"))
					InicialGUI.aProjetos.addFilho(txfTitulo.getText() + ".doc");
				AjudaTextualNegocio gravaAjudaTextual = new AjudaTextualNegocio();
				AjudaTextual ajudaTextual = new AjudaTextual();
				ajudaTextual.setNomeAjuda(txfTitulo.getText() + ".doc");
				ajudaTextual.setTexto(txaEditTexto.getText());
				//Pegar o getNome() da funcionalidade para passar o caminho
				gravaAjudaTextual.geraArquivoAjudaTextual(caminho, ajudaTextual.getNomeAjuda(), ajudaTextual.getTexto());
			}
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new AjudaTextualGUI().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalva;
    private javax.swing.JButton btnSalvaSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea txaEditTexto;
    public static javax.swing.JTextField txfTitulo;
    // End of variables declaration//GEN-END:variables
}

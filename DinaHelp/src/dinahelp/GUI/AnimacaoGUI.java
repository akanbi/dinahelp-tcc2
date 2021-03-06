package dinahelp.GUI;

import dinahelp.negocio.AnimacaoNegocio;
import dinahelp.util.Validador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/**
 * @author Guilherme Taffarel Bergamin
 * @author Akanbi Strossi de Jesus
 * @author Felipe Bochehin
 */
public class AnimacaoGUI extends javax.swing.JFrame implements ActionListener {

	/** Comandos dos botões */
	private static String COMANDO_GERAR = "COMANDO_GERAR";
	private static String COMANDO_CANCELAR = "COMANDO_CANCELAR";
	public static AnimacaoNegocio animacao = new AnimacaoNegocio();

	/** Construtor */
	public AnimacaoGUI() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfDiretorio = new javax.swing.JTextField();
        bGerar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gerar Animação");

        jLabel1.setText("Diretório:");

        bGerar.setText("Gerar");
        bGerar.setActionCommand(COMANDO_GERAR);
        bGerar.addActionListener(this);

        bCancelar.setText("Cancelar");
        bCancelar.setActionCommand(COMANDO_CANCELAR);
        bCancelar.addActionListener(this);

        jLabel2.setText("Nome:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfDiretorio, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bGerar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfDiretorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGerar)
                    .addComponent(bCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bGerar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfDiretorio;
    public static javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables

	/** Execução dos comandos dos botões */
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (COMANDO_GERAR.equals(comando)) {
			if (tfDiretorio.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Deve-se informar o diretório origem das imagens");
			} else if (tfNome.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Deve-se informar o nome do arquivo");
			} else if (Validador.caminhoExistente(InicialGUI.aProjetos.getCaminho() + "\\" + tfNome.getText() + ".gif")) {
				JOptionPane.showMessageDialog(null, "Arquivo já existente");
			} else if (!Validador.caminhoExistente(tfDiretorio.getText())) {
				JOptionPane.showMessageDialog(null, "Diretório inexistente");
			} else if (Validador.nomeValido(tfNome.getText())) {
				try {
					File[] imagensFile = new File(tfDiretorio.getText()).listFiles();
					BufferedImage[] imagensBuffered = new BufferedImage[imagensFile.length];
					for (int i = 0; i <= imagensFile.length - 1; i++) {
						imagensBuffered[i] = ImageIO.read(imagensFile[i]);
					}
					animacao.imagensParaGIF(imagensBuffered, new File(InicialGUI.aProjetos.getCaminho() + "\\" + tfNome.getText() + ".gif"));
					DinaHelp.inicial.setEnabled(true);
					dispose();
					ConfirmaArquivoGUI confirmaAnimacao = new ConfirmaArquivoGUI("ANIMACAO");
					confirmaAnimacao.setVisible(true);
				} catch (IOException ex) {
					Logger.getLogger(AnimacaoGUI.class.getName()).log(Level.SEVERE, null, ex);
				}
			}
		} else if (COMANDO_CANCELAR.equals(comando)) {
			DinaHelp.inicial.setEnabled(true);
			dispose();
		}
	}
}

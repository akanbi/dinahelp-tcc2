package dinahelp.GUI;

import com.sun.awt.AWTUtilities;
import dinahelp.util.Arvore;
import dinahelp.util.Config;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 * @author Guilherme Taffarel Bergamin
 * @author Akanbi Strossi de Jesus
 * @author Felipe Bochehin
 */
@SuppressWarnings("serial")
public class InicialGUI extends javax.swing.JFrame implements ActionListener {

	private static String COMANDO_ADD = "COMANDO_ADD";
	private static String COMANDO_REMOVE = "COMANDO_REMOVE";
	private static String COMANDO_TEXTO = "COMANDO_TEXTO";
	private static String COMANDO_SCREENSHOT = "COMANDO_SCREENSHOT";
	private static String COMANDO_VIDEO = "COMANDO_VIDEO";
	private static String COMANDO_ANIMACAO = "COMANDO_ANIMACAO";
	private static String COMANDO_AUDIO = "COMANDO_AUDIO";
	private static String COMANDO_ABRIR = "COMANDO_ABRIR";
	public static Config config = new Config("C:\\TESTE"); // Criar um arquivo de configuração e ler.

	/** Cria um novo form InicialGUI */
	public InicialGUI() {
		initComponents();
	}

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lFerramentas = new javax.swing.JLabel();
        bTexto = new javax.swing.JButton();
        bScreenShot = new javax.swing.JButton();
        bVideo = new javax.swing.JButton();
        bAnimacao = new javax.swing.JButton();
        bAudio = new javax.swing.JButton();
        lProjetos = new javax.swing.JLabel();
        sProjetos = new javax.swing.JSeparator();
        bSelFuncionalidade = new javax.swing.JButton();
        bAddFunc = new javax.swing.JButton();
        bRemFunc = new javax.swing.JButton();
        aProjetos = new Arvore();
        spProjetos = new javax.swing.JScrollPane();
        mbInicial = new javax.swing.JMenuBar();
        mInicialArquivo = new javax.swing.JMenu();
        miNovoProjeto = new javax.swing.JMenuItem();
        mInicialAjuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DinaHelp");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);

        lFerramentas.setText("Ferramentas:");

        bTexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinahelp/util/imagens/texto.png"))); // NOI18N
        bTexto.setToolTipText("Abre editor de texto");
        bTexto.setActionCommand("COMANDO_TEXTO");
        bTexto.addActionListener(this);

        bScreenShot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinahelp/util/imagens/screenshot.png"))); // NOI18N
        bScreenShot.setToolTipText("Abre tela para seleção de área para captura de tela");
        bScreenShot.setActionCommand(COMANDO_SCREENSHOT);
        bScreenShot.addActionListener(this);

        bVideo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinahelp/util/imagens/video.png"))); // NOI18N
        bVideo.setToolTipText("Abre gravador de vídeo da tela");
        bVideo.setActionCommand(COMANDO_VIDEO);
        bVideo.addActionListener(this);

        bAnimacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinahelp/util/imagens/animacao.png"))); // NOI18N
        bAnimacao.setToolTipText("Abre editor de animação");
        bAnimacao.setActionCommand(COMANDO_ANIMACAO);
        bAnimacao.addActionListener(this);

        bAudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dinahelp/util/imagens/audio.png"))); // NOI18N
        bAudio.setToolTipText("Abre gravador de áudio");
        bAudio.setActionCommand(COMANDO_AUDIO);
        bAudio.addActionListener(this);

        lProjetos.setText("Projetos");

        bSelFuncionalidade.setText("Abrir");
        bSelFuncionalidade.setActionCommand("COMANDO_ABRIR");
        bSelFuncionalidade.addActionListener(this);

        bAddFunc.setText("+");
        bAddFunc.setToolTipText("Adiciona item na estrutura de projetos");
        bAddFunc.setActionCommand("COMANDO_ADD");
        bAddFunc.addActionListener(this);

        bRemFunc.setText("-");
        bRemFunc.setToolTipText("Remove item na estrutura de projetos");
        bRemFunc.setActionCommand("COMANDO_REMOVE");
        bRemFunc.addActionListener(this);

        spProjetos.setViewportView(aProjetos);
        spProjetos.setAlignmentX(LEFT_ALIGNMENT);
        spProjetos.setEnabled(false);

        mInicialArquivo.setText("Arquivo");

        miNovoProjeto.setText("Novo Projeto");
        miNovoProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNovoProjetoActionPerformed(evt);
            }
        });
        mInicialArquivo.add(miNovoProjeto);

        mbInicial.add(mInicialArquivo);

        mInicialAjuda.setText("Ajuda");
        mbInicial.add(mInicialAjuda);

        setJMenuBar(mbInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bScreenShot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bAnimacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(bAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lFerramentas)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lProjetos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAddFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bRemFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(bSelFuncionalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lFerramentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bScreenShot, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bVideo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAnimacao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAudio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lProjetos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(sProjetos, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spProjetos, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAddFunc)
                    .addComponent(bRemFunc)
                    .addComponent(bSelFuncionalidade))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

	private void miNovoProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNovoProjetoActionPerformed
		// verificar se o projeto já existe (ver as pastas já criadas)
		NovoProjetoGUI np = new NovoProjetoGUI();
		np.setVisible(true);

	}//GEN-LAST:event_miNovoProjetoActionPerformed

	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new InicialGUI().setVisible(true);
			}
		});
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAddFunc;
    private javax.swing.JButton bAnimacao;
    private javax.swing.JButton bAudio;
    private javax.swing.JButton bRemFunc;
    private javax.swing.JButton bScreenShot;
    private javax.swing.JButton bSelFuncionalidade;
    private javax.swing.JButton bTexto;
    private javax.swing.JButton bVideo;
    private javax.swing.JLabel lFerramentas;
    private javax.swing.JLabel lProjetos;
    private javax.swing.JMenu mInicialAjuda;
    private javax.swing.JMenu mInicialArquivo;
    private javax.swing.JMenuBar mbInicial;
    private javax.swing.JMenuItem miNovoProjeto;
    private javax.swing.JSeparator sProjetos;
    public static Arvore aProjetos;
    private javax.swing.JScrollPane spProjetos;
    // End of variables declaration//GEN-END:variables

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (COMANDO_ADD.equals(comando)) {
			if (!aProjetos.getCaminho().contains(".")) {
				NovaFuncionalidadeGUI nf = new NovaFuncionalidadeGUI();
				nf.setVisible(true);
			}
		} else if (COMANDO_REMOVE.equals(comando)) {
			aProjetos.removeNodo();
		} else if (COMANDO_TEXTO.equals(comando)) {
			if (!aProjetos.getCaminho().contains(".")) {
				AjudaTextualGUI tat = new AjudaTextualGUI();
				tat.setVisible(true);
			}
		} else if (COMANDO_SCREENSHOT.equals(comando)) {
			if (!aProjetos.getCaminho().contains(".")) {
				setExtendedState(JFrame.ICONIFIED);
				CapturaTelaGUI tsc = new CapturaTelaGUI('I');
				tsc.setExtendedState(MAXIMIZED_BOTH);
				AWTUtilities.setWindowOpacity(tsc, 0.5f);
				tsc.setVisible(true);
			}
		} else if (COMANDO_VIDEO.equals(comando)) {
			if (!aProjetos.getCaminho().contains(".")) {
				VideoGUI gv = new VideoGUI();
				gv.setVisible(true);
			}
		} else if (COMANDO_ANIMACAO.equals(comando)) {
			if (!aProjetos.getCaminho().contains(".")) {
				// TODO animação
			}
		} else if (COMANDO_AUDIO.equals(comando)) {
			if (!aProjetos.getCaminho().contains(".")) {
				// TODO áudio
			}
		} else if (COMANDO_ABRIR.equals(comando)) {
			try {
				Desktop desktop = Desktop.getDesktop();
				desktop.open(new File(aProjetos.getCaminho()));
			} catch (IOException ex) {
				Logger.getLogger(InicialGUI.class.getName()).log(Level.SEVERE, null, ex);
			}
			repaint();
		}
	}
}
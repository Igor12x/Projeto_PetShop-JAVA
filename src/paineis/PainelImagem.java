package paineis;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelImagem extends JPanel {
	private JLabel jlImagem;
	private ImageIcon imagem;
	public PainelImagem() {
		super();
		setSize(600, 500);// largura e altura
		setLayout(null);
		setBackground(Color.GRAY);
		iniciarComponentes();
		criarEventos();
	
	}
	private void iniciarComponentes() {
	imagem = new ImageIcon(getClass().getResource(""));
	jlImagem = new JLabel(imagem);
	
	add(jlImagem);
	
	jlImagem.setBounds(0, 0, 600, 500);
	}
	private void criarEventos() {
		// TODO Auto-generated method stub
		
	}
	
	
}

package paineis;



import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.util.List;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



import classe.Cliente;



public class PainelPesquisa extends JPanel {
	
	private JLabel jlPesuisa, jlNomeCliente, jlimagem;
	private JTextField jtfNomeCliente;
	private JButton jbPesuisar;
	private ImageIcon imagem;
	private JTextArea jtaMostrar;
	private JScrollPane jspMostrar;
	private List<Cliente> clientes;
	//Construtor

	public PainelPesquisa(List<Cliente> clientes) {
		this.clientes = clientes;
		setSize(600,500);// largura e altura
		setLayout(null);
		setBackground(Color.LIGHT_GRAY);
		iniciarComponentes();
		criarEventos();
	}
	private void iniciarComponentes() {
		//objetos
		Font titulo = new Font("Arial", Font.CENTER_BASELINE, 28);	
		Font nome = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18);
		imagem = new ImageIcon(getClass().getResource("/imagem/imagem3.png"));
		jlimagem = new JLabel(imagem);
		jlPesuisa = new JLabel("PESQUISA");
		jlPesuisa.setFont(titulo);
		jlNomeCliente = new JLabel("Nome do cliente");
		jlNomeCliente.setFont(nome);
		jtfNomeCliente = new JTextField();
		jbPesuisar = new JButton("Pesquisar");
		jbPesuisar.setFont(nome);
		jspMostrar = new JScrollPane(jtaMostrar);
		jtaMostrar = new JTextArea();
		jtaMostrar.setEditable(false);
		
		//adicionar o objeto a tela
		add(jlPesuisa);
		add(jlNomeCliente);
		add(jtfNomeCliente);
		add(jbPesuisar);
		add(jspMostrar);
		add(jlimagem);
		
		//dimencionar
		jlimagem.setBounds(400, 20, 100, 100);
		jlPesuisa.setBounds(140, 40, 250, 25);
		jlNomeCliente.setBounds(10, 120, 150, 25);
		jtfNomeCliente.setBounds(10, 145, 300, 25);
		jbPesuisar.setBounds(360, 145, 140, 50);
		jspMostrar.setBounds(10, 200, 540, 230);


	}





	private void criarEventos() {
		// TODO Auto-generated method stub



	}



}
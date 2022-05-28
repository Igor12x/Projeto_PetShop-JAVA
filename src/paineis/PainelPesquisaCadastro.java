package paineis;



import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;



import classe.Cliente;



public class PainelPesquisaCadastro extends JPanel {
	
	private JLabel jlPesuisa, jlNomeCliente, jlimagem;
	private JTextField jtfNomeCliente;
	private JButton jbPesquisa;
	private ImageIcon imagem;
	private JTextArea jtaMostrar;
	private JScrollPane jspMostrar;
	private List<Cliente> clientes = new ArrayList<>();
	
	public PainelPesquisaCadastro(List<Cliente> clientes) {
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
		jlPesuisa = new JLabel("PESQUISA CADASTRO");
		jlPesuisa.setFont(titulo);
		jlNomeCliente = new JLabel("Nome do cliente");
		jlNomeCliente.setFont(nome);
		jtfNomeCliente = new JTextField();
		jbPesquisa = new JButton("Pesquisar");
		jbPesquisa.setFont(nome);
		jbPesquisa.setForeground(Color.BLUE);
		jtaMostrar = new JTextArea();
		jtaMostrar.setEditable(false);
		jspMostrar = new JScrollPane(jtaMostrar);
		
		
		//adicionar o objeto a tela
		add(jlPesuisa);
		add(jlNomeCliente);
		add(jtfNomeCliente);
		add(jbPesquisa);
		add(jspMostrar);
		add(jlimagem);
		
		//dimencionar
		jlimagem.setBounds(400, 20, 100, 100);
		jlPesuisa.setBounds(60, 40, 350, 30);
		jlNomeCliente.setBounds(10, 120, 150, 25);
		jtfNomeCliente.setBounds(10, 145, 300, 25);
		jbPesquisa.setBounds(360, 145, 140, 50);
		jspMostrar.setBounds(10, 200, 540, 230);


	}





	private void criarEventos() {
		jbPesquisa.addActionListener(new ActionListener() {



			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("\t************CLIENTE**************\n");
				boolean achou = false;
				String nomeCliente = jtfNomeCliente.getText();
				for (Cliente cliente : clientes) {

					if (cliente.getNomeCliente().equalsIgnoreCase(nomeCliente)) {
						jtaMostrar.append(cliente.mostrarDados());
						achou=true;
						break;
					}
					jtfNomeCliente.setText("");
					if (!achou) {
						JOptionPane.showMessageDialog(null, "Cliente não encontrado", "IMPÉRIO 4 PATAS", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
	}
}
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
import classe.Servicos;



public class PainelPesquisaServico extends JPanel {
	
	private JLabel jlPesuisa, jlNomeCliente, jlimagem, jlFundoImagem;
	private JTextField jtfNomeCliente;
	private JButton jbPesquisa;
	private ImageIcon imagem, fundoImagem;
	private JTextArea jtaMostrar;
	private JScrollPane jspMostrar;
	private List<Servicos> listaServicos = new ArrayList<>();;
	
	public PainelPesquisaServico(List<Servicos> listaServicos) {
		this.listaServicos = listaServicos;
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
		fundoImagem = new ImageIcon(getClass().getResource("/imagem/papelParede.png"));
        jlFundoImagem = new JLabel(fundoImagem);
		jlPesuisa = new JLabel("PESQUISA SERVIÇO");
		jlPesuisa.setFont(titulo);
		jlNomeCliente = new JLabel("Nome do cliente");
		jlNomeCliente.setFont(nome);
		jtfNomeCliente = new JTextField();
		jbPesquisa = new JButton("Pesquisar");
		jbPesquisa.setFont(nome);
		jbPesquisa.setBackground(Color.white);
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
		add(jlFundoImagem);
		jlFundoImagem.setBounds(0, 0, 600, 500);
		
		//dimencionar
		jlimagem.setBounds(400, 20, 100, 100);
		jlPesuisa.setBounds(60, 40, 300, 30);
		jlNomeCliente.setBounds(10, 120, 150, 25);
		jtfNomeCliente.setBounds(10, 145, 300, 25);
		jbPesquisa.setBounds(360, 145, 140, 50);
		jspMostrar.setBounds(10, 200, 540, 230);


	}





	private void criarEventos() {
		jbPesquisa.addActionListener(new ActionListener() {



			@Override
			public void actionPerformed(ActionEvent e) {
				jtaMostrar.setText("\t************SERVIÇOS**************\n");
				boolean achou = false;
				String nomeCliente = jtfNomeCliente.getText();
				for (Servicos listaServicos : listaServicos) {

					if (listaServicos.getNomeClienteServico().equalsIgnoreCase(nomeCliente)) {
						jtaMostrar.append(listaServicos.mostrarDados());
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
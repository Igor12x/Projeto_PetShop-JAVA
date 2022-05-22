package tela;





import java.awt.Color;
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;



import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;



import arquivo.EscreverLerArquivo;
import classe.Cliente;
import paineis.PainelCadastro;
import paineis.PainelPesquisa;
import paineis.PainelServicos;





public class TelaPetShop extends JFrame {
	private JMenuBar jmbBarra;
	private JMenu jmArquivo, jmCadastro,jmPesquisa;
	private JMenuItem jmiSair, jmiCadastro, jmiServicos, jmiPesquisa;
	private Container contentPane;
	private List<Cliente> clientes = new ArrayList<>();// matriz dinamica
	private EscreverLerArquivo arquivo = new EscreverLerArquivo();




	public TelaPetShop (String title) throws HeadlessException {
		super(title);
		setSize(600, 500);// largura e altura
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//inserir uma cor
		getContentPane().setBackground(Color.lightGray);
		iniciarComponentes();
		criarEventos();
		lerArquivo();
	}





	private void lerArquivo() {



	}




	// Objetos
	private void iniciarComponentes() {
		jmbBarra = new JMenuBar();
		setJMenuBar(jmbBarra);
		contentPane = getContentPane();// devolve um container uma tela
		jmArquivo = new JMenu("Arquivo");
		jmCadastro = new JMenu("Cadastro");
		jmPesquisa = new JMenu ("Pesquisa");
		jmiSair = new JMenuItem("Sair");
		jmiCadastro = new JMenuItem("Cadastro");
		jmiServicos = new JMenuItem ("Servi�os");
		jmiPesquisa = new JMenuItem ("Pesquisa");

		//adicionar o menu na barra
		jmbBarra.add(jmArquivo);
		jmbBarra.add(jmCadastro);
		jmbBarra.add(jmPesquisa);



		//MenuItem

		jmArquivo.add(jmiSair);
		jmCadastro.add(jmiCadastro);
		jmCadastro.add(jmiCadastro);
		jmCadastro.add(jmiServicos);
		jmPesquisa.add(jmiPesquisa);
	}




//helo word
	private void criarEventos() {

		//criar o evento do menu sair
		jmiSair.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Salvar arquivo", "Pet Shop", JOptionPane.YES_NO_OPTION);
				if (resposta == 0) {
					arquivo.EscreverArquivo(clientes);
				}





				System.exit(0);
			}
		});

		//evento do cadastro
		jmiCadastro.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				PainelCadastro cadastro = new PainelCadastro(clientes);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(cadastro);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});

		jmiServicos.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				PainelServicos servico = new PainelServicos(clientes);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(servico);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});
		jmiPesquisa.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPesquisa pesquisa = new PainelPesquisa(clientes);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(pesquisa);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});



	}
}
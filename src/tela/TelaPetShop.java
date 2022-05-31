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
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;



import arquivo.EscreverLerArquivo;
import classe.Cliente;
import classe.Servicos;
import paineis.PainelCadastro;
import paineis.PainelDeletar;
import paineis.PainelMostrar;
import paineis.PainelPesquisaCadastro;
import paineis.PainelPesquisaServico;
import paineis.PainelServicos;





public class TelaPetShop extends JFrame {
	private JLabel jlImagem, jlFundoImagem;
	private ImageIcon imagem, fundoImagem;
	private JMenuBar jmbBarra;
	private JMenu jmArquivo, jmCadastro,jmExibir;
	private JMenuItem jmiSair, jmiCadastro, jmiServicos, jmiPesquisaCadastro, jmiPesquisaServico, jmiDeletar, jmiMostrar;
	private Container contentPane;
	private List<Cliente> clientes = new ArrayList<>();// matriz dinamica
	private List<Servicos> listaServicos = new ArrayList<>();
	private EscreverLerArquivo arquivo = new EscreverLerArquivo();




	public TelaPetShop (String title) throws HeadlessException {
		super(title);
		setSize(600, 500);// largura e altura
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//inserir uma cor
		getContentPane().setBackground(Color.BLUE);
		iniciarComponentes();
		criarEventos();
	
		
	}

	// Objetos
	private void iniciarComponentes() {
		imagem = new ImageIcon(getClass().getResource("/imagem/ImagemFundo.png"));
        jlImagem = new JLabel(imagem);
		fundoImagem = new ImageIcon(getClass().getResource("/imagem/papelParede.png"));
        jlFundoImagem = new JLabel(fundoImagem);
		jmbBarra = new JMenuBar();
		setJMenuBar(jmbBarra);
		contentPane = getContentPane();// devolve um container uma tela
		jmArquivo = new JMenu("Arquivo");
		jmCadastro = new JMenu("Cadastro");
		jmExibir = new JMenu ("Exibir");
		jmiSair = new JMenuItem("Sair");
		jmiCadastro = new JMenuItem("Cadastro");
		jmiServicos = new JMenuItem ("Serviços");
		jmiPesquisaCadastro = new JMenuItem ("Pesquisa-Cadastro");
		jmiPesquisaServico = new JMenuItem("Pesquisa-Servico");
		jmiDeletar = new JMenuItem ("Deletar");
		jmiMostrar = new JMenuItem ("Mostrar");
		
		//adicionar o menu na barra
		jmbBarra.add(jmArquivo);
		jmbBarra.add(jmCadastro);
		jmbBarra.add(jmExibir);



		//MenuItem

		jmArquivo.add(jmiSair);
		jmCadastro.add(jmiCadastro);
		jmCadastro.add(jmiCadastro);
		jmCadastro.add(jmiServicos);
		jmExibir.add(jmiPesquisaCadastro);
		jmExibir.add(jmiPesquisaServico);
		jmExibir.add(jmiDeletar);
		jmExibir.add(jmiMostrar);

	
		add(jlImagem);
		add(jlFundoImagem);
		

		jlFundoImagem.setBounds(0, 0, 600, 500);
		jlImagem.setBounds(140, 75, 300, 200);
		
	}





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
				PainelServicos servicos = new PainelServicos(listaServicos);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(servicos);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});

		jmiPesquisaServico.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				PainelPesquisaServico pesquisaServico = new PainelPesquisaServico(listaServicos);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(pesquisaServico);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});

		jmiPesquisaCadastro.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				
				PainelPesquisaCadastro pesquisaCadastro = new PainelPesquisaCadastro(clientes);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(pesquisaCadastro);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});

		jmiDeletar.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				PainelDeletar deletar = new PainelDeletar(clientes);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(deletar);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});

		jmiMostrar.addActionListener(new ActionListener() {





			@Override
			public void actionPerformed(ActionEvent e) {
				PainelMostrar mostrar = new PainelMostrar(clientes);
				contentPane.removeAll();//removendo tudo da tela
				contentPane.add(mostrar);//adicionando o painel
				contentPane.validate();//validar os componentes
			}
		});
	}
}
package paineis;

import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import classe.Cliente;


public class PainelCadastro extends JPanel {
	private JLabel jlNomecliente, jlEndereco, jlBairro, jlCidade, jlCelular, jlTelefone,
	jlPet, jlPet2, jlPet3, jlPet4, jlRaca, jlRaca2, jlRaca3, jlRaca4, jlCadastro;
	private JTextField jtfNomecliente, jtfEndereco, jtfBairro, jtfCidade, jtfCelular, jtfTelefone,
	jtfPet, jtfPet2, jtfPet3, jtfPet4, jtfRaca, jtfRaca2, jtfRaca3, jtfRaca4;
	private JButton jbCadastrar;
	private ImageIcon imagem;
	private List<Cliente> clientes;
	
	public PainelCadastro(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
		setSize(600,500);// largura e altura
		setLayout(null);
		setBackground(Color.GRAY);
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		// Criar objetos
		
		Font titulo = new Font("Arial", Font.CENTER_BASELINE, 28);	
		Font nome = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 19);
		imagem = new ImageIcon(getClass().getResource(""));
		imagem = new ImageIcon();
		jlNomecliente = new JLabel("Nome Cliente");
		jlNomecliente.setFont(nome);
		jlEndereco = new JLabel("Endereço");
		jlEndereco.setFont(nome);
		jlBairro = new JLabel("Bairro");
		jlBairro.setFont(nome);
		jlCidade = new JLabel("Cidade");
		jlCidade.setFont(nome);
		jlCelular = new JLabel("Celular");
		jlCelular.setFont(nome);
		jlTelefone = new JLabel("Telefone");
		jlTelefone.setFont(nome);
		jlPet = new JLabel("Nome Pet");
		jlPet.setFont(nome);
		jlPet2 = new JLabel("Nome Pet");
		jlPet2.setFont(nome);
		jlPet3 = new JLabel("Nome Pet");
		jlPet3.setFont(nome);
		jlPet4 = new JLabel("Nome Pet");
		jlPet4.setFont(nome);
		jlRaca = new JLabel("Raça");
		jlRaca.setFont(nome);
		jlRaca2 = new JLabel("Raça");
		jlRaca2.setFont(nome);
		jlRaca3 = new JLabel("Raça");
		jlRaca3.setFont(nome);
		jlRaca4 = new JLabel("Raça");
		jlRaca4.setFont(nome);
		jlCadastro = new JLabel("Cadastro");
		jlCadastro.setFont(titulo);
		jtfNomecliente = new JTextField();
		jtfNomecliente.setSize(200, 20);
		jtfEndereco = new JTextField();
		jtfBairro = new JTextField();
		jtfCidade = new JTextField();
		jtfCelular = new JTextField();
		jtfTelefone = new JTextField();
		jtfPet = new JTextField();
		jtfPet2 = new JTextField();
		jtfPet3 = new JTextField();
		jtfPet4 = new JTextField();
		jtfRaca = new JTextField();
		jtfRaca2 = new JTextField();
		jtfRaca3 = new JTextField();
		jtfRaca4 = new JTextField();
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar.setFont(nome);
		
		//adicionar o objeto a tela
		
		add(jlNomecliente);
		add(jlEndereco);
		add(jlBairro);
		add(jlCidade);
		add(jlCelular);
		add(jlTelefone);
		add(jlPet);
		add(jlPet2);
		add(jlPet3);
		add(jlPet4);
		add(jlRaca);
		add(jlRaca2);
		add(jlRaca3);
		add(jlRaca4);
		add(jlCadastro);
		add(jtfNomecliente);
		add(jtfEndereco);
		add(jtfBairro);
		add(jtfCidade);
		add(jtfCelular);
		add(jtfTelefone);
		add(jtfPet);
		add(jtfPet2);
		add(jtfPet3);
		add(jtfPet4);
		add(jtfRaca);
		add(jtfRaca2);
		add(jtfRaca3);
		add(jtfRaca4);
		add(jbCadastrar);
		
		//dimencionar
		jlCadastro.setBounds(200, 40, 150, 30);
		jlNomecliente.setBounds(10, 120, 150, 25);
		jtfNomecliente.setBounds(10, 145, 300, 25);
		jlEndereco.setBounds(10, 170, 150, 30);
		jtfEndereco.setBounds(10, 200, 300, 25);
		jlBairro.setBounds(10, 225, 160, 25);
		jtfBairro.setBounds(10, 250, 145, 25);
		jlCidade.setBounds(170, 225, 160, 25);
		jtfCidade.setBounds(165, 250, 145, 25);
		jlCelular.setBounds(10, 280, 145, 25);
		jtfCelular.setBounds(10, 305, 145, 25);
		jlTelefone.setBounds(170, 280, 145, 25);
		jtfTelefone.setBounds(165, 305, 145, 25);
		jlPet.setBounds(320, 120, 150, 25);
		jtfPet.setBounds(320, 145, 100, 25);
		jlPet2.setBounds(320, 175, 150, 25);
		jtfPet2.setBounds(320, 200, 100, 25);
		jlPet3.setBounds(320, 225, 100, 25);
		jtfPet3.setBounds(320, 250, 100, 25);
		jlPet4.setBounds(320, 280, 100, 25);
		jtfPet4.setBounds(320, 305, 100, 25);
		jlRaca.setBounds(430, 120, 80, 25);
		jtfRaca.setBounds(430, 145, 80, 25);
		jlRaca2.setBounds(430, 175, 80, 25);
		jtfRaca2.setBounds(430, 200, 80, 25);
		jlRaca3.setBounds(430, 225, 80, 25);
		jtfRaca3.setBounds(430, 250, 80, 25);
		jlRaca4.setBounds(430, 280, 80, 25);
		jtfRaca4.setBounds(430, 305, 80, 25);
		jbCadastrar.setBounds(200, 350, 200, 50);
		
	}

	private void criarEventos() {
		// criar eventos
		
		
	}
	
	
	
}

package paineis;



import java.awt.Color;
import java.awt.Font;
import java.util.List;



import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;



import classe.Cliente;



public class PainelServicos extends JPanel {
	private JLabel jlServicos, jlformaPagamento;
	private JCheckBox jckBanho, jckTosaHigencia, jckTosaVerao, jckTosaTesoura, jckTosaRaca, jckTosaTotal, jckTrimming, jckCronogramaCapilar, jckHidratacao, jckRemocao, jckDesembolo, jckTaxi;
	private JRadioButton jrbDebito, jrbCredito, jrbPix, jrbDinheiro;
	private ImageIcon imagem;
	private JButton jbCadastrar;
	private ButtonGroup bgFormaPagamento;
	private List<Cliente> clientes;



	public PainelServicos(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
		setSize(400, 400);// largura e altura
		setLayout(null);
		setBackground(Color.CYAN);
		iniciarComponentes();
		criarEventos();
	}



	private void iniciarComponentes() {
		// Criar objetos
		Font titulo = new Font("Arial", Font.CENTER_BASELINE, 17);	
		Font nome = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18);
		Font titulo2 = new Font("Arial", Font.CENTER_BASELINE, 28);
		imagem = new ImageIcon(getClass().getResource(""));
		imagem = new ImageIcon();
		jlServicos = new JLabel("Tipo de Servi�os");
		jlServicos.setFont(titulo2);
		jlformaPagamento = new JLabel("Forma de pagamento");
		jlformaPagamento.setFont(titulo);
		jckBanho = new JCheckBox("Banho");
		jckBanho.setFont(nome);
		jckBanho.setOpaque(false);
		jckTosaHigencia = new JCheckBox("TosaHig�ncia");
		jckTosaHigencia.setFont(nome);
		jckTosaHigencia.setOpaque(false);
		jckTosaVerao = new JCheckBox("Tosa Ver�o");
		jckTosaVerao.setFont(nome);
		jckTosaVerao.setOpaque(false);
		jckTosaTesoura = new JCheckBox("Tosa Tesoura");
		jckTosaTesoura.setFont(nome);
		jckTosaTesoura.setOpaque(false);
		jckTosaRaca = new JCheckBox("Tosa Ra�a");
		jckTosaRaca.setFont(nome);
		jckTosaRaca.setOpaque(false);
		jckTosaTotal = new JCheckBox("Tosa Total");
		jckTosaTotal.setFont(nome);
		jckTosaTotal.setOpaque(false);
		jckTrimming = new JCheckBox("Trimming");
		jckTrimming.setFont(nome);
		jckTrimming.setOpaque(false);
		jckCronogramaCapilar = new JCheckBox("Cronograma Capilar");
		jckCronogramaCapilar.setFont(nome);
		jckCronogramaCapilar.setOpaque(false);
		jckHidratacao = new JCheckBox("Hidratação");
		jckHidratacao.setFont(nome);
		jckHidratacao.setOpaque(false);
		jckRemocao = new JCheckBox("Remoção de Sub pelo");
		jckRemocao.setFont(nome);
		jckRemocao.setOpaque(false);
		jckDesembolo = new JCheckBox("Desembolo");
		jckDesembolo.setFont(nome);
		jckDesembolo.setOpaque(false);
		jckTaxi = new JCheckBox("Taxi Dog");
		jckTaxi.setFont(nome);
		jckTaxi.setOpaque(false);
		jrbDebito = new JRadioButton("Debito");
		jrbDebito.setFont(nome);
		jrbDebito.setOpaque(false);
		jrbCredito = new JRadioButton("Credito");
		jrbCredito .setFont(nome);
		jrbCredito.setOpaque(false);
		jrbPix = new JRadioButton("Pix");
		jrbPix .setFont(nome);
		jrbPix.setOpaque(false);
		jrbDinheiro = new JRadioButton("Dinheiro");
		jrbDinheiro .setFont(nome);
		jrbDinheiro.setOpaque(false);
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar .setFont(nome);
		bgFormaPagamento = new ButtonGroup();
		
		
		//adicionar o objeto a tela
				add(jlServicos);
				add(jlformaPagamento);
				add(jckBanho);
				add(jckTosaHigencia);
				add(jckTosaVerao);
				add(jckTosaTesoura);
				add(jckTosaRaca);
				add(jckTosaTotal);
				add(jckTrimming);
				add(jckCronogramaCapilar);
				add(jckHidratacao);
				add(jckRemocao);
				add(jckDesembolo);
				add(jckTaxi);
				add(jrbDebito);
				add(jrbCredito);
				add(jrbPix);
				add(jrbDinheiro);
				add(jbCadastrar);
				//dimencionar
				
				jlServicos.setBounds(150, 40, 250, 25);
				jlformaPagamento.setBounds(400, 145, 180, 25);
				jckBanho.setBounds(10, 145, 150, 25);
				jckTosaHigencia.setBounds(10, 170, 170, 25);
				jckTosaVerao.setBounds(10, 195, 150, 25);
				jckTosaTesoura.setBounds(10, 220, 300, 25);
				jckTosaRaca.setBounds(10, 245, 160, 25);
				jckTosaTotal.setBounds(10, 270, 145, 25);
				jckTrimming.setBounds(190, 145, 160, 25);
				jckCronogramaCapilar.setBounds(190, 170, 250, 25);
				jckHidratacao.setBounds(190, 195, 145, 25);
				jckRemocao.setBounds(190, 220, 250, 25);
				jckDesembolo.setBounds(190, 245, 145, 25);
				jckTaxi.setBounds(190, 270, 145, 25);
				jrbDebito.setBounds(410, 195, 145, 25);
				jrbCredito.setBounds(410, 220, 145, 25);
				jrbPix.setBounds(410, 245, 145, 25);
				jrbDinheiro.setBounds(410, 270, 145, 25);
				jbCadastrar.setBounds(300, 350, 200, 50);

	}



	private void criarEventos() {
		
	}













}
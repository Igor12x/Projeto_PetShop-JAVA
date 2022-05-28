package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import classe.Cliente;
import classe.Servicos;

public class PainelServicos extends JPanel {
	private JLabel jlServicos, jlFormaPagamento, jlData, jlHorario, jlNomeClienteServico, jlTipoServico, jlimagem;
	private JTextField jtfData, jtfHorario, jtfNomeClienteServico, jtfTipoServico;
	private JRadioButton jrbDebito, jrbCredito, jrbPix, jrbDinheiro;
	private JTextArea jtaTipoServico;
	private JScrollPane jspTipoServico;
	private ImageIcon imagem;
	private JButton jbCadastrar;
	private ButtonGroup bgFormaPagamento;
	private List<Servicos> listaServico = new ArrayList<>();

	public PainelServicos(List<Servicos> listaServico) {
		super();
		this.listaServico = listaServico;
		setSize(400, 400);// largura e altura
		setLayout(null);
		setBackground(Color.lightGray);
		iniciarComponentes();
		criarEventos();
	}

	private void iniciarComponentes() {
		// Criar objetos
		Font titulo = new Font("Arial", Font.CENTER_BASELINE, 17);
		Font nome = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18);
		Font titulo2 = new Font("Arial", Font.CENTER_BASELINE, 28);
		imagem = new ImageIcon(getClass().getResource("/imagem/imagem3.png"));
		jlimagem = new JLabel(imagem);
		jlServicos = new JLabel("Serviços");
		jlServicos.setFont(titulo2);
		jlFormaPagamento = new JLabel("Forma de pagamento");
		jlFormaPagamento.setFont(titulo);
		jlNomeClienteServico = new JLabel("Nome do Cliente");
		jlNomeClienteServico.setFont(nome);
		jlData = new JLabel("Data");
		jlData.setFont(nome);
		jlHorario = new JLabel("Horário");
		jlHorario.setFont(nome);
		jlTipoServico = new JLabel("Tipo do serviço");
		jlTipoServico.setFont(nome);
		jtfTipoServico = new JTextField();
		jtfHorario = new JTextField();
		jtfData = new JTextField();
		jtfNomeClienteServico = new JTextField();
		jrbDebito = new JRadioButton("Debito");
		jrbDebito.setFont(nome);
		jrbDebito.setOpaque(false);
		jrbCredito = new JRadioButton("Credito");
		jrbCredito.setFont(nome);
		jrbCredito.setOpaque(false);
		jrbPix = new JRadioButton("Pix");
		jrbPix.setFont(nome);
		jrbPix.setOpaque(false);
		jrbDinheiro = new JRadioButton("Dinheiro");
		jrbDinheiro.setFont(nome);
		jrbDinheiro.setOpaque(false);
		jbCadastrar = new JButton("Cadastrar");
		jbCadastrar.setFont(nome);
		bgFormaPagamento = new ButtonGroup();
		jtaTipoServico = new JTextArea();
		jspTipoServico = new JScrollPane(jtaTipoServico);

		// adicionar o objeto a tela
		add(jlServicos);
		add(jlFormaPagamento);
		add(jlData);
		add(jlNomeClienteServico);
		add(jlHorario);
		add(jlTipoServico);
		add(jlimagem);
		add(jtfTipoServico);
		add(jtfHorario);
		add(jtfData);
		add(jtfNomeClienteServico);
		add(jrbDebito);
		add(jrbCredito);
		add(jrbPix);
		add(jrbDinheiro);
		add(jbCadastrar);
		add(jspTipoServico);
		// dimencionar
		jlimagem.setBounds(400, 20, 100, 100);
		jlServicos.setBounds(150, 40, 250, 25);
		jlFormaPagamento.setBounds(370, 135, 180, 25);
		jlData.setBounds(170, 170, 145, 25);
		jlHorario.setBounds(170, 235, 145, 25);
		jlNomeClienteServico.setBounds(10, 80, 200, 25);
		jlTipoServico.setBounds(10, 145, 150, 25);
		jspTipoServico.setBounds(10, 170, 150, 115);
		jtfData.setBounds(170, 195, 140, 25);
		jtfHorario.setBounds(170, 260, 140, 25);
		jtfNomeClienteServico.setBounds(10, 105, 300, 25);
		jrbDebito.setBounds(380, 175, 145, 25);
		jrbCredito.setBounds(380, 200, 145, 25);
		jrbPix.setBounds(380, 225, 145, 25);
		jrbDinheiro.setBounds(380, 250, 145, 25);
		jbCadastrar.setBounds(340, 290, 180, 50);

	}

	private void criarEventos() {
		jbCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!jtfNomeClienteServico.getText().isEmpty() && !jtfData.getText().isEmpty()
						&& !jtfHorario.getText().isEmpty() && !jtaTipoServico.getText().isEmpty()) {

					String tipoPagamento = null, nomeClienteServico, data, horario, tipoServico;

					nomeClienteServico = jtfNomeClienteServico.getText();
					data = jtfData.getText();
					horario = jtfHorario.getText();
					tipoServico = jtaTipoServico.getText();

					if (jrbCredito.isSelected())
						tipoPagamento = "Crédito";
					if (jrbDebito.isSelected())
						tipoPagamento = "Débito";
					if (jrbDinheiro.isSelected())
						tipoPagamento = "Dinheiro";
					if (jrbPix.isSelected())
						tipoPagamento = "Pix";

					listaServico.add(new Servicos(tipoPagamento, nomeClienteServico, data, horario, tipoServico));

					jtfNomeClienteServico.setText("");
					jtfData.setText("");
					jtfHorario.setText("");
					jtaTipoServico.setText("");

				} else {
					JOptionPane.showMessageDialog(null, "preencha todos os campos",
							"IMPÉRIO 4 PATAS", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
	}
}
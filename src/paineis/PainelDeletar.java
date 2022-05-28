package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import classe.Cliente;




public class PainelDeletar extends JPanel {
	private List<Cliente> clientes;
	private JLabel jlDeletar, jlIndice, jlimagem;
	private JTextField jtfIndice;
	private ImageIcon imagem;
	private JButton jbDeletar;

	public PainelDeletar(List<Cliente> clientes) {
		super();
		this.clientes = clientes;
		setSize(400, 400);
		setLayout(null);
		setBackground(Color.lightGray);
		componentes();
		eventos();


	}

	private void componentes() {
		Font nome = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18);
		Font titulo = new Font("Arial", Font.CENTER_BASELINE, 28);
		Font titulo2 = new Font("Arial", Font.CENTER_BASELINE, 16);
		imagem = new ImageIcon(getClass().getResource("/imagem/imagem3.png"));
		jlimagem = new JLabel(imagem);
		jlDeletar = new JLabel("Deletar");
		jlDeletar.setFont(getFont());
		jlDeletar.setFont(titulo);
		jlIndice = new JLabel("Digite o nome do Cliente");
		jtfIndice = new JTextField();
		jlIndice.setFont(titulo2);
		jbDeletar = new JButton("Deletar");
		jbDeletar.setFont(nome);
		jbDeletar.setBackground(Color.white);
		jbDeletar.setForeground(Color.BLUE);
		
		
		add(jlimagem);
		add(jlDeletar);
		add(jlIndice);
		add(jtfIndice);
		add(jbDeletar);
		
		jlimagem.setBounds(400, 20, 100, 100);
		jlDeletar.setBounds(190, 80, 150, 30);
		jlIndice.setBounds(140, 170, 200, 20);
		jtfIndice.setBounds(140, 200, 200, 20);
		jbDeletar.setBounds(165, 230, 150, 40);

	}

	private void eventos() {
		jbDeletar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {
					int indice = Integer.parseInt(jtfIndice.getText())-1;
					int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente deletar este Índice?", "IMPÉRIO 4 PATAS", JOptionPane.YES_NO_OPTION);
					if (resposta == 0) {
						try {
							clientes.remove(indice);
							JOptionPane.showMessageDialog(null, "Deletado com sucesso");
						}catch(IndexOutOfBoundsException erro) {
							JOptionPane.showMessageDialog(null, "Número de Índice não existe!!!!!","IMPÉRIO 4 PATAS",JOptionPane.ERROR_MESSAGE);
						}
					}


				} catch (NumberFormatException erro) {
					JOptionPane.showMessageDialog(null, "Digite somente número no campo Índice!!!!!","IMPÉRIO 4 PATAS",JOptionPane.ERROR_MESSAGE);
				}

			}
		});


	}
}
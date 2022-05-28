package paineis;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import classe.Cliente;
import classe.Servicos;

public class PainelMostrar extends JPanel {
    private JLabel jlMostrar, jlimagem;

    private JButton jbMostrar;
    private ImageIcon imagem;
    private JTextArea jtaMostrar;
    private JScrollPane jspMostrar;
    private List<Cliente> clientes = new ArrayList<>();
    private List<Servicos> listaServico = new ArrayList<>();

    public PainelMostrar(List<Cliente> clientes) {
        this.clientes = clientes;
        setSize(600, 500);// largura e altura
        setLayout(null);
        setBackground(Color.LIGHT_GRAY);
        iniciarComponentes();
        criarEventos();
    }

    private void iniciarComponentes() {
        // objetos
        Font titulo = new Font("Arial", Font.CENTER_BASELINE, 28);
        Font nome = new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 18);
        imagem = new ImageIcon(getClass().getResource("/imagem/imagem3.png"));
        jlimagem = new JLabel(imagem);
        jlMostrar = new JLabel("Mostrar");
        jlMostrar.setFont(titulo);
        jbMostrar = new JButton("Mostrar");
        jbMostrar.setFont(nome);
        jbMostrar.setForeground(Color.BLUE);
        jtaMostrar = new JTextArea();
        jtaMostrar.setEditable(false);
        jspMostrar = new JScrollPane(jtaMostrar);

        add(jlMostrar);
        add(jbMostrar);
        add(jspMostrar);
        add(jlimagem);

        jlimagem.setBounds(400, 20, 100, 100);
        jlMostrar.setBounds(200, 40, 250, 25);
        jbMostrar.setBounds(180, 145, 140, 50);
        jspMostrar.setBounds(10, 200, 540, 230);

    }

    private void criarEventos() {

        jbMostrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                jtaMostrar.setText("\t*****Pet Shop******\n");
                for (Cliente cliente : clientes) {
                    jtaMostrar.append(cliente.mostrarDados());
                    for (Servicos servicos : listaServico) {
                        jtaMostrar.append(servicos.mostrarDados());
                    }
                }
            }
        });
    }
}

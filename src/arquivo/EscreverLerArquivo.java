package arquivo;

import java.io.FileOutputStream;
import java.util.List;


import classe.Cliente;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JOptionPane;




public class EscreverLerArquivo  {
	public void EscreverArquivo(List<Cliente> clientes) {
		FileOutputStream saida ;

		try {
			saida = new FileOutputStream("Cliente.bin");
			ObjectOutputStream objeto = new ObjectOutputStream(saida);
			objeto.writeObject(clientes);//grava os dados da matriz Crianca.bin
			JOptionPane.showMessageDialog(null, "Gravado com Sucesso!");
			objeto.close();//fechando o arquivo

		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo corrompido", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();

		}
	}


	//ler o arquivo
	public List<Cliente> lerArquivo(){
		List<Cliente> clientes = null;
		try {
			FileInputStream entrada = new FileInputStream("Clientes.bin");
			ObjectInputStream objeto = new ObjectInputStream(entrada);
			clientes = (List<Cliente>) objeto.readObject();
			objeto.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encotrado", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo corrompido", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Classe não encontrada", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}





		return clientes;


	}
	//ESCREVER ARQUIVO DO CADASTRO DA SENHA E DO LOGUIN
	public void escreverArquivocadastro(List<Cliente> clientes) {

		try {
			FileOutputStream saida = new FileOutputStream("Cadastro.bin");
			ObjectOutputStream objeto = new ObjectOutputStream(saida);
			objeto.writeObject(clientes);
			JOptionPane.showMessageDialog(null, "Gravado com sucesso");
			objeto.close();//fechando o arquivo
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não corrompido", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
	}

	//ler arquivo do cadastro da senha e do loguin

	public List<Cliente> lerArquivocadastro(){
		List<Cliente> clientes = null;
		try {
			FileInputStream entrada = new FileInputStream("Cliente.bin");
			ObjectInputStream objeto = new ObjectInputStream(entrada);
			clientes = (List<Cliente>) objeto.readObject();
			objeto.close();
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não encontrado", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Arquivo não corrompido", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Classe não encontrada", "IMPÉRIO QUATRO PATAS", JOptionPane.ERROR_MESSAGE);
			
			e.printStackTrace();
		}
		return clientes;
	}
}
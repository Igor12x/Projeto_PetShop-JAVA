package classe;

public class Cliente {
	protected  String nomeCliente;
	protected  String celular;
	protected  String telefone;
	protected  String endereco; 
	protected  String bairro;
	protected  String cidade; 
	protected  String nomePet;
	protected  String raca; 
	protected  String tipoServico;
	protected  String tipoPagamento;

	//construtor
	public Cliente(String nomeCliente, String celular, String telefone, String endereco, String bairro, String cidade,
			String nomePet, String raca, String tipoServico, String tipoPagamento){
		super();
		this.nomeCliente = nomeCliente;
		this.celular = celular;
		this.telefone = telefone;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.nomePet = nomePet;
		this.raca = raca;
		this.tipoServico = tipoServico;
		this.tipoPagamento = tipoPagamento;
	} 
	//metodo
	public String mostrarDados() {
		return "\nCliente: "+ this.nomeCliente + "\nCelular: "
				+ this.celular + "\nTelefone: " + this.telefone + "\nEndereço" + this.endereco + 
				"\nBairro" + this.bairro + "\nNomePet" + this.nomePet + 
				"\nRaça" + this.raca + "\nTIpoServiço" + this.tipoServico + "\nTipoPagamento" + this.tipoPagamento;
	}
}

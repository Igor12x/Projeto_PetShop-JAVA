package classe;

import java.util.List;



public class Servicos {
private String tipoPagamento;
private String nomeClienteServico;
private String data;
private String horario;
private String tipoServico;
	


	public Servicos(String tipoPagamento, String nomeClienteServico, String data, String horario, String tipoServico) {
        this.tipoPagamento = tipoPagamento;
        this.nomeClienteServico = nomeClienteServico;
        this.data = data;
        this.horario = horario;
        this.tipoServico = tipoServico;
    }


    public String mostrarDados() {
		return "/nCliente: " + this.nomeClienteServico + "/nTipo do servico: /n" + this.tipoServico 
        + "/nTipo de pagamento: " + this.tipoPagamento + "/nData: " + this.data + "/nHorário: " + this.horario;
	}


    public String getNomeClienteServico() {
        return nomeClienteServico;
    }


    public void setNomeClienteServico(String nomeClienteServico) {
        this.nomeClienteServico = nomeClienteServico;
    }


}
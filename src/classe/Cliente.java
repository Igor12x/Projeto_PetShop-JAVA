package classe;



public class Cliente {
protected String nomeCliente;
protected String celular;
protected String telefone;
protected String endereco;
protected String bairro;
protected String cidade;
protected String pet;
protected String pet2;
protected String pet3;
protected String pet4;
protected String raca;
protected String raca2;
protected String raca3;
protected String raca4;




//construtor
public Cliente(String nomeCliente, String celular, String telefone, String endereco, String bairro, String cidade,
String pet, String pet2, String pet3, String pet4, String raca, String raca2, String raca3, String raca4){
super();
this.nomeCliente = nomeCliente;
this.celular = celular;
this.telefone = telefone;
this.endereco = endereco;
this.bairro = bairro;
this.cidade = cidade;
this.pet = pet;
this.pet2 = pet2;
this.pet3 = pet3;
this.pet4 = pet4;
this.raca = raca;
this.raca2 = raca2;
this.raca3 = raca3;
this.raca4 = raca4;



}
//metodo
public String mostrarDados() {
return "\nCliente: "+ this.nomeCliente + "\nCelular: "
+ this.celular + "\nTelefone: " + this.telefone + "\nEndereço: " + this.endereco +
"\nBairro: " + this.bairro + "\nNome Pet: " + this.pet +  "\nRaça: " + this.raca + "\nNome Pet: " + this.pet2 + "\nRaça: " + this.raca2 + "\nNome Pet: " + this.pet3 +   "\nRaça: " + this.raca3 + "\nNome Pet: " + this.pet4 +
 "\nRaça: " + this.raca4;
}
public String getNomeCliente() {
return nomeCliente;
}
public void setNomeCliente(String nomeCliente) {
this.nomeCliente = nomeCliente;
}

}
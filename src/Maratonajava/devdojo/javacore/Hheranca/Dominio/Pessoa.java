package Maratonajava.devdojo.javacore.Hheranca.Dominio;

public class Pessoa {
 protected String nome;
 protected String cpf;
 protected Endereco endereco;

public void imprime(){
    System.out.println("Nome:"+this.nome);
    System.out.println("CPF: "+this.cpf);
    System.out.println("Endereço: "+this.endereco.getRua() +"\nCep: "+ this.endereco.getCep());
}

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

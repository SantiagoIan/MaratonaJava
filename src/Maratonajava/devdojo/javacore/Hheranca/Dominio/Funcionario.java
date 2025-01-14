package Maratonajava.devdojo.javacore.Hheranca.Dominio;

public class Funcionario extends Pessoa { // Funcionario esta extendendo pessoa, puxando os dados (nome, cpf e endereco).
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estatico de Funcionario.");
    }

    {
        System.out.println("Dentro do bloco inicicializao não estatico de Funcionario. 1");
    }

    {
        System.out.println("Dentro do bloco inicicializao não estatico de Funcionario. 2");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("dentro do construtor funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salario: "+this.salario);
    }

    public void relatorioSal(){
        System.out.println("Eu "+ this.nome + ", recebi o salario de "+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

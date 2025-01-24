package Maratonajava.devdojo.javacore.Lclassesabstratas.Dominio;

// Classes absratas foram criasdas para serem extendidas
  //Não podemos mistrurar final e abstract
public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }

    @Override
    public void imprime() {
        System.out.println("Imprimindo..");
    }

    // Metodos Abstratos só podem existir em Classes abstratas, já a Classe Abstrata pode ter os dois (abstract e concreto).
    public abstract void calculaBonus();

}

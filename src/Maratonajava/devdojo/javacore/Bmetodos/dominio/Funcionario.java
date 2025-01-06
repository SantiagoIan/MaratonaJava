package Maratonajava.devdojo.javacore.Bmetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario = {1144.50, 2239.95, 1420.00};
    private double media = 0;


    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario != null) { // if criando para evitar erros. Caso não exista salarios, o código ainda sim vai ser executado
            for (double salary : salario) {
                System.out.printf(salary + " ");
            }
            mediaSalario();
        }
    }

    private void mediaSalario() {
        if (salario == null) {// if criando para evitar erros. Caso não exista salarios, o código ainda sim vai ser executado
            return;
        } // caso salario for igual a null, o codigo ira para lá mesmo


        for (double salary : salario) {
            media += salary; // Media recebendo ela mesma + salario.
        }

        media /= salario.length; // Media recebendo ela mesma, dividindo 'salario.length' (todos os salarios armazenados.)
        System.out.println("\nMédia dos Salarios: " + media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}

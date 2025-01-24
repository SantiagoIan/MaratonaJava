package Maratonajava.devdojo.javacore.Kenumeracao.Dominio;

public enum TipoPagamento {
        DIBITO("Debito"){
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.1;
            }
        },
        CREDITO("Credito"){
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

        public abstract double calcularDesconto(double valor);
        // Metodos Abstract são feitos para ser sobrescritos, por isso eles não tem corpo.

        public final String Pagamento;

        TipoPagamento(String pagamento) {
            this.Pagamento = pagamento;
        }

        public String getPagamento() {
            return Pagamento;
        }
    }
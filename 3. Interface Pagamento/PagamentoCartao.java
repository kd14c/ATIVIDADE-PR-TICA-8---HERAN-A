public class PagamentoCartao implements Pagamento {
    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor * 1.05;
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento com cartão. Valor final com taxa: R$" + calcularPagamento();
    }
}

public class PagamentoDinheiro implements Pagamento {
    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularPagamento() {
        return valor * 0.90;
    }

    @Override
    public String emitirRecibo() {
        return "Pagamento em dinheiro. Valor final com desconto: R$" + calcularPagamento();
    }
}

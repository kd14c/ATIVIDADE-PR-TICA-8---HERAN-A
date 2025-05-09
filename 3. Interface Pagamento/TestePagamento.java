public class TestePagamento {
    public static void main(String[] args) {
        Pagamento cartao = new PagamentoCartao(100);
        Pagamento dinheiro = new PagamentoDinheiro(100);

        System.out.println(cartao.emitirRecibo());
        System.out.println(dinheiro.emitirRecibo());
    }
}

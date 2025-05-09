public class Vendedor implements Funcionario {
    @Override
    public void baterPonto() {
        System.out.println("Vendedor bateu o ponto.");
    }

    public void realizarVenda() {
        System.out.println("Vendedor realizou uma venda.");
    }
}

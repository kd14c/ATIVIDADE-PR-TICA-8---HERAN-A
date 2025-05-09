public class Faxineiro implements Funcionario {
    @Override
    public void baterPonto() {
        System.out.println("Faxineiro bateu o ponto.");
    }

    public void solicitarMaterial() {
        System.out.println("Faxineiro solicitou material.");
    }
}

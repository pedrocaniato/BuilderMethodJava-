public class PedidoTest {
    public static void main(String[] args) {
        System.out.println("Iniciando teste Builder...");
        try {
            Hamburguer h = new HamburguerBuilder()
                .setPao("Brioche")
                .setCarne("Angus")
                .comQueijo()
                .comBacon()
                .build();
            
            System.out.println("Lanche criado: " + h);
            System.out.println("TESTE PASSOU: Builder funcionando");
        } catch (Exception e) {
            System.err.println("TESTE FALHOU");
            e.printStackTrace();
        }
    }
}
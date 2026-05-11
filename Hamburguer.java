public class Hamburguer {
    private String pao;
    private String carne;
    private boolean queijo;
    private boolean alface;
    private boolean bacon;

    public Hamburguer(String pao, String carne, boolean queijo, boolean alface, boolean bacon) {
        this.pao = pao;
        this.carne = carne;
        this.queijo = queijo;
        this.alface = alface;
        this.bacon = bacon;
    }

    @Override
    public String toString() {
        return "Hamburguer [Pão=" + pao + ", Carne=" + carne + ", Queijo=" + queijo + 
               ", Alface=" + alface + ", Bacon=" + bacon + "]";
    }
}
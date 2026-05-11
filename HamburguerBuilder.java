public class HamburguerBuilder {
    private String pao;
    private String carne;
    private boolean queijo = false;
    private boolean alface = false;
    private boolean bacon = false;

    public HamburguerBuilder setPao(String pao) {
        this.pao = pao;
        return this;
    }

    public HamburguerBuilder setCarne(String carne) {
        this.carne = carne;
        return this;
    }

    public HamburguerBuilder comQueijo() {
        this.queijo = true;
        return this;
    }

    public HamburguerBuilder comAlface() {
        this.alface = true;
        return this;
    }

    public HamburguerBuilder comBacon() {
        this.bacon = true;
        return this;
    }

    public Hamburguer build() {
        return new Hamburguer(pao, carne, queijo, alface, bacon);
    }
}
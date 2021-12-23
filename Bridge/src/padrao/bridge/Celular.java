package padrao.bridge;

public abstract class Celular {
    protected Cor cor;

    public Celular(Cor cor) {
        this.cor = cor;
    }

    public abstract String getCelular();
}

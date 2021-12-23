package padrao.bridge;

public class Galaxy extends Celular {
    public Galaxy(Cor cor) {
        super(cor);
    }

    public String getCelular() {
        return "A cor do galaxy é " + this.cor.getCor();
    }
}

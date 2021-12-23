package padrao.bridge;

public class Iphone extends Celular{
    public Iphone(Cor cor) {
        super(cor);
    }

    public String getCelular() {
        return "A cor do iphone é " + this.cor.getCor();
    }
}

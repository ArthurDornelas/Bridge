package test;

import org.junit.jupiter.api.Test;
import padrao.bridge.Branco;
import padrao.bridge.Celular;
import padrao.bridge.Galaxy;
import padrao.bridge.Preto;
import static org.junit.jupiter.api.Assertions.*;

public class GalaxyTest {
    @Test
    void deveRetornarGalaxyPreto() {
        Celular celular = new Galaxy(new Preto());
        assertEquals("A cor do galaxy é preta", celular.getCelular());
    }

    @Test
    void deveRetornarGalaxyBranco() {
        Celular celular = new Galaxy(new Branco());
        assertEquals("A cor do galaxy é branca", celular.getCelular());
    }
}

package test;

import org.junit.jupiter.api.Test;
import padrao.bridge.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IphoneTest {
    @Test
    void deveRetornarIphonePreto() {
        Celular celular = new Iphone(new Preto());
        assertEquals("A cor do iphone é preta", celular.getCelular());
    }

    @Test
    void deveRetornarIphoneBranco() {
        Celular celular = new Iphone(new Branco());
        assertEquals("A cor do iphone é branca", celular.getCelular());
    }
}

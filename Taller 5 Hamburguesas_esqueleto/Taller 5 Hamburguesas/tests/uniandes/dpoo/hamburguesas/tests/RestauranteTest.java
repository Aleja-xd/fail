package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uniandes.dpoo.hamburguesas.mundo.Restaurante;
import uniandes.dpoo.hamburguesas.excepciones.YaHayUnPedidoEnCursoException;
import uniandes.dpoo.hamburguesas.excepciones.NoHayPedidoEnCursoException;

import java.io.IOException;

public class RestauranteTest {
    private Restaurante restaurante;

    @BeforeEach
    void setUp() {
        restaurante = new Restaurante();
    }

    @Test
    void testIniciarPedido() {
        try {
            restaurante.iniciarPedido("Juan", "Calle 123");
            assertNotNull(restaurante.getPedidoEnCurso(), "El pedido no se inició correctamente.");
        } catch (YaHayUnPedidoEnCursoException e) {
            fail("No debería haber un pedido en curso al iniciar uno nuevo.");
        }
    }

    @Test
    void testCerrarPedido() {
        try {
            restaurante.iniciarPedido("Juan", "Calle 123");
            restaurante.cerrarYGuardarPedido();
            assertNull(restaurante.getPedidoEnCurso(), "El pedido no se cerró correctamente.");
        } catch (YaHayUnPedidoEnCursoException e) {
            fail("No debería haber un pedido en curso al iniciar uno nuevo.");
        } catch (NoHayPedidoEnCursoException | IOException e) {
            fail("No debería haber un error al cerrar y guardar el pedido.");
        }
    }
}

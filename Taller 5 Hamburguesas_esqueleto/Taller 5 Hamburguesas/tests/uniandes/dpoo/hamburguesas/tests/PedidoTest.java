package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class PedidoTest {
    private Pedido pedido;

    @BeforeEach
    void setUp() {
        pedido = new Pedido("Juan", "Calle 123");
    }

    @Test
    void testAgregarProducto() {
        ProductoMenu hamburguesa = new ProductoMenu("Hamburguesa", 15000);
        pedido.agregarProducto(hamburguesa);
        assertTrue(pedido.getProductos().contains(hamburguesa), "El producto no fue agregado correctamente.");
    }

    @Test
    void testGenerarTextoFactura() {
        // Implementa la prueba para verificar que la factura se genere correctamente
    }

    @Test
    void testGuardarFactura() {
        // Implementa la prueba para verificar que la factura se guarde correctamente
    }
}

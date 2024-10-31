package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uniandes.dpoo.hamburguesas.mundo.Combo;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

import java.util.ArrayList;

public class ComboTest {
    private Combo combo;

    @BeforeEach
    void setUp() {
        ProductoMenu hamburguesa = new ProductoMenu("Hamburguesa", 15000);
        ProductoMenu papas = new ProductoMenu("Papas", 5000);
        ArrayList<ProductoMenu> items = new ArrayList<>();
        items.add(hamburguesa);
        items.add(papas);
        combo = new Combo("Combo Especial", 0.07, items);
    }

    @Test
    void testGetPrecio() {
        assertEquals(18600, combo.getPrecio(), "El precio del combo no es el esperado.");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fes.aragon.camisas.Tienda;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author David
 */
public class TiendaTest {

    @Test
    public void testTotal() {
        Tienda tienda = new Tienda(2, 3, 4);

        double subtotal = tienda.calcularSubtotal();
        double descuento = tienda.calcularDescuento();
        assertEquals(2125.2, tienda.calcularTotal());
    }

    @Test
    public void testDescuento() {
        Tienda tienda = new Tienda(2, 3, 4);
        double descuento = tienda.calcularDescuento();
        assertEquals(184.8, tienda.calcularDescuento());
    }
    @Test
    public void testSubtotal() {
        Tienda tienda = new Tienda(2, 3, 4);
        double subtotal = tienda.calcularSubtotal();
        assertEquals(2310, tienda.calcularSubtotal());

    }
}
// TODO add test methods here.
// The methods must be annotated with annotation @Test. For example:
//
// @Test
// public void hello() {}


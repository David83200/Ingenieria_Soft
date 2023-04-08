/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.camisas.inicio;

import fes.aragon.camisas.Tienda;

/**
 *
 * @author David
 */
public class Main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(5, 2, 1);
        System.out.println("Subtotal: $" + tienda.calcularSubtotal());
        System.out.println("Descuento: $" + tienda.calcularDescuento());
        System.out.println("Total: $" + tienda.calcularTotal());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fes.aragon.camisas;
/**
 *
 * @author David
 */
public class Tienda {

    private int numCamisaCorta;
    private int numCamisaCasual;
    private int numCamisaFormal;
    private double precioCamisaCorta = 190;
    private double precioCamisaCasual = 230;
    private double precioCamisaFormal = 310;

    public Tienda(int cantidadCamisaCorta, int cantidadCamisaCasual, int cantidadCamisaFormal) {
        this.numCamisaCorta = cantidadCamisaCorta;
        this.numCamisaCasual = cantidadCamisaCasual;
        this.numCamisaFormal = cantidadCamisaFormal;
    }

    public double calcularSubtotal() {
        double subtotal = numCamisaCorta * precioCamisaCorta
                + numCamisaCasual * precioCamisaCasual
                + numCamisaFormal * precioCamisaFormal;
        return subtotal;
    }

    public double calcularDescuento() {
        int cantidadTotal = numCamisaCorta + numCamisaCasual + numCamisaFormal;
        double descuento = 0;
        if (cantidadTotal >= 3 && cantidadTotal <= 5) {
            descuento = 0.05;
        } else if (cantidadTotal > 5) {
            descuento = 0.08;
        }
        return descuento * calcularSubtotal();
    }

    public double calcularTotal() {
        return calcularSubtotal() - calcularDescuento();

    }

    
}

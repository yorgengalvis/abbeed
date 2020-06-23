/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Andrey
 */
public enum EnumProducto {
    Papeleria(16),Supermercado(4),Drogueria(12);
    private int iva;

    private EnumProducto(int iva) {
        this.iva = iva;
    }

    public int getIva() {
        return iva;
    }
    
    
}

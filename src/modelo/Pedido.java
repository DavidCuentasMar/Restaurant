/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



/**
 *
 * @author pollo4053
 */


public class Pedido {
    public int NroPedido;
    public String Mesa;
    public String Camarero;
    private Pedido link;
    private  ListaProducto productos;
    private int valor;


    public Pedido(int NroPedido, String Mesa, String Camarero, ListaProducto productos) {
        this.NroPedido = NroPedido;
        this.Mesa = Mesa;
        this.Camarero = Camarero;
        this.productos = productos;

        this.valor = 0;
    }
    public void showPedidoList(){
        productos.showList();
    }

 

    public Pedido getLink() {
        return link;
    }

    public void setLink(Pedido link) {
        this.link = link;
    }
    
    public ListaProducto getProductos() {
        return productos;
    }
    public int getNroPedido() {
        return NroPedido;
    }

    public String getMesa() {
        return Mesa;
    }

    public String getCamarero() {
        return Camarero;
    }

    public String getProductosTxt() {
        return productos.getListTxt();
    }

    public void addPrice(String Monto){
        this.valor = this.valor+Integer.parseInt(Monto);
    }

    public int getValor() {
        return valor;
    }
    
    public void setPrice(int Monto){
        this.valor = this.valor-Monto;
    }
}

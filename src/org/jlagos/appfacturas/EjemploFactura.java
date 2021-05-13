package org.jlagos.appfacturas;

import org.jlagos.appfacturas.modelo.Cliente;
import org.jlagos.appfacturas.modelo.Factura;
import org.jlagos.appfacturas.modelo.ItemFactura;
import org.jlagos.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setRut("11.111.111-1");
        cliente.setNombre("Javier");

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese Una descripcion de la factura: ");
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;


        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print(" Ingrese producto n° "+ producto.getCodigo()+" : ");
            producto.setNombre(s.nextLine());


            System.out.print("Ingrese el precio: ");
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));

            System.out.println();
            s.nextLine();

        }
        System.out.println(factura);
    
    }
}

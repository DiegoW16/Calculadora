import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Descripción de tu factura: ");
        String nombreFactura = entrada.nextLine(); //Nombre de factura

        System.out.print("¿Precio del primer producto? $: ");
        double producto1 = entrada.nextDouble(); //Digitación de precio del primer producto

        System.out.print("¿Precio del segundo producto? $: ");
        double producto2 = entrada.nextDouble(); //Digitación de precio del segundo producto

        double total = (producto1 + producto2) * 0.19; //Calculo total de la factura más impuestos.

        String factura = "La factura " + nombreFactura + " tiene un total bruto " + Double.toString(producto1+producto2)
                + ", con un impuesto de 19% y el monto después de impuesto es de " + total;
        System.out.println(factura);




    }
}

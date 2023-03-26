/*EntradaComprar.java
 * Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 *Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles, la zona de compra-venta con 200 entradas disponibles y la zona vip
 *con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 *venderlas.
 * 
 * @Steven Cubillos Garcia
 */




package entradasCampanillas;


import java.util.Scanner;
public class EntradaComprar {


    public static void main(String[]Args){

        Scanner sc = new Scanner(System.in);{


            Zona principal = new Zona(1000);
            Zona compraventa = new Zona(200);
            Zona vip = new Zona (25);

            int eleccion = 0;



            do {


            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - ");
            System.out.println("|Bienvenido a Expocoches Campanillas. Seleccione una de las opcienes:| ");
            System.out.println("1. Mostrar numero de entradas libres.                                | ");
            System.out.println("2. Vender entradas.                                                  | ");
            System.out.println("3. Salir del menu.                                                   | ");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -  - ");

            eleccion = sc.nextInt();


            switch (eleccion) {

                case 1:
                System.out.println("Entradas libres en la sala principal -> > "+principal.getEntradasPorVender());
                System.out.println("Entradas libres en la sala compraventa -> > "+compraventa.getEntradasPorVender());
                System.out.println("Entradas libres en la sala VIP -> > "+vip.getEntradasPorVender());
                break;

                case 2:

                    int opcion = 0;

                    System.out.println("¿En que zona quiere comprar la entrada?");
                    System.out.println("1. Sala principal");
                    System.out.println("2. Sala compraventa");
                    System.out.println("3. Sala VIP");
                    opcion = sc.nextInt();


                    System.out.print("¿Cuantas entradas quieres comprar?");
                    int entradas = sc.nextInt();

                    switch (opcion) {

                        case 1:
                        principal.vender(entradas);

                        break;

                        case 2:
                        compraventa.vender(entradas);
                        break;

                        case 3:
                        vip.vender(entradas);
                        break;

                        default:
                        System.out.println("Error en la seleccion...");
                    }


                case 3:
                System.out.println("¡Hasta luego!");
                break;

                default:
                System.out.println("Error en la seleccion...");



            }



            sc.close();
        } while (eleccion != 3);


    }



    }
    
}

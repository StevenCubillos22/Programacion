/*Ejercicio5.java
 * Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén) para llevar el
 *control de los artículos de un almacén. De cada artículo se debe saber el código,
 *la descripción, el precio de compra, el precio de venta y el stock (número de
 *unidades). El menú del programa debe tener, al menos, las siguientes opciones:
 *1. Listado
 *2. Alta
 *3. Baja
 *4. Modificación
 *5. Entrada de mercancía
 *6. Salida de mercancía
 *7. Salir
 * @Steven Cubillos Garcia
 * 
 */


package arrayobj.EJ5;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[]Args){

        Scanner sc=new Scanner(System.in);{


            //Declaracion de atributos

            int eleccion;
            int i;
            
            int primerLibre = 0;
            int stockDepositado = 0;
            double precCompra;
            double precVenta;
            String codigo;
            String codDep;
            String descripc;
            String precCompraString;
            String precVentaString;
            String stockDepositString;
            


            Articulo[] articulo = new Articulo[100];


            for( i =0; i <articulo.length; i++){
            articulo [i] = new Articulo ();    
            }

           //Bucle do-while 
            do{

                System.out.println("GESTISIMAL");
                System.out.println("--La logística es nuestra prioridad--");
                System.out.println("+++++++++++");
                System.out.println("Seleccione una opción:");
                System.out.println("");
                System.out.println("1. Listado");
                System.out.println("2. Alta");
                System.out.println("3. Baja");
                System.out.println("4. Modificación");
                System.out.println("5. Entrada de mercancía");
                System.out.println("6. Salida de mercancía");
                System.out.println("7. Salir");
                eleccion = sc.nextInt();
                
                //Switch que nos ayuda a elegir una de las opciones que elijamos

                switch(eleccion){

                    case 1:
                    System.out.println("L I S T A D O: ");
                    System.out.println(" ");
                   
                    //Se hace un listado de los productos, siempre que sean los que esten libres//
                    for(i = 0; i<articulo.length;i++){

                        if(!articulo[i].getCodigo().equals("Libre")){
                            System.out.println(articulo[i]);
                            System.out.println(" O O O O O O ");

                        }

                    }
                    break;

                    case 2:
                    System.out.println("N U E V O");

                    //Buscamos una posicion de array libre con la variable primerLibre
                    //Si el código del artículo es diferente a "Libre", entonces se incrementa la variable para buscar la siguiente posición libre.//
                    //Se continúa este proceso hasta que se encuentre una posición libre o se alcance el final del array de artículos.//
                    codigo = articulo[primerLibre].getCodigo();

                    while ((primerLibre < articulo.length) && (!(codigo.equals("Libre")))){
                        primerLibre++;

                        if (primerLibre < articulo.length){
                            codigo = articulo[primerLibre].getCodigo();
                        }
              
                    }

                    //Introducimos los datos si hay un array libre con un if
                    if (primerLibre == articulo.length){
                        System.out.println("Nuestra base de datos esta llena, lo siento mucho..");
                    } else {


                    System.out.println("A L T A");
                    System.out.println("");

                    System.out.println("Introduzca un codigo");
                    codigo = sc.nextLine();
                    

                    System.out.println("Introduzca una descripcion");
                    descripc=sc.nextLine();

                    System.out.println("Introduzca un precio de compra");
                    precCompra=sc.nextDouble();

                    System.out.println("Introduzca un precio de venta");
                    precVenta=sc.nextDouble();

                    System.out.println("Por ultimo un numero de stock");
                    stockDepositado=sc.nextInt();


                }

                break;


                //Damos de baja a algun producto segun el codigo que pongamos
                case 3:
                System.out.println("B A J A: ");
                System.out.println(" ");

                System.out.println("Introduce el código para la baja: ");
                codDep=sc.nextLine();

                i=-1;
                codigo = "";

                //Aqui se busca un artículo en nuestra array  por su código de depósito//
                //y lo elimina si lo encuentra. Si no se encuentra, se informa que el código es inexistente.//

                do {
                    i++;
                    if(i < articulo.length){
                        codigo = articulo[i].getCodigo();
                    }
                } while (!(codigo.equals(codDep))&&(i < articulo.length));


                if (i ==articulo.length){
                    System.out.println("El codigo es inexistente");
                } else {
                    articulo[i].setCodigo("Libre");
                    System.out.println("El articulo es eliminado");
                }
                break;


                //Se modifica cualquier articulo segun el codigo
                case 4:
                System.out.println("M O D I F I C A C I O N: ");
                System.out.println("--- ");

                System.out.println("Introduzca el codigo del articulo que quiera modificar ");
                codDep=sc.nextLine();

                i =- 1;

                do {
                    i++;

                } while (!((articulo[i].getCodigo()).equals(codDep)));

                System.out.println("Introduzca los nuevos datos del articulo");

                System.out.println("Introduzca un nuevo codigo");
                codigo = sc.nextLine();
                if (!codDep.equals("")) {
                    articulo[i].setCodigo(codDep);
                }
                    

                System.out.println("Introduzca una nueva descripcion");
                descripc=sc.nextLine();
                if (!descripc.equals("")) {
                    articulo[i].setDescripcion(descripc);
                }

                System.out.println("Introduzca un nuevo precio de compra");
                precCompraString=sc.nextLine();
                if (!precCompraString.equals("")) {
                    articulo[i].setPrecCompraString(precCompraString);
                }

                System.out.println("Introduzca un nuevo precio de venta");
                precVentaString=sc.nextLine();
                if (!precVentaString.equals("")) {
                    articulo[i].setPrecVenta(precVentaString);
                }

                System.out.println("Por ultimo un stock");
                stockDepositString=sc.nextLine();
                if (!stockDepositString.equals("")) {
                    articulo[i].setStockDepositString(stockDepositString);
                }
                break;

 
                //Se pide una entrada de mercancia introduciendo un codigo que pongamos

                case 5:
                System.out.println("E N T R A D A  DE  M E R C A N C I A");
                System.out.println("");


                System.out.println("Introduzca codigo");
                codDep=sc.nextLine();

                i=-1;
                codigo = "";

                do {
                    i++;
                    if(i < articulo.length){
                        codigo = articulo[i].getCodigo();
                    }
                } while (!(codigo.equals(codDep))&&(i < articulo.length));


                if (i ==articulo.length){
                    System.out.println("El codigo es inexistente");
                } else {
                    System.out.println("Entrada de mercancía del siguiente artículo: ");
                    System.out.println(articulo[i]);
                    System.out.print("Introduzca el número de unidades que entran al almacén: ");
                    stockDepositString= sc.nextLine();

                }
                break;


              //Se da a salir una mercancia segun el codigo del producto que pongamos, que se mandará a buscar//
              //De lo contrario, nos dira que no se encuentra disponible//
                case 6:
                System.out.println("S A L I D A  M E R C A N C I A");
                System.out.println("");

                System.out.println("Introduzca codigo");
                codDep=sc.nextLine();

                i=-1;
                codigo = "";

                do {
                    i++;
                    if(i < articulo.length){
                        codigo = articulo[i].getCodigo();
                    }
                } while (!(codigo.equals(codDep))&&(i < articulo.length));


                if (i ==articulo.length){
                    System.out.println("El codigo es inexistente");
                } else {
                    System.out.println("Salida de mercancía del siguiente artículo: ");
                    System.out.println(articulo[i]);
                    System.out.print("Introduzca el número de unidades que salen del almacén: ");
                    stockDepositString= sc.nextLine();

                    if(articulo[i].getStock() - stockDepositado > 0) {
                        articulo[i].setStock(articulo[i].getStock() - stockDepositado);
                        System.out.println("La mercancia ha salido sin problema");
                        System.out.println("        __________");
                        System.out.println("       //  ||   //");
                        System.out.println(" _____//___||_ //___");;
                        System.out.println(" )  _          _    /");
                        System.out.println(" |_/ /________/ /___|-- .......");
                        System.out.println("__/_/________/_/______");
                        System.out.println("");


                    } else {
                        System.out.println("No se pudo sacar unidades del almacen");
                    }

                }

                break;

            }
        
            sc.close();
            
        }while(eleccion!=7);
    }    

  }
}

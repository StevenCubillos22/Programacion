



import java.util.Scanner;
public class Prueba {

    public static void main(String[]Args) {

        Scanner sc = new Scanner(System.in);{



        Bici decathlon = new Bici();
        Coche toyota = new Coche();


        int kilometro1;
        int kilometro2;
        int eleccion = 0;


        System.out.println("Elige una opcion: ");
        System.out.println("1. Coge la bici y pedalea: ");
        System.out.println("2. Usa el timbre de la bici: ");
        System.out.println("3. haz un ollie con la bici: ");
        System.out.println("4. Coge el coche y acelera: ");
        System.out.println("5. Usa el turbo del coche: ");
        System.out.println("6. Haz un derrape del coche: ");
        System.out.println("7. Salir: ");

        eleccion =sc.nextInt();



        switch (eleccion) {

            case 1:
            System.out.println("¿Cuantos kms quieres recorrer?: ");
            kilometro1 = sc.nextInt();

            decathlon.recorrer(kilometro1);

            System.out.println("Has hecho " +kilometro1+ " kms con la bici.");

            break;


            case 2:
            decathlon.sonarTimbre();
            break;

            case 3:
            decathlon.ollie();
            break;




            case 4:
            System.out.println("¿Cuantos kms quieres recorrer?: ");
            kilometro2 = sc.nextInt();

            toyota.recorrer(kilometro2);

            System.out.println("Has hecho " +kilometro2+ " kms con el coche.");

            break;


            case 5:

            toyota.turbo();
            break;

            case 6:
            toyota.drift();
            break;


            case 7:
            System.out.println("Cerrando..");
            default:




        }



        sc.close();

    }

 }
    
}
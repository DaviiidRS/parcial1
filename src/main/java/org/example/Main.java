package org.example;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    /*
    Parcial 1 Linea III
    Juan David Ramírez
    Parcial realizado 100% con inteligencia artesanal :)
     */
    public static void main(String[] args) {
        int opcion;
        Scanner teclado = new Scanner(System.in);
        CabinaTelefonica cabina1 = new CabinaTelefonica(3,45,23948273);
        CabinaTelefonica cabina2 = new CabinaTelefonica(6,643,99293292);
        ArrayList<CabinaTelefonica> listaCabinas = new ArrayList<>();
        listaCabinas.add(cabina1);
        listaCabinas.add(cabina2);

        do {
            System.out.println("1. Crear nueva cabina");
            System.out.println("2. Escoger cabina");
            System.out.println("3. Mostrar consolidado de todas las cabinas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    // crear una nueva cabina
                    CabinaTelefonica cabinaNueva = new CabinaTelefonica(0,0,0);
                    listaCabinas.add(cabinaNueva);
                    System.out.println("Cabina creada");
                    break;
                case 2:
                    // escoger una cabina
                    for (int i = 0; i < listaCabinas.size(); i++) {
                        System.out.println(i+". "+listaCabinas.get(i));
                    }
                    System.out.print("Escoge una cabina: ");
                    int cabinaEscogida = teclado.nextInt();
                    System.out.println("1. Registrar llamada");
                    System.out.println("2. Mostrar informacion");
                    System.out.println("3. Reiniciar cabina");
                    System.out.println("4. Salir");
                    System.out.print("Seleccione una opcion: ");
                    int opcionCabina = teclado.nextInt();

                    switch (opcionCabina){
                        case 1:
                            System.out.print("Ingrese la duracion de la llamada: ");
                            int duracion = teclado.nextInt();
                            System.out.println("1. Local");
                            System.out.println("2. Larga Distancia");
                            System.out.println("3. Celular");
                            System.out.print("Seleccione un tipo de llamadaaaaaa: ");
                            int tipo = teclado.nextInt();
                            listaCabinas.get(cabinaEscogida).registrarLlamada(duracion,tipo);
                            break;
                        case 2:
                            listaCabinas.get(cabinaEscogida).mostrarInformacion();
                            break;
                        case 3:
                            listaCabinas.get(cabinaEscogida).reiniciarCabina();
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    break;
                case 3:
                    // mostrar consolidado de todas las cabinas
                    for (int i = 0; i < listaCabinas.size(); i++) {
                        // System.out.println(i+". "+listaCabinas.get(i));
                        System.out.println();
                        System.out.println("Cabina "+i);
                        System.out.println("Total de llamadas: "+listaCabinas.get(i).getNumeroLlamadas());
                        System.out.println("Total de duracion: "+listaCabinas.get(i).getDuracionTotal());
                        System.out.println("Total de costos: "+listaCabinas.get(i).getCostoTotal());
                        System.out.println();
                    }
                    break;
                case 4:
                    // salir
                    System.out.println("Finalizando...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        } while (opcion!=4);
    }
}
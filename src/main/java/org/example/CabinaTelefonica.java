package org.example;
import java.util.Scanner;
public class CabinaTelefonica {
    Scanner teclado = new Scanner(System.in);
    //atributos
    private int numeroLlamadas;
    private int duracionTotal;
    private int costoTotal;

    //contructor vacio

    public CabinaTelefonica() {
    }

    //contructor

    public CabinaTelefonica(int numeroLlamadas, int duracionTotal, int costoTotal) {
        this.numeroLlamadas = numeroLlamadas;
        this.duracionTotal = duracionTotal;
        this.costoTotal = costoTotal;
    }

    // getters y setters

    public int getNumeroLlamadas() {
        return numeroLlamadas;
    }

    public void setNumeroLlamadas(int numeroLlamadas) {
        this.numeroLlamadas = numeroLlamadas;
    }

    public int getDuracionTotal() {
        return duracionTotal;
    }

    public void setDuracionTotal(int duracionTotal) {
        this.duracionTotal = duracionTotal;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    // toString

    @Override
    public String toString() {
        return "CabinaTelefonica{" +
                "numeroLlamadas=" + numeroLlamadas +
                ", duracionTotal=" + duracionTotal +
                ", costoTotal=" + costoTotal +
                '}';
    }

    //metodos

    //registrar llamada
    public void registrarLlamada(int minutos, int tipo){
        int tarifa=0;
        switch (tipo){
            case 1:
                tarifa=50;
                break;
            case 2:
                tarifa=350;
                break;
            case 3:
                tarifa=150;
                break;
            default:
                System.out.println("Opcion no valida");
        }
        this.numeroLlamadas++;
        this.duracionTotal+=minutos;
        this.costoTotal+=minutos*tarifa;
    }
    //mostrar informacion
    public void mostrarInformacion(){
        System.out.println("Numero de llamadas realizadas: "+numeroLlamadas);
        System.out.println("Duración Total: "+duracionTotal+" minutos");
        System.out.println("Costo total: $"+costoTotal);
    }

    // reiniciar valores
    public void reiniciarCabina(){
        this.numeroLlamadas=0;
        this.duracionTotal=0;
        this.costoTotal=0;
        System.out.println("Cabina Reiniciada");
    }
}

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {
        int a=0;
        while (a==0){
            Scanner in= new Scanner(System.in);
            System.out.println("Ingrese 1 para ingresar nuevos datos, 2 para ver el sismo de mayor intesidad, 3 para ver la cantidad de sismos mayores a 5.0, 4 para simular el envío de SMS, 5 para salir");
            String opcion = in.next();
            double[][] listaDias = ingresarDatos();
            if (Objects.equals(opcion, "1")) {
                listaDias = ingresarDatos();
            }
            if (Objects.equals(opcion, "2")){
                double mayorSismo= buscarMayorSismo(listaDias);
                System.out.println(mayorSismo);
            }
            if (Objects.equals(opcion, "3")){
                int cantSismos = contarSismosMayores(listaDias);
                System.out.println(cantSismos);
            }
            if (Objects.equals(opcion, "4")){
                avisarAlerta(listaDias);
            }
            if (Objects.equals(opcion, "5")){
                a=1;
            }
        }
    }

    public static void avisarAlerta(double [][] listaDias) {
        for (int i = 0; i < listaDias.length; i++) {
            for (int j = 0; j < listaDias[i].length; j++) {
                if (listaDias[i][j] > 7) {
                    System.out.println("Alerta!!! se debe evacuar zona costera!");
                }
            }
        }
    }

    public static int contarSismosMayores(double [][] listaDias) {
        int cant = 0;
        for (int i = 0; i < listaDias.length; i++) {
            for (int j = 0; j < listaDias[i].length; j++) {
                if (listaDias[i][j] > 5) {
                    cant ++;
                }
            }
        }
        return cant;
    }

    public static double[][] ingresarDatos(){
        double[][] listaDias = new double[7][24];
        for (int i=0;i< listaDias.length;i++){
            for (int j=0;j<listaDias[0].length;j++) {
                double sismo = Math.random()*9.9;
                listaDias[i][j]=sismo;
            }
        }
        return listaDias;
    }
    public static double buscarMayorSismo(double [][] listaDias){
        double mayor = 0;
        for (int i=0;i< listaDias.length;i++) {
            for (int j = 0; j < listaDias[i].length; j++) {
                if (listaDias[i][j]>mayor) {
                    mayor = listaDias[i][j];
                }
            }
        }
        return mayor;
    }
}

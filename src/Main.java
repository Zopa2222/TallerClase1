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
            if (Objects.equals(opcion, "1")){
                double[][] listaDias = ingresarDatos();

            }
        }
    }
    public static double[][] ingresarDatos(){
        double[][] listaDias = new double[7][24];
        for (int i=0;i< listaDias.length;i++){
            for (int j=0;j<listaDias[0].length;j++) {
                double sismo = Math.random()*9.9;
                listaDias[i][j]=sismo;
            }
        }
        System.out.println(listaDias);
        return listaDias;

    }
}

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
                ingresarDatos();
            }
        }
    }
    public static void ingresarDatos(){
        ArrayList listaDias = new ArrayList<>();
        for (int i=1;i<8;i++){
            ArrayList numDia = new ArrayList<>();
            for (int j=1;j<25;i++) {
                double sismo = Math.random()*9.9;
                numDia.add(sismo);
            }
            listaDias.add(numDia);
        }
        System.out.println(listaDias);

    }
}


import java.util.Scanner;

public class Evaluador {
    public static void main(String[] args) {

        Scanner Inspector = new Scanner(System.in);
        System.out.println("Por favor  Introduce tu nota en las siguientes materias \n Matematicas \n Lenguaje \n Ingles ");
        Integer matematica = Inspector.nextInt();
        Integer lenguaje = Inspector.nextInt();
        Integer ingles = Inspector.nextInt();

        if (matematica > 10 || matematica < 0) {
            System.out.println("Has intentado hackear el sistema  >:c ");
        } else if (matematica == 10) {
            System.out.println("Excelente");
        } else if (matematica > 5 &&  matematica <= 9) {
            System.out.println("Aceptable");
        } else if (matematica <= 5 && matematica > 3) {
            System.out.println("insuficiente");
            
        }else {
            System.out.println("No aprobado");
        }


        if (lenguaje > 10 || lenguaje < 0) {
            System.out.println("Has intentado hackear el sistema  >:c ");
        } else if (lenguaje == 10) {
            System.out.println("Excelente");
        } else if (lenguaje > 5 &&  lenguaje <= 9) {
            System.out.println("Aceptable");
        } else if (lenguaje <= 5 && lenguaje > 3) {
            System.out.println("insuficiente");

        }else {
            System.out.println("No aprobado");
        }

        if (ingles > 10 || ingles < 0) {
            System.out.println("Has intentado hackear el sistema  >:c ");
        } else if (ingles == 10) {
            System.out.println("Excelente");
        } else if (ingles > 5 &&  ingles <= 9) {
            System.out.println("Aceptable");
        } else if (ingles <= 5 && ingles > 3) {
            System.out.println("insuficiente");

        }else {
            System.out.println("No aprobado");
        }

    }


}

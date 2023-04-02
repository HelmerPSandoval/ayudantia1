import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
import java.util.Random;
/**
 * Conceptos básicos de Java
 * @author Helmer Pizarro Sandoval
 * */
public class Main {
    public static void main(String[] args) {
        //Imprimir datos
        String cadena = ":D";
        System.out.println("Hola mundo " + cadena + " !!");

        //Leer datos, se define instancia de la clase Scanner para la lectura.
        System.out.print("Ingrese el número entero: ");
        Scanner in = new Scanner(System.in);
        int numero = in.nextInt();
        System.out.println();
        System.out.println("El número por 10 es: " + (numero*10));

        //Condicionales
        if(numero <= 200)
        {
            System.out.println("El número es menor o igual a 200.");
        }else{
            if(numero > 200 && numero <= 600)
            {
                System.out.println("El npumero es mayor a 200 y menor o igual que 600.");
            }else{
                System.out.println("El npumero es mayor a 600.");
            }
        }

        //Ciclo for
        int[] arr = new int[10];
        for(int i = 0;i<10;i++)
        {
            /*Con "%" se calcula el resto de la division de dos numeros. El ciclo rellena las posiciones pares
            con 0 y las impares con 1*/
            if(i%2 == 0)
            {
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }

        for(int i = 0;i<10;i++)
        {
            //Se imprime los valores del arreglo y la posición correspondiente.
            System.out.println("En la posición "+i+" se encuentra el número: "+arr[i]);
        }

        //Ciclo while
        int contador = 0;

        //Se define la condición de salida del ciclo para evitar un loop infinito.
        while(contador != 6)
        {
            System.out.println("Iteración número "+contador);
        }

    }
}
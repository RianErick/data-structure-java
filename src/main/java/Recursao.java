import java.util.Arrays;
import java.util.Objects;

public class Recursao {


    public static void main(String[] args) {
        //contadorDESCRecursivo(10);
        //contadorCrescenteRecursivo(4);
        //contadorDecrecenteCrescenteRecursivo(4);
        //contadorCrescenteDECRecursivo(0, 4);

//        int[] numeros = {1, 2, 3 , 7 , 9 , 4};
//        inverterArray(new int[]{1, 2, 3, 7, 9, 4}, 0, numeros.length - 1);
//        System.out.println(Arrays.toString(numeros));

        isPalindromo("");
    }

    static public void isPalindromo(String palavra) {
        int intervalo = 0;
        String[] palavraArray = palavra.toLowerCase().trim().split("");

        if (palavraArray.length == 1 || palavraArray.length == 0) {
            System.out.println("true");
            System.exit(0);
        }

        if(!Objects.equals(palavraArray[intervalo], palavraArray[palavraArray.length - 1])) {
            System.out.println("false");
            System.exit(0);
        }
        String[] arrays = Arrays.copyOfRange(palavraArray, ++intervalo, palavraArray.length - 1);
        isPalindromo(String.join("", arrays));
    }

    static public void inverterArray(int[] numeros, int inicio, int fim) {
        if (inicio >= fim)  return;
        int temp = numeros[inicio];
        numeros[inicio] = numeros[fim];
        numeros[fim] = temp;
        inverterArray(numeros, ++inicio, --fim);
    }

    static public void contadorDESCRecursivo(int numero) {
        if(numero == 0) {
            return;
        }
        System.out.println(numero--);
        contadorDESCRecursivo(numero);
    }

    static public void contadorCrescenteRecursivo(int numero) {
        if(numero == 0) {
            return;
        }
        numero--;
        contadorCrescenteRecursivo(numero++);
        System.out.println(numero++);
    }

    static public void contadorDecrecenteCrescenteRecursivo(int numero) {
        if (numero == 0) {
            System.out.println(0);
            return;
        }
        System.out.println(numero--);
        contadorDecrecenteCrescenteRecursivo(numero++);
        System.out.println(numero);
    }

    static public void contadorCrescenteDECRecursivo( int piso ,int numero) {
        if (piso <= numero) {
            System.out.println(piso);
            contadorCrescenteDECRecursivo(piso + 1, numero);
        }
        if (piso < numero) {
            System.out.println(piso);
        }
    }
}

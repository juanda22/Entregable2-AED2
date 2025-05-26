package aed;

import java.util.Scanner;
import java.io.PrintStream;

class Archivos {
    float[] leerVector(Scanner entrada, int largo) {
         float[] nVector = new float[largo];
         for(int i =0;i<largo;i++){
            nVector[i]=entrada.nextFloat();
         }
         return nVector;
    }

    float[][] leerMatriz(Scanner entrada, int filas, int columnas) {
        float[][] matriz = new float[filas][columnas];
        for(int i = 0; i<filas;i++){
            matriz[i]=leerVector(entrada, columnas);
        }
        return matriz;
    }

    void imprimirPiramide(PrintStream salida, int alto) {
        char esp = ' ';
        char ast = '*';
        for(int i = 0; i<alto;i++){
            for(int j = 0;j<(alto-i)-1;j++){
                salida.print(esp);
            }
            for(int j = 0;j<2*i+1;j++){
                salida.print(ast);
            }
            for(int k = 0;k<(alto-i)-1;k++){
                salida.print(esp);
            }
            salida.print("\n");

        }
    }
}

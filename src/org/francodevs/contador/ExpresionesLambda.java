package org.francodevs.contador;

import java.util.Collections;

public class ExpresionesLambda {
    public static void main(String[] args) {

        ContadorPalabras contador = frase -> {
            // Limpiamos la frase eliminando los puntos, comas y dejamos en minúsculas. Luego con split convertimos la frase en un arreglo para iterarlo.
            String[] arreglo = frase.replace(".", "")
                    .replace(",", "")
                    .toLowerCase()
                    .split(" ");
            /*
                Con un for doble iteramos cada palabra y la comparamos con cada una del arreglo así podemos calcular el máximo que se repite una palabra.
                Definimos dos variables importantes, la palabra más repetida y el max o cantidad de veces que se repite la palabra
             */
            int max = 0;
            String palabra = null;
            for (int i = 0; i < arreglo.length; i++) {
                int cantidad = 0;
                for (int j = 0; j < arreglo.length; j++) {
                    if (arreglo[i].equalsIgnoreCase(arreglo[j])) {
                        cantidad++;
                    }
                }

                if(cantidad > max){
                    max = cantidad;
                    palabra = arreglo[i];
                }
            }
            // Finalmente, devolvemos el resultado de la palabra más repetida y el número de veces que se repite en un Map donde la llave es la palabra y max la cantidad.
            return Collections.singletonMap(palabra, max);
        };

        /*
            Ejecutamos y probamos nuestra expresión lambda con alguna frase con la palabra ni que se repite varias veces.
            Finalmente, el map que devuelve lo iteramos con una lambda forEach mostrando la llave o palabra y el valor la cantidad
         */

        contador.contarPalabras("Yo ni te conozco, ni te he visto, ni se tu nombre, ni te hablaré, ni me interesas.")
                .forEach( (k, v) -> System.out.println("La palabra '" + k + "' se repite " + v + " veces."));

    }
}

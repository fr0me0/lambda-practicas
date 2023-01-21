package org.francodevs.contador;

import java.util.Map;

@FunctionalInterface
public interface ContadorPalabras {

    Map<String,Integer> contarPalabras(String frase);

}

package org.francodevs.formatear;

public class ExpresionesLambdaFormatear {

    public static void main(String[] args) {

        FormatearFrase format = frase -> {
            return frase.replace(".", "").toUpperCase();
        };

        String resultado = format.limpiarYFormatear("Pedro Pablo Pérez Pereira, pobre pintor portugués, pinta paisajes por poca plata, para pasear por París.");
        System.out.println(resultado);

    }

}

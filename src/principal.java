import java.util.Scanner;

public class principal {
    //variables para crear el marco
    static final char LINEA_VERTICAL = '║';
    static final char LINEA_HORIZONTAL = '═';
    static final char ESQ_SUP_DER = '╗';
    static final char ESQ_SUP_IZQ = '╔';
    static final char ESQ_INF_DER = '╝';
    static final char ESQ_INF_IZQ = '╚';
    static final int bodeSuperior = 0;
    static final int bordeInferior = 1;

    public static void main(String[] args) {
        //construyendo la interaccion con el usuario
        mostrarTitulo("CONVERSOR DE MONEDAS");
        Scanner lectura = new Scanner(System.in);
        ConsultarMoneda consulta = new ConsultarMoneda();
        int opcion = 0;
        while (opcion != 9) {
            mostrarTitulo("ELIGE LA OPCION A CONVERTIR:");
            System.out.println("""
                    1.-Peso mexicano  -- dolar
                    2.-Dolar          -- peso mexicano
                    3.-Real Brasilero -- dolar
                    4.-dolar          -- real brasilero
                    5.-peso Argentino -- dolar
                    6.-dolar          -- peso argentino
                    7.-Yen japones    -- peso mexicano
                    8.-peso mexicano  -- yen japones
                    9.-Salir***""");
            opcion = lectura.nextInt();
            lectura.nextLine();
        }
    }
    //metodo para crear el marco
    static void mostrarTitulo(String titulo) {

        String[] lineas = titulo.split("\n");
        int lineaMax = 0;
        for (String lineaActual : lineas){
            if (lineaActual.length() > lineaMax) lineaMax = lineaActual.length();
        }

        //borde superior
        imprimirBorde(bodeSuperior, lineaMax);

        //lineas centrales
        for (int i = 0; i < lineas.length; i++) {
            System.out.print(LINEA_VERTICAL+"  ");
            for (int j = 0; j < lineaMax; j++) {
                if (j < lineas[i].length())
                    System.out.print(lineas[i].charAt(j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println(" " + LINEA_VERTICAL);
        }

        //borde inferior
        imprimirBorde(bordeInferior, lineaMax);

    }
    static void imprimirBorde (int tipoBorde, int ancho) {
        System.out.print(tipoBorde == bodeSuperior ? ESQ_SUP_IZQ : ESQ_INF_IZQ );
        for (int i = 0; i < ancho *2 + 3; i++)
            System.out.print(LINEA_HORIZONTAL);
        System.out.println(tipoBorde == bodeSuperior ? ESQ_SUP_DER : ESQ_INF_DER );

    }
}


import java.util.Scanner;

public class Conversor {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura) {
        double cantidad;
        double cantidadConvertida;
        //convirtiendo los valores
        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("VALOR DE CONVERSION\n1 "+monedaBase+ " = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("ingrese la cantidad en "+monedaBase+":");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println("\n"+cantidad+" "+monedaBase +" = " +cantidadConvertida + " " + monedas.target_code()+ "\n \n");
        System.out.println("reiniciando tabla de conversion...");
    }
}

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        boolean continuar = true;

        while (continuar){

            // Mostrar un cuadro de diálogo de opción y obtener la opción seleccionada
            Object[] opciones = {"Conversor de moneda", "Conversor de temperatura"};
            int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción de conversión", "Selector de opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            System.out.println("Opción seleccionada: " + opciones[seleccion]);

            if (seleccion == 0) {
                // aqui realizo la Lógica para el conversor de moneda
                String[] monedas = {"pesos argentinos a Dólar", "pesos argentinos a Euro", "pesos argentinos a Libra esterlina",
                        "peso Argentino a peso mexicano", "dolar a pesos argentinos", "euro a pesos argentinos", "peso mexicano a pesos argentinos"
                };
                String monedaSeleccionada = (String) JOptionPane.showInputDialog(null,
                        "Selecciona la moneda para convertir",
                        "Selector de monedas",
                        JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[0]);

                System.out.println("Moneda seleccionada: " + monedaSeleccionada);


                // Solicitar el valor a convertir
                String valorAConvertir = JOptionPane.showInputDialog(null,
                        "Ingrese el valor a convertir",
                        "Conversor de moneda",
                        JOptionPane.QUESTION_MESSAGE);
                System.out.println("Valor a convertir: " + valorAConvertir);



                double conversion = 0.0;
                try {
                    double valor = Double.parseDouble(valorAConvertir); //aca lo que hacemos es forzar a que el valor
                    switch (monedaSeleccionada) {                      //String de valorAConvertir sea del tipo double
                        case "pesos argentinos a Dólar":
                            conversion = valor * 0.0039;
                            break;
                        case "pesos argentinos a Euro":
                            conversion = valor * 0.0035;
                            break;
                        case "pesos argentinos a Libra esterlina":
                            conversion = valor * 0.0030;
                            break;
                        case "peso Argentino a peso mexicano":
                            conversion = valor * 0.066;
                            break;
                        case "dolar a pesos argentinos":
                            conversion = valor * 259.21;
                            break;
                        case "euro a pesos argentinos":
                            conversion = valor * 282.01;
                            break;
                        case  "peso mexicano a pesos argentinos":
                            conversion = valor * 15.20;
                            break;
                    }
                } catch (NumberFormatException exce) {
                    JOptionPane.showMessageDialog(null,
                            "Valor inválido. Ingrese solo numeros.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Mostrar el resultado al usuario
                JOptionPane.showMessageDialog(null,
                        "Resultado de la conversión: " + conversion,
                        "Conversor de moneda",
                        JOptionPane.INFORMATION_MESSAGE);


                // Mostrar un cuadro de diálogo de confirme si desea o no continuar
                int opcion = JOptionPane.showConfirmDialog(null, "¿Deseas continuar?");
                if (opcion != JOptionPane.YES_OPTION) {
                    continuar = false;
                }

            }
            else if (seleccion == 1) {
                // Lógica para el conversor de temperatura
                // Implementa aquí el código para el conversor de temperatura
            }

        }

        // Mostrar el mensaje "Programa finalizado" si el usuario no desee continuar
        JOptionPane.showMessageDialog(null, "programa finalizado");
    }



}

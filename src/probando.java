import javax.swing.JOptionPane;
    public class probando {
        public static void main(String[] args) {
            // Mostrar un mensaje de información
            JOptionPane.showMessageDialog(null, "Hola, bienvenido");

            // Mostrar un cuadro de diálogo de entrada y obtener el texto ingresado
            String nombre = JOptionPane.showInputDialog("Por favor, ingresa tu nombre");
            System.out.println("Hola, " + nombre);

            // Mostrar un cuadro de diálogo de confirmación y obtener la respuesta
            int opcion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de continuar?");
            if (opcion == JOptionPane.YES_OPTION) {
                System.out.println("Continuando...");
            } else {
                System.out.println("Operación cancelada");
            }

            // Mostrar un cuadro de diálogo de opción y obtener la opción seleccionada
            Object[] opciones = {"Opción 1", "Opción 2", "Opción 3"};
            int seleccion = JOptionPane.showOptionDialog(null, "Elige una opción", "Selector de opciones",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
            System.out.println("Opción seleccionada: " + opciones[seleccion]);
        }
    }


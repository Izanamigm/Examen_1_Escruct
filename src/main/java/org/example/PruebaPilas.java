import javax.swing.JOptionPane;

public class PruebaPilas {

    public static void main(String[] args) {
        
        int tamanio;
        
        tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamanio de la Pila"));
        
        PilaDeTamanioFijo pila = new PilaDeTamanioFijo(tamanio);

        int opcion;
        int elemento;
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Menu de Opciones
                    
                    1. Push.
                    2. Pop.
                    3. Top.
                    4. Size.
                    5. Is empty.
                    6. Imprimir pila.
            
                    0. Salir.
                    
                    """));

            switch (opcion) {
                case 1:
                    //PUSH
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el elemento a insertar: "));
                    pila.push(elemento);
                    break;
                case 2:
                    //POP
                    int elementoRemovido = pila.pop();
                    if(elementoRemovido != -1)
                    {
                        JOptionPane.showMessageDialog(null, "Elemento Top Removido: " + elementoRemovido);
                    }
                    break;
                case 3:
                    //TOP
                    int ultimoElemento = pila.top();
                    if(ultimoElemento != -1)
                    {
                        JOptionPane.showMessageDialog(null, "Último elemento: " + ultimoElemento);
                    }
                    break;
                case 4:
                    //SIZE
                    int tamanoPila = pila.size();
                    JOptionPane.showMessageDialog(null, "Tamaño de la pila: " + tamanoPila);
                    break;
                case 5:
                    //IS EMPTY
                    boolean estaVacia = pila.isEmpty();
                    JOptionPane.showMessageDialog(null, "La pila está vacía: " + estaVacia);
                    break;
                case 6:
                    
                    // Código para IMPRIMIR PILA
                    
                    pila.mostrarElementos();
                    break;
                case 0:
                    //SALIR
                    JOptionPane.showMessageDialog(null, "Saliendo... ");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Por favor, intente nuevamente.");
                    break;
            }

            System.out.println();
        } while (opcion != 0);
    }
}
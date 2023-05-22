import javax.swing.JOptionPane;


public class PilaDeTamanioFijo {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public PilaDeTamanioFijo(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int element) {
        if (!isFull()) {
            stackArray[++top] = element;
            JOptionPane.showMessageDialog(null, "Elemento " + element + " insertado correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "La pila está llena. Elemento no insertado.");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int poppedElement = stackArray[top--];
            return poppedElement;
        } else {
            JOptionPane.showMessageDialog(null, "La pila está vacía. No se puede remover ningún elemento.");
            return -1;
        }
    }

    public int top() {
        if (isEmpty() == false) {
            return stackArray[top];
        } else {
            JOptionPane.showMessageDialog(null, "La pila está vacía.");
            return -1;
        }
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void imprimir() {
        if (!isEmpty()) {
            System.out.print("Contenido de la pila: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("La pila está vacía.");
        }
    }
    
    public void mostrarElementos() {
        if (!isEmpty()) {
            StringBuilder elementos = new StringBuilder();
            elementos.append("Elementos de la pila: ");
            for (int i = top; i >= 0; i--) {
                elementos.append(stackArray[i]).append(" ");
            }
            JOptionPane.showMessageDialog(null, elementos.toString());
        } else {
            JOptionPane.showMessageDialog(null, "La pila está vacía.");
        }
    }
}
import java.util.Objects;

public class Fila {
    private Node head;
    private Node end;
    private int cardinality;

    public Fila() {
        this.head = null;
        this.end = null;
        this.cardinality = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getEnd() {
        return end;
    }

    public void setEnd(Node end) {
        this.end = end;
    }

    public int getCardinality() {
        return cardinality;
    }

    public void setCardinality(int cardinality) {
        this.cardinality = cardinality;
    }

    // verificar se uma fila está vazia
    public boolean isEmpty(){
        return getCardinality() == 0;
    }

    // recuperar o número de elementos da fila
    public int numberElements(){
        return getCardinality();
    }

    // verificar se um determinado elemento está na fila
    public boolean checkElementInList(Object element){
        Node aux = getHead();
        while (aux != null){
            if (aux.getElement().equals(element)){
                return true;
            }
            aux = aux.getNext();
        }
        return false;
    }

    // Verificar se uma posição qualquer é válida
    public boolean checkPosition(int position){
        if (position > -1 && position <= getCardinality()){
            return true;
        }
        return false;
    }

    // Recuperar um elemento da fila
    public Object returnElement(int index){
        Node aux = getHead();
        int x = 0;
        while (aux != null){
            if (x == index){
                return aux.getElement();
            }
            aux = aux.getNext();
            x++;
        }
        return null;
    }

    // Recuperar a posição de um elemento da fila
    public int recoverPosition(Object element){
        Node aux = getHead();
        int i = 1;
        while (aux != null){
            if (aux.getElement().equals(element)){
                return i;
            }
            aux = aux.getNext();
            i++;
        }
        return -1;
    }

    // Recupera o primeiro elemento da fila
    public Object headElement(){
        return getHead().getElement();
    }

    // Recupera o ultimo elemento da fila
    public Object endElement(){
        return getEnd().getElement();
    }

    // Insere um elemento
    public void add(Object element){
        Node newNode = new Node();
        newNode.setElement(element);
        newNode.setNext(null);
        if (head == null){
            head = newNode;
        }else{
            end.setNext(newNode);
        }
        end = newNode;
        cardinality++;
    }

    // Remove um elemento
    public Object remove(){
        Node aux = new Node();
        aux.setElement(head);
        head = head.getNext();
        if (head == null){
            end = null;
        }
        cardinality--;
        return aux;
    }

    // Mostra valores da fila
    public void showFila(){
        Node aux = getHead();
        int i = 1;
        while (aux != null){
            System.out.println("[" + i + "]" + " Elemento: " + aux.getElement());
            i++;
            aux = aux.getNext();
        }
    }

    //
    public static void main(String[] args) {

        Fila f = new Fila();

        System.out.println("********************************************************************************");
        // Verificar se uma fila está vazia
        System.out.println("- Verifica se uma fila está vazia: " + f.isEmpty());
        System.out.println("********************************************************************************");

        // Adiciona 1 elemento na fila
        f.add(10);

        // Verificar se uma fila está vazia
        System.out.println("- Verifica se uma fila está vazia após inserido um elemento: " + f.isEmpty());
        System.out.println("********************************************************************************");

        // Recuperar o número de elementos da fila
        System.out.println("- Recupera n° elementos na fila: [" + f.numberElements() + "]° Elementos. ");
        System.out.println("********************************************************************************");

        // Verificar se um determinado elemento está na fila
        System.out.println("- Verificar se um determinado elemento está na fila: '10' -> " + f.checkElementInList(10));
        System.out.println("********************************************************************************");

        // Verificar se um determinado elemento está na fila
        System.out.println("- Verificar se um determinado elemento está na fila: 'inexistente' -> " + f.checkElementInList(19));
        System.out.println("********************************************************************************");

        // Verificar se uma posição qualquer é válida
        System.out.println("- Verificar se uma posição qualquer é válida: " + f.checkPosition(1));
        System.out.println("********************************************************************************");

        // Verificar se uma posição qualquer é válida
        System.out.println("- Verificar se uma posição qualquer é válida: 'INVALIDA' " + f.checkPosition(999));
        System.out.println("********************************************************************************");

        // Insere mais elementos na fila
        f.add(55);
        f.add(200);
        f.add(40);
        f.add(88);
        f.add(2);
        f.add(6);

        // Recuperar um elemento da fila
        System.out.println("- Recuperar um elemento da fila: 'index 2' -> " + f.returnElement(2));
        System.out.println("********************************************************************************");

        // Recuperar um elemento da fila
        System.out.println("- Recuperar um elemento da fila: 'index INEXISTENTE' -> " + f.returnElement(255));
        System.out.println("********************************************************************************");

        // Recuperar a posição de um elemento da fila
        System.out.println("- Recupera a posição de um elemento: 'elemento 200' -> " + f.recoverPosition(200));
        System.out.println("********************************************************************************");

        // Recuperar a posição de um elemento da fila
        System.out.println("- Recupera a posição de um elemento: 'elemento INEXISTENTE' -> " + f.recoverPosition(233));
        System.out.println("********************************************************************************");

        // Recuperar o primeiro elemento da fila
        System.out.println("- Recuperar o primeiro elemento da fila: " + f.headElement());
        System.out.println("********************************************************************************");

        // Recuperar o último elemento da fila
        System.out.println("- Recuperar o último elemento da fila: " + f.endElement());
        System.out.println("********************************************************************************");

        // Inserir um elemento
        System.out.println("- Insere um elemento na fila: '9999' ");
        f.add(9999);
        System.out.println("********************************************************************************");

        // Retirar um elemento
        System.out.println("- Exibe a fila antes de retirar elemento: ");
        f.showFila();
        System.out.println("********************************************************************************");
        System.out.println("- Retira um elemento da fila: " );
        f.remove();
        System.out.println("********************************************************************************");

        // Exibe os elementos da fila
        System.out.println("- Exibe a fila: ");
        f.showFila();
        System.out.println("********************************************************************************");
    }

}



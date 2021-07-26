public class LinkedList implements List {

    private Node root;
    private int countOfNodes;


    public LinkedList(){
        root = new Node();
    }

    @Override
    public void add(int value) {
        if (root.nextNode == null) {
            root.add(value);
        }
        else {
            Node currentNode = root;
            while (currentNode.nextNode != null){
                currentNode = currentNode.nextNode;
            }
            currentNode.add(value);
        }
        countOfNodes++;
    }

    @Override
    public int get(int index) {
        //index++;
        if (isCorrectIndex(index)) {
            if (index == 0) return root.value;
            int counterOfNodes = 0;
            Node currentNode = root;
            while (counterOfNodes != index) {
                counterOfNodes++;
                currentNode = currentNode.nextNode;
            }
            return currentNode.value;
        }
        System.out.println("eroor");
        return -1;
    }

    @Override
    public void set(int index, int value) {
        if (isCorrectIndex(index)) {
            int counterOfNodes = 0;
            Node currentNode = root;
            while (counterOfNodes != index) {
                counterOfNodes++;
                currentNode = currentNode.nextNode;
            }
            currentNode.value = value;
        }
        else System.out.println("eroor");
    }

    @Override
    public void remove(int index) {
    if (isCorrectIndex(index)) {
        int counterOfNodes = 0;
        Node currentNode = root;
        while (index != counterOfNodes) {
            currentNode = currentNode.nextNode;
            counterOfNodes++;
        }
        currentNode.nextNode = currentNode.nextNode.nextNode;
        countOfNodes--;
    }
    else
        System.out.println("error");
    }

    @Override
    public int size() { return countOfNodes;}


    private boolean isCorrectIndex(int index) { return index >= 0 && index < size();}

    @Override
    public boolean isEmpty() { return countOfNodes == 0; }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size(); i++){
            if (i > 0)builder.append(", ");
            builder.append(get(i));
        }
        builder.append("]");
        return builder.toString();
    }

    private class Node {
        private int value;
        private Node nextNode;

        public void add(int value){
            this.value = value;
            nextNode = new Node();
        }
    }
}

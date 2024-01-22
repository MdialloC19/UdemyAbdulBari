import java.util.Iterator;
import java.util.NoSuchElementException;

public class Table implements Iterable<String> {
    private String[] elements;
    private int size;
    private int maxSize;

    public Table(int maxSize) {
        this.maxSize = maxSize;
        this.elements = new String[maxSize];
        this.size = 0;
    }

    public void add(String element) {
        if (size < maxSize) {
            elements[size++] = element;
        } else {
            System.out.println("Table is full. Cannot add more elements.");
        }
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<String> iterator() {
        // Implémentation de la classe interne (ou locale) Iterator
        class TableIterator implements Iterator<String> {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size;
            }

            @Override
            public String next() {
                if (hasNext()) {
                    return elements[currentIndex++];
                } else {
                    throw new NoSuchElementException();
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        // Retourne une instance de la classe TableIterator
        return new TableIterator();
    }

    public static void main(String[] args) {
        Table myTable = new Table(5);

        myTable.add("Element 1");
        myTable.add("Element 2");
        myTable.add("Element 3");

        System.out.println("Table Size: " + myTable.size());

        // Utilisation de l'itérateur pour parcourir les éléments
        for (String element : myTable) {
            System.out.println("Element: " + element);
        }
    }
}

import java.util.Iterator;
public class MyLinkList implements Iterable{
    private Elements first;
    private Elements last;
    private int count = 0;

    @Override
    public Iterator iterator() {
        return new Iterator<Object>() {
            Elements element0 = new Elements("0");
            {
                element0.setNext(first);
            }
            Elements currentElement = element0;

            @Override
            public boolean hasNext() {
                return currentElement.getNext() != null;
            }

            @Override
            public Object next() {
                currentElement = currentElement.getNext();
                return currentElement.getData();
            }
        };
    }

    public int size() {
        return count;
    }

    private Elements getElement(int index){
        if (index >= count){
            throw new IndexOutOfBoundsException();
        }

        Elements result = first;
        for (int i = 1; i <= index; i++){
            result = result.getNext();
        }
        return result;
    }

    public Object get(int index){

        Elements element = getElement(index);

        return element.getData();
    }

    public void remove(int index){

        Elements currentElement = getElement(index);
        Elements nextElement = currentElement.getNext();
        Elements previousElement = currentElement.getPrevious();

        if (index == 0){
            first = nextElement;
            if (last == currentElement){
                last = null;
            }
        }

        if (index == count - 1){
            last = previousElement;
            if (first == currentElement){
                first = null;
            }
        }

        count--;

        if (nextElement != null){
            nextElement.setPrevious(previousElement);
        }

        if (previousElement != null){
            previousElement.setNext(nextElement);
        }

    }


    public void add(Object data){
        count++;
        Elements element = new Elements(data);
        if (first == null){
            first = element;
            last = element;
            return;
        } else if (last == null) {
            last = element;
            return;
        }

        last.setNext(element);
        element.setPrevious(last);
        last = element;
    }
}

public class Elements {
    Object data;
    private Elements next;
    private Elements previous;

    public Elements(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Elements getNext() {
        return next;
    }

    void setNext(Elements element){
        next = element;
    }

    void setPrevious(Elements element){
        previous = element;
    }

    public Elements getPrevious() {
        return previous;
    }
}

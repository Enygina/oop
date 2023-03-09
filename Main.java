import java.util.Iterator;
public class Main {
    public static void main(String[] args) {
        MyLinkList list = new MyLinkList();
        list.add("один");
        list.add("два");
        list.add("три");
        list.add("четыре");
        list.add("пять");
        list.add("шесть");
        list.remove(5);



        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println("Элемент с индексом 3 : "+ list.get(3));
        System.out.println("Длинна списка: " + list.size());

    }
}

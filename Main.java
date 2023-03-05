import java.util.List;

public class Main {
    public static void main(String[] args) {
        Zoo zoopark = new Zoo();
        zoopark.addAnimals(List.of(new Cat("Barsik"),
                new Dog("Sharik"),
                new Rabbit("Whik"),
                new Cow("Murka"),
                new Duck("Krya"),
                new Butterfly("Yellow"),
                new Seal("Silly"),
                new Hippopotamus("Pit")));
        for (Sayable item : zoopark.getSayAble()) {
            System.out.println(item.say());
        }
        System.out.println("---------------------------------------------");
        for (Runable item : zoopark.getRunable()){
            System.out.println(item);
        }
        System.out.println("---------------------------------------------");
        for (Flyable item : zoopark.getFlyable()){
            System.out.println(item);
        }
        System.out.println("---------------------------------------------");
        System.out.println("The fastest in running");
        System.out.println(zoopark.getWinner());

        System.out.println("---------------------------------------------");
        System.out.println("The fastest in flight");
        System.out.println(zoopark.getWinnerFly());

        System.out.println("---------------------------------------------");
        System.out.println("The fastest in swimming");
        System.out.println(zoopark.getWinnerSwim());
    }
}
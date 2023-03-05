

public class Duck extends Herbivores implements Flyable, Runable, Swimable {
    public Duck(String nickname) {
        super(nickname);

    }

    @Override
    public int speedOfFly() {
        return 50;
    }
    public String toString(){
        return "I'm duck. " + super.toString() + ". My run speed is " + speedOfRun() + ", speed of fly " + speedOfFly()+ ". My swim speed is " + speedOfSwim();
    }
    @Override
    public int speedOfRun() {
        return 10;
    }

    @Override
    public String say() {
        return "Krya-krya";
    }

    @Override
    public int speedOfSwim() {
        return 3;
    }
}

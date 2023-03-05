

public class Dog extends Predator implements Runable, Swimable {
    public Dog(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm dog. " + super.toString() + ". My run speed is " + speedOfRun()+ ". My swim speed is " + speedOfSwim();
    }
    public String say(){
        return "gav-gav";
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public int speedOfSwim() {
        return 2;
    }
}



public class Cow extends Herbivores implements Runable, Swimable {
    public Cow(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm cow. " + super.toString() + ". My speed is " + speedOfRun()+ ". My swim speed is " + speedOfSwim();
    }
    public String say(){
        return "Mu-mu";
    }

    @Override
    public int speedOfRun() {
        return 5;
    }

    @Override
    public int speedOfSwim() {
        return 2;
    }
}
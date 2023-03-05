public class Seal extends Predator implements Swimable {
    public Seal(String nickname) {
        super(nickname);
    }

    public String toString(){
        return "I'm seal. " + super.toString() + ". My swim speed is " + speedOfSwim();
    }

    @Override
    public String say() {
        return "Ui-Ui";
    }

    @Override
    public int speedOfSwim() {
        return 10;
    }
}

public class Hippopotamus extends Herbivores implements Runable, Swimable {
    public Hippopotamus(String nickname) {
        super(nickname);
    }
    public String toString(){
        return "I'm Hippo. " + super.toString() + ". My swim speed is " + speedOfSwim()+ ". My run speed is " + speedOfRun();
    }
    @Override
    public String say() {
        return "Hra-hra";
    }

    @Override
    public int speedOfRun() {
        return 20;
    }

    @Override
    public int speedOfSwim() {
        return 8;
    }
}

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        quackBehaviour = new MuteQuack();
        swimBehaviour = new Drowning();
        flyBehaviour = new NoFly();
    }
    public void display() {
        System.out.println("I am a Decoy Duck.");
    }
}
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak(); // Assigns Squeak behavior
        swimBehaviour = new Floating();
        flyBehaviour = new NoFly();
    }


    @Override
    public void display() {
        System.out.println("I am a rubber duck..");
    }
}


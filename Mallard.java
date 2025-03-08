public class Mallard extends Duck{
    public Mallard(){
        quackBehaviour = new Quack();

        swimBehaviour = new Swimming();

        flyBehaviour = new Flying();
    }
    @Override
    public void display(){
        System.out.println("I am a Mallard duck.");
    }
}
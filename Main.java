// Main Class to demonstrate Duck Behavior
public class Main {
    public static void main(String[] args) {
        Mallard md = new Mallard();
        RubberDuck rd = new RubberDuck();
        DecoyDuck dd = new DecoyDuck();
        RedheadDuck rhd = new RedheadDuck();

        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("--------");

        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("--------");

        dd.display();
        dd.performQuack();
        dd.performSwim();
        dd.performFly();
        System.out.println("--------");

        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        rhd.performFly();
    }
}
class RedheadDuck extends Duck {
    public RedheadDuck() {
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new Flying();
    }
    public void display() {
        System.out.println("I am a Redhead Duck.");
    }
}
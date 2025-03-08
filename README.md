# Behaviour-Of-a-Duck
Used Intellij IDEA community Edition 
Duck Behavior Simulation

Overview

This project demonstrates the behavior of different types of ducks by implementing the Strategy design pattern. Each duck has a unique combination of flying, swimming, and quacking behaviors, which are defined through interfaces and concrete classes.

Features

Implements FlyBehavior, SwimBehavior, and QuackBehavior as interfaces.

Ducks have dynamic behavior using the Strategy pattern.

Supports different types of ducks: Mallard Duck, Rubber Duck, Decoy Duck, and Redhead Duck.

Implements multiple swim behaviors: Swimming, Floating, and Drowning.

Implements multiple fly behaviors: Flying and NoFly.

Implements multiple quack behaviors: Quack, Squeak, and MuteQuack.

Classes and Interfaces

Main Class

Main – Executes the program by creating and displaying different ducks.

Abstract Class: Duck

Defines the base class for all ducks.

Has three behaviors: FlyBehavior, SwimBehavior, and QuackBehavior.

Uses setter methods to allow dynamic behavior changes.

Implements display(), performQuack(), performSwim(), and performFly() methods.

Interfaces

FlyBehavior – Defines the fly() method.

SwimBehavior – Defines the swim() method.

QuackBehavior – Defines the quack() method.

Behavior Implementations

Swim Behaviors

Swimming – Ducks swim normally.

Floating – Ducks float on water.

Drowning – Ducks sink.

Fly Behaviors

Flying – Ducks can fly.

NoFly – Ducks cannot fly.

Quack Behaviors

Quack – Ducks quack normally.

Squeak – Ducks squeak instead of quacking.

MuteQuack – Ducks are silent.

Duck Implementations

Mallard – Quacks, swims, and flies.

RubberDuck – Squeaks, floats, and cannot fly.

DecoyDuck – Silent, drowns, and cannot fly.

RedheadDuck – Quacks, swims, and flies.

How to Run

Install IntelliJ IDEA (Professional Edition) or any Java-compatible IDE.

Copy and paste the code into a new Java project.

Run the Main class to observe the duck behaviors.

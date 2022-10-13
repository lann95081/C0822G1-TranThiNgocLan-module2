package ss7_abstract_interface.practice.animals;

public class Chicken extends Animal implements Edible {
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    public String howToEat() {
        return "could be fried";
    }


}

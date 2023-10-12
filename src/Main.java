public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.run(150);
        cat1.swim(10);

        Dog dog1 = new Dog();
        dog1.run(20);
        dog1.swim(200);

        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        Cat cat6 = new Cat();
        System.out.printf("The number of cats are: %d", cat6.getNumberOfCats());

        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();
        Dog dog5 = new Dog();
        Dog dog6 = new Dog();
        System.out.printf("\nThe number of dogs are: %d", dog6.getNumberOfDogs());
    }
}

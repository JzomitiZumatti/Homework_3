class Cat extends Animal{
    private static int numberOfCats = 0;

    public Cat() {
        numberOfCats++;
    }

    public int getNumberOfCats() {
        return numberOfCats;
    }

    @Override
    public void swim(int lengthOfObstacle) {
        System.out.println("Cat's can't swim.");
    }

    @Override
    public void run(int lengthOfObstacle) {
        if (lengthOfObstacle > 200) {
            System.out.println("Cats can only run 200 meters, than it need to have a rest.");
        } else {
            System.out.println("The cat ran " + lengthOfObstacle + " meters.");
        }
    }
}

 class Dog extends Animal{

    private static int numberOfDogs = 0;
    public Dog() {
        numberOfDogs++;
    }

     public int getNumberOfDogs() {
         return numberOfDogs;
     }

     @Override
     public void run(int lengthOfObstacle) {
         if (lengthOfObstacle > 500) {
             System.out.println("Dogs can only run 500 meters, than it need to have a rest.");
         } else {
             System.out.println("The dog ran " + lengthOfObstacle + " meters.");
         }
     }

     @Override
     public void swim(int lengthOfObstacle) {
         if (lengthOfObstacle > 10) {
             System.out.println("Dogs can only swim 10 meters, than it need to have a rest.");
         } else {
             System.out.println("The dog swam " + lengthOfObstacle + " meters.");
         }
     }
 }

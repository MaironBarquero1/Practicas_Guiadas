public class Main {

    public static void main(String[] args) {

        /*int[] numbers = {10, 20, 30, 40, 50};

        String[] fruits = new String[3];

        System.out.println(numbers[2]);
        System.out.println(fruits[2]);*/

        PetManager petManager = new PetManager(3);
        Person person = new Person("Mairon", 18, petManager);
        for(Pet pet : petManager.getPets()){
            System.out.println(pet.getPetName());
        }


        
    }
}

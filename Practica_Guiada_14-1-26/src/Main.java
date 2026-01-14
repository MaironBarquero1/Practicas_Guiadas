public class Main {

    public static void main(String[] args) {

        /*
         * int[] numbers = {10, 20, 30, 40, 50};
         * 
         * String[] fruits = new String[3];
         * 
         * System.out.println(numbers[2]);
         * System.out.println(fruits[2]);
         */


        Person person = new Person("Mairon", 18, 3);
        Pet pet1 = new Pet("Goldie", "Fish");


        /*for (Pet pet : petManager.getPets()) {
            System.out.println(pet.getPetName());
        }*/

        if (person.addPet(pet1)) {
            IOManager.printMessage("Pet added successfully");
        } else {
            IOManager.printMessage("Failed to add pet");
        }

        for (Pet pet : person.getPetManager().getPets()) { 
            System.out.println(pet.getPetName());
        }

        /* 
        if(person.removePet(pet1)){
            IOManager.printMessage("Pet remove successfully");
        }else{
            IOManager.printMessage("Failed to remove pet");
        }*/

        if(person.getPets().length == 0){
            IOManager.printMessage("No pets found");
        }else{
            for (Pet pet : person.getPets()) {
                IOManager.printMessage(pet.getPetName());
            }
        }

        Pet pet2 = new Pet("Max", "Dog");
        if(person.getPetManager().updatePets(pet2, 0)){
            IOManager.printMessage("Pet update successfully");
        }else{
            IOManager.printMessage("Update error");
        }

        for (Pet pet : person.getPetManager().getPets()) { 
            System.out.println(pet.getPetName());
        }

        





    }

}

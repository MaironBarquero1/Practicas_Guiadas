public class Person {

    private String name;
    private int age;
    private PetManager petManager;;

    public Person() {
        
    }

    public Person(String name, int age, int numberPets) {
        this.name = name;
        this.age = age;
        this.petManager = new PetManager(numberPets);
    }

    public boolean addPet(Pet pet){
        return petManager.addPet(pet);
    }

    public PetManager getPetManager() {
        return petManager;
    }

    public boolean removePet(Pet pet){
        return petManager.removePet(pet);
    }

    public Pet[] getPets(){
        return petManager.getPets();
    }

}

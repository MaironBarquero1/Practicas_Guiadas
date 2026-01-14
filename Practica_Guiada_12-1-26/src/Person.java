public class Person {

    private String name;
    private int age;
    private PetManager petManager;;

    public Person() {
        
    }

    public Person(String name, int age, PetManager petManager) {
        this.name = name;
        this.age = age;
        this.petManager = petManager;
    }

    public boolean addPet(Pet pet){
        return petManager.addPet(pet);
    }

}

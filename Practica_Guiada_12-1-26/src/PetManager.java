public class PetManager {

    private int contador = 0;
    private Pet[] pets;

    public PetManager(int numeroPets) {
        this.pets = new Pet[numeroPets];
    }
    
    public boolean addPet(Pet pet){
        for (int i = 0; i < pets.length; i++) {
            if(pets[i] == null){
                pets[i] = pet;
                contador++;
                return true;
            }else{
                return false;
            }
        }
        return false;
    }

    public Pet[] getPets() {
        return pets;
    }


}

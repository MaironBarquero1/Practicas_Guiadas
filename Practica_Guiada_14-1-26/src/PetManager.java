public class PetManager {

    private int contador = 0;
    private Pet[] pets;

    public PetManager(int numeroPets) {
        this.pets = new Pet[numeroPets];
    }

    public boolean addPet(Pet pet) {
        for (int i = 0; i < pets.length; i++) {
            if (pets[i] == null) {
                pets[i] = pet;
                contador++;
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public boolean removePet(Pet pet){
        for (int i = 0; i < pets.length; i++) {
            if(pets[i] != null && pets[i].equals(pet)){
                for (int j = i; j < pets.length - 1; j++) {
                    pets[j] = pets[j + 1];
                }
                pets[pets.length - 1] = null;
                contador--;
                return true;
            }
        }
        return false;
    }

    public Pet[] getPets(){
        Pet[] pets = new Pet[this.contador];

        for (int i = 0; i < this.contador; i++) {
            pets[i] = this.pets[i];
        }
        return pets;
    }

    public boolean updatePets(Pet pet, int index){
        if(index > contador || index < 0) return false;
        if(pet == null) return false;

        pets[index] = pet; return true;
    }

}

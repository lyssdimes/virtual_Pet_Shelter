package virtual_pet_shelter;

import java.util.Random;

public class VirtualPet {
    private String petName = "";
    private String petDescription = "";
    private int petHunger;
    private int petThirst;
    private int petBoredom;

    public String getPetName() {
        return petName;
    }

    public String getPetDescription() {
        return petDescription;
    }

    public int getPetHunger() {
        return petHunger;
    }

    public int getPetThirst() {
        return petThirst;
    }

    public int getPetBoredom() {
        return petBoredom;
    }

    private int createRandomValue() {
        Random value = new Random();
        return value.nextInt(45) + 1;
    }

    public VirtualPet(String petName, String petDescription, int PetHunger, int petThirst, int petBoredom) {
        this.petName = petName;
        this.petDescription = petDescription;
        this.petHunger = createRandomValue();
        this.petThirst = createRandomValue();
        this.petBoredom = createRandomValue();
    }

    public VirtualPet(String petName, String petDescription) {
        this.petName = petName;
        this.petDescription = petDescription;
    }

    public void feed() {
        petHunger -= 15;
        if (petHunger < 0) {
            petHunger = 0;
        }
    }

    public void drink() {
        petThirst -= 15;
        if (petThirst < 0) {
            petThirst = 0;
        }
    }

    public void play() {
        petBoredom -= 15;
        if (petBoredom < 0) {
            petBoredom = 0;
        }
    }
}

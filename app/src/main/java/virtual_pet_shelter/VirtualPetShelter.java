package virtual_pet_shelter;

import java.util.ArrayList;

public class VirtualPetShelter { 
 private ArrayList<VirtualPet> shelterPetList;

    public ArrayList<VirtualPet> getShelterPetList() {
        return shelterPetList;
    }

    public VirtualPetShelter() {
        shelterPetList = new ArrayList<>();

        VirtualPet firstAdoptee = new VirtualPet("Princess",
                "Female. 6yrs old. White long haired cat that enjoys lots of pets and relaxing", 0, 0, 0);
        shelterPetList.add(firstAdoptee);
        VirtualPet secondAdoptee = new VirtualPet("Lou",
                "Male. 2yr old pitbull. The goodest boy. Enjoys jogs and smiling after being pet", 0, 0, 0);
        shelterPetList.add(secondAdoptee);
        VirtualPet thirdAdoptee = new VirtualPet("Peppermint",
                "Male. 3yr old black kitty w a tuft of white on chest. Loves under the chin rubs and laying in laps", 0,
                0, 0);
        shelterPetList.add(thirdAdoptee);
        VirtualPet fourthAdoptee = new VirtualPet("Ronald",
                "Male. 8yr old beagle. Enjoys ear scratches and short relaxing walks", 0, 0, 0);
        shelterPetList.add(fourthAdoptee);
        VirtualPet fifthAdoptee = new VirtualPet("Charlotte",
                "Female. 12yr old tabby cat. Plays well with other animals. Lives to chill.", 0, 0, 0);
        shelterPetList.add(fifthAdoptee);
        VirtualPet sixthAdoptee = new VirtualPet("Clementine",
                "Female. 6month old orange kitty. Loves running around and playing with people and animals", 0, 0, 0);
        shelterPetList.add(sixthAdoptee);
    }

    public void feedAllAdoptees() {
        for (VirtualPet adoptees : shelterPetList) {
            adoptees.feed();
        }
    }

    public void waterForAllAdoptees() {
        for (VirtualPet adoptees : shelterPetList) {
            adoptees.drink();
        }
    }

    public void playWithSelectedAnimal(String animalToPlayWith){
        for (VirtualPet adoptee : shelterPetList) {
            if (adoptee.getPetName().equalsIgnoreCase(animalToPlayWith)){
                adoptee.play();
            }
        }
    }

    public void removeAdoptedPet(VirtualPet adoptedPetsName){
        shelterPetList.remove(adoptedPetsName);
        // double check this. may be overlooking something? make sure completely removed
    }

    public void addNewPetForAdoption(VirtualPet newAdopteesName){
        shelterPetList.add(newAdopteesName);
        // remember to add new virtual pet object in VirtualPetApp.java for this
    }

}


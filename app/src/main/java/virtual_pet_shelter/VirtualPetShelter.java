package virtual_pet_shelter;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelterPetList;

    public ArrayList<VirtualPet> getShelterPetList() {
        return shelterPetList;
    }

    public VirtualPetShelter() {
        shelterPetList = new ArrayList<>();

        VirtualPet firstAdoptee = new VirtualPet("Shortcake",
                "Female. 6yr old white long haired cat. Enjoys food & relaxing", 0, 0, 0);
        shelterPetList.add(firstAdoptee);
        VirtualPet secondAdoptee = new VirtualPet("Lou",
                "Male. 2yr old pitbull. Enjoys jogs & smiling after being pet", 0, 0, 0);
        shelterPetList.add(secondAdoptee);
        VirtualPet thirdAdoptee = new VirtualPet("Peppermint",
                "Male. 3yr old black kitty. Enjoys chin scratches & laying in laps", 0,
                0, 0);
        shelterPetList.add(thirdAdoptee);
        VirtualPet fourthAdoptee = new VirtualPet("Ronald",
                "Male. 8yr old beagle. Enjoys ear scratches and short walks", 0, 0, 0);
        shelterPetList.add(fourthAdoptee);
        VirtualPet fifthAdoptee = new VirtualPet("Charlotte",
                "Female. 12yr old tabby cat. Enjoys rest, but plays well with others.", 0, 0, 0);
        shelterPetList.add(fifthAdoptee);
        VirtualPet sixthAdoptee = new VirtualPet("Clementine",
                "Female. 6month old orange kitty. Enjoys zoomies, people, and animals", 0, 0, 0);
        shelterPetList.add(sixthAdoptee);
        VirtualPet seventhAdoptee = new VirtualPet("Zoolander", "Male. 2yr old Russian blue cat. Enjoys blue steel.", 0, 0 ,0);
        shelterPetList.add(seventhAdoptee);
    }

    public void feedAllAdoptees() {
        for (VirtualPet adoptees : shelterPetList) {
            adoptees.feed();
        }
        System.out.println("Thank you for feeding all the pets!");
    }

    public void waterForAllAdoptees() {
        for (VirtualPet adoptees : shelterPetList) {
            adoptees.drink();
        }
        System.out.println("Thank you for giving all the pets water!");
    }

    public void playWithSelectedAnimal(String animalToPlayWith) {
        boolean petFound = false;
        for (VirtualPet adoptee : shelterPetList) {
            if (adoptee.getPetName().equalsIgnoreCase(animalToPlayWith)) {
                adoptee.play();
                petFound = true;
            }
        }if (!petFound) {
        System.out.println("Sorry. Pet not found. Please try again.");
            }else {
                System.out.println("Thank you for playing with " + animalToPlayWith);
            }
        }

    public void removeAdoptedPet(String adoptedPetsName) {
        VirtualPet petToAdopt = null;
        for (VirtualPet adopted : shelterPetList) {
            if (adopted.getPetName().equalsIgnoreCase(adoptedPetsName)) {
                petToAdopt = adopted;
            }
        }
            if (petToAdopt != null) {
                shelterPetList.remove(petToAdopt);
                System.out.println("Thank you for agreeing to take home a furry friend.");
                System.out.println("Please stop at the front desk to finalize the adoption of " + adoptedPetsName + ".");
            } else {
                System.out.println("Uh oh. Pet not found. Please call the office to inquire.");
            }
        }

    public void addNewPetForAdoption(VirtualPet newAdopteesName) {
        shelterPetList.add(newAdopteesName);
    }

}

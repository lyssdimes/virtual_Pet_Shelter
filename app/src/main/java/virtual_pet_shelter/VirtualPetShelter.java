package virtual_pet_shelter;

import java.util.ArrayList;

public class VirtualPetShelter {
    private ArrayList<VirtualPet> shelterPetList;
    private ArrayList<VirtualPet> descriptivePetList;

    public ArrayList<VirtualPet> getShelterPetList() {
        return shelterPetList;
    }

    public ArrayList<VirtualPet> getDescriptivePetList() {
        return descriptivePetList;
    }

    public VirtualPetShelter() {
        shelterPetList = new ArrayList<>();

        VirtualPet firstAdoptee = new VirtualPet("Shortcake", 0, 0, 0);
        shelterPetList.add(firstAdoptee);
        VirtualPet secondAdoptee = new VirtualPet("Peppermint", 0, 0, 0);
        shelterPetList.add(secondAdoptee);
        VirtualPet thirdAdoptee = new VirtualPet("Charlotte", 0, 0, 0);
        shelterPetList.add(thirdAdoptee);
        VirtualPet fourthAdoptee = new VirtualPet("Clementine", 0, 0, 0);
        shelterPetList.add(fourthAdoptee);
        VirtualPet fifthAdoptee = new VirtualPet("Zoolander", 0, 0, 0);
        shelterPetList.add(fifthAdoptee);
    }

    public VirtualPetShelter(String name, String description) {
        descriptivePetList = new ArrayList<>();

        VirtualPet firstAdopteeDescription = new VirtualPet("Shortcake",
                "White long haired cat that enjoys being brushed");
        descriptivePetList.add(firstAdopteeDescription);
        VirtualPet secondAdopteeDescription = new VirtualPet("Peppermint",
                "Black short haired cat that loves playing with string toys");
        descriptivePetList.add(secondAdopteeDescription);
        VirtualPet thirdAdopteeDescription = new VirtualPet("Charlotte",
                "Chocolate lab that enjoys daily walks in the park");
        descriptivePetList.add(thirdAdopteeDescription);
        VirtualPet fourthAdopteeDescription = new VirtualPet("Clementine",
                "Gray pitbull that enjoys jogs and belly rubs");
        descriptivePetList.add(fourthAdopteeDescription);
        VirtualPet fifthAdopteeDescription = new VirtualPet("Zoolander",
                "Russian blue cat that enjoys short walks outside");
        descriptivePetList.add(fifthAdopteeDescription);
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
        }
        if (!petFound) {
            System.out.println("Sorry. Pet not found. Please try again.");
        } else {
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

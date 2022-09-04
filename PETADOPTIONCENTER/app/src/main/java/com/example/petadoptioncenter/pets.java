package com.example.petadoptioncenter;

public class pets {

    //object
    private String PetName;
    private int PetAge;
    private int PetImage;

    public pets(String petName, int petAge, int petImage) {
        PetName = petName;
        PetAge = petAge;
        PetImage = petImage;
    }

    public String getPetName() {
        return PetName;
    }

    public void setPetName(String petName) {
        PetName = petName;
    }

    public int getPetAge() {
        return PetAge;
    }

    public void setPetAge(int petAge) {
        PetAge = petAge;
    }

    public int getPetImage() {
        return PetImage;
    }

    public void setPetImage(int petImage) {
        PetImage = petImage;
    }
}







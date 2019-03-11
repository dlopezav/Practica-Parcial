/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.util.ArrayList;

/**
 *
 * @author dfeli
 */
public class Veterinaria {

    private ArrayList<Pet> pets;

    public Veterinaria() {
        this.pets = new ArrayList<>();
    }
    
    
    private void RemotePet(Pet p ){
        for(Pet q: pets){
            
        }
    }

    private ArrayList<Pet> ShowPetsByType(String type){
        return pets;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }
    
}
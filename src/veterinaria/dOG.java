/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

/**
 *
 * @author dfeli
 */
public class dOG extends Pet{
    private String breed;
    
    public dOG(String id, String name, String hairColor , String breed) {
        super(id, name, hairColor);
    }

    @Override
    public String sound() {
        return "guau";
        
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
}

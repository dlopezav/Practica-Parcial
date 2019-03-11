/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinaria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author dfeli
 */
public class Starter {
    public static ArrayList<Person> personas;
    public static Veterinaria vet;
    
    
    public static void main(String[] args) throws IOException {
        int x;
        personas = new ArrayList<>(); 
        Scanner lectura = new Scanner(System.in);
        vet = new Veterinaria();
        ReadPets(vet);
        for(Pet i: vet.getPets()){
        System.out.println(i.sound());
        }
        for(Person p:personas){
            System.out.println(p.getName());
        }
    }
    public static void ReadPets(Veterinaria v) throws IOException{
        File file = new File("ARCHIVO/pets.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        ArrayList<Pet> petss = new ArrayList();
        FileInputStream fa = new FileInputStream (file); 
        BufferedReader lfa = new BufferedReader(new InputStreamReader(fa));
        while(lfa.ready()){
            String q = lfa.readLine();
        
            if(q.contains("Dog")){
                String x[]=q.split(" ");
                Pet pet = new dOG(x[1],x[2],x[3],x[4]);
                petss.add(pet);
                String dueno = lfa.readLine();
                String y[] = dueno.split(" ");
                boolean bobo=false;
                for(Person xx: personas){
                    if(xx.getId().equals(y[1])){
                        xx.getPets().add(pet);
                        bobo = true;
                    }
                }
                if(bobo==false){
                    Person person = new Person(y[0],y[1]);
                    person.getPets().add(pet);
                    personas.add(person);
                }
            }
            if(q.contains("Cat")){
            String x[]=q.split(" ");
                Pet pet = new Cat(parseBoolean(x[4]),x[2],x[3],x[1]);
                
                petss.add(pet);
                String dueno = lfa.readLine();
                String y[] = dueno.split(" ");
                boolean bobo=false;
                for(Person xx: personas){
                    if(xx.getId().equals(y[1])){
                        xx.getPets().add(pet);
                        bobo = true;
                    }
                }
                if(bobo==false){
                    Person person = new Person(y[0],y[1]);
                    person.getPets().add(pet);
                    personas.add(person);
                }
            }
            if(q.contains("Hamster")){
            String x[]=q.split(" ");
                Pet pet = new Hamster(parseDouble(x[4]),x[2],x[3],x[1]);
                petss.add(pet);
                String dueno = lfa.readLine();
                String y[] = dueno.split(" ");
                boolean bobo=false;
                for(Person xx: personas){
                    if(xx.getId().equals(y[1])){
                        xx.getPets().add(pet);
                        bobo = true;
                    }
                }
                if(bobo==false){
                    Person person = new Person(y[0],y[1]);
                    person.getPets().add(pet);
                    personas.add(person);
                }
            }
        }
        v.setPets(petss);
    }
    public void manageVet(Veterinaria v, String action){
        
    }
}

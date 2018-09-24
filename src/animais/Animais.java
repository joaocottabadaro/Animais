/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;
import java.util.ArrayList;
/**
 *
 * @author ice
 */
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal animal1 = new Animal();
       // animal1.comer();
       // animal1.dormir();
       // animal1.emitirSom();
        
        Cachorro dog1 = new Cachorro();
       // dog1.comer();
       // dog1.dormir();
        
        Animal[] animal= new Animal[2];
        animal[0] = new Cachorro();
        animal[1] = new Gato();
                
        ArrayList<Animal> animal2 = new ArrayList();
        animal2.add(new Cachorro());
        animal2.add(new Gato());
        animal2.add(new Cachorro());
        animal2.add(new Gato());
        animal2.add(new Cachorro());
        animal2.add(new Gato());
        animal2.add(new Cachorro());
        animal2.add(new Gato());
        
        
        for(int i=0;i<8;i++)
            animal2.get(i).emitirSom();
                
                
        
       
        
        
    }
    
}

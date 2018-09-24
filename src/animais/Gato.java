/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

/**
 *
 * @author ice
 */
public class Gato extends Animal {
    String nome = "gato123";
    @Override
    public void emitirSom() {
         System.out.println("miao");
        super.emitirSom();
        
        
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Gato{" + "nome=" + nome + '}';
    }

   
    
 
    
    
    
}

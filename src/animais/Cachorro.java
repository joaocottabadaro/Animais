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
public class Cachorro extends Animal{
    String Nome ;
    int idade;

    
    
    /**
     *
     */
    @Override
    public void dormir()
            
    {
        super.emitirSom();
        System.out.println(" ao ao");}
}

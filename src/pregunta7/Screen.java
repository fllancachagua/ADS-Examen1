/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta7;

/**
 *
 * @author Felipe
 */
public class Screen implements DeviceOutput{

    @Override
    public void write(String text) {
        System.out.println("Showing in screen: "+text);
    }
    
}

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
public class ContainerIOC {
    public DeviceOutput getInstance(String concreto) {
        if (concreto.equals("Printer")) return new Printer();
        if (concreto.equals("Screen")) return new Screen();
        return null;
    }
}

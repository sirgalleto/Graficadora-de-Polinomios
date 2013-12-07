/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package graficadora.logica;

/**
 *
 * @author pandres95
 */
public class Derivadora {
    
    public static double derivar(double[] coeficientes, int punto){
        double suma = 0;
        for(int c = 1; c < coeficientes.length; c++){
            suma += c * coeficientes[c] * Math.pow(punto, c-1);
        }
        return suma;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author joaolopes
 */
public class Calculadora {
    //private String[] linhaTrain;
    //private String[] linhaTest;
    private double[] linhaTrain;
    private double[] linhaTest;
    
    
    /*public Calculadora(String[] linhaTrain, String[] linhaTest) {
        this.linhaTrain = linhaTrain;
        this.linhaTest = linhaTest;
    }*/

    
    public Calculadora(double[] linhaTrain, double[] linhaTest) {
        this.linhaTrain = linhaTrain;
        this.linhaTest = linhaTest;
    }
    
    /*public double calcDistancia(){
        double distancia = 0;
        for(int contador = 0; contador < linhaTest.length - 1 ; contador++ ){
            distancia += Math.abs(Double.parseDouble(linhaTrain[contador]) - Double.parseDouble(linhaTest[contador]));
            //distancia += Math.abs(linhaTrain[contador] - linhaTest[contador]);
        }
        return distancia;
    }*/
    
    public double calcDistancia(){
        double distancia = 0;
        for(int contador = 0; contador < linhaTest.length - 1 ; contador++ ){
            distancia += Math.abs(linhaTrain[contador] - linhaTest[contador]);
        }
        return distancia;
    }
    
}
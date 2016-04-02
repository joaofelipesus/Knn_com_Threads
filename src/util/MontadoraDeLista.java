/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import beans.Ponto;
import java.util.ArrayList;
import java.util.List;
import threads.ProcessaPontosRunnable;

/**
 *
 * @author joaofelipe
 */
public class MontadoraDeLista {
    private List<ProcessaPontosRunnable> runnables;
    private List<List<Ponto>> pontosMaisProximos;

    public MontadoraDeLista(List<ProcessaPontosRunnable> runnables) {
        this.runnables = runnables;
        this.pontosMaisProximos = new ArrayList<>();
    }
    
    public List<List<Ponto>> monta(){
         new ArrayList<>();
        for(ProcessaPontosRunnable run : runnables){
           for(List<Ponto> ponto : run.getResultados()){
                pontosMaisProximos.add(ponto);
            }
        }
        return pontosMaisProximos;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica02;

import java.util.ArrayList;
import practica02.Transition.Action;

/**
 *
 * @author JoseAlberto
 */
public class State {
    public enum Position {DERECHA,IZQUIERDA}
    public Position Canibal1;
    public Position Canibal2;
    public Position Canibal3;
    public Position Misionero1;
    public Position Misionero2;
    public Position Misionero3;
    public Position Bote;
    
    public boolean isValid(){
        if ((Canibal1 == Position.DERECHA)&&
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
        return false;
        if ((Canibal1 == Position.DERECHA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Canibal1 == Position.DERECHA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.DERECHA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.DERECHA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.DERECHA)&&
                (Misionero3 == Position.DERECHA)&&
                (Bote == Position.IZQUIERDA))
            return false;
        if ((Canibal1 == Position.IZQUIERDA)&& 
                (Canibal2 == Position.DERECHA)&&
                (Canibal3 == Position.DERECHA)&&
                (Misionero1 == Position.DERECHA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.IZQUIERDA)&&
                (Bote == Position.DERECHA))
            return false;
        return true;
        
    }
  public boolean isFinal(){
      if ((Canibal1 == Position.IZQUIERDA)&&
                (Canibal2 == Position.IZQUIERDA)&&
                (Canibal3 == Position.IZQUIERDA)&&
                (Misionero1 == Position.IZQUIERDA)&&
                (Misionero2 == Position.IZQUIERDA)&&
                (Misionero3 == Position.IZQUIERDA)&&
                (Bote == Position.IZQUIERDA))
            return true;
      return false;
  }
  public ArrayList<Transition> validTransitions(){
      ArrayList<Transition> result =new 
            ArrayList<Transition>();
      //Mover al bote siempre es posible
      result.add(new Transition(this,Action.MOVER_BOTE));
      
        if (Misionero1 == Bote){
            result.add(new Transition(this, Action.MOVER_MISIONERO1));
        }
        return result;
  }
        public static void main (String[] args){
            State test =new State();
            test.Bote = Position.DERECHA;
            System.out.print(test);
        }
        @Override
        public String toString(){
            return "Posición Misionero1: " + Misionero1 + "," +
                "Posición Misionero2: "+ Misionero2 + "," +
                "Posición Misionero3: " + Misionero3 + "," +
                "Posición Canibal1: " + Canibal1 + "," +
                "Posición Canibal2: " + Canibal2 + "," +
                "Posición Canibal3: " + Canibal3 + "," +
                "Posición Bote: "+ Bote;

     




    }
}

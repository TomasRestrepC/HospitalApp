/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.hospitalapp.exceptions;

/**
 * La clase consiste en con una excepcíon decir que el hospital quebro
 * @author Tomas
 *  versión 1.0
 * @since 2025-04-09
 */
  public class DeclararQuiebraException  extends RuntimeException{

      /**
       *  Se dice que el hospital ha entrado en quiebra
       */
        public DeclararQuiebraException() {
            super("El hospital ha entrado en quiebra");
        }
    }


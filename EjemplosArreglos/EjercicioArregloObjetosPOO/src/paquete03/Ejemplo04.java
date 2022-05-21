/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class Ejemplo04 {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {new Calificacion(10, "Computación"), 
            new Calificacion(9, "Electrónica")};
        
        
        
        double acumulador = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            acumulador = acumulador + objetoCalificacion.obtenerNota();
        }
        double promedio = acumulador / calificaciones.length;
        
        System.out.printf("Promedio = %.2f\n", promedio);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_materias;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_6_Materias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clave, nombre, creditos, hrTeo, hrPrac, carrera
        //tipoMat
        String clave, nombre,carrera;
        int creditos, hrTeo, hrPra;
        boolean tipoMat;
        //captura
        Scanner cap = new Scanner(System.in);
        System.out.println("introduce la calve de la materia:");
        clave = cap.nextLine();
        System.out.println("introduce el nombre de la materia:");
        nombre = cap.nextLine();
        System.out.println("introduce la carrera de la materia:");
        carrera = cap.nextLine();
        System.out.println("introduce los creditos de la materia:");
        creditos = cap.nextInt();
        System.out.println("introduce las horas teoricas de la materia:");
        hrTeo = cap.nextInt();
        System.out.println("introduce las horas practicas de la materia:");
        hrPra = cap.nextInt();
        System.out.println("introduce el tipo de la materia[true--> generico, falso--> especialidad]:");
        tipoMat = cap.nextBoolean();
        
        //HACER ALGO CON LOS DATOS CAPTURADOS
        System.out.println("Datos de la asignatura");
        System.out.println(clave);
        System.out.println(nombre);
        System.out.println(carrera);
        System.out.println(creditos);
        System.out.println(hrTeo);
        System.out.println(hrPra);
        System.out.println(tipoMat);        
    }
    
}

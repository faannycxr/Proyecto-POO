/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinalpoo12eq02;

/**
 *
 * @author caban
 */
public class cambiarPagina {
    public static void Carga()
    {
        char[] spinner = {'|', '/', '-', '\\'};
        System.out.println("Cargando..... ");
        for (int i = 0; i < 20; i++) {
            System.out.print("");
            try { Thread.sleep(200); } catch (Exception e) {}
        }
    }
    
    public static void saltoPagina()
    {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
}

package com.mycompany.proyectofinalpoo12eq02;

public class programaLealtad {

    private boolean cuenta;
    private boolean registro;

    private double puntosTotal;       
    private int nivel;                
    private double puntosRecompensa;  
    private double subirNivel;
    private int nivelSuperior;

    private double dineroAcumulado;

    public programaLealtad(boolean cuenta) {
        this.cuenta = cuenta;
        this.registro = false;

        puntosTotal = 0;
        nivel = 0;
        puntosRecompensa = 0.01;
        nivelSuperior = 5;
        subirNivel = 1000;
        dineroAcumulado = 0;
    }

    public void activarRegistro() {
        if (!cuenta) {
            System.out.println("No tiene cuenta registrada.");
            return;
        }
        registro = true;
        System.out.println("Se ha registrado al programa de lealtad.");
    }

    public void verificarPrograma() {
        if (!cuenta) {
            System.out.println("No tiene cuenta registrada.");
            return;
        }
        if (!registro) {
            System.out.println("No se registro en el programa de lealtad.");
            return;
        }
        mostrarPrograma();
    }

    public void mostrarPrograma() {
        System.out.println("============================================");
        System.out.println("Programa de Lealtad");
        System.out.println("Donde tu confianza te recompensa");
        System.out.println("Puntos totales: " + puntosTotal);
        System.out.println("Nivel actual: " + nivel);
        System.out.println("Porcentaje de recompensa: " + (puntosRecompensa * 100) + "%");
        System.out.println("Dinero faltante para subir: $" + subirNivel);
        System.out.println("Proximo nivel: " + nivelSuperior);
        System.out.println("============================================");
    }

    public void registrarCompra(double totalPagado) {
        if (!cuenta) {
            System.out.println("No tiene cuenta registrada.");
            return;
        }
        if (!registro) {
            System.out.println("No se ha afiliado al programa de lealtad");
            return;
        }

        dineroAcumulado += totalPagado;

        double puntosGanados = totalPagado * puntosRecompensa;
        puntosTotal += puntosGanados;

        actualizarNivel();
    }

    private void actualizarNivel() {
        if (nivel < 5) {
            nivelSuperior = 5;
            subirNivel = 1000 - dineroAcumulado;
            puntosRecompensa = 0.01;

            if (dineroAcumulado >= 1000) {
                nivel = 5;
                dineroAcumulado = 0;
            }
            return;
        }

        if (nivel >= 5 && nivel < 10) {
            nivelSuperior = 10;
            subirNivel = 1200 - dineroAcumulado;
            puntosRecompensa = 0.085;

            if (dineroAcumulado >= 1200) {
                nivel = 10;
                dineroAcumulado = 0;
            }
            return;
        }

        if (nivel >= 10 && nivel < 15) {
            nivelSuperior = 15;
            subirNivel = 1350 - dineroAcumulado;
            puntosRecompensa = 0.16;

            if (dineroAcumulado >= 1350) {
                nivel = 15;
                dineroAcumulado = 0;
            }
            return;
        }

        if (nivel == 15) {
            nivelSuperior = 15;
            subirNivel = 0;
            puntosRecompensa = 0.16;

            System.out.println("Nivel maximo alcanzado. Cada $750 obtiene un producto gratis.");
        }
    }

    //getters
    public static boolean getCuenta(programaLealtad p) { 
        return p.cuenta; 
    }
    public static boolean getRegistro(programaLealtad p) { 
        return p.registro; 
    }
    public static double getPuntosTotal(programaLealtad p) { 
        return p.puntosTotal; 
    }
    public static int getNivel(programaLealtad p) { 
        return p.nivel; 
    }
    public static double getPuntosRecompensa(programaLealtad p) { 
        return p.puntosRecompensa; 
    }
    public static double getSubirNivel(programaLealtad p) { 
        return p.subirNivel; 
    }
    public static int getNivelSuperior(programaLealtad p) { 
        return p.nivelSuperior; 
    }
    public static double getDineroAcumulado(programaLealtad p) { 
        return p.dineroAcumulado; 
    }

    //setters
    public static void setCuenta(programaLealtad p, boolean valor) { 
        p.cuenta = valor; 
    }
    public static void setRegistro(programaLealtad p, boolean valor) { 
        p.registro = valor; 
    }
    public static void setPuntosTotal(programaLealtad p, double valor) { 
        p.puntosTotal = valor; }
    public static void setNivel(programaLealtad p, int valor) { 
        p.nivel = valor; 
    }
    public static void setPuntosRecompensa(programaLealtad p, double valor) { 
        p.puntosRecompensa = valor; 
    }
    public static void setSubirNivel(programaLealtad p, double valor) { 
        p.subirNivel = valor; 
    }
    public static void setNivelSuperior(programaLealtad p, int valor) { 
        p.nivelSuperior = valor; 
    }
    public static void setDineroAcumulado(programaLealtad p, double valor) { 
        p.dineroAcumulado = valor; 
    }
}

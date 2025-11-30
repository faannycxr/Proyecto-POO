
package com.mycompany.proyectofinalpoo12eq02;

class ProgramaLealtad {

    private boolean cuenta;
    private boolean registro;

    private double puntosTotal;       
    private int nivel;                
    private double puntosRecompensa;  
    private double subirNivel;
    private int nivelSuperior;

    private double dineroAcumulado;

    public ProgramaLealtad(boolean cuenta) {
        this.cuenta = cuenta; // viene de otra clase
        this.registro = false;

        puntosTotal = 0;
        nivel = 0;
        puntosRecompensa = 0.01; // nivel 0 → 1%
        nivelSuperior = 5;
        subirNivel = 1000;       // nivel 0 → requiere 1000
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
            System.out.println("No se registró en el programa de lealtad.");
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
        System.out.println("Próximo nivel: " + nivelSuperior);
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

        // Acumular dinero para subir de nivel
        dineroAcumulado += totalPagado;

        // Calcular puntos obtenidos
        double puntosGanados = totalPagado * puntosRecompensa;
        puntosTotal += puntosGanados;

        // Actualizar el nivel si toca
        actualizarNivel();
    }

    private void actualizarNivel() {

        // NIVEL 0 → 5
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

        // NIVEL 5 → 10
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

        // NIVEL 10 → 15
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

        // NIVEL 15-
        if (nivel == 15) {
            nivelSuperior = 15;
            subirNivel = 0;
            puntosRecompensa = 0.16;

            System.out.println("Nivel máximo alcanzado. Cada $750 obtiene un producto gratis.");
        }
    }
}

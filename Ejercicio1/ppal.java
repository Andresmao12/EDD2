package Ejercicio1;

import java.io.*;

class ppal {

    public static void main(String[] args) throws IOException {

        String menuP = "Seleccione la opcion deseada: \n"
                + "1.Insertar\n"
                + "2.Eliminar\n"
                + "3.Imprimir\n"
                + "4.Estadisticas\n"
                + "0.Salir\n";

        String decisionP;

        do {
            General.imprimir("\n=== GESTION EMPLEADOS ===");
            decisionP = General.leer(menuP, true);

            switch (decisionP) {
                case "1":
                    Lista.insertar();
                    break;
                case "2":
                    Lista.eliminar();
                    break;
                case "3":
                    Lista.imprimir();
                    break;
                case "4":
                    menuEstadisticas();
                    break;
                case "0":
                    General.imprimir("\nEntendible, hasta pronto...");
                    break;
                default:
                    General.imprimir("\n-- Ingrese una opcion valida -- \n");
                    break;
            }

        } while (!decisionP.equals("0"));
    }

    public static void menuEstadisticas() throws IOException {

        String menuS = "Seleccione la opcion deseada: \n"
                + "1.Suma de los salarios\n"
                + "2.Salario promedio\n"
                + "3.Cantidad con saldo negativo\n"
                + "4.Cantidad con saldo positivo\n"
                + "5.Salario mas alto y mas bajo\n"
                + "0.Salir\n";

        String decisionS;

        do {
            General.imprimir("\n=== ESTADISTICAS ===");
            decisionS = General.leer(menuS, true);

            switch (decisionS) {
                case "1":
                    double nomina = Lista.opSalarios(1);
                    General.imprimir("La nomina en total es de $" + nomina);
                    break;
                case "2":
                    double promNomina = Lista.opSalarios(2);
                    General.imprimir("El promedio de salarios es de $" + promNomina);
                    break;
                case "3":
                    Lista.saldosPyN("N");
                    break;
                case "4":
                    Lista.saldosPyN("P");
                    break;
                case "5":
                    Lista.saldoMyM();
                    break;
                // case "6":
                //     Lista.saldoMyM("menor");
                //     break;
                case "0":
                    General.imprimir("\nEntendible, hasta pronto...");
                    break;
                default:
                    General.imprimir("\n-- Ingrese una opcion valida -- \n");
                    break;
            }

        } while (!decisionS.equals("0"));

    }

}

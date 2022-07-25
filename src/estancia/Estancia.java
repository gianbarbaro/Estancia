/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estancia;

import estancia.entidades.Casa;
import estancia.servicios.CasaService;
import estancia.servicios.EstanciaService;
import estancia.servicios.FamiliaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Estancia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        FamiliaService fs = new FamiliaService();
        CasaService cs = new CasaService();
        EstanciaService es = new EstanciaService();

        String op;
        Integer dia, mes, año;
        
        try {
            
            System.out.println("BIENVENIDO! Elija una de las siguientes opciones: ");

            do {
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                System.out.println("1. Listar familias que tienen al menos 3 hijos con una edad máxima inferior a 10 años.");
                System.out.println("2. Listar las casas disponibles entre el 1 de agosto de 2020 y el 31 de agosto de 2020 en Reino Unido.");
                System.out.println("3. Listar familias cuya dirección de mail sea de Hotmail.");
                System.out.println("4. Listar casas disponibles a partir de una fecha y un número de días específico.");
                System.out.println("5. Listar todas las estancias disponibles.");
                System.out.println("6. Incrementar el precio de la habitación por día en un 5% de todas las casas del Reino Unido");
                System.out.println("7. Obtener el número de casas que existen para cada uno de los países diferentes.");
                System.out.println("8. Listar casas del Reino Unido de las que se han dicho que están limpias.");
                System.out.println("9. Listar todas las casas");
                System.out.println("10. Salir");
                System.out.println("-------------------------------------------------------------------------------------------------------------------");
                
                op = leer.next();
                
                switch(op) {
                    case "1":
                        fs.mostrarFamliasConTresHijos();
                        break;
                        
                    case "2":
                        cs.mostrarCasasUKDesdeHasta();
                        break;
                        
                    case "3":
                        fs.mostrarFamliasConCorreoHotmail();
                        break;
                        
                    case "4":
                        System.out.println("Indique la fecha (dd/mm/aa)");
                        dia = leer.nextInt();
                        mes = leer.nextInt();
                        año = leer.nextInt();
                        
                        Date fecha = new Date(año-1900, mes-1, dia);
                        
                        System.out.println("Ingrese los dias de disponibilidad que requiere de la casa");
                        dia = leer.nextInt();
                        
                        cs.mostrarCasasFechaYDiaEspecifico(fecha, dia);
                        break;
                        
                    case "5":
                        es.mostrarTodo();
                        break;
                        
                    case "6":
                        for (Casa casa : cs.listarCasasUK()) {
                            cs.modificarPrecioHabitacion(casa);
                        }
                        System.out.println("Los precios han sido actualizados con éxito!");
                        System.out.println("Desea ver como quedo la lista? (s/n)");
                        op = leer.next();
                        
                        if(op.equalsIgnoreCase("s")) {
                            cs.mostarCasasUK();
                        } 
                        break;
                        
                    case "7":
                        cs.mostrarCantCasasPorPais();
                        break;
                        
                    case "8":
                        cs.mostrarCasasLimpiasUK();
                        break;
                        
                    case "9":
                        cs.mostrarTodo();
                        break;
                        
                    default:
                }
            } while(!op.equals("10"));
        
        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
        }

    }

}

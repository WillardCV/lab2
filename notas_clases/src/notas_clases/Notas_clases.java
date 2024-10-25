/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas_clases;

import java.util.Scanner;

/**
 *
 * @author WillardCerna
 */
public class Notas_clases {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        
        while(opcion !=4){
            System.out.println("opciones ");
            System.out.println("1)cadena"
            +"\n2)notas"
                    + "\n3)clase"
                    + "\n4)salir"+"\n");
            
            System.out.println("ingresar un numero asignado");
            opcion=entrada.nextInt();
        
            if(opcion==1){
                System.out.println("**opciones**");
                System.out.println("ingresar una cadena de caracteres");
                String cadena = entrada.next(); 
                
            int longitud=cadena.length();
            int maxRepeticiones=0;
            char caracterRepetido=' ';
            char caracter=0; 
            
            while(256 <= caracter);{
                int contador=0;
                int contadorCaracteres=0;
                
                while(contadorCaracteres< longitud){
                    if(cadena.charAt(contadorCaracteres)== caracter);{
                    contador++; 
                }
                 contadorCaracteres++;   
                }
                if (contador>maxRepeticiones){
                    maxRepeticiones=contador;
                    caracterRepetido=(char) contador;
                    
                }
                caracter++;
            }
                System.out.println("carracter que mas se repite"+caracterRepetido);
                System.out.println("numero de veces que se repitio la cadena"+maxRepeticiones);
            }
                 else if(opcion==2){
                        System.out.println("**notas**");
                        System.out.println("ingrese la cantidad de notas");
                        int cantidadNotas=entrada.nextInt();
                        int contador = 0;
                        double sumarnota=0;
                        double promedio=0;
                        double notamayor=0;
                        double notamenor=100;
                        
                        while(contador ++< cantidadNotas){
                            System.out.println("nota"+contador+": ");
                            double nota=entrada.nextDouble();
                            sumarnota+=nota;
                        
                            while(nota>notamayor){
                                notamayor=nota;
                            }
                            while(nota<notamenor){
                                notamenor=nota;
                            }
                            while(nota<=-1 || nota>=100){
                                System.out.println("nota"+contador+": ");
                                nota= entrada.nextDouble();
                            }
                          promedio= sumarnota/cantidadNotas;
                            System.out.println("Promedio"+promedio);
                            System.out.println("Nota mayor"+notamayor);
                            System.out.println("Nota menor"+notamenor);
                                
                        }
                        if(opcion==3){
                            System.out.println("**clase**");
                        }
            }
            
        }
         
    }
    
}

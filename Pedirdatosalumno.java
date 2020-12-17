/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedirdatosalumno;

import java.util.Scanner;

/**
 *
 * @author Jose
 */
public class Pedirdatosalumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner entrada=new Scanner(System.in);
        int opc,x,i,j,aux,pos,min;
        System.out.println("LLENANDO DATOS DEL ARREGLO");
        System.out.print("Digite la cantidad de elementos del arreglo: ");
        x=entrada.nextInt();
        int []vec=new int[x];
        for(i=0;i<x;i++){
            System.out.print((i+1)+". Digite un numero: ");
            vec[i]=entrada.nextInt();
        }
        do{
            System.out.println("\n\n\t..:MENU:..");
            System.out.println("1. Mostrar arreglo");
            System.out.println("2. Ordenar y mostrar por metodo burbuja ");
            System.out.println("3. Ordenar y mostrar por metodo INSERCION");
            System.out.println("4. Ordenar y mostrar por metodo SELECCION");
            System.out.println("5. Salir");
            System.out.println("\nEscoja una opcion: ");
            opc=entrada.nextInt();
        
         switch(opc){
            case 1: 
                System.out.println("MOSTRANDO ARREGLO: ");
                for(i=0;i<x;i++){
                    System.out.print(vec[i]+", ");
                }break;
            case 2: 
                System.out.println("ORDENADO POR METODO BURBUJA");
                for(i=0;i<vec.length;i++){
                    for(j=i+1;j<vec.length;j++){
                        if(vec[i]>vec[j]){
                            aux=vec[i];
                            vec[i]=vec[j];
                            vec[j]=aux;
                        }
                    }
                }
                for(i=0;i<x;i++){
                    System.out.print(vec[i]+", ");
                }break;
            case 3: 
                System.out.println("ORDENADO POR METODO INSERCION");
                for(i=0;i<x;i++){
                    pos=i;
                    aux=vec[i];
                    while((pos>0)&&(vec[pos-1]>aux)){
                        vec[pos]=vec[pos-1];
                        pos--;
                    }
                    vec[pos]=aux;
                }
                for(i=0;i<x;i++){
                    System.out.print(vec[i]+", ");
                }break;
            case 4: 
                System.out.println("ORDENADO POR METODO SELECCION");
                for(i=0;i<x;i++){
                    min=i;
                    for(j=i+1;j<x;j++){
                        if(vec[j]<vec[min]){
                            min=j;
                        }
                    }
                    aux=vec[i];
                    vec[i]=vec[min];
                    vec[min]=aux;                  
                }
                for(i=0;i<x;i++){
                    System.out.print(vec[i]+", ");
                }break;
            case 5:
                System.out.println("GRACIAS POR USAR EL MENU!");
                break;
         }
        }while(opc!=5);
    }
}

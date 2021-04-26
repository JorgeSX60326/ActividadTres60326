/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadtres60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class ActividadTres60326 {
    
    public static void Encabezado(){
      
        System.out.println("------------------------------------------");
        System.out.println("*****Universidad Autónoma de Campeche*****");
        System.out.println("------------------------------------------");
        System.out.println("***********Facultad de Ingeniería*********");
        System.out.println("------------------------------------------");
        System.out.println("**Ingeniería en Sistemas Computacionales**");
        System.out.println("------------------------------------------");
    }
    
    public static void Cuerpo(){
        
        System.out.println("------------------------------------------");
        System.out.println("*****Nombre: Jorge Alberto Sulub Xool*****");
        System.out.println("*************Matricula: 60326*************");
        System.out.println("------------------------------------------");
        System.out.println("*****Profesor: Edgar D. Caamal Dzulu******");
        System.out.println("********Lenguaje de programación 1********");
        System.out.println("------------------------------------------");
        System.out.println("*********Segundo Semestre Grupo A*********");
        System.out.println("------------------------------------------");
        System.out.println("***************Actividad 3****************");
        System.out.println("------------------------------------------");
        System.out.println("");
    }
    
    public static void Pie(){
        
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("**************San Francisco de Campeche***");
        System.out.println("*****************************Abril 2021***");
    }
    
    public static void SumaConsecutiva(){
        
        System.out.println("");
        System.out.println("*******Suma consecutiva del 0 al 10*******");
        System.out.println("");
        int numero = 0;
        for (int i = 0; i <=10; ++i){
        numero += i;
        System.out.println(numero);  
        }
    }
    
    public static void FactorialHastaDiez(){
        
        System.out.println("");
        System.out.println("**********Factorial del 1 al 10***********");
        System.out.println("");
        int factorial = 1;
        for (int i = 1; i <=10; ++i){
        factorial *= i;
        System.out.println(factorial);
        }
    }
    
    public static void FactorialScanner(){
        
        System.out.println("");
        System.out.println("****Factorial ingresado por el usuario****");
        System.out.println("");
        Scanner usuario = new Scanner(System.in);
        System.out.println("Ingrese un número para obtener su factorial.");
        int numero;
        int factorial = 1;
        numero = usuario.nextInt();
        for (int i = 1; i <= numero; ++i){
        factorial *= i; 
        }
        System.out.println("");
        System.out.println("El factorial del numero ingresado es:");
        System.out.println(factorial);
    }
    
    public static void MediaScanner(){
        
        System.out.println("");
        System.out.println("*****Media introducida por el usuario*****");
        System.out.println("");
        System.out.println("Se obtendrá la suma del 0 hasta el número introducido por el usuario.");
        System.out.println("");
        Scanner usuario = new Scanner(System.in);
        int numero;
        double media;
        double suma = 0;
        System.out.println("Escriba un número");
        numero = usuario.nextInt();
        for (int i = 1; i <= numero; ++i){
        suma +=i;    
        }
        media = suma / numero;
        System.out.println("La media entre la suma del 0 hasta el " + numero + " es:");
        System.out.println(media);
    }
    
    public static void PromedioDistancia(int Numeros){
        
     System.out.println("");
     System.out.println("************Actividad del promedio************");
     System.out.println("");
     System.out.println("Se calculará el promedio de los números introducidos, el mayor y el menor introducido, y la distancia numerica entre estos");
     System.out.println("");
     Scanner usuario = new Scanner(System.in);
     
     int Numero = Numeros;
     int Suma =0;
     double Promedio;
     int Distancia;
     int Arreglo[] = new int[Numero];
     for (int i = 0; i < Arreglo.length; i++){
       System.out.print("Introduzca el numero " + (i + 1) + ": ");
       Arreglo[i] = usuario.nextInt();
    }
     int mayor;
     int menor;
     mayor = menor = Arreglo[0];
     for(int i = 0; i < Arreglo.length; i++){
         if(Arreglo[i] > mayor){
             mayor = Arreglo[i];    
         } else if(Arreglo[i] < menor){
             menor = Arreglo[i];
         }
         Suma += Arreglo[i];
     }
    Promedio = (double)Suma / (double)Numero;
    Distancia = mayor - menor;
    
    System.out.println("");
    System.out.println("Cantidad de números introducidos: " + Numero);
    System.out.println("Promedio de los numeros introducidos: " + Promedio);
    System.out.println("Mayor numero introducido: " + mayor);
    System.out.println("Menor numero introducido: " + menor);
    System.out.println("Distancia númerica entre el numero mayor y menor: " + Distancia);  
    }
    
    public static void ArregloSemana(){
        
        System.out.println("");
        System.out.println("**************Arreglo semanal**************");
        System.out.println("Arreglo que contiene los nombres de los días de la semana.");
        System.out.println("");
        String semana[] = new String[7];
        semana[0] = "Lunes";
        semana[1] = "Martes";
        semana[2] = "Miercoles";
        semana[3] = "Jueves";
        semana[4] = "Viernes";
        semana[5] = "Sábado";
        semana[6] = "Domingo";
        
        for(String Dias: semana){
        System.out.println(Dias);    
        }
    }
    
    public static void ArregloGato(){
        
    System.out.println("");
    System.out.println("***********Arreglo del juego del gato**********");
    System.out.println("");
    String Gato[][] = new String[3][3];
    for(String Vert[]: Gato){
        for(String Hori: Vert){
            System.out.print("+" + " ");
        }
        System.out.println("");
    }
        
    }
    
    public static void SelecciónActividad(){
        
        Scanner usuario = new Scanner(System.in);
        int NumAct;
        NumAct = usuario.nextInt();
        switch (NumAct){
            case 1:
                SumaConsecutiva();
                break;
            case 2:
                FactorialHastaDiez();
                break; 
            case 3:
                FactorialScanner();
                break;
            case 4:
                MediaScanner();
                break;
            case 5:
                PromedioDistancia(usuario.nextInt());
                break;
            case 6:
                ArregloSemana();
                break;
            case 7:
                ArregloGato();
                break;
            default:
            System.out.println("Verifique que la actividad seleccionada sea entre 1 a 7.");
            break;
        }
    }
    
    public static void main(String[] args) {
        
    Encabezado();
    Cuerpo();
       System.out.println("Seleccione una actividad de la siguiente lista:");
       System.out.println("1.-Suma consecutiva del 0 al 10");
       System.out.println("2.-Factorial del 1 al 10");
       System.out.println("3.-Factorial ingresado por el usuario");
       System.out.println("4.-Media introducida por el usuario");
       System.out.println("5.-Actividad del promedio");
       System.out.println("6.-Arreglo Semanal");
       System.out.println("7.-Arreglo del juego del Gato");
       System.out.println("");
       System.out.println("Introduzca el numero de la actividad correspondiente del 1 al 7.");
       SelecciónActividad();
       Pie();
    }
    
}
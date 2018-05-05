
package pilas;

import java.util.Scanner;


public class Lista {
    
    class Nodo{
        int posicion;
        String nombre;
        Nodo siguiente;
        
        public Nodo(){
            
        }
        
        public Nodo(String n,int p){
            this.nombre=n;
            this.posicion=p;
            siguiente = null;
        }
    }
    
    Nodo fin;
    Nodo cima = new Nodo();
    Nodo fondo = new Nodo();
    Nodo Aux ;
    int tamaño;
    Scanner entrada = new Scanner(System.in);
    
    public Lista(){
        fin = null;
        tamaño=0;
    }
    
    int posicion=0;
    
    public void push (String nom){
        posicion++;
        Nodo nuevo = new Nodo(nom,posicion);
        if(fin==null){
            fondo.nombre=nom;
            fin = nuevo;
        }else{
            nuevo.siguiente=fin;
            fin  = nuevo;
            Aux = nuevo;
        }
        tamaño++;
    }
    
    public void pop(){
        if (fin==null){
            System.out.println("PILA VACÍA");
        }else{
            System.out.println(fin.posicion+" "+fin.nombre);
            fin = fin.siguiente;
            tamaño--;
        }
    }
    
    public void imprimir(){
        Nodo auxiliar = new Nodo();
        auxiliar = fin;
        while(auxiliar!=null){
            System.out.println(auxiliar.posicion+" "+auxiliar.nombre);
            auxiliar = auxiliar.siguiente;
        }
    }
    
    public void Modificar(int posicion){
        Nodo auxiliar = new Nodo();
        auxiliar = fin;
        while(auxiliar!=null){
            if (auxiliar.posicion==posicion){
                System.out.println("ESCRIBA EL NUEVO NOMBRE");
                auxiliar.nombre = entrada.next();
            }
            auxiliar = auxiliar.siguiente;
        }
    }
    
    public void fondo(){
        System.out.println("EL NOMBRE QUE SE INGRESÓ PRIMERO FUE");
        System.out.println(fondo.nombre);
    }
    
    public void cima(){
        System.out.println("EL ULTIMO NOMBRE QUE SE INGRESÓ FUE");
        System.out.println(fin.nombre);
    }
}

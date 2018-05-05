package pilas;

import java.util.Scanner;

public class Pilas {

    public static void main(String[] args) {
      
        Lista Nueva_Lista = new Lista();
        Scanner entrada = new Scanner(System.in);
        int maximo =0;
        
        do{
            System.out.println("INGRESE UN NOMBRE");
            String dato = entrada.next();
            Nueva_Lista.push(dato);
            maximo++;
        }while(maximo!=5);
        
        Nueva_Lista.imprimir();
        System.out.println("Eliminar dato aquí");
        Nueva_Lista.pop();
        System.out.println("Lista actualizada");
        Nueva_Lista.imprimir();
        
        System.out.println("DESEA MODIFICAR ALGUN DATO ESCRIBA: SI O NO");
        String desicion = entrada.next();
        
        if(desicion.equals("SI")){
            System.out.println("ESCRIBA LA POSICION DEL ELEMENTO QUE DESEE MODIFICAR");
            int pos = entrada.nextInt();
            Nueva_Lista.Modificar(pos);
            Nueva_Lista.imprimir();
        }
        
        System.out.println("//////////");
        Nueva_Lista.cima();
        System.out.println("///////////");
        Nueva_Lista.fondo();
    }
    
}

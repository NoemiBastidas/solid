/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
import java.util.Scanner;
public class ejecutar {
     public static void main(String[] args){
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
         imprimir imp = new imprimir();
         String ordImprimir="";
         
         do{
              System.out.println("como desea imprimir? 1)ascendente 2)descendente ");
              ordImprimir=leer.nextLine();
             
         }while(ordImprimir=="1" || ordImprimir=="2");
         
         
         
         if(ordImprimir.equals("1")){
            for(int i=0; i<imp.ascendente().size();i++){
                System.out.println(i+1+" "+imp.ascendente().get(i));
            }
         }else{
             for(int i=0; i<imp.ascendente().size();i++){
                System.out.println(imp.ascendente().size()-i+" "+imp.descendente().get(i));
            }
         }
    }
}



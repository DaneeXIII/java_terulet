/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package terulet;

/**
 *
 * @author 20g_szarkad
 */
import java.util.Scanner;
public class Terulet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Kerület, terület számító program\nSzarka Dániel\n113C");
System.out.print("\n");
    System.out.println("1 - Téglalap\n2 - Kör\n3 - Háromszög\n");
    Scanner bemenet; 
    bemenet=new Scanner(System.in); 
    char ujra;
    int valasz;
    do{
    System.out.println("Válassza ki, melyik síkidommal szeretne dolgozni! (1/2/3)");
    System.out.println("Írjon be egy számot: ");
    valasz=bemenet.nextInt();
    
    while(!(valasz==1 || valasz ==2 || valasz==3)){
    System.out.println("Kérem, csak a(z) 1,2,3 karakterek közül adjon meg!");
    System.out.println("Próbálja újra: ");
    valasz=bemenet.nextInt();
    }
    if (valasz==1){
    System.out.println("Adja meg a téglalap 'A' oldalát:");
    int a=bemenet.nextInt();
    System.out.println("Adja meg a téglalap 'B' oldalát");
    int b=bemenet.nextInt();
    int terulet=a*b;
    int kerulet=2*a+2*b;
    System.out.println("A téglalap területe: "+terulet+"\n");
    System.out.println("A téglalap kerülete: "+kerulet+"\n");
    }
    else if(valasz==2){
    System.out.println("Adja meg a kör sugarát: ");
    double sugar = bemenet.nextDouble();
    double terulet = Math.PI * (sugar * sugar);
    System.out.println("A kör területe: "+terulet);
    double kerulet= Math.PI * 2*sugar;
    System.out.println( "A kör kerülete: "+kerulet) ;
    
    }
    else if (valasz==3){
        System.out.println("Adja meg a háromszög 'A' oldalát: ");
        int a=bemenet.nextInt();
         System.out.println("Adja meg a háromszög 'B' oldalát: ");
        int b=bemenet.nextInt();
         System.out.println("Adja meg a háromszög 'C' oldalát: ");
        int c=bemenet.nextInt();
    
     if (a+b<=c){
        System.out.println("Nem megszerkeszthető!");
    }
        else if (a+c<=b){
        System.out.println("Nem megszerkeszthető!");
    }
    else if (b+c<=a){
        System.out.println("Nem megszerkeszthető!");}

    else{
        int kerulet=a+b+c;
        System.out.println("A háromszög kerülete: "+kerulet+" ");
        }   
    }
    
    bemenet.nextLine(); 
    System.out.print("Szeretné újra futtatni a programot? Ha igen, üssön egy 'i'-t: ");
    valasz = bemenet.nextLine().toLowerCase().charAt(0); 
    }while (valasz == 'i');
    bemenet.close();
    }
    
    
 }
    


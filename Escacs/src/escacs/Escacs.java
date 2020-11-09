package escacs;

import java.util.Scanner;

/* Taula de tests
entrada | sortida
    3   | [•][◌][•]
        | [◌][•][◌]
        | [•][◌][•]
--------|----------
    4   | [•][◌][•][◌]
        | [◌][•][◌][•]
        | [•][◌][•][◌]
        | [◌][•][◌][•]
*/

/**
 *
 * @author JORGEC
 */
public class Escacs {

    public static void main(String[] args) {
        String tauler = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("De quina mida vols fer el taulell?");
        
        int n = entrada.nextInt();
        
        for(int i=0; i<n; i++){
            tauler += "\n";
            for (int j=0; j<n; j++){
                if((i+1)%2 == 0){
                    if((j+1)%2 == 0)
                        tauler += "[•]";
                    else
                        tauler += "[◌]";
                }else{
                    if((j+1)%2 != 0)
                        tauler += "[•]";
                    else
                        tauler += "[◌]";
                }        
            }
        }
        
        System.out.println("Mostrant tauler d'escacs de " + n + "x" + n +":");
        System.out.println(tauler);
        
    }
    
}

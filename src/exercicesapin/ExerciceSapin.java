
package exercicesapin;

/**
 *
 * @author rbmini
 */
public class ExerciceSapin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

   System.out.println("----------SAPIN PLEIN-------");
    int nbrLigne = 25;  
   
   for (int j = 0; j < nbrLigne; j++) {
            
            for (int i = 0; i < nbrLigne-j; i++) {
                System.out.print(" ");
            }
              
            System.out.print("*");
            for (int i = 0; i < j; i++) {
                System.out.print("**");
            }
            System.out.println("p");
        }
        
     
        
       System.out.println("----------SAPIN VIDE-------");
       
      

        if (nbrLigne!=0) {
             System.out.println("*");
        }
       
        //----
        for (int i = 1; i < nbrLigne-1; i++) {
            System.out.println("**");
        }
        //----
        System.out.print("*");
        for (int i = 0; i < nbrLigne-1; i++) {
               System.out.print("**");
        }
     
       System.out.println("");
      System.out.println("----------SAPIN COUCHÉ-------");
        for (int j = 0; j < nbrLigne; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
          for (int j = 0; j < nbrLigne; j++) {
            for (int i = 0; i < nbrLigne-j; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
       
       
                
        
        

    }

}

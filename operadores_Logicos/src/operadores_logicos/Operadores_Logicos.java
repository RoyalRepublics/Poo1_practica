/*

 */
package operadores_logicos;

/**
 *
 * @author ESPE
 */
public class Operadores_Logicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1=1,valor2=1;
         System.out.println((valor1==valor2)&&(valor1!=valor2));
         System.out.println((valor1==valor2)||(valor1!=valor2));
         System.out.println(!(valor1==valor2));
         
         int i = 0;
      int randy=(int)(Math.random()*100);   
while (i!=1) {
    randy=(int)(Math.random()*100);
    if((randy<=10)||(randy>60)) {
        }
         
    else{System.out.println(randy);
    i=1;
    }
    }
}
         
    }


public class Ex53PrintChristmas {
    public static void main(String[] main) {
        // set height

        int height = 10;
        for (int i=1; i<= height; i++) {
         
            //print identation
            //i = 1
            for( int space= 1; space <= height -i; space ++) {
                System.out.print(" ");
                // 1 <= 10-1, printea " ", 2< = 9 " ", 3,4,5,6,7,8,9. Printea 9 espacios. pasa a imprimir estrellas
                // 2 <= 10-1, printea " ", 3< = 9 " ", 4,5,6,7,8,9. Printea 8 espacios. pasa a imprimir estrellas
                
                }
            // print stars
            for( int star= 1; star <= i*2-1; star ++) {
                System.out.print("*");
                // 1 <= 1*2-1, printea "*", 2 <= 2*2-1 failea la condición, deja de imprimir.
                // 1 <= 2*2-1, printea "*", 2 <= 2*2-1, printea *, 3 <= 2*2-1, printrea *. 4 <= 2*2-1 failea la condición, deja de imprimir.
            }
            // print new line
            System.out.println();
            //cuando se terminan los dos loops, se imprime un espacio.
        }
        
    }
    
}
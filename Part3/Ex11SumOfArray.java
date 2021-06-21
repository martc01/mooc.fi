public class Ex11SumOfArray {
        public static void main(String[] args){
                
                int[] array = {5, 1, 3, 4, 2};

                int sum = 0;
                //for-each loop
                for (int element: array){
                        sum += element;
                }
                System.out.println("Sum of array elements is: " + sum);
        }
}
//encontré una solución en google que no usa method. for-each loop
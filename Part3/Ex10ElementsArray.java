public class Ex10ElementsArray {
        public static void main(String[] args){

        public static void listElements(int[] integerArray){
                System.out.println("the elements of the array are: ");
                int index = 0;
                while (index < integerArray.length){
                        int number = integerArray[index];
                        System.out.print(number + " ");
                        index = index + 1;
                }

                System.out.println("");
        }
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        listElements(numbers);
        }
}
//Este no salió

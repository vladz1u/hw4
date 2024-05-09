public class Homework {
    public static void main(String[] args) {
//        firstTask();
//        secondTask();
//        thirdTask();
//        fourthTask();
//        fifthTask();
    }
    public static void firstTask(){
        for (int i = 1; i < 56; i += 2) {
            System.out.print(i+" | ");
        }
    }
    public static void secondTask(){
        for (int i = 90; i > -1; i -= 5) {
            System.out.print(i+" | ");
        }
    }
    public static void thirdTask(){
        for (int i = 2; i < 129; i *= 2) {
            System.out.print(i+" | ");
        }
    }
    public static void fourthTask(){
        for (int i = -29; i < 11; i++) {
            if (i % 5 == 0){
                System.out.print(i+" | ");
            }
        }
    }
    public static void fifthTask(){
        int sum = 0;
        int sumPairs = 0;
        for (int i = 50; i <= 150; i++) {
            sum += i;
            System.out.println("Suma "+i+": "+sum);

            if (i % 2 == 0){
                sumPairs++;
            }
        }
        System.out.println("Suma of pairs: "+sumPairs);
    }
    public static void sixthTask(){
        
    }
}
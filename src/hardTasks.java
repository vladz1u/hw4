public class hardTasks {
    public static void main(String[] args) {
        int[] ar = {5,-3,-2,16,55,0};

//        firstTask(ar);
//        secondTask(ar);
        thirdTask();    }
    public static void firstTask(int[] ar){
        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max){
                max = ar[i];
            }
        }
        System.out.println(max);
    }
    public static void secondTask(int[] ar){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > 0) {
                sum += ar[i];
                count++;
            }
        }
        System.out.println(sum);
        System.out.println(count);
    }
    public static void thirdTask(){
        int[] ar = new int[11];
        ar[0] = 1;
        ar[1] = 1;
        for (int i = 2; i < ar.length; i++) {
            ar[i] = ar[i-1]+ar[i-2];
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}

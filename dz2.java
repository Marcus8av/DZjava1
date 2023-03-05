public class dz2 { // Третье задание -выводим простые числа.
    public static void main(String[] arg){ 
        for (int i = 1; i < 1000; i++) {
            if (Numbers(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean Numbers(int number) {
        if (number < 2){
            return false;
        }
        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
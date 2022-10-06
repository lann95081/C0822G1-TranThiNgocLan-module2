package ss2_array_and_loop_in_java.exercise;

public class DisplayPrimeLess100 {
    public static void main(String[] args) {
        System.out.println(" Cac so nguyen to nho hon 100: ");
        for (int i = 0; i < 100; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}

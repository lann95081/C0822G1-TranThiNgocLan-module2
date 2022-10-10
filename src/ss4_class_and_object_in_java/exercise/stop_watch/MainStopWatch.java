package ss4_class_and_object_in_java.exercise.stop_watch;

public class MainStopWatch {
    public static void main(String[] args) {
        StopWatch stopWatch=new StopWatch();
        stopWatch.start();
        System.out.println("Thoi gian bat dau: "+stopWatch.getStartTime());
        stopWatch.end();
        System.out.println("Thoi gian ket thuc: "+stopWatch.getEndTime());
        System.out.println("Tong thoi gian: "+stopWatch.getElapsedTime());
    }
}

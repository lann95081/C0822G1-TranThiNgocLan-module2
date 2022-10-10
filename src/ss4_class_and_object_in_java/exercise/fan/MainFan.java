package ss4_class_and_object_in_java.exercise.fan;

public class MainFan {
    public static void main(String[] args) {
        Fan fan1=new Fan();
        fan1.setSpeed((fan1.getFAST()));
        fan1.setColor("Yellow");
        fan1.setRadius(10);
        fan1.setOn(false);
        System.out.println("Fan1: "+fan1);

        Fan fan2 = new Fan();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(true);
        System.out.println("FAN2:" + fan2);
    }
}

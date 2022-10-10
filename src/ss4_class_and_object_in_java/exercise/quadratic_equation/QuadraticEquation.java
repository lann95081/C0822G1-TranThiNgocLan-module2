package ss4_class_and_object_in_java.exercise.quadratic_equation;

public class QuadraticEquation {
    double number1, number2, number3;

    public QuadraticEquation(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public double getNumber1() {
        return this.number1;
    }

    public double getNumber2() {
        return this.number2;
    }

    public double getNumber3() {
        return this.number3;
    }

    public String display() {
        return "Phương trình bậc 2: " + getNumber1() + "*X^2 + " + getNumber2() + "*X + " + getNumber3() + " = 0";
    }

    public double getDiscriminant() {
        return getNumber2() * getNumber2() - 4 * getNumber1() * getNumber3();
    }

    public double getRoot1() {
        return (-getNumber2() + Math.sqrt(getDiscriminant()) / 2 * getNumber1());
    }

    public double getRoot2() {
        return (-getNumber2() - Math.sqrt(getDiscriminant()) / 2 * getNumber1());
    }

    public double getRoot3() {
        return (-getNumber3() / getNumber2());
    }


    public String result() {
        if (getNumber1() == 0) {
            return "Khong phai phuong trinh bac 2 ma la phuong trinh bac nhat" + "\nCo 1 nghiem la: " + getRoot3();
        }

        if (getDiscriminant() > 0) {
            return " Phuong trinh co 2 nghiem x1= " + getRoot1() + ", x2= " + getRoot2();
        }

        if (getDiscriminant() == 0) {
            return "Phuong trinh co nghiem kep x1=x2=" + getRoot1();
        }

        return "Phuong trinh vo nghiem!!!";


    }
}

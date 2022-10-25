package ss15_exception_debug.exercise.use_illegal_triangle_exception.model;

import ss15_exception_debug.exercise.use_illegal_triangle_exception.exception.IllegalTriangleException;

public class Triangle {
    double firstEdge;
    double secondEdge;
    double thirdEdge;

    public Triangle() {
    }

    public Triangle(double firstEdge, double secondEdge, double thirdEdge) throws IllegalTriangleException {
        if (firstEdge <= 0 || secondEdge <= 0 || thirdEdge <= 0) {
            throw new IllegalTriangleException("Cạnh của tam giác phải >0!");
        } else if (firstEdge + secondEdge <= thirdEdge || firstEdge + thirdEdge <= secondEdge
                || secondEdge + thirdEdge <= firstEdge) {
            throw new IllegalTriangleException("Cạnh của tam giác không thoả mãn điều kiện a+b>0");
        } else {
            this.firstEdge = firstEdge;
            this.secondEdge = secondEdge;
            this.thirdEdge = thirdEdge;
        }
    }

    public double getFirstEdge() {
        return firstEdge;
    }

    public void setFirstEdge(double firstEdge) {
        this.firstEdge = firstEdge;
    }

    public double getSecondEdge() {
        return secondEdge;
    }

    public void setSecondEdge(double secondEdge) {
        this.secondEdge = secondEdge;
    }

    public double getThirdEdge() {
        return thirdEdge;
    }

    public void setThirdEdge(double thirdEdge) {
        this.thirdEdge = thirdEdge;
    }

    @Override
    public String toString() {
        return "Tam giác có: " +
                "Cạnh thứ nhất= " + firstEdge +
                ", Cạnh thứ hai=" + secondEdge +
                ", Cạnh thứ ba=" + thirdEdge;
    }
}



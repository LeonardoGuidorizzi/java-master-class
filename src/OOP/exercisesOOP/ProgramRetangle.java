package OOP.exercisesOOP;

import java.util.Scanner;

public class ProgramRetangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        double height = sc.nextDouble();
        double width = sc.nextDouble();
        Retangle retangle = new Retangle(width, height);
        System.out.println(retangle);
    }
}

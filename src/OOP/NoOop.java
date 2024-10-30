package OOP;

import java.util.Locale;
import java.util.Scanner;

public class NoOop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;
        Locale.setDefault(Locale.US);
        System.out.println("Enter with the measures of triangule x");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Enter with the measures of triangule y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
        if (areaX > areaY) {
            System.out.println("larger area: X " + areaX);
        } else {
            System.out.println("larger area Y " + areaY);
        }
        sc.close();
    }
}
/*
Instanciação
Todas as variaveis são criadas em uma area da memoria chamada stack, a area onde sao criadas a variaveis estaticas
durante a execução do programa eu posso fazer uma alocação de memoria usando o "new"
no momento que eu faço "x=new Traiangule()", vai ser criado um objeto triangulo em alguma parte da minha memória
chamada heap, heap é um lugar onde é criado objetos dinamicos durante a execução. DENTRO DELA NÃO VÃO ESTAR OS DADOS
DO TRIANGULO, VÃO ESTAR O ENDEREÇO DE MEMORIA QUE ESTARIA NO HEAP, quando vc coloca o x o x se torna uma ferencia para
o objeto que esta la no heap

* */
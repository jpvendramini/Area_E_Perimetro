package areaperimetro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaPerimetro {

    public static void main(String[] args) {
        DecimalFormat formatador = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        System.out.println("Area e Perimetro:");
        System.out.print("(1)Circunferencia (2)Retangulo: ");
        int escolha = sc.nextInt();
        if(escolha == 1){
            System.out.print("Digite o raio da circunferencia: ");
            float raio = sc.nextFloat();
            System.out.println("Area");
            System.out.println(formatador.format(Circunferencia.area(raio)));
            System.out.println("Perimetro");
            System.out.println(formatador.format(Circunferencia.perimetro(raio)));
        }else if(escolha == 2){
            System.out.print("Digite a base do Retangulo: ");
            float base = sc.nextFloat();
            System.out.print("Digite a altura do Retangulo: ");
            float altura = sc.nextFloat();
            System.out.print("Area: ");
            System.out.println(formatador.format(Retangulo.area(base, altura)));
            System.out.print("Perimetro: ");
            System.out.println(formatador.format(Retangulo.perimetro(base, altura)));
        }
    }
}

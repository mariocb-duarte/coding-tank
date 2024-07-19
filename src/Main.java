import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salarios = new double[5];
        double[] inss = new double[5];
        double[] impRenda = new double[5];

        int cont = 1;
//loop entrada salario dos funcionarios
        while (cont <= 5) {
            System.out.println("Insira o salário bruto do funcionário " + (cont));
            salarios[cont - 1] = scanner.nextDouble();
            cont++;
        }

//loop para calculo do inss
        for (int i = 0; i < 5; i++) {
            if (salarios[i] <= 1212.00) {
                inss[i] = salarios[i] * 0.075;
            } else if (salarios[i] >= 1212.01 && salarios[i] <= 2427.35) {
                inss[i] = salarios[i] * 0.09;
            } else if (salarios[i] >= 2427.36 && salarios[i] <= 3641.03) {
                inss[i] = salarios[i] * 0.12;
            } else {
                inss[i] = salarios[i] * 0.14;
            }
        }

//loop para calculo do imposto de renda
        for (int i = 0; i < 5; i++) {
            if (salarios[i] <= 1903.98) {
                impRenda[i] = salarios[i] * 0;
            } else if (salarios[i] >= 1903.99 && salarios[i] <= 2826.65) {
                impRenda[i] = salarios[i] * 0.075;
            } else if (salarios[i] >= 2826.66 && salarios[i] <= 3751.05) {
                impRenda[i] = salarios[i] * 0.15;
            } else if (salarios[i] >= 3751.06 && salarios[i] <= 4664.68) {
                impRenda[i] = salarios[i] * 0.225;
            } else {
                impRenda[i] = salarios[i] * 0.275;
            }
        }
//loop para imprimir as informações de todos os funcionarios
        for (int i = 0; i < 5; i++) {
            System.out.println("--------------------------");
            System.out.println("FUNCIOÁRIO " + (i + 1));
            System.out.println("--------------------------");
            System.out.printf("Salário bruto: R$ %.2f%n", salarios[i]);
            System.out.printf("Desconto INSS: R$ %.2f%n", inss[i]);
            System.out.printf("Desconto IR: R$ %.2f%n", impRenda[i]);
            System.out.printf("Salário líquido: R$ %.2f%n", salarios[i] - inss[i] - impRenda[i]);
            System.out.println("--------------------------");
        }
    }
}
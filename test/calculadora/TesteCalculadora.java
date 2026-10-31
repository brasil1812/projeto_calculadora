package calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Testes rápidos
        System.out.print("Soma: 2 + 3 | esperado: 5 | obtido: ");
        calc.calc(2, 3, "+");  // esperado: 5

        System.out.print("Subtração: 10 - 4 | esperado: 6 | obtido: ");
        calc.calc(10, 4, "-"); // esperado: 6

        System.out.print("Multiplicação: 3 * 5 | esperado: 15 | obtido: ");
        calc.calc(3, 5, "*");  // esperado: 15

        System.out.print("Divisão: 8 / 2 | esperado: 4 | obtido: ");
        calc.calc(8, 2, "/");  // esperado: 4

        System.out.print("Divisão por zero: 8 / 0 | esperado: mensagem de erro | obtido: ");
        calc.calc(8, 0, "/");  // divisao por zero

        System.out.print("Operação inválida: 5 x 5 | esperado: mensagem de erro | obtido: ");
        calc.calc(5, 5, "x");  // operação inválida
    }
}

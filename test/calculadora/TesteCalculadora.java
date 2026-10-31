package calculadora;

/**
 * <p><strong>Testes da classe {@link Calculadora}</strong></p>
 *
 * <p>Executa as quatro operações válidas e mostra no terminal a entrada, o
 * resultado esperado e o resultado obtido. Também testa a divisão por zero e o
 * operador inválido, que lançam {@link IllegalArgumentException}.</p>
 *
 * @author Gustavo Brasil Bordini
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * Executa os testes da calculadora e mostra os resultados no terminal.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Operações válidas
        System.out.print("Soma: 2 + 3 | esperado: 5 | obtido: ");
        System.out.println(calc.calcular(2, 3, "+"));

        System.out.print("Subtração: 10 - 4 | esperado: 6 | obtido: ");
        System.out.println(calc.calcular(10, 4, "-"));

        System.out.print("Multiplicação: 3 * 5 | esperado: 15 | obtido: ");
        System.out.println(calc.calcular(3, 5, "*"));

        System.out.print("Divisão: 8 / 2 | esperado: 4 | obtido: ");
        System.out.println(calc.calcular(8, 2, "/"));

        // Casos de erro: o esperado é uma exceção com mensagem
        try {
            System.out.print("Divisão por zero: 8 / 0 | esperado: exceção | obtido: ");
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.print("Operação inválida: 5 x 5 | esperado: exceção | obtido: ");
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

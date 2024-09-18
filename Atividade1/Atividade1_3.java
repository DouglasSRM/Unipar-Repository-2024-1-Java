/**
 *   "Abaixo, você encontrará algumas instruções seguidas por espaços reservados para variáveis.
 *   Sua tarefa é identificar o tipo de dado apropriado para cada variável e declará-las corretamente em Java."
 * - Nome do Aluno: [Declare uma variável para armazenar o nome do aluno]
 * - Idade do Aluno: [Declare uma variável para armazenar a idade do aluno]
 * - Nota da Prova 1: [Declare uma variável para armazenar a nota da primeira prova]
 * - Nota da Prova 2: [Declare uma variável para armazenar a nota da segunda prova]
 * - Média Final: [Declare uma variável para armazenar a média final das notas]
 *   "Certifique-se de escolher os tipos de dados apropriados para cada variável com base no que será armazenado.
 *   Lembre-se de que em Java, os tipos de dados podem incluir inteiros, decimais, texto e assim por diante."
 */

public class Atividade1_3 {
    public static void main(String[] args) {
        String nomeDoAluno = "Douglas";
        int idadeDoAluno = 19;
        double notaDaProva1 = 9;
        double notaDaProva2 = 9.5;
        double mediaFinal = (notaDaProva1 + notaDaProva2) / 2;

        System.out.println("A média final do aluno " + nomeDoAluno + " é: " + mediaFinal);
    }
}

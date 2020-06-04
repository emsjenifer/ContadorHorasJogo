package ContadorHorasJogo;

import java.util.Scanner;

public class HoraJogo { 
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Horario inicio = new Horario();
        Horario fim = new Horario();

        inicio.hora = leitor.nextInt();
        inicio.minuto = leitor.nextInt();

        fim.hora = leitor.nextInt();
        fim.minuto = leitor.nextInt();

        int duracaoEmMinutos = quantosMinutos(fim) - quantosMinutos(inicio);

        if (duracaoEmMinutos <= 0) {
            imprimirDuracao(duracaoEmMinutos + 24*60);
        } else {
            imprimirDuracao(duracaoEmMinutos);
        }
    }

    public static int quantosMinutos(Horario h) {
        return h.minuto + h.hora*60;
    }

    public static void imprimirDuracao (int duracao) {
        int duracao_horas = duracao/60;
        int duracao_minutos = duracao % 60;
        System.out.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S) \n", duracao_horas, duracao_minutos);
    }
}
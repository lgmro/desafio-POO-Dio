package br.com.dio.desafio.Teste;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentorias;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Teste");
        curso1.setDescricao("Descrição");
        curso1.setCargaHoraria(10);

        Mentorias mentoria = new Mentorias();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Aula");
        mentoria.setData(LocalDate.now());

        System.out.println(curso1);
        System.out.println(mentoria);
    }
}

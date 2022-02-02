package br.com.dio.desafio.Teste;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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

//        System.out.println(curso1);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas Gabriel");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devLucas.getConteudosInscritos());
        devLucas.progedir();
        System.out.println("Conteúdos Concluídos: " + devLucas.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: " + devLucas.getConteudosInscritos());
        System.out.println("XP: " + devLucas.calcularTotalXp());

        System.out.println("--------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progedir();
        devCamila.progedir();
        System.out.println("Conteúdos Concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularTotalXp());


    }
}

package POO.src;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author israe
 */
public class Main {
    private static final Conteudo Curso1 = null;
    private static final Conteudo Curso2 = null;
    private static final Conteudo Mentoria = null;

    /**
     * @param args
     */
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescriçao("descriçao curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescriçao("descriçao curso js");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescriçao("descriçao mentoria java");
        mentoria.getData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescriçao("Descriçao Bootcamp Java Developer");
        bootcamp.getConteudos().add(Curso1);
        bootcamp.getConteudos().add(Curso2);
        bootcamp.getConteudos().add(Mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        System.out.println("-");
        System.out.println("conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudo Inscritos Joao:" + devJoao.getConteudosInscritos());

        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudo Inscritos Joao:" + devJoao.getConteudosInscritos());
        System.out.println("Conteudo Concluir joao:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

    }
}
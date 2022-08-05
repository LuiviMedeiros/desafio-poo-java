import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(10);

        Conteudo conteudo = new Curso ();

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Aulas Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devLuivi = new Dev();
        devLuivi.setNome("Luivi");
        devLuivi.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Luivi " + devLuivi.getConteudosInscritos());
        devLuivi.progredir();
        devLuivi.progredir();
        System.out.println(".");
        System.out.println("Conteudos Inscritos Luivi " + devLuivi.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Luivi " + devLuivi.getConteudosConcluidos());
        System.out.println("XP: " + devLuivi.calcularTotalXP());

        System.out.println("......");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println(".");
        System.out.println("Conteudos Inscritos Camila " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila " + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXP());




    }
}

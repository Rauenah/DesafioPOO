import br.com.dio.desafio.dominio.*;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       Curso curso1 =new Curso();
       curso1.setTitulo( " Curso Java ");
       curso1.setDescrição( " Descricao curso Java " );
       curso1.setCargaHoraria( 8 );

       Curso curso2 =new Curso();
       curso2.setTitulo( " Curso JS ");
       curso2.setDescrição( " Descricao curso JS " );
       curso2.setCargaHoraria( 4 );


       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("Mentoria Java");
       mentoria.setDescrição("Descrição Java");
       mentoria.setData(LocalDate.now());


       /*System.out.println(curso1);
       System.out.println(curso2);
       System.out.println(mentoria);*/

       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("BootCamp Java Developer");
       bootcamp.setDescricao("Descricao Bootcamp Jaca Developer");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);

       Dev devRauena= new Dev();
       devRauena.setNome("Rauena");
       devRauena.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos" + devRauena.getConteudosInscritos());
       devRauena.progredir();
       devRauena.progredir();
       System.out.print("-");
       System.out.println("Conteudos inscritos" + devRauena.getConteudosInscritos());
       System.out.println("Conteudos concluidos" + devRauena.getConteudosConcluidos());
       System.out.println(" XP " + devRauena.calcularTotalXp());



       System.out.println("----------");


       Dev devPedro = new Dev();
       devPedro.setNome("Pedro");
       devPedro.inscreverBootcamp(bootcamp);
       System.out.println("Conteudos inscritos" + devPedro.getConteudosInscritos());
       devPedro.progredir();
       System.out.print("-");
       System.out.println("Conteudos inscritos" + devPedro.getConteudosInscritos());
       System.out.println("Conteudos concluidos" + devPedro.getConteudosConcluidos());
       System.out.println(" XP " + devPedro.calcularTotalXp());
    }
}

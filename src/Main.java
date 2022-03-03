import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args){

        Curso curso1 = new Curso("Curso Java", "Fundamentos de Java", 8);
        Curso curso2 = new Curso("Curso js", "Fundamentos de js", 9);
        Mentoria mentoria = new Mentoria("Mentoria Java", "Sobre fundamentos de Java", LocalDate.now());

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
    }

}

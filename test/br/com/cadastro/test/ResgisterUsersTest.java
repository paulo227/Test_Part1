package br.com.cadastro.test;

import br.com.cadastro.ResgisterUsers;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

public class ResgisterUsersTest {

    @Test
    public void test(){

        List<ResgisterUsers> lista = new ResgisterUsers().cadastreUser();
        Stream<ResgisterUsers> registerF = lista.stream()
                .filter(user -> user.getGender().equals("F".toUpperCase()));
         System.out.println("**** Usuários Femininos ****");
        registerF.forEach(System.out::println);

    }
}

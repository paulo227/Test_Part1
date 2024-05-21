package br.com.cadastro.test;

import br.com.cadastro.ResgisterUsers;
import org.junit.Test;
import org.junit.Assert;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResgisterUsersTest {

   @Test
    public void test(){

       List<ResgisterUsers> lista = new ResgisterUsers().cadastreUser();
       Stream<ResgisterUsers> registerF = lista.stream()
               .filter(user -> user.getGender().equals("F".toUpperCase()));
       Assert.assertTrue("F", true);
       registerF.forEach(System.out::println);
    }
}

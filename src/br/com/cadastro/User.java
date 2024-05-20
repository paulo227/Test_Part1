package br.com.cadastro;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class User {

    public static void main(String[] args) {

        List<ResgisterUsers> lista = new ResgisterUsers().cadastreUser();
        Stream<ResgisterUsers> registerF = lista.stream()
                .filter(user -> user.getGender().equals("F".toUpperCase()));
        // System.out.println("**** Usuários Femininos ****");
        registerF.forEach(System.out::println);

        System.out.println("---- Todos os usuários ----");

        List<ResgisterUsers> register = new ArrayList<>(lista);
        register.forEach(System.out::println);

    }
}

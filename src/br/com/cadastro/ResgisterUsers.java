package br.com.cadastro;

import java.util.List;
import java.util.Objects;

public class ResgisterUsers {

    String name;
    Integer years;
    String gender;

    public ResgisterUsers(String name, Integer years, String gender) {
        this.name = name;
        this.years = years;
        this.gender = gender;
    }

    public ResgisterUsers() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<ResgisterUsers> cadastreUser(){
        ResgisterUsers user1 = new ResgisterUsers("Paulo", 26, "m".toUpperCase());
        ResgisterUsers user2 = new ResgisterUsers("Joana", 32, "f".toUpperCase());
        ResgisterUsers user3 = new ResgisterUsers("Allan", 3, "m".toUpperCase());
        ResgisterUsers user4 = new ResgisterUsers("Patricia", 35, "f".toUpperCase());
        ResgisterUsers user5 = new ResgisterUsers("Adriana", 12, "f".toUpperCase());
        ResgisterUsers user6 = new ResgisterUsers("Cecilia", 45, "f".toUpperCase());

        return List.of(user1, user2, user3, user4, user5, user6);
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", gender='" + gender + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResgisterUsers that = (ResgisterUsers) o;
        return Objects.equals(name, that.name) && Objects.equals(years, that.years) && Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, years, gender);
    }

}

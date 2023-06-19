package atl.academy.atl_academy_java_activities.actividad_10;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private Integer uid;
    private Integer dni;
    private String name;
    private Integer age;
    private LocalDate birthDate;

    public Person(){

    }

    public Person(Integer uid, Integer dni, String name, LocalDate birthDate){
        this. uid = uid;
        this. dni = dni;
        this. name = name;
        this. age = Period.between(birthDate, LocalDate.now()).getYears();
        this. birthDate = birthDate;
    }

    public Integer getUid() {
        return uid;
    }

    public Integer getDni() {
        return dni;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String showData() {
        return "Person{" +
                "uid=" + uid +
                ", dni=" + dni +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthDate=" + birthDate +
                '}';
    }

    public Boolean isAdult(){
        return this.age >= 18;
    }

}

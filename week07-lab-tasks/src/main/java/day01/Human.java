package day01;

public class Human {
    private String name;
    private int age;

    public Human(String name, int age) {
        if(age>120){
            throw new IllegalArgumentException("Hibás kor");
        }
        if(!name.contains(" ")){
            throw new IllegalArgumentException("Hibás név fomátum");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

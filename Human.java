public class Human {

    private String name;
    private long egn;
    private byte age;

    public Human(String name) {
        this(name, 1234567899, (byte) 48);
    }

    public Human(String name, int egn, byte age) {
        this.name = name;
        this.egn = egn;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public long getEgn() {
        return egn;
    }

    public void setName() {
        this.name = name;
    }
}




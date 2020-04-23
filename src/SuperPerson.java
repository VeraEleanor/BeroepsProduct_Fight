import java.util.ArrayList;

public class SuperPerson {

    private Integer id;
    private String superName;
    private String realName;
    protected Integer age;
    private String city;
    private Integer powerLevel;
    private String oneLiner;
    protected ArrayList<Gadget> gadgets;
    protected ArrayList<Hero> heroes;
    protected ArrayList<Villain> villains;

    public SuperPerson(String superName, String realName,Integer age, String city, String oneLiner, Integer powerLevel){
        this.superName = superName;
        this.realName = realName;
        this.age = age;
        this.city = city;
        this.oneLiner = oneLiner;
        this.powerLevel = powerLevel;
    }
}

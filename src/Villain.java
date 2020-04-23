import java.util.ArrayList;

public class Villain extends SuperPerson{

    protected ArrayList<Hero> antiFriendsBook;
    private Hero nemesis;
    protected ArrayList<Gadget> myGadgets;

    public Villain(Integer id, String superName, String realName, String city, Integer powerLevel, String oneLiner, Hero nemesis) {
        super(superName, realName, age, city, oneLiner, powerLevel);


    }
}


import java.util.ArrayList;

public class Hero extends SuperPerson {
    protected ArrayList<Villain> antiFriendsBook;
    private Villain nemesis;
    protected ArrayList<Gadget> myGadgets;

    public Hero(Integer id, String superName, String realName, String city, Integer powerLevel, String oneLiner, Villain nemesis) {
        super(superName, realName, age, city, oneLiner, powerLevel);


    }


}


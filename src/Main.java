public class Main {

public static void main(String args[]) {


    Hero Batman = new Hero(001, "Batman", "Bruce Wayne", "Gotham", 8, "I'm Batman!", Joker);
    Hero Superwoman = new Hero();
    Hero Superman = new Hero();
    Hero Spider_Man = new Hero();


    Villain Joker = new Villain(001, "Joker", "Jack Napier", "Gotham", 8, "Let's put a smile on that face!", Batman);
    Villain Doctor_Octopus = new Villain(002, "Bane", "Otto Octavius", "New York", 7, "The power of the sun.. in the palm of my hand.", Spider_Man);
    Villain Catwoman = new Villain(003, "Catwoman", "Selina Kyle", "Gotham", 5, "Life's a bitch, now so am I!", Batman);

}}

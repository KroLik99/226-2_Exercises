package gibb;


abstract class Person {
    protected String name;
    protected String vorname;
    protected int personalNummer;

    public Person(String name, String vorname, int personalNummer) {
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
    }

    public void print() { // deklarieren und implementieren
        System.out.println("Name: " + this.name);
        System.out.println("Vorname: " + this.vorname);
        System.out.println("Personalnummer: " + this.personalNummer);
    }

    public abstract int berechneFerien(int alter); //deklariert aber nicht implementiert -> abstrakte Klasse und keine Objekte mehr möglich von Person (instanciated)
}

class Chef extends Person {
    protected String abteilung;

    public Chef(String name, String vorname, int personalNummer, String abteilung) {
        super(name, vorname, personalNummer); // weil Chef von Person erbt muss er alle Instanzvariabeln von Person im Konstruktor haben
        this.abteilung = abteilung;

    }

    @Override
    public void print() { // deklarieren und implementieren, überschreibt print() von der Basisklasse
        super.print();
        System.out.println(abteilung);
    }

    @Override
    public int berechneFerien(int alter) {
        if(alter < 45){
            return 4;
        } else if (alter>=45 && alter < 55) {
            return 5;
        }
        return 6;
    }
}

class Fachangestellter extends Person {
    protected Chef vorgesetzter; //wir greifen auf diesen zu (ohne Setter)

    public Fachangestellter(String name, String vorname, int personalNummer, Chef vorgesetzter) {
        super(name, vorname, personalNummer);
        this.vorgesetzter = vorgesetzter;
    }

    @Override
    public int berechneFerien(int alter) {
        if(alter < 50){
            return 4;
        } else if (alter>=50 && alter < 60) {
            return 5;
        }
        return 6;
    }
}

class Lernender extends Person {
    private int lernjahr;

    public Lernender(String name, String vorname, int personalNummer, int lernjahr) {
        super(name, vorname, personalNummer);
        this.lernjahr = lernjahr;
    }
@Override
    public void print() { // deklarieren und implementieren, überschreibt print() von der Basisklasse
        super.print();
        System.out.println("Lernjahr: " + this.lernjahr);
    }

    @Override
    public int berechneFerien(int alter) {
        return 5;
    }
}

class Firma {
    public Person[] mitarbeiter;

    public Firma(Person[] p) {
        mitarbeiter = p;
    }
}

public class Personen {
    public static void main(String args[]) {

        /*
        Chef personal3 = new Chef("Sattler", "Beatrice", 234,"Verkauf");
        Fachangestellter personal1 = new Fachangestellter("Klein","Thomas", 123, personal3);
        Fachangestellter personal2 = new Fachangestellter("Gross", "Thomasa", 456, personal3);
        Person personal4 = new Person(null, null, 0);

        personal1.vorgesetzter = personal3; //1
        personal4=personal1;//2
       /*
       personal4.vorgesetzter = personal3; //3
        personal1 = personal4; //4
        */
/*
        personal1 = (Fachangestellter) personal4; //*5
        */
        Chef chef = new Chef("Sattler","Beatrice", 234,"Verkauf");
        Person[] angestellte = new Person[]{
               chef,
                new Fachangestellter("Klein","Thomas", 123, chef),
                new Fachangestellter("Gross", "Thomasa", 456, chef),
                new Lernender("Müller", "Max", 12, 3)
        };


    }
}

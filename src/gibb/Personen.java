package gibb;


class Person {
    private String name;
    private String vorname;
    private int personalNummer;
    public Person(String name, String vorname, int personalNummer){
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
    }
}
class Chef extends Person {
    private String abteilung;
    public Chef(String name, String vorname, int personalNummer,String abteilung){
        super(name,vorname,personalNummer); // weil Chef von Person erbt muss er alle Instanzvariabeln von Person im Konstruktor haben
        this.abteilung = abteilung;

    }
}
class Fachangestellter extends Person {
    protected Chef vorgesetzter; //wir greifen auf diesen zu (ohne Setter)

    public Fachangestellter(String name, String vorname, int personalNummer, Chef vorgesetzter) {
        super(name, vorname, personalNummer);
        this.vorgesetzter = vorgesetzter;
    }
}
public class Personen {
    public static void main (String args[]) {
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

        personal1 = (Fachangestellter) personal4; //*5
    }
}

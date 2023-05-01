package gibb;

public class Aufgabe1_VererbungUndReferenzen {

}
class Person {
    String name;
    String vorname;
    int personalNummer;
    public Person(String name, String vorname, int personalNummer){
        this.name = name;
        this.vorname = vorname;
        this.personalNummer = personalNummer;
    }
}
class Chef extends Person {
    String abteilung;
    public Chef(String name, String vorname, int personalNummer,String abteilung){
        super(name,vorname,personalNummer); // weil Chef von Person erbt muss er alle Instanzvariabeln von Person im Konstruktor haben
        this.abteilung = abteilung;

    }
}
class Fachangestellter extends Person {
    Chef vorgesetzter;

    public Fachangestellter(String name, String vorname, int personalNummer, Chef vorgesetzter) {
        super(name, vorname, personalNummer);
        this.vorgesetzter = vorgesetzter;
    }
}
public class Personen {
    public static void main (String args[]) {
        Fachangestellter personal1 = new Fachangestellter();
        Fachangestellter personal2 = new Fachangestellter();
        Chef personal3 = new Chef();
        Person personal4 = new Person();
        personal3.name="Sattler";
        personal3.vorname="Beatrice";
        personal3.abteilung="Verkauf";
        personal1.name="Klein";
        personal1.vorname="Thomas";
        personal1.vorgesetzter=personal3; //*1
        personal4 = personal1; //*2
        personal4.vorgesetzter = personal3; //*3
        personal1 = personal4; //*4
        personal1 = (Fachangestellter) personal4; //*5
    }
}

package gibb.polymorphismus_delegation;

public class Bibliothek {
    private Medium[] katalog; //weil katalog ein Array ist, ist keine strikte polymorphe Variable

    public Bibliothek(Medium[] katalog) {
        this.katalog = katalog;
    }

    public void showSample(Medium m) { //m ist die polymorphe Variable
        m.printSample();
    }

    public void showAllSamples(){
        for (Medium medium:katalog) {
            showSample(medium);
        }
    }

    public static void main(String[] args) {
        Medium[] medien = new Medium[]{
                new Buch(),
                new CD(),
                new DVD(),
                new Buch(),
                new MC()
        };

        Bibliothek bibliothek = new Bibliothek(medien);
        bibliothek.showAllSamples();
    }
}
abstract class Medium {
    public abstract void printSample();
}
class Buch extends Medium {
    String sample;

    @Override
    public void printSample() {
        System.out.println(this.sample);
    }
}
class CD extends Medium {
    Sound sample;

    @Override
    public void printSample() {
        Player p = new Player();
        p.playSound(this.sample);
    }
}
class DVD extends Medium {
    Video sample;

    @Override
    public void printSample() {
        Player p = new Player();
        p.playVideo(this.sample);
    }
}
class MC extends Medium{
    Sound sample;
    @Override
    public void printSample() {
        Player p = new Player();
        p.playSound(this.sample);
    }
}
class Sound { // ...
}
class Video { // ...
}
class Player {
    public void playVideo(Video v) {
// Video anzeigen ...
        System.out.println("Playing video...");
    }
    public void playSound(Sound s) {
// Sound spielen ...
        System.out.println("Playing sound...");
    }


}

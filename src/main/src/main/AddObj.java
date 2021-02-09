package src.main;

import java.util.ArrayList;

public class AddObj extends Archivio1{
    public AddObj(ArrayList<Detenuti1> listaDetenuti, ArrayList<Guardie1> listaGuardie) {
        super(listaDetenuti, listaGuardie);
    }

    public ArrayList<Detenuti1> addObjectsPrisoners() {
        Archivio1 archivio = new Archivio1(listaDetenuti, listaGuardie);

        // dati anagrafici
        Detenuti1 markFisher = new Detenuti1("Mark", "Fisher", "13/7/67", "Gotham", "Gotham");
        archivio.addPrisoner(markFisher);
        Detenuti1 philipMiller = new Detenuti1("Philip", "Miller", "13/7/69", "Gotham", "Gotham");
        archivio.addPrisoner(philipMiller);
        Detenuti1 jesusChrist = new Detenuti1("Jesus", "Christ", "0/0/00", "Gotham", "Gotham");
        archivio.addPrisoner(jesusChrist);
        Detenuti1 jokerJoker = new Detenuti1("Joker", "Joker", "1/1/70", "Gotham", "Gotham");
        archivio.addPrisoner(jokerJoker);
        Detenuti1 arleyQueen = new Detenuti1("Arley", "Queen", "13/11/75", "Gotham", "Gotham");
        archivio.addPrisoner(arleyQueen);


        //FASCICOLI
        markFisher.setFascicoloDetenuto(new FascicoloDetenuti1("Mark", "Fisher", 001, "12/12/19", "none", "Aggressione", false, false));
        philipMiller.setFascicoloDetenuto(new FascicoloDetenuti1("Philip", "Miller", 002, "12/12/19", "none", "Aggressione", false, true));
        jesusChrist.setFascicoloDetenuto(new FascicoloDetenuti1("Jesus", "Christ", 003, "12/12/19", "none", "Aggressione", true, false));
        jokerJoker.setFascicoloDetenuto(new FascicoloDetenuti1("Joker", "Joker", 004, "12/12/19", "none", "Aggressione", false, false));
        arleyQueen.setFascicoloDetenuto(new FascicoloDetenuti1("Arley", "Queen", 005, "12/12/19", "none", "Aggressione", false, false));

        return listaDetenuti;
    }

    public ArrayList<Guardie1> addObjectsGuards() {
        Archivio1 archivio = new Archivio1(listaDetenuti, listaGuardie);

        // dati anagrafici
        Guardie1 batMan = new Guardie1("Bat", "Man", "12/4/73", "Gotham", "Gotham");
        archivio.addGuard(batMan);
        Guardie1 batGirl = new Guardie1("Bat", "Girl", "11/5/90", "Gotham", "Gotham");
        archivio.addGuard(batGirl);
        Guardie1 robinRobin = new Guardie1("Robin", "Robin", "12/11/80", "Gotham", "Gotham");
        archivio.addGuard(robinRobin);
        Guardie1 joshStiller = new Guardie1("Josh", "Stiller", "1/1/72", "Gotham", "Gotham");
        archivio.addGuard(joshStiller);
        Guardie1 matFooler = new Guardie1("Mat", "Fooler", "2/8/71", "Gotham", "Gotham");
        archivio.addGuard(matFooler);

        //FASCICOLI
        batMan.setFascicoloGuardia(new FascicoloGuardie1("Bat", "Man", 001, "12/12/13", "12/12/19", "Secondino"));
        batGirl.setFascicoloGuardia(new FascicoloGuardie1("Bat", "Girl", 002, "12/11/13", "none", "Secondino"));
        robinRobin.setFascicoloGuardia(new FascicoloGuardie1("Robin", "Robin", 003, "12/11/13", "none", "Secondino"));
        joshStiller.setFascicoloGuardia(new FascicoloGuardie1("Josh", "Stiller", 004, "12/11/13", "none", "Secondino"));
        matFooler.setFascicoloGuardia(new FascicoloGuardie1("Mat", "Fooler", 005, "12/11/13", "none", "Secondino"));

        return listaGuardie;
    }
}

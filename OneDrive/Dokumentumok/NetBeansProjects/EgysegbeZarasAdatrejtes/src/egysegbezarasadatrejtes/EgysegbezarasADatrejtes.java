package egysegbezarasadatrejtes;

class Ember{
    private String nev;
    private int kor;
    private String cim;

    
    public Ember(String nev, String cim){
        this(nev+";"+40+";"+cim);
    }
    
    /* ALT + INSERT generálva */
    public Ember(String nev, int kor){
        this(nev+";"+kor+";Nincs lakcíme");
    }
    
    public Ember(String nev, int kor, String cim) {
        this(nev+";"+kor+";"+cim);
//        setNev(nev);
//        setKor(kor);
//        this.cim = cim;
    }

    /* túlterhelt kstr. */
    public Ember(String sor) {
        //this(sor.split(";")[0], Integer.parseInt(sor.split(";")[1]), sor.split(";")[2]);
        /* első legyen a kstr hívás és this() a kstr, nem a neve */
        //Ember(sor.split(";")[0], Integer.parseInt(sor.split(";")[1]), sor.split(";")[2]);
        String[] s = sor.split(";");
        setNev(s[0]);
        setKor(Integer.parseInt(s[1]));
        cim = s[2];
    }
 
    /* ALT + INSERT generálva */
    public String getNev() {
        return nev;
    }

    public int getKor() {
        return kor;
    }

    public String getCim() {
        return cim;
    }
    
    
    
   /* ALT + INSERT generálva */
//    public void setCim(String cim){
//        this.cim = cim;
//    }

    /* beszédes setter */
    public void koltozik(String ujCim){
        this.cim = ujCim;
    }
    
    public void setNev(String nev) {
        if(nev.length() < 3){ nev = "hiba"; }
        this.nev = nev;
    }

    /* ALT + INSERT generálva */
    public void setKor(int kor) {
        if(kor <= 0 || kor > 130){ kor = 40; }
        this.kor = kor;
    }
    
    /* beszédes és biztonságos setter */
    public void szuletesnap(){
        //kor++;
        setKor(kor + 1);
    }

    /* ALT + INSERT generálva */
    public void setCim(String cim) {
        this.cim = cim;
    }
    
    
    public void kiir(){
        System.out.println("név: " + nev);
        System.out.println("kor: " + kor);
        System.out.println("cím: " + cim);
        System.out.println("-------------------");
    }
}

public class EgysegbezarasADatrejtes {
    public static void main(String[] args) {
        Ember ember = new Ember("Pál", "Bereg");
        ember.kiir();
        
        ember = new Ember("Pál", 39);
        ember.kiir();
        System.out.println("Pál lakást vett");
        ember.setCim("Bp");
        ember.kiir();
        
        ember = new Ember("P", -39, "Cinkota");
        ember.kiir();
        
        String sor = "P;-210;Bp";
        ember = new Ember(sor);
        ember.kiir();
        
        sor = "Petra;33;Göd";
        ember = new Ember(sor);
        ember.kiir();
        System.out.println("Petra elköltözött Érdre");
        //ember.setCim("Érd");
        ember.koltozik("Érd");
        //ember.setKor(-5);
        ember.kiir();
        System.out.println("Petrának szülinapja volt, idősebb lett 1 évvel");
        //ember.setKor(ember.getKor() + -11);
        ember.kiir();
        System.out.println("Petra házasodott, felvette férje nevét");
        ember.setNev("Kovácsné Petra");
        ember.kiir();
        
        System.out.println("elrontom");
        ember.setKor(-50);
        for (int i = 0; i < 150; i++) {
            ember.szuletesnap();
        }
        ember.setNev("K");
        ember.kiir();
    }

}

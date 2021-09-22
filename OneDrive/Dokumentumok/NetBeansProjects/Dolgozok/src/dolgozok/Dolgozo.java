package dolgozok;

public class Dolgozo {

    private String nev;
    private int kor;
    private String neme;
    private int munkEv;

    public Dolgozo(String sor) {
        String[] s = sor.split(";");
        this.nev = s[0];
        this.kor = Integer.parseInt(s[1]);
        this.neme = s[2];
        this.munkEv = Integer.parseInt(s[3]);

    }

    public String getNEV() {
        return nev;
    }

    public int getKOR() {
        return kor;
    }

    public String getNEME() {
        return neme;
    }

    public int getMunkEV() {
        return munkEv;
    }

    @Override
    public String toString() {
        return "DolgozokProg{" + "NEV=" + nev + ", KOR=" + kor + ", NEME=" + neme + ", MunkEV=" + munkEv + '}';
    }

}

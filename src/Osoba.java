import java.util.Date;

public class Osoba {
    private String ime;
    private String prezime;
    private Date datum_rodjenja;
    private boolean student;

    public Osoba(String ime, String prezime, Date datum_rodjenja, boolean student) {
        this.ime = ime;
        this.prezime = prezime;
        this.datum_rodjenja = datum_rodjenja;
        this.student = student;
    }
    public Osoba(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }
    public String getIme (){
        return ime;
    }
    public String getPrezime (){
        return prezime;
    }

    @Override
    public String toString() {
        if(student)
        return ime + '\'' +
                prezime + '\'' +
                 datum_rodjenja + '\'' + "student";
        else return ime + '\'' +
                prezime + '\'' +
                datum_rodjenja + '\'';
    }
}

import java.util.*;
public class Zajecia {
    private String nazwa;
    private ArrayList<String> listaStudentow = new ArrayList<String>();

    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void zapiszStudenta(String name) {
        if (listaStudentow.size() < 10) {
            listaStudentow.add(name);
        } else {
            System.out.println("Przekroczono limit liczby uczestników");
        }


    }
}

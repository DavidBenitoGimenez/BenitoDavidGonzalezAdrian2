package prog2.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public abstract class Camping implements InCamping {
    private String nom;
    private ArrayList<Allotjament> llistaAllotjaments;


    // Constructor
    public Camping(String nom) {
        this.nom = nom;
        this.llistaAllotjaments = new ArrayList<>();

    }

    // Getters
    public String getNom() {
        return nom;
    }
    public ArrayList<Allotjament> getLlistaAllotjaments() {
        return llistaAllotjaments;
    }
    public int getNumAllotjaments() {
        return llistaAllotjaments.size();
    }


    public static InAllotjament.Temp getTemporada(LocalDate data){
        int mes = data.getMonthValue();
        int dia = data.getDayOfMonth();
        if ((mes > 3 || (mes == 3 & dia > 20)) && (mes < 9 || (mes == 9 & dia < 21))) {
            return InAllotjament.Temp.ALTA;
        }
        return InAllotjament.Temp.BAIXA;
    }

    // Métodes per agregar diferents tipus d'allotjaments
    public void afegirParcela(String nom, String idAllotjament, float metres, boolean connexioElectrica) {
        llistaAllotjaments.add(new Parcela(nom, idAllotjament, metres, connexioElectrica));
    }

    public void afegirBungalow(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred) {
        llistaAllotjaments.add(new Bungalow(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred));
    }

    public void afegirBungalowPremium(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        llistaAllotjaments.add(new BungalowPremium(nom, idAllotjament, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred, serveisExtra, codiWifi));
    }

    public void afegirGlamping(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, String material, boolean casaMascota) {
        llistaAllotjaments.add(new Glamping(nom, idAllotjament, mida, habitacions, placesPersones, material, casaMascota));
    }

    public void afegirMobilHome(String nom, String idAllotjament, String mida, int habitacions, int placesPersones, boolean terrassaBarbacoa) {
        llistaAllotjaments.add(new MobilHome(nom, idAllotjament, mida, habitacions, placesPersones, terrassaBarbacoa));
    }

}

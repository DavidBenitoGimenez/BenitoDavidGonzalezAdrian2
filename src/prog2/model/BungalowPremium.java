package prog2.model;

public class BungalowPremium extends Bungalow {
    private boolean serveisExtra;
    private String codiWifi;

    // Constructor
    public BungalowPremium(String nom_, String idAllotjament_, String mida, int habitacions, int placesPersones, int placesParquing, boolean terrassa, boolean tv, boolean aireFred, boolean serveisExtra, String codiWifi) {
        super(nom_, idAllotjament_, mida, habitacions, placesPersones, placesParquing, terrassa, tv, aireFred);
        this.serveisExtra = serveisExtra;
        this.codiWifi = codiWifi;
    }

    // Getters
    public boolean isServeisExtra() {
        return serveisExtra;
    }
    public String getCodiWifi() {
        return codiWifi;
    }
    public void setServeisExtra(boolean serveisExtra) {

    }
}

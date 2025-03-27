    package prog2.model;
    import java.io.Serializable;
    import java.util.ArrayList;

    public abstract class Acces implements InAcces, Serializable {
        private String nom;
        private boolean accesibilitat;
        private boolean estat; // obert = true, tancat = false
        private ArrayList<Allotjament> LlistaAllotjaments;

        public Acces(String nom, boolean accesibilitat, boolean estat) {
            this.nom = nom;
            this.accesibilitat = accesibilitat;
            this.estat = estat;
            this.LlistaAllotjaments = LlistaAllotjaments;
        }

        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }

        public boolean isAccessibilitat() {
            return accesibilitat;
        }
        public void setAccesibilitat(boolean accesibilitat) {
            this.accesibilitat = accesibilitat;
        }
        public boolean isEstat() {
            return estat;
        }
        public void setEstat(boolean estat) {
            this.estat = estat;
        }
        public ArrayList<Allotjament> getLlistaAllotjaments() {
            return LlistaAllotjaments;
        }
        public void setLlistaAllotjaments(ArrayList<Allotjament> LlistaAllotjaments) {
            this.LlistaAllotjaments = LlistaAllotjaments;
        }


        /**
         * Afegeix un allotjament rebut com a paràmetre a la llista d'allotjaments de l'accés
         * @param allotjament
         */
        public void afegirAllotjament(Allotjament allotjament) {
            LlistaAllotjaments.add(allotjament);
        }

        /**
         * Canvia l'estat de l'accés a tancat
         */
        public void tancarAcces() {
            estat = false;
        }

        /**
         * Canvia l'estat de l'accés a obert
         */
        public void obrirAcces() {
            estat = true;
        }
    }

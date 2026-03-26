public class DispozitivMedical {
    private String tipDispozitiv;
    private String material;
    private double pret;
    private String categorie;

    public DispozitivMedical(String tipDispozitiv, String material, double pret, String categorie) {
        this.tipDispozitiv = tipDispozitiv;
        this.material = material;
        this.pret = pret;
        this.categorie = categorie;
    }

    public DispozitivMedical(String tipDispozitiv, String material) {
        this.tipDispozitiv = tipDispozitiv;
        this.material = material;
        this.pret = 0;
        this.categorie = "";
    }

    public String getTipDispozitiv() {
        return tipDispozitiv;
    }

    public void setTipDispozitiv(String tipDispozitiv) {
        this.tipDispozitiv = tipDispozitiv;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "\n=== Dispozitiv Medical ===\n" +
                "Nume: " + tipDispozitiv +
                "\nMaterial: " + material +
                "\nPret: " + pret + " RON" +
                "\nCategorie: " + categorie;
    }
}

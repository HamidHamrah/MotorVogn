package motorvogn.register.motorvogn;

public class MotorVogn {
    private String personnummer;
    private String Navn;
    private String Adresse;
    private String kjenetegn;
    private String BilMerke;
    private String BilType;

    public MotorVogn(String  personnummer, String navn, String adresse,
                     String kjenetegn, String bilMerke, String bilType) {
        this.personnummer = personnummer;
        Navn = navn;
        Adresse = adresse;
        this.kjenetegn = kjenetegn;
        BilMerke = bilMerke;
        BilType = bilType;
    }
    public MotorVogn(){
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getNavn() {
        return Navn;
    }

    public void setNavn(String navn) {
        Navn = navn;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getKjenetegn() {
        return kjenetegn;
    }

    public void setKjenetegn(String kjenetegn) {
        this.kjenetegn = kjenetegn;
    }

    public String getBilMerke() {
        return BilMerke;
    }

    public void setBilMerke(String bilMerke) {
        BilMerke = bilMerke;
    }

    public String getBilType() {
        return BilType;
    }

    public void setBilType(String bilType) {
        BilType = bilType;
    }
}

package at.spengergasse.spring_thymeleaf.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autohaus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    // Felder in lowerCamelCase benennen (Java-Konvention)
    private String modellname;
    private String hersteller;
    private String baujahr;
    private String farbe;


    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getModellname() { return modellname; }
    public void setModellname(String modellname) { this.modellname = modellname; }

    public String getHersteller() { return hersteller; }
    public void setHersteller(String hersteller) { this.hersteller = hersteller; }

    public String getBaujahr() { return baujahr; }
    public void setBaujahr(String baujahr) { this.baujahr = baujahr; }

    public String getFarbe() { return farbe; }
    public void setFarbe(String farbe) { this.farbe = farbe; }

}

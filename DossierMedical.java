/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author linah
 */

public class DossierMedical {
    private int ref ;
    private String nom ;
    private String prenom ;
    private Date datenais ;
    private Gender genre ;
    private String tel ;
    private ArrayList<Consultation> historiqueConsultations = new ArrayList<>();

    public DossierMedical() {
    }

    public DossierMedical(int ref, String nom, String prenom, Date datenais, Gender genre, String tel, ArrayList<Consultation> historiqueConsultations) {
        this.ref = ref;
        this.nom = nom;
        this.prenom = prenom;
        this.datenais = datenais;
        this.genre = genre;
        this.tel = tel;
        this.historiqueConsultations = historiqueConsultations;
    }

    public int getRef() {
        return ref;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDatenais() {
        return datenais;
    }

    public Gender getGenre() {
        return genre;
    }

    public String getTel() {
        return tel;
    }

    public ArrayList<Consultation> getHistoriqueConsultations() {
        return historiqueConsultations;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDatenais(Date datenais) {
        this.datenais = datenais;
    }

    public void setGenre(Gender genre) {
        this.genre = genre;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setHistoriqueConsultations(ArrayList<Consultation> historiqueConsultations) {
        this.historiqueConsultations = historiqueConsultations;
    }
    
}

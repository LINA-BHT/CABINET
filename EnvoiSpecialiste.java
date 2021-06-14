/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

/**
 *
 * @author linah
 */
public class EnvoiSpecialiste extends Prescription{

    public EnvoiSpecialiste(int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
    }
    private String specialite ;
    private String nomMedecin ;

    public String getSpecialite() {
        return specialite;
    }

    public String getNomMedecin() {
        return nomMedecin;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public void setNomMedecin(String nomMedecin) {
        this.nomMedecin = nomMedecin;
    }

    public EnvoiSpecialiste(String specialite, String nomMedecin, int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
        this.specialite = specialite;
        this.nomMedecin = nomMedecin;
    }

    public String detailPrescription() {
        return "nom specialiste :"+nomMedecin + "Specialite :"+specialite ;
    }

 
    @Override
    public String type() {
        return "Envoi specialiste" ;
    }
    
    @Override
    public String detail (){
        return "nom :"+nomMedecin+" specialite"+specialite ;
    }
    
    
}

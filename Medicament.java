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
public class Medicament extends Prescription{

    public Medicament(int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
    }
    private String nom ;
    private String posologie ;

    public String getNom() {
        return nom;
    }

    public String getPosologie() {
        return posologie;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPosologie(String posologie) {
        this.posologie = posologie;
    }

    public Medicament(String nom, String posologie, int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
        this.nom = nom;
        this.posologie = posologie;
    }

   

 
    @Override
    public String type() {
        return "Medicament" ;
    }
    
    @Override
    public String detail (){
        return "nom"+nom+" posologie: "+posologie ;
    }
    
}

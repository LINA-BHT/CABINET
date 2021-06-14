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
public class ActeRadio extends Prescription{
    private String type_acte ;

    public ActeRadio(int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
    }

    public ActeRadio(String type_acte, int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
        this.type_acte = type_acte;
    }

    public String getType_acte() {
        return type_acte;
    }

    public void setType_acte(String type_acte) {
        this.type_acte = type_acte;
    }

   


    public String detailPrescription() {
        return type_acte ;
    }

    @Override
    public String type() {
        return "Acte radio" ;
    }
    @Override
    public String detail (){
        return type_acte ;
    }
    
    
}

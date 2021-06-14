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
public class Prescription  {
    private int idConsultation ; 
    private int idprescription ;

    public Prescription() {
    }

    public int getIdConsultation() {
        return idConsultation;
    }

    public int getIdprescription() {
        return idprescription;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public void setIdprescription(int idprescription) {
        this.idprescription = idprescription;
    }

    public Prescription(int idConsultation, int idprescription) {
        this.idConsultation = idConsultation;
        this.idprescription = idprescription;
    }
    public String detail (){
        return "" ;
    }
    /**
     *
     * @return
     */
  public String type() {
        return "prescription" ;
    }
}

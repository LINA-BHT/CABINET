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
public class AnalyseAF extends Prescription{

    public AnalyseAF(int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
    }
    private String initule ;

    public AnalyseAF(String initule, int idConsultation, int idprescription) {
        super(idConsultation, idprescription);
        this.initule = initule;
    }

    public String getInitule() {
        return initule;
    }

    public void setInitule(String initule) {
        this.initule = initule;
    }

   
    public String detailPrescription() {
        
        return initule;
    }

    @Override
    public String type() {
        return "Analyse" ;
    }
    @Override
    public String detail (){
        return initule ;
    }
    
}

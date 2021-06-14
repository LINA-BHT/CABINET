/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.awt.List;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author linah
 */
public class Consultation {
   private Date Date ;
   private String Diagnostique ;
   private int idconsultation;
   private ArrayList<Prescription> perseptions = new ArrayList<>();
    
    public Consultation(Date Date,int idconsultation, String Diagnostique, ArrayList<Prescription> perseptions) {
        this.Date = Date;
        this.Diagnostique = Diagnostique;
        this.perseptions = perseptions;
          this.idconsultation=idconsultation;
          
    }

    public Date getDate() {
        return Date;
    }

    public String getDiagnostique() {
        return Diagnostique;
    }

    public ArrayList<Prescription> getPerseptions() {
        return perseptions;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public void setDiagnostique(String Diagnostique) {
        this.Diagnostique = Diagnostique;
    }

    public void setPerseptions(ArrayList<Prescription> perseptions) {
        this.perseptions = perseptions;
    }
    public int getidconsultation() {
        return idconsultation;
        
    }
    public void setidconsultation(int idconsultation){
        this.idconsultation=idconsultation;
    }


   
}

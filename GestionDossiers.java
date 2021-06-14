/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Data.ActeRadio;
import Data.Consultation;
import Data.DossierMedical;
import Data.EnvoiSpecialiste;
import Data.Gender;
import Data.Medicament;
import Data.Prescription;
import Interface.Authentification1;
import Interface.Patient;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author linah
 */
public class GestionDossiers {

    private HashMap<Integer, DossierMedical> dossiers  = new HashMap<>();

    public HashMap<Integer, DossierMedical> getDossiers() {
        return dossiers;
    }

    public void setDossiers(HashMap<Integer, DossierMedical> dossiers) {
        this.dossiers = dossiers;
    }
    public GestionDossiers() {
         ArrayList<Consultation> cs1 = new ArrayList<>();
         ArrayList<Consultation> cs2 = new ArrayList<>();
         ArrayList<Consultation> cs3 = new ArrayList<>();
         ArrayList<Consultation> cs4 = new ArrayList<>();
         ArrayList<Prescription> ps1 = new ArrayList<>();
         try{   
        DossierMedical d1 = new DossierMedical(1, "mohsen", "ben lasaad",new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1994"), Gender.MALE,"21111555", new ArrayList<Consultation>());
        DossierMedical d2 = new DossierMedical(2, "monji", "ben salha",new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1994"), Gender.MALE,"21111555", new ArrayList<Consultation>());
        DossierMedical d3 = new DossierMedical(3, "lasaa", "ben dida",new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1994"), Gender.MALE,"21111555", new ArrayList<Consultation>());
        DossierMedical d4 = new DossierMedical(4, "mounir", "saayed",new SimpleDateFormat("dd/MM/yyyy").parse("03/04/1994"), Gender.MALE,"21111555", new ArrayList<Consultation>());
        //CHARGEMENT DE HASHMAP 
        dossiers.put(1, d1);
        dossiers.put(2, d2);
        dossiers.put(3, d3);
        dossiers.put(4, d4);
        Consultation c1=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("17/05/2019"),1,"diagnostique",new ArrayList<Prescription>());
        Consultation c2=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("03/04/2020"),2,"diagnostique",new ArrayList<Prescription>());
        Consultation c3=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2020"),3,"diagnostique",new ArrayList<Prescription>());
        Consultation c4=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2018"),4,"diagnostique",new ArrayList<Prescription>());
        cs1.add(c1);
        cs1.add(c2);
        cs1.add(c3);
        cs1.add(c4);
        d1.setHistoriqueConsultations(cs1);
        Consultation c5=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("17/05/2019"),1,"diagnostique",new ArrayList<Prescription>());
        Consultation c6=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("03/04/2020"),2,"diagnostique",new ArrayList<Prescription>());
        Consultation c7=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2020"),3,"diagnostique",new ArrayList<Prescription>());
        Consultation c8=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2018"),4,"diagnostique",new ArrayList<Prescription>());
        Consultation c9=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("17/05/2019"),5,"diagnostique",new ArrayList<Prescription>());
        Consultation c10=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("03/04/2020"),6,"diagnostique",new ArrayList<Prescription>());
        Consultation c11=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("03/08/2020"),7,"diagnostique",new ArrayList<Prescription>());
        Consultation c12=new Consultation(new SimpleDateFormat("dd/MM/yyyy").parse("02/08/2018"),8,"diagnostique",new ArrayList<Prescription>());
        cs2.add(c5);
        cs2.add(c6);
        cs2.add(c7);
        cs2.add(c8);
        cs2.add(c9);
        cs2.add(c10);
        cs2.add(c11);
        cs2.add(c12);
        d2.setHistoriqueConsultations(cs2);
        Prescription p1 = new EnvoiSpecialiste(1,1);
        Prescription p2 = new Medicament(2,1);
        Prescription p3 = new Medicament(1,1);
        Prescription p4 = new ActeRadio(1,1);
        ps1.add(p1);
        ps1.add(p2);
        ps1.add(p3);
        ps1.add(p4);
            
        }
    catch(Exception e){
       }
    }
    //recherche consultation par id patient et id consultation
    public  Consultation findConsultationById(int idPatient , int idConsultation){
        ArrayList<Consultation> c =  new ArrayList<>() ;
        c = findPatientById(idPatient).getHistoriqueConsultations() ;
    
        for (Consultation c1 : c) {
            if(c1.getidconsultation()==idConsultation)
                return c1 ;
        }
        return null ;
    }
    //recherche patient par id
    public DossierMedical findPatientById(int id){
        return dossiers.get(id);
    }
    //Ajout patient 
    public boolean addDosssier (DossierMedical d){
        try {
            dossiers.put(d.getRef(), d) ;
            return true ;
        } catch (Exception e) {
            return false ;
        }
        
    }
}

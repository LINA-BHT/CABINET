package dossiers.medicaux;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import Interface.Authentification1;
import Service.GestionDossiers;

/**
 *
 * @author linah
 */
public class DOSSIERSMEDICAUX {
    public static GestionDossiers gestion  ;//un objet static de type GestionDossiers
    public static void main(String[] args) {
      
        gestion = new GestionDossiers();
        //CREATION D'UN OBJET DE TYPE Authentification(interface graphyque)
        Authentification1 A = new Authentification1();
        
        A.setVisible(true);
        
    }
   
    
    
}

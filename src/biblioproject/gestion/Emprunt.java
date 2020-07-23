/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioproject.gestion;

/**
 *
 * @author KataTheQueen
 */
import java.sql.Date;
import biblioproject.Users.User;
import java.time.Instant;
import java.time.Period;
import java.util.Calendar;
public class Emprunt {
	protected Date date;
	protected String emprunteur;
	protected int materiel;
	protected int duree;
        protected Date fin;
        protected String motif;
	protected boolean isActive = false;

	public Emprunt(String cin,int materiel
			, Date date,int duree,String motif) {
		this.date = date;
		this.emprunteur=cin;
		this.materiel = materiel;
		this.duree = duree;
                this.isActive=true;
                this.motif=motif;
                Calendar c = Calendar.getInstance(); 
                c.setTime(date); 
                c.add(Calendar.DATE,duree);
                fin= new java.sql.Date(c.getTimeInMillis());
        }
      
        public String getMotif(){
            return this.motif;
        }
	public String getEmprunteur() {
		return emprunteur;
	}
	
	public Date getDate(){
		return date;
	}
	public Date getFin(){
		return this.fin;
	}
	public void switchActive() {
		isActive = !isActive;
	}
	
	public boolean isActive(){
		return isActive;
	}

	public void setEmprunteur(String emprunteur) {
		this.emprunteur = emprunteur;
	}

	public String toString() {
		return duree + " " + materiel
				+ " a rendre le " + date.toString();
	}

	public int getMaterial() {
		return materiel;
	}
	
	public int getDuree() {
		return duree;
	}
	
	
	
}

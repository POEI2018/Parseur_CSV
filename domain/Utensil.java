package fr.gtm.tp.exo11.domain;

import java.time.LocalDate;

/**
 * @author Adminl
 *
 */
public abstract class Utensil {
	
	private LocalDate creation ; 
	
	public abstract void setScore(Object obj) ;
	
	/**
	 * @param current la date a partir de laquelle calculer l'année en cours.
	 * @return int la valeur calculée
	 */
	public int calcValue(LocalDate current) {
		return current.getYear() - this.creation.getYear() - 50  ; 
	}

	public LocalDate getCreation() {
		return creation;
	}

	public void setCreation(LocalDate creation) {
		this.creation = creation;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Ustensile[") ; 
		sb.append("Fabrication->") ;
		sb.append(this.creation);
		return sb.toString() ;
	}
	
	

}

package fr.gtm.tp.exo11.domain;

/**
 * @author Adminl
 *
 */
public class Spoon extends Utensil {
	
	private float length ;

	/**
	 * @return
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length
	 */
	public void setLength(float length) {
		this.length = length;
	} 
	
	@Override
	public String toString() {
		
		return super.toString().replaceAll("Ustensile", "spoon");
	}

	@Override
	public void setScore(Object obj) {
		this.setLength(Float.parseFloat(obj.toString()));
		
	}
	
	

}

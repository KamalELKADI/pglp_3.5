package fr.uvsq.pglp_3.DIP;

import java.time.LocalDateTime;

public class AfficheMetier implements AffichageMetier {
	/**
	 * fonction pour l'affichage du log au début.
	 */
	public void afficheDebut() {
		System.out.println(LocalDateTime.now()
				+ " : Début de UneMethodeMetier");
	}
	/**
	 * fonction pour l'affichage du log à la fin.
	 */
	public void afficheFin() {
		System.out.println(LocalDateTime.now()
				+ " : Fin de UneMethodeMetier");
	}
}
package fr.uvsq.pglp_3.DIP;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AfficheMetier implements AffichageMetier {
	private static final Logger logger = LoggerFactory.getLogger(AfficheMetier.class);
	/**
	 * fonction pour l'affichage du log au début.
	 */
	public void afficheDebut() {
	    logger.info(LocalDateTime.now()
				+ " : Début de UneMethodeMetier");
	}
	/**
	 * fonction pour l'affichage du log à la fin.
	 */
	public void afficheFin() {
	    logger.info(LocalDateTime.now()
				+ " : Fin de UneMethodeMetier");
	}
}
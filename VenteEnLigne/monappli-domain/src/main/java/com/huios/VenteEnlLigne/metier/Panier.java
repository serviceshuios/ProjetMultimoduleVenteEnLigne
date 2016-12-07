package com.huios.VenteEnlLigne.metier;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Panier implements Serializable{

	/** Generated Serial UID. **/
	private static final long serialVersionUID = 2264262400805241155L;

	private Map<Long, LigneCommande> items = new HashMap<Long, LigneCommande>();
}

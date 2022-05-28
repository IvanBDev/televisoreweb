package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public interface TelevisoreService {
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO);
	
	public List<Televisore> listAll() throws Exception;

	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);
	
	public Televisore mostraTelevisore(Long id) throws Exception;
	
	public int inserisciNuovoTelevisore(Televisore input) throws Exception;
	
	public int rimuoviTelevisore(Televisore input) throws Exception;
	
	public int aggiornaTelevisore(Televisore input) throws Exception;
}

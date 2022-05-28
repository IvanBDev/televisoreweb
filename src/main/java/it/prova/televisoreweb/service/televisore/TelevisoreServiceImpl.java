package it.prova.televisoreweb.service.televisore;

import java.util.List;

import it.prova.televisoreweb.dao.televisore.TelevisoreDAO;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreServiceImpl implements TelevisoreService{
	
	private TelevisoreDAO televisoreDAO;

	@Override
	public void setTelevisoreDAO(TelevisoreDAO televisoreDAO) {
		// TODO Auto-generated method stub
		this.televisoreDAO = televisoreDAO;
	}

	@Override
	public List<Televisore> listAll() throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.list();
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		// TODO Auto-generated method stub
		return televisoreDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisore mostraTelevisore(Long id) throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.get(id);
	}

	@Override
	public int inserisciNuovoTelevisore(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.insert(input);
	}

	@Override
	public int rimuoviTelevisore(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.delete(input);
	}

	@Override
	public int aggiornaTelevisore(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return televisoreDAO.update(input);
	}

}

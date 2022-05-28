package it.prova.televisoreweb.dao.televisore;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import it.prova.televisoreweb.dao.DB_Mock;
import it.prova.televisoreweb.model.Televisore;

public class TelevisoreDAOImpl implements TelevisoreDAO{
	
	private Connection connection;
	
	@Override
	public void setConnection(Connection connection) {
		// TODO Auto-generated method stub
		this.connection = connection;
	}

	@Override
	public List<Televisore> list() throws Exception {
		// TODO Auto-generated method stub
		return DB_Mock.LISTA_TELEVISORI;
	}

	@Override
	public Televisore get(Long id) throws Exception {
		// TODO Auto-generated method stub
		for (Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getIdTelevisore() == id) {
				return televisoreItem;
			}
		}
		return null;
	}

	@Override
	public int update(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		for(Televisore televisoreItem : DB_Mock.LISTA_TELEVISORI) {
			if(televisoreItem.getIdTelevisore() == input.getIdTelevisore()) {
				
				televisoreItem.setMarca(input.getMarca());
				televisoreItem.setModello(input.getModello());
				televisoreItem.setPrezzo(input.getPrezzo());
				televisoreItem.setNumeroPollici(input.getNumeroPollici());
				televisoreItem.setCodice(input.getCodice());
				
				return 1;
			}
		}
		
		return 0;
	}

	@Override
	public int insert(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		input.setIdTelevisore(DB_Mock.getNexIdAvailable());
		return DB_Mock.LISTA_TELEVISORI.add(input)?1:0;
	}

	@Override
	public int delete(Televisore input) throws Exception {
		// TODO Auto-generated method stub
		return DB_Mock.LISTA_TELEVISORI.remove(input)?1:0;
	}

	@Override
	public List<Televisore> findByMarcaAndModello(String marca, String modello) {
		// TODO Auto-generated method stub
		List<Televisore> result = new ArrayList<>();

		for (Televisore televisoreInput : DB_Mock.LISTA_TELEVISORI) {
			if (televisoreInput.getMarca().startsWith(marca) && televisoreInput.getModello().startsWith(modello))
				result.add(televisoreInput);
		}
		return result;
	}

}

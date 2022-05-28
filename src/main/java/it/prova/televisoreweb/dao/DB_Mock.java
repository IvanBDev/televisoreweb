package it.prova.televisoreweb.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import it.prova.televisoreweb.model.Televisore;

public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<Televisore>();
	
	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "Samsung", "OLED", 2000, 65, "SO65"));
		LISTA_TELEVISORI.add(new Televisore(2l, "Panasonic", "Flat", 1575, 55, "PSF55"));
		LISTA_TELEVISORI.add(new Televisore(3l, "Sony", "QHD", 1875, 60, "SQ60"));
		LISTA_TELEVISORI.add(new Televisore(4l, "Huawei", "UQLED", 2216, 68, "HUQ68"));
		LISTA_TELEVISORI.add(new Televisore(5l, "LG", "UltraFlat", 2552, 70, "LUF70"));
		LISTA_TELEVISORI.add(new Televisore(6l, "TCL", "UHD", 1500, 50, "TU50"));
		LISTA_TELEVISORI.add(new Televisore(7l, "Philips", "HD", 1259, 49, "PH49"));
	}
	
	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getIdTelevisore)).get().getIdTelevisore();
		return ++resultId;
	}
}

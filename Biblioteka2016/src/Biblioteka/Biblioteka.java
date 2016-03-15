package Biblioteka;

import java.util.LinkedList;

import Biblioteka.interfejs.Interfejs;

public class Biblioteka implements Interfejs {

	private LinkedList<Knjiga> knjige = new LinkedList<>();

	@Override
	public void dodajKnjigu(Knjiga k) {
		if (k == null || knjige.contains(k))
			throw new RuntimeException("Greska pri unosu!");
		else
			knjige.add(k);
	}

	@Override
	public void obrisiKnjigu(Knjiga k) {
		if (k == null || !knjige.contains(k))
			throw new RuntimeException("Greska pri unosu!");
		else
		knjige.remove(k);
	}

	@Override
	public LinkedList<Knjiga> vratiSveKnjige() {
		return knjige;
	}

	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac) {

		if(naslov == null)
			throw new RuntimeException("Naslov je null!");
		LinkedList<Knjiga> rezultat = new LinkedList<>();
		for (int i = 0; i < knjige.size(); i++) {
			if (knjige.get(i).getNaslov().contains(naslov)) {
				rezultat.add(knjige.get(i));
			}
		}
		return rezultat;
	}

}

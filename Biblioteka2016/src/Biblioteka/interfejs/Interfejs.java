package Biblioteka.interfejs;

import java.util.LinkedList;

import Biblioteka.Autor;
import Biblioteka.Knjiga;

public interface Interfejs {

	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, long ISBN, String naslov, String izdavac);
	
	
}

package interfaz;

public class Reproductor_registrado extends Reproductor {
	private event _compartir_cancion;
	private event _avanzar_10s;
	private event _retroceder_10s;
	private event _favoritos;
	public Zona_ultima_lista_reproduccion _zona_ultima_lista_reproduccion;
	public Reproductor_lista _reproductor_lista;
	public Reproductor_cancion _reproductor_cancion;
	public Reproductor_album _reproductor_album;
	public Lista_busqueda _lista_busqueda;

	public void Compartir_cancion() {
		throw new UnsupportedOperationException();
	}

	public void Avanzar_10s() {
		throw new UnsupportedOperationException();
	}

	public void Retroceder_10s() {
		throw new UnsupportedOperationException();
	}

	public void Favoritos() {
		throw new UnsupportedOperationException();
	}
}
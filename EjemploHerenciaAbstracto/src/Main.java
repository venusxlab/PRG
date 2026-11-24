void main() {
    //Si intentamos crear un producto de la clase producto nos dará error aunque le pasemos todos los datos.

    Videojuego p = new Videojuego("COD-01", "Zelda", "Al nivel de GTA6",
            59.90, "PEG-6", "Nintendo Switch 2", "Nintendo");
    IO.println(p);
}
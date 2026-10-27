import model.Libro;

void main() {
    Libro l1 = new Libro("122323nn", "El señor de los anillos", "JRR Tolkien");

    IO.println(l1.getAutor());

    IO.println(l1.infoLibro());
}
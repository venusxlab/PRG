void main() {
    String [] modulos = {"Frenada", "Paso por curva", "Adelantamiento", "El ultimo en pie"};

    Persona pp = new Persona("pepe", "garcia", LocalDate.now(), "7613767F");
    Alumno a1 = new Alumno("Marc", "Marquez", LocalDate.now(), "10101010M",
            "MOTOGP", 2026, modulos);
    AntiguosAlumnos a2 = new AntiguosAlumnos("Valentino", "Rossi", LocalDate.now(), "112131231F", "MOTOGP", 2022, modulos, LocalDate.now(), false);

    //IO.println(pp); //Al haber definido el toString de dios, el println llamada directamente al toString indicado
    //IO.println(a1); //Por esto no haria falta ningun metodo que saque la info ni llamar al toString directamente.

    Persona[] decrolyComunidad = new Persona[5]; //Coleccion de personas

    decrolyComunidad[0] = pp;
    decrolyComunidad[1] = a1;
    decrolyComunidad[2] = a2;//Se puede meter a1 aunque sea un alumno porque tambien es una persona.
    //Si el array fuese de alumnos pp no entraria, esto es el polimorfismo

//    for (int i = 0; i < decrolyComunidad.length; i++) {
//        if (decrolyComunidad[i] != null){
//            IO.println(decrolyComunidad[i]);
//        }
//    }

    //En la primera posicion hay una persona y en la segunda un alumno
    //Por lo que en el for cuando accedemos a la posicion, como definimos el toString, sabe que cosas pintar directamente

    //El instanceof lo que hace es comprobar si el objeto de esa posicion es un Alumno (la clase)
    //Entonces lo que hace es pintar los que son alumnos, en caso de poner persona pintaria todos ya que todos son personas
    for (int i = 0; i < decrolyComunidad.length; i++) {
        if (decrolyComunidad[i] != null){
            if (decrolyComunidad[i] instanceof Alumno){
                IO.println("OJO QUE SOY UN ALUMNO");
                IO.println(decrolyComunidad[i]);
            }
        }
    }
}
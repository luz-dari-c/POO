package Taller11__Polimorfismo.Ejercicio3;





// Clase derivada con sobrescritura incorrecta


class Secretario extends Persona {
    @Override
    public void presentarse() {
        super.presentarse();
    }
}
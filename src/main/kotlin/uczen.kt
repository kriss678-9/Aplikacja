class Uczen(
    val imie: String,
    var klasa: String,
    val kierunek: String
) {

    fun wyswietlDane() {
        println("===== DANE UCZNIA =====")
        println("Imię i nazwisko: $imie")
        println("Klasa: $klasa")
        println("Kierunek kształcenia: $kierunek")
    }
}
fun main() {

    val uczen = Uczen(
        "Jan Kowalski",
        "2A",
        "Technik informatyk"
    )

    uczen.wyswietlDane()

    val obliczenia = Obliczenia()

    println()
    println("===== OBLICZENIA GODZIN =====")

    val wynik1 = obliczenia.obliczGodziny(5, 4)

    println("5 godzin tygodniowo przez 4 tygodnie = $wynik1 godzin")

    val wynik2 = obliczenia.obliczGodziny(8, 6)

    println("8 godzin tygodniowo przez 6 tygodni = $wynik2 godzin")
}
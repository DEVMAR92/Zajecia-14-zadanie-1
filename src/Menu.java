public enum Menu {
    PRYWATNE("Konto Prywatne, Witaj\n"),
    FIRMOWE("Konto Firmowe, Witaj\n"),
    KONSULTANT("Witaj, Konsultancie\n"),
    KONIEC("Do zobaczenia");

    public String wellcome;

    Menu(String wellcome) {
        this.wellcome = wellcome;
    }


}

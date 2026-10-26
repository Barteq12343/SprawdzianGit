import java.sql.SQLOutput;

void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wpisz imie i nazwisko");
    String name = scanner.nextLine();
    System.out.println("Podaj wiek");
    int age = scanner.nextLine();
    System.out.println("Witaj" + name + ". Za" + (18 - age) + " lata będę miał 18 lat!");

}

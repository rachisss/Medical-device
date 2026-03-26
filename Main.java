import java.util.Scanner;

public class Main {
    public static DispozitivMedical d1;
    public static DispozitivMedical d2;
    public static DispozitivMedical d3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        d1 = new DispozitivMedical("", "");
        d2 = new DispozitivMedical("", "");
        d3 = new DispozitivMedical("", "");

        while (true) {
            System.out.println("\n=== MENIU ===");
            System.out.println("1. Introducere detalii dispozitive");
            System.out.println("2. Setare pret");
            System.out.println("3. Setare categorie");
            System.out.println("4. Afisare dispozitive");
            System.out.println("5. Iesire");
            System.out.print("Selectati o optiune: ");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt) {
                case 1:
                    introducereDispozitiv(sc);
                    break;
                case 2:
                    setPret(sc);
                    break;
                case 3:
                    setCategorie(sc);
                    break;
                case 4:
                    afiseazaDispozitive();
                    break;
                case 5:
                    System.out.println("Iesire din program.");
                    sc.close();
                    return;
                default:
                    System.out.println("Optiune invalida!");
            }
        }
    }

    public static void introducereDispozitiv(Scanner sc) {
        System.out.println("\n=== Introduceti detaliile dispozitivelor medicale ===");

        for (int i = 1; i <= 3; i++) {
            System.out.println("\nDispozitiv nr. " + i);
            System.out.print("Introduceti numele dispozitivului: ");
            String nume = sc.nextLine();
            System.out.print("Introduceti materialul (ex: titan, plastic medical): ");
            String material = sc.nextLine();

            if (i == 1) {
                d1.setTipDispozitiv(nume);
                d1.setMaterial(material);
            } else if (i == 2) {
                d2.setTipDispozitiv(nume);
                d2.setMaterial(material);
            } else {
                d3.setTipDispozitiv(nume);
                d3.setMaterial(material);
            }
        }
        System.out.println("Dispozitivele au fost stocate cu succes!");
    }

    public static void setPret(Scanner sc) {
        System.out.println("\n=== Setare pret ===");
        System.out.print("Introduceti pretul dispozitivului nr.1: ");
        d1.setPret(sc.nextDouble());
        System.out.print("Introduceti pretul dispozitivului nr.2: ");
        d2.setPret(sc.nextDouble());
        System.out.print("Introduceti pretul dispozitivului nr.3: ");
        d3.setPret(sc.nextDouble());
        sc.nextLine();
        System.out.println("Preturile au fost setate!");
    }

    public static void setCategorie(Scanner sc) {
        System.out.println("\n=== Setare categorie ===");
        System.out.print("Categoria dispozitivului nr.1 (Diagnostic/Terapie): ");
        d1.setCategorie(sc.nextLine());
        System.out.print("Categoria dispozitivului nr.2 (Diagnostic/Terapie): ");
        d2.setCategorie(sc.nextLine());
        System.out.print("Categoria dispozitivului nr.3 (Diagnostic/Terapie): ");
        d3.setCategorie(sc.nextLine());
        System.out.println("Categoriile au fost setate!");
    }

    public static void afiseazaDispozitive() {
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}

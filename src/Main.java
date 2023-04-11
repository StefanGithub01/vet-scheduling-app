import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Bun venit la cabinetul veterinar al domnului Mandris Stefan Alexandru!");

        String raspuns;
        String dataPacient;
        String oraPacient;
        int indexPacient = 0;
        String tipAnimal;
        int varstaPacient;
        String numePacient;
        Doctor doctor = new Doctor();

        System.out.println("Doriti sa faceti o programare?: da / nu:");
        raspuns = s.next();

        do {

            if (raspuns.equals("da")) {

                doctor.adaugaPacient(indexPacient);
                Pacient pacient = doctor.getPacient(indexPacient);

                System.out.println("Aveti o Pisica sau un Caine?:");
                tipAnimal = s.next();

                pacient.setTipAnimal(TipAnimal.valueOf(tipAnimal.toUpperCase()));

                System.out.println("Care este numele Pacientului?:");
                numePacient = s.next();
                pacient.setNume(numePacient);

                System.out.println("Care este varsta Pacientului?:");
                varstaPacient = s.nextInt();
                pacient.setVarsta(varstaPacient);

                System.out.println("Pe ce DATA doriti sa programati pacientul?");
                dataPacient = s.next();

                System.out.println("La ce ora doriti sa programati pacientul?");
                oraPacient = s.next();

                doctor.adaugaProgramare(dataPacient, oraPacient, indexPacient);

                System.out.println("Programarea dumneavoastra a fost efectuata cu SUCCES!");
                System.out.println("....");

                System.out.println("Doriti sa mai faceti inca o programare? da / nu:");
                raspuns = s.next();
                indexPacient++;
            }
        } while (raspuns.equals("da"));


        System.out.println("Buna ziua domnule Doctor!");
        System.out.println("Doriti sa vedeti agenda dumneavoastra?: da / nu:");
        raspuns = s.next();
        if (raspuns.equals("da")) {
            doctor.afisarePacienti(indexPacient);
        }
    }
}

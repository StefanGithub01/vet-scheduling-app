public class Doctor {
    private final Pacient[] pacienti;

    public Doctor() {
        pacienti = new Pacient[101];
    }

    public Pacient getPacient(int poz) {
        return this.pacienti[poz];
    }

    public void adaugaPacient(int pozitie) {
        this.pacienti[pozitie] = new Pacient();
    }

    public void adaugaProgramare(String dataStabilita, String oraStabilita, int nrPacientului) {

        this.getPacient(nrPacientului).getProgramare().setDataProgramare(dataStabilita);
        this.getPacient(nrPacientului).getProgramare().setOraProgramare(oraStabilita);

    }

    public void afisarePacienti(int nrPacienti) {

        for (int i = 0; i < nrPacienti; i++) {
            System.out.println("Pacientul Nr:" + (i + 1));
            System.out.println("Tip Animal:" + this.pacienti[i].getTipAnimal());
            System.out.println("Numele Pacientului " + "este: " + this.pacienti[i].getNume());
            System.out.println("Varsta Pacientului " + "este: " + this.pacienti[i].getVarsta());
            System.out.println("Programarea este pe data de: " + this.getPacient(i).getProgramare().getDataProgramare() +
                    ", la ora:" + this.getPacient(i).getProgramare().getOraProgramare());

            System.out.println("----------------------");
            System.out.println();
        }
    }
}

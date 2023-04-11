public class Pacient {

    private String nume;
    private int varsta;
    private TipAnimal tipAnimal;
    private final Programare programare;

    public Pacient() {
        nume = "";
        varsta = 0;
        programare = new Programare();
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getVarsta() {
        return this.varsta;
    }

    public void setTipAnimal(TipAnimal animal) {
        this.tipAnimal = animal;
    }

    public TipAnimal getTipAnimal() {
        return this.tipAnimal;
    }

    public Programare getProgramare() {
        return programare;
    }

}

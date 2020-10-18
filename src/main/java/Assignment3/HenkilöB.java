package Assignment3;

public class HenkilöB implements HenkilöInterface {

    public HenkilöB(String nimi, Integer ikä) {
        this.nimi = nimi;
        this.ikä = ikä;
    }

    String nimi;
    Integer ikä;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HenkilöB henkilöB = (HenkilöB) o;

        if (nimi != null ? !nimi.equals(henkilöB.nimi) : henkilöB.nimi != null) return false;
        return ikä != null ? ikä.equals(henkilöB.ikä) : henkilöB.ikä == null;
    }

    @Override
    public int hashCode() {
        int result = nimi != null ? nimi.hashCode() : 0;
        result = 31 * result + (ikä != null ? ikä.hashCode() : 0);
        return result;
    }
}




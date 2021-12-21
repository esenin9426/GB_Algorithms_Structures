import java.util.Random;

public enum Manufacturer {
    Lenuvo,
    Asos,
    MacNote,
    Eser,
    Xamiou;

    public boolean compare(Manufacturer m2){
        if (this.equals(Lenuvo))
            return true;
        if (m2.equals(Xamiou))
            return true;
        if (this.equals(Asos) && m2.equals(Lenuvo))
            return false;
        if (this.equals(Asos) && m2.equals(Asos))
            return true;
        if (this.equals(Asos) && m2.equals(MacNote))
            return true;
        if (this.equals(Asos) && m2.equals(Eser))
            return true;
        if (this.equals(Asos) && m2.equals(Xamiou))
            return true;

        if (this.equals(MacNote) && m2.equals(Lenuvo))
            return false;
        if (this.equals(MacNote) && m2.equals(Asos))
            return false;
        if (this.equals(MacNote) && m2.equals(MacNote))
            return true;
        if (this.equals(MacNote) && m2.equals(Eser))
            return true;
        if (this.equals(MacNote) && m2.equals(Xamiou))
            return true;

        if (this.equals(Eser) && m2.equals(Lenuvo))
            return false;
        if (this.equals(Eser) && m2.equals(Asos))
            return false;
        if (this.equals(Eser) && m2.equals(MacNote))
            return false;
        if (this.equals(Eser) && m2.equals(Eser))
            return true;
        if (this.equals(Eser) && m2.equals(Xamiou))
            return true;
      return false;
    };

}

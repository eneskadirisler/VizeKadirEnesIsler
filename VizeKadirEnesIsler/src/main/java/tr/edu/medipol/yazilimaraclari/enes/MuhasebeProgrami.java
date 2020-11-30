package tr.edu.medipol.yazilimaraclari.enes;

public class MuhasebeProgrami {

    public static void main(String[] args) {
        System.out.println(ucretHesapla(5,10));
    }

    public static Ucret ucretHesapla(int calisilanSaat, int saatlikUcret){
        return new Ucret(calisilanSaat, saatlikUcret);
    }

    private static class Ucret{
        int calisilanSaat;
        int saatlikUcret;
        int ucret;

        public Ucret(int calisilanSaat, int saatlikUcret) {
            this.calisilanSaat = calisilanSaat;
            this.saatlikUcret = saatlikUcret;
            this.ucret = calisilanSaat * saatlikUcret;
        }

        @Override
        public String toString() {
            return "" + calisilanSaat + " * " + saatlikUcret + " = " + ucret + "";
        }

        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Ucret u = (Ucret) o;
            return calisilanSaat == u.calisilanSaat &&
                    saatlikUcret == u.saatlikUcret &&
                    ucret == u.ucret;
        }


    }


}



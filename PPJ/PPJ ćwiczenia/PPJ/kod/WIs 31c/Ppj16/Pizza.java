public class Pizza {
    static String[] skladnikiCiasta = {
            "mąka", "woda", "drożdże", "sól"
    };
    float srednica;
    String[] skladniki;

    Pizza(int skladniki) {
        this.skladniki = new String[skladniki];
    }
    Pizza() {
        this(5);
    }

    void upiecz() {
        this.srednica = srednica * 0.9f;
    }

    static void zagniec() {

    }

}

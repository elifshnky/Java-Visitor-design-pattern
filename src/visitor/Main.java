
package visitor;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IVisitor v = new HikayeGoster();
        IMesajIslem k = new NormalKullanici();

        k.accept(v);

        v = new MesajKaydetme();
        k.accept(v);

        k = new PremiumKullanici();
        k.accept(v);
        v = new HikayeGoster();
        k.accept(v);

    }

}

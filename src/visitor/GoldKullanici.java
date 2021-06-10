
package visitor;


public class GoldKullanici implements IMesajIslem{

    @Override
    public void kisibul(String kisi) {
        System.out.println("Gold kullanıcı için "+kisi + " adlı kişi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Gold kullanıcı için "+" mesaj alınıyor...");
    }

    @Override
    public void mesajGonder(String msg) {
        System.out.println("Gold kullanıcı için "+msg + " mesajı göderiliyor.");
    }
    public void accept(IVisitor v){
   v.visit(this);
}
}

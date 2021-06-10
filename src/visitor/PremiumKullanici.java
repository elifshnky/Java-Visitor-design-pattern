
package visitor;


class PremiumKullanici implements IMesajIslem{
 @Override
    public void kisibul(String kisi) {
        System.out.println("Premium kullanıcı için "+kisi + " adlı kişi bulundu.");
    }

    @Override
    public void mesajAl() {
        System.out.println("Premium kullanıcı için "+" mesaj alınıyor...");
    }

    @Override
    public void mesajGonder(String msg) {
        System.out.println("Premium kullanıcı için "+msg + " mesajı göderiliyor.");
    }    
    public void accept(IVisitor v){
   v.visit(this);
}
}

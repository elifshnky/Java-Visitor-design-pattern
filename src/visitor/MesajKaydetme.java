
package visitor;


public  class MesajKaydetme implements IVisitor{
    

    @Override
    public void visit(NormalKullanici normal_k) {
        System.out.println("Normal kullanıcı için  mesaj kaydetme özelliği bulunmamakta:(");
    }

    @Override
    public void visit(PremiumKullanici prem_k) {
        System.out.println("Premium kullanıcı için  mesaj kaydediliyor");
    }

    @Override
    public void visit(GoldKullanici gold_k) {
        System.out.println("Gold kullanıcı için  mesaj kaydediliyor");
    }
}

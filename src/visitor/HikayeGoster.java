
package visitor;


public class HikayeGoster implements IVisitor {

    @Override
    public void visit(NormalKullanici normal_k) {
  System.out.println("Normal kullanıcı için hikaye gösteriliyor..");

    }

    @Override
    public void visit(PremiumKullanici prem_k) {
   System.out.println("Premium kullanıcı için hikaye gösteriliyor..");

    }

    @Override
    public void visit(GoldKullanici gold_k) {
System.out.println("Gold kullanıcı için hikaye gösteriliyor..");
    }
    
}


package visitor;


public interface IVisitor {
 void visit(NormalKullanici normal_k);  
 void visit(PremiumKullanici prem_k);
 void visit(GoldKullanici gold_k);   
 
}

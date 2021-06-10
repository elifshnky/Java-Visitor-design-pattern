
package visitor;


public interface IMesajIslem {
    void kisibul(String kisi);
    void mesajAl();
    void mesajGonder(String msg);
    void accept(IVisitor visitor);
}

package mediatheque;

public class CataloguePrinter implements ItemVisitor {

    public CataloguePrinter(){
    }

    public void visit(Book item){
        System.out.println(item);
    }

    public void visit(CD item){
        System.out.println(item);
    }
}

package mediatheque;

public class CataloguePrinter implements ItemVisitor {

    public CataloguePrinter(){
    }

    public void visit(Book item){
    }

    public void visit(CD item){
    }

    public void visit(Item item){
        System.out.println(item);
    }
}

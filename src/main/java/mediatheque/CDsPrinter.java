package mediatheque;

public class CDsPrinter implements ItemVisitor {
    public CDsPrinter(){
    }

    public void visit(Book item){
    }

    public void visit(CD item){
        System.out.println(item);
    }

    public void visit (Item item){
    }
}

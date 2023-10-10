package mediatheque;

public interface ItemVisitor {
    // UNe méthode pour chaque sous-classe de Modem

    void visit(CD item);
    void visit (Book item);
    void visit (Item item);
}

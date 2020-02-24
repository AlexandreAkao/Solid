package ISP;

public interface NewMachine extends OldMachine {
    void fax(Document d) throws Exception;
    void scan(Document d) throws Exception;
}

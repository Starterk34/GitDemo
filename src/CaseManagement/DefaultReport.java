package CaseManagement;

public abstract class DefaultReport {
    String header;
    public DefaultReport (String header){
        this.header = header;
    }

    public abstract void print();
}




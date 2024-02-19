package CaseManagement;

public class Report extends DefaultReport {
    String title;
    String caseID;
    String device;
    Report (String header, String actualTitle,String caseID,String device){
        super(header);
        this.title = actualTitle;
        this.caseID = caseID;
        this.device = device;
    }
    Report (String header){
        super(header);
    }

    public String getTitle(){
        return  title;
    }
    public String getCaseID(){
        return  caseID;
    }
    public String getDevice(){
        return  device;
    }
    public void setTitle(String newTitle){
    this.title = newTitle;
    }
    public void setCaseID(String newCaseID){
        this.caseID = newCaseID;
    }
public void setDevice(String newDevice){
        this.device = newDevice;
}


    public boolean isDeviceFromConsole(String dev) {
    if (dev.equalsIgnoreCase(getDevice())){
        return true;
    }
    else return false;
    }
    public void setCaseIDAsDeviceAndTitle(){
        this.caseID = title + " " + device;
    }
    @Override
    public String toString(){
        return "Report title: " + title + ", CaseID: " + caseID + ", Device name: " + device;
    }
    public void print(){
        System.out.println("Report info:Report title: " + title + ", CaseID: " + caseID + ", Device name: " + device);
    }

}

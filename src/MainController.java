import java.util.ArrayList;

public class MainController {
    MainFrame mainFrame;
    ArrayList<Employee> empList;
    int actual;
    public MainController() {
        this.actual = 0;
        this.mainFrame = new MainFrame();
        this.empList = LoadFile.load();
        this.handleEvent();
        this.loadEmployee(this.empList.get(0)); // első dolgozó itt toltodik be
    }
    private void handleEvent(){
        this.mainFrame.getPreviousButton().addActionListener( e -> {
            startPrevious();
        });
        this.mainFrame.getNextButton().addActionListener( e -> {
            startNext();
        });
    }
    private void startPrevious(){
        System.out.println("vissza..");
        if(this.actual >0){
            this.actual--;
            this.loadEmployee(this.empList.get(this.actual));
        }
        
    }
    private void startNext(){
        System.out.println("előre..");
        int count = this.empList.size();
        if(this.actual < count -1){
            this.actual++;
            this.loadEmployee(this.empList.get(this.actual));
        }
       
    }
    private void loadEmployee(Employee emp){
        this.mainFrame.namePanel.setValue(emp.name);
        this.mainFrame.cityPanel.setValue(emp.city);
        this.mainFrame.addressPanel.setValue(emp.address);
        this.mainFrame.birthPanel.setValue(emp.birth.toString());
        this.mainFrame.salaryPanel.setValue(emp.salary.toString());
    }
    
}

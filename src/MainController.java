import java.util.ArrayList;

public class MainController {
    MainFrame mainFrame;
    ArrayList<Employee> empList;
    public MainController() {
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
    }
    private void startNext(){
        System.out.println("előre..");
    }
    private void loadEmployee(Employee emp){
        System.out.println(emp.name);
    }
    
}

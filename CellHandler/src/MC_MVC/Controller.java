package MC_MVC;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import Objects.Message;
import javafx.event.ActionEvent;

public class Controller {
	
	public Model model = new Model();
	private handlerHandler handler = new handlerHandler(this);
	
	public Controller() {
		new Thread(handler).start();
	}

    @FXML
    public CheckBox addChkBox;

    @FXML
    public CheckBox mulChkBox;

    @FXML
    public CheckBox subChkBox;

    @FXML
    public CheckBox divChkBox;

    @FXML
    private Button submitBtn;

    @FXML
    private Button addNewBtn;

    @FXML
    void newCell(ActionEvent event) {
    	model.newCell();
    }

    @FXML
    void submitRequest(ActionEvent event) {
    	Message msg = model.changeMother(this);
    	System.out.println("String is: " + msg.getMsg());
    	handler.forwardMessage(msg);
    }

}
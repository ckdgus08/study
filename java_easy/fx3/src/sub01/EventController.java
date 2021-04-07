package sub01;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class EventController implements Initializable{

	@FXML private Button btnOk;
	@FXML private Button btnCancle;
	@FXML private TextField txtFd;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		btnOk.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
				String value = txtFd.getText();
				
				System.out.println("결과 : "+value);
				
			}
		});
		
		btnCancle.setOnAction(event -> btnCancleClicked());

		
		
		
		
			
		
		
	} // initialize end
	
	public void btnCancleClicked () {
		System.out.println("취소버튼 클릭!!!");
	}
	
	
}

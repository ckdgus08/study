package kr.co.calc;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController implements Initializable{

	@FXML private TextField txtResult;
	@FXML private Button btn0;
	@FXML private Button btn1;
	@FXML private Button btn2;
	@FXML private Button btn3;
	@FXML private Button btn4;
	@FXML private Button btn5;
	@FXML private Button btn6;
	@FXML private Button btn7;
	@FXML private Button btn8;
	@FXML private Button btn9;
	@FXML private Button btnPlus;
	@FXML private Button btnMinus;
	@FXML private Button btnDiv;
	@FXML private Button btnMulti;
	@FXML private Button btnCancle;
	@FXML private Button btnEq;
	
	private boolean isFirst = true;
	private int tmp1 = 0;
	private int tmp2 = 0;
	private int operator = 0;

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		btn0.setOnAction(event -> btn0Clicked());
		btn1.setOnAction(event -> btn1Clicked());
		btn2.setOnAction(event -> btn2Clicked());
		btn3.setOnAction(event -> btn3Clicked());
		btn4.setOnAction(event -> btn4Clicked());
		btn5.setOnAction(event -> btn5Clicked());
		btn6.setOnAction(event -> btn6Clicked());
		btn7.setOnAction(event -> btn7Clicked());
		btn8.setOnAction(event -> btn8Clicked());
		btn9.setOnAction(event -> btn9Clicked());
		
		
		btnPlus.setOnAction(event -> btnPlusClicked());
		btnMinus.setOnAction(event -> btnMinusClicked());
		btnDiv.setOnAction(event -> btnDivClicked());
		btnMulti.setOnAction(event -> btnMultiClicked());
		btnCancle.setOnAction(event -> btnCancleClicked());
		btnEq.setOnAction(event -> btnEqClicked());
		
		
	} // initialize end
	
	List<Integer> list = new ArrayList<>(1);
	
	public void btn0Clicked() {setNum("0");}
	public void btn1Clicked() {setNum("1");}
	public void btn2Clicked() {setNum("2");}
	public void btn3Clicked() {setNum("3");}
	public void btn4Clicked() {setNum("4");}
	public void btn5Clicked() {setNum("5");}
	public void btn6Clicked() {setNum("6");}
	public void btn7Clicked() {setNum("7");}
	public void btn8Clicked() {setNum("8");}
	public void btn9Clicked() {setNum("9");}
	
	public void setNum(String num) {
		if(isFirst == true) {
			txtResult.setText(num);
			isFirst = false;
		} else { 
			String getNum = txtResult.getText();
			String totNum = getNum + num;
			txtResult.setText(totNum);
		}
	}
	
	public void btnPlusClicked() {
		setOperation(1);
	}
	public void btnMinusClicked() {
		setOperation(2);
	}
	public void btnDivClicked() {
		setOperation(3);
	}
	public void btnMultiClicked() {
		setOperation(4);
	}
	
	public void setOperation (int type) {
		operator = type;
		String getNum = txtResult.getText();
		tmp1 = Integer.parseInt(getNum);
		isFirst = true;
	}
	
	public void btnCancleClicked() {
		txtResult.setText("0");
		tmp1 = 0;
		tmp2 = 0;
		isFirst = true;
	}
	
	public void btnEqClicked() {
		
		String getNum2= txtResult.getText();
		tmp2 = Integer.parseInt(getNum2);
		
		
		int result = 0;
		
		switch (operator) {
			case 1: result = tmp1 + tmp2;break;
			case 2: result = tmp1 - tmp2;break;
			case 3: result = tmp1 / tmp2;break;
			case 4: result = tmp1 * tmp2;break;
		}	
		txtResult.setText(""+result);
		}
	}
	
	

package com.demo;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

public class CalcController{
	
	@FXML
	private HBox hbox;
	public void click0(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "0");
	}
	public void click1(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "1");
	}
	public void click2(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "2");
	}
	public void click3(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "3");
	}
	public void click4(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "4");
	}
	public void click5(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "5");
	}
	public void click6(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "6");
	}
	public void click7(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "7");
	}
	public void click8(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "8");
	}
	public void click9(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "9");
		
	}
	public void clickc(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		text.setText("");
	}
	public void clickp(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "+");
	}
	public void clickm(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "-");
	}
	public void clickt(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "*");
	}
	public void clickd(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		text.setText(value+ "/");
	}
	public void clicke(MouseEvent event) {
		Text text=(Text)hbox.lookup("#text1");
		String value=text.getText();
		String p="\\+";
		String m="-";
		String t="\\*";
		String d="/";
		String tempValue=value.replaceAll(p, d).replaceAll(m, d).replaceAll(t, d);
		String [] nums= tempValue.split(d);
		
		String flagValue=value;
		for (int i = 0; i <= 9; i++) {
			flagValue =flagValue.replaceAll(i+"", "");
		}
		char[] flagChar= flagValue.toCharArray();
		int result=0;
		result=Integer.valueOf(nums[0]);
		for (int i = 0; i < flagChar.length; i++) {

			if (flagChar[i]=='+') {
				result=result+Integer.valueOf(nums[i+1]);
			}else if(flagChar[i]=='-') {
				result=result-Integer.valueOf(nums[i+1]);
			}else if(flagChar[i]=='*') {
				result=result*Integer.valueOf(nums[i+1]);
			}else if(flagChar[i]=='/') {
				result=result/Integer.valueOf(nums[i+1]);
			}
					
		}
		text.setText(result+"");
	}
}

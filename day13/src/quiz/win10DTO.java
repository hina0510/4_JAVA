package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class win10DTO {
	Scanner input = new Scanner(System.in);
	private HashMap info;
	private String calc, notepad;
	private String msg;
	
	public HashMap getInfo() {
		return info;
	}
	public void setInfo(HashMap info) {
		this.info = info;
	}
	
	public String getCalc() {
		return calc;
	}
	public void setCalc(String calc) {
		this.calc = calc;
	}
	
	public String getNotepad() {
		return notepad;
	}
	public void setNotepad(String notepad) {
		this.notepad = notepad;
	}
	
}	

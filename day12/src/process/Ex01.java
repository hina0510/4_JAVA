package process;

import java.io.IOException;

public class Ex01 {
public static void main(String[] args) {
	ProcessBuilder pro = new ProcessBuilder();
	
	pro.command("calc");
	try {
		pro.start();
	} catch (IOException e) {
		e.printStackTrace();
	}
}
}

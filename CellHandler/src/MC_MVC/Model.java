package MC_MVC;

import java.io.File;

import Objects.Message;

public class Model {

	String fileFldrAdd = "C:/temp/Services/Add";
	String fileFldrSub = "C:/temp/Services/Substract";
	String fileFldrMul = "C:/temp/Services/Multiply";
	String fileFldrDiv = "C:/temp/Services/Divide";

	public void newCell() {
		
	}

	public Message changeMother( Controller c) {
		Message msg = new Message();
        char[] msgArray = new char[4];
        File[] servicesToInject = new File[4];
        
		if(c.addChkBox.isSelected()) {
			msgArray[0] = '1';
			servicesToInject[0] = new File(fileFldrAdd);
		}
		else {
			msgArray[0] = '0';
			servicesToInject[0] = null;

		}
		
		if(c.subChkBox.isSelected()) {
			msgArray[1] = '1';
			servicesToInject[1] = new File(fileFldrSub);
		}
		else {
			msgArray[1] = '0';
			servicesToInject[1] = null;
		}
		
		if(c.mulChkBox.isSelected()) {
			msgArray[2] = '1';
			servicesToInject[2] = new File(fileFldrMul);
		}
		else {
			msgArray[2] = '0';
			servicesToInject[2] = null;

		}
		
		if(c.divChkBox.isSelected()) {
			msgArray[3] = '1';
			servicesToInject[3] = new File(fileFldrDiv);
		}
		else {
			msgArray[3] = '0';
			servicesToInject[0] = null;
		}
		
		String msgCode = new String(msgArray);
		msg.setMessage(msgCode);
		msg.services = servicesToInject;
		msg.setContentCode(15);
		return msg;
	}
}

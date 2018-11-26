package MC_MVC;

import Objects.Message;

public class Model {
	
	public void newCell() {
		
	}
	
	public Message changeMother( Controller c) {
		Message msg = new Message();
        char[] msgArray = new char[4];

		if(c.addChkBox.isSelected()) {
			msgArray[0] = '1';
		}
		else {
			msgArray[0] = '0';
		}
		
		if(c.subChkBox.isSelected()) {
			msgArray[1] = '1';
		}
		else {
			msgArray[1] = '0';
		}
		
		if(c.mulChkBox.isSelected()) {
			msgArray[2] = '1';
		}
		else {
			msgArray[2] = '0';
		}
		
		if(c.divChkBox.isSelected()) {
			msgArray[3] = '1';
		}
		else {
			msgArray[3] = '0';
		}
		
		String msgCode = new String(msgArray);
		msg.setMessage(msgCode);
		msg.setContentCode(15);
		return msg;
	}
}

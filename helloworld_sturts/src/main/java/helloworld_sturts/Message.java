package helloworld_sturts;

import org.apache.struts.action.ActionForm;

public class Message extends ActionForm{
    private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

 
}

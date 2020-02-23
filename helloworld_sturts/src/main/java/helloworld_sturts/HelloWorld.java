package helloworld_sturts;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import helloworld_sturts.Message;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class HelloWorld extends Action{
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
    		HttpServletResponse response) throws Exception {
    	Message msg = (Message) form;
    	msg.setMsg("hello wolrd : ashish");
    	return mapping.findForward("success");
    }
}

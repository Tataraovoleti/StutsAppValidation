/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author TATARAO
 */
public class RegisterAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
   

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        RegisterForm frm=(RegisterForm)form;
        String name=frm.getName();
        String Password=frm.getPassword();
               
        return mapping.findForward("success");
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import org.springframework.web.servlet.mvc.SimpleFormController;

/**
 *
 * @author Saurav
 */
public class HelloService extends SimpleFormController {
    
    public static String sayHello(String name) {
     
        return "\"Look who is here Naruto's Greatest Fan and Goku's fan too , ooops ANIME FAN xD !!! Hello "+name+" Wasuppp!!";
        
    }
    
    @Override
    protected void doSubmitAction(Object command) throws Exception {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    /*
    @Override
    protected ModelAndView onSubmit(
            HttpServletRequest request, 
            HttpServletResponse response, 
            Object command, 
            BindException errors) throws Exception {
        ModelAndView mv = new ModelAndView(getSuccessView());
        //Do something...
        return mv;
    }
     */
}

package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import service.HelloService;

/**
 *
 * @author Saurav
 */
public class HelloController extends SimpleFormController {
    private HelloService helloService;
    public void setHelloService(HelloService helloService) {
    this.helloService = helloService;
}
    public HelloController() {
        //Initialize controller properties here or 
        //in the Web Application Context

        setCommandClass(Name.class);
        setCommandName("name");
        setSuccessView("helloView");
        setFormView("nameView");
    }
    
   // @Override
   // protected void doSubmitAction(Object command) throws Exception {
   //     throw new UnsupportedOperationException("Not yet implemented");
   // }

    //Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects
    
    @Override
    protected ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException errors) throws Exception {

        Name name = (Name) command;
        ModelAndView mv = new ModelAndView(getSuccessView());
        mv.addObject("helloMessage", helloService.sayHello(name.getValue()));
        return mv;
}
     
}

# JAVA-WEB-APP-NETBEANS
Deploying first JAVA Web Application using NetBeans IDE

# FINAL OUTPUT

![outputvideo](https://user-images.githubusercontent.com/25481890/52430884-19ed1000-2b2d-11e9-8725-c1e008d89d9a.gif)

# Step by Step Tutorial

1.Download and Install Netbeans IDE and JDK along with it.

2.Properly install it and take care of the servers too ( will be mentioning later)

3.This will be a very basic app with just greeting the user by his name

4.I have used SPRING framework for this project.

5.To build the server first goto Services in the left column of Netbeans

6.Add a server there ( I have used Glassfish)

7.Now choose 'New Project' and select 'Java Web App'

8.Type the file name 'WebApplication1'

9.Make sure Glassfish Server is selected

10.Under frameworks section select 'Spring Web MVC'

11.Click 'Finish'

12.Run the testProject that is automatically created by IDE for teting the server connections.

13.A page acknowledging the connection will pop up in the default web browser with localhost

# Creating our part

14.Click on 'New File' -> 'Java Category' as 'Spring Framework' -> 'File Types'  as 'Simple Form Controller'

15.Click on 'Next'.

16.Name the class as 'Hello Controller' and in package name type 'controller' ,  a new class opens up in IDE

17."public HelloController() {"
    
    "setCommandClass(Name.class);"
    
    "setCommandName("name");"
    
    "setSuccessView("helloView");"
    
    "setFormView("nameView");"

"}"

18.Create a java class 'Name' and set the ackage as 'controller'

19.In that Java class 'Name' pass a private String variable as value ; and use the getter() and setter() methods.

20. ""//Use onSubmit instead of doSubmitAction 
    //when you need access to the Request, Response, or BindException objects""
    
    This change should be done in the controller file
    
21.Create one main java class using 'service' package named 'HelloService'

22.In the controller file fix the imports by right clicking on IDE

23.We have to create a private HelloService helloservice; instance with void member function to create a public setter method 

24.Now hopefully there might not be any more warnings or errors in any of the pages.

25.In 'applicationContext.xml' tabwe have to register HelloService  by "<bean name="helloService" class="service.HelloService" />"

26.In the 'dispatrche-servlet.xml' registr the 'HeloController' by "<bean class="controller.HelloController" p:helloService-ref="helloService"/>"

# Basically we are done with the backend part and now Frontend

27.Goto 'jsp' folder under Web App Project Main Folder and crete 2 new jsp files named 'helloView' 'nameView'.

28.Make apt changes in 'helloView'

29.In 'nameView' add this for framework "<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>"

30.For response this is the command --- under the <h1></h1> tags of enquiring the name

"
<spring:nestedPath path="name">
    <form action="" method="post">
        Name:
        <spring:bind path="value">
            <input type="text" name="${status.expression}" value="${status.value}">
        </spring:bind>
        <input type="submit" value="OK">
    </form>
</spring:nestedPath>
"

31.To create a runtime like app , right click on MainProject icon , go to 'Properties' select 'Run' and type '/hello.htm' in the URL path

32.The connectivity is handled by Spring Framework.

33.RUN 


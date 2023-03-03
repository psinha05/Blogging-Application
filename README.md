# Blogging-Application
Blogging Application for the demo purpose

About

A blogging platform is a service that's used to create and manage a blog so that you can publish your ideas and words online. 
A full-stack blog written in Java using Spring Boot and Reactjs, all the user athentication happened at server end. Once user register into the application then need to sign up for the post of blogs.

Used technologies for this application : 
Core java (oops , package , exception , lambda , stream api etc)
Basics of Spring Framework( Spring Core(DI) , JPA and MVC)
Spring Boot Basics
Basics of MySQL Database
STS IDE
React JS
Java Script
Postman rest client

MySql


Getting Started:
Prerequisites
    Install Java 11 from the OpenJDK
    Install Node.js from the Node.js website
    Install MySql 8.x on local machine
    Install Postman rest client
    install STS for Java based application
    install visual studio for run the Java script codes
    
    
    MySQL Setup:
    Use a preffered MySQL 8.0 for your system(os) and create a database named blog-app
    Run the MySQL Server

Backend:
    Open the backend folder with STS
    Right click on the pom.xml file and with the maven option select Reload the project it will automatically download the dependencies
    Open application.properties file from the resource folder and add the following lines

     #MySQL database connection strings
     spring.datasource.url=jdbc:mysql://localhost:3306/blog-app
     spring.datasource.username=YOUR_DB_USERNAME //Commonly used: root
     spring.datasource.password=YOUR_DB_PASSWORD

     # JPA property settings
     #spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
     spring.jpa.hibernate.ddl-auto=update //If update don't work use create or create-drop, the revert back to update
     spring.jpa.properties.hibernate.show_sql=true

    Once the source building and dependecies are ready and application.properties is configured, run the App using Application configuration or just run if the provided configuration is available. // We're running only the development version here since it's basic

Frontend:
    for frontend open blog-app folder from cmd 
    run the code .. cmd, this will open the application in visual studio with project structure.
    Open terminal inside the vs code or run the run from externally.
    Either use npm run start or use npm run build then serve the build with serve -s build
    Frontend will automatically run in your browser

Once all three are set, you can readily browse through http://lostcalhost:9090 for backend and
http://localhost:3000 for frontend 
(PORTs may vary depending on your system/version or availability for use.)

  
    Representaion for application architecture:
    
       
![image](https://user-images.githubusercontent.com/40369558/222567413-a62e9c8c-f206-4380-ad94-4d3a428409ea.png)




#  Blogging Application Diagrams:


 a).  Signup Page (For First time user)
 
 ![image](https://user-images.githubusercontent.com/40369558/222568074-bdc16ad5-5cf7-4cf5-a845-79dfde7aca98.png)
 
 ------------------------------------------------------------------------------------------------------------------
 

b). Login Page 

 ![image](https://user-images.githubusercontent.com/40369558/222567874-be3d2cf1-25f2-4eb7-b473-1e52ad45b9bf.png)
 
 
 ----------------------------------------------------------------------------------------------------------------------

c). Successfully registered user

   ![image](https://user-images.githubusercontent.com/40369558/222571848-230f734f-f8e1-44a7-9fe1-fa4566f23d82.png)
    
    
 ----------------------------------------------------------------------------------------------------------------------- 
    
    
 d). Login for the registered user
 
 ![image](https://user-images.githubusercontent.com/40369558/222569107-84937ac0-c368-47b0-b65a-9f7e7ef32118.png)
          
-------------------------------------------------------------------------------------------------------------------------


e). For blog in the application 


![image](https://user-images.githubusercontent.com/40369558/222569347-fd47f7fd-9f8b-4594-82f3-699b372d32eb.png)

--------------------------------------------------------------------------------------------------------------------------


f).  User Information Page


![image](https://user-images.githubusercontent.com/40369558/222569458-1aee5cad-b56b-4c83-b0c6-ba50a5750293.png)

----------------------------------------------------------------------------------------------------------------------------


g). Blogging info page

  ![image](https://user-images.githubusercontent.com/40369558/222572423-681fca35-38f7-4cb3-8dbe-5a81bbad3751.png)


--------------------------------------------------------------------------------------------------------------------------


ER Diagrams.
![image](https://user-images.githubusercontent.com/40369558/219021040-82970e5a-e517-4c1e-a176-0eabbba12175.png)


-------------------------------------------------------------------------------------------------------------------------

#  Topics covered for the project 

1).  Git 

GitHub is an Internet hosting service for software development and version control using Git. It provides the distributed version control of Git plus access control, bug tracking, software feature requests, task management, continuous integration, and wikis for every project. It has been a subsidiary of Microsoft since 2018.



![github](https://user-images.githubusercontent.com/40369558/222688276-e274bfdd-d8c1-4a92-9e97-86d5977f32bf.jpg)


2).  UML : 

UML, short for Unified Modeling Language, is a standardized modeling language consisting of an integrated set of diagrams, developed to help system and software developers for specifying, visualizing, constructing, and documenting the artifacts of software systems, as well as for business modeling and other non-software systems. The UML represents a collection of best engineering practices that have proven successful in the modeling of large and complex systems. The UML is a very important part of developing object oriented software and the software development process. The UML uses mostly graphical notations to express the design of software projects. Using the UML helps project teams communicate, explore potential designs, and validate the architectural design of the software.

@  Class Diagram

![image](https://user-images.githubusercontent.com/40369558/222689832-7dbcf302-404c-405e-aec5-44f0bc657150.png)




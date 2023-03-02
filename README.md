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

  
    Images for representaion for application architecture:
    
       
![image](https://user-images.githubusercontent.com/40369558/222567413-a62e9c8c-f206-4380-ad94-4d3a428409ea.png)




ER Diagrams.
![image](https://user-images.githubusercontent.com/40369558/219021040-82970e5a-e517-4c1e-a176-0eabbba12175.png)





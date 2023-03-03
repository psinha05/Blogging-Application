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

@  Class Diagram of blog application

![image](https://user-images.githubusercontent.com/40369558/222689832-7dbcf302-404c-405e-aec5-44f0bc657150.png)


@ Sequence Diagram of the blog application 

![image](https://user-images.githubusercontent.com/40369558/222690434-3fc84be8-daa6-41b9-81da-d5579044dcd6.png)

@ Activity Diagram of blog application

![image](https://user-images.githubusercontent.com/40369558/222690559-8f41054d-dde8-4309-948b-c13fb3f7e95a.png)


3). Domain-driven Design(DDD)

Domain-Driven Design is an approach to software design that glues the system’s implementation to a constantly evolving model, leaving aside irrelevant details like programming languages, infrastructure technologies, etc. DDD focuses on three core principles:

•	It focuses on the core domain and domain logic.

•	Base complex designs on models of the domain.

•	Constantly collaborate with domain experts, in order to improve the application model.


The common terms that are useful for describing the DDD as 

        > Bounded Context: It is a description of a boundary within which a particular model is defined and applicable.        
(For example, outside of a Bounded Context, an “add” could mean two different things, either add a product to the cart or add a user)

        > Ubiquitous Language: It is a language, shared by the development team and the domain experts It is used by all team members to connect all the   activities of the team with the software.
        
        > Building Blocks:  Domain-driven design also defines a number of high-level concepts that can be used to create, express, and retrieve domain model within a Bounded Context.
        
        > Aggregate: Aggregates are collections of related Entities and Value Objects. Each Aggregate has an Entity that controls all access to the objects inside the boundary, this entity is the Aggregate Root. 
        
        > Services: The Domain Model requires certain actions or operations that are not directly related to an Entity or a Value Object, in that case, such business logic can be implemented as a Service. Services are classes that offer stateless operations. 
        
        > Entity: An object that has a unique identity and consistent thread of continuity. The Identity is maintained via a unique key or a combination of keys.
        
        > Value Object: An immutable object that describes characteristics, and that does not possess any unique identity is called Value Objects.
        
        > Repositories: The repository is an interface that handles Read, Updates, and Delete operations. It hides the implementation details from the client. It operates as an abstraction layer over memory, file system, database, etc.
        
        > Factories: The repository is an interface that handles Read, Updates, and Delete operations. It hides the implementation details from the client. It operates as an abstraction layer over memory, file system, database, etc.
        
       DDD of blog application and other design:
       
       a).  Blog Application 
            
          

![ddd01](https://user-images.githubusercontent.com/40369558/222699384-71caf1b0-a152-426e-8157-4e5d571db878.png)

![blog_DDD](https://user-images.githubusercontent.com/40369558/222700464-52114911-7698-428d-9622-7634dbc96cab.png)


               

          
        b).  DDD implementation cycle
             
![DDD_impl](https://user-images.githubusercontent.com/40369558/222699715-e0dfad7d-7d30-4427-8a7f-b92fc531a7ec.png)


        c).  DDD of Microservices application
           




![ms_ddd](https://user-images.githubusercontent.com/40369558/222699955-e9f7b008-a5ba-403b-b03a-7636c1dc7dbf.png)



  
![image](https://user-images.githubusercontent.com/40369558/222704252-31383754-89fb-4467-a746-565aa2c1d860.png)


4). Metrics(Sonarqube)

 SonarQube is an open-source platform developed by SonarSource for continuous inspection of code quality to perform automatic reviews
with static analysis of code to detect bugs and code smells on programming languages. SonarQube offers reports on duplicated code, coding standards, 
unit tests, code coverage, code complexity, comments, bugs, and security recommendations.

SonarQube can record metrics history and provides evolution graphs. SonarQube provides fully automated analysis and integration with Maven, Ant, Gradle, MSBuild and continuous integration tools.

Steps :
a).  install the sonarqube on system

b).  add the plugin in the maven(pom.xml) file

<!-- Below plugin needs to be added for code coverage-->
            <plugin>
                <groupId>org.jacoco</groupId>
                <artifactId>jacoco-maven-plugin</artifactId>
                <version>0.8.6</version>
                <executions>
                    <execution>
                        <id>default-prepare-agent</id>
                        <goals>
                            <goal>prepare-agent</goal>
                        </goals>
                    </execution>
                    <execution>
                        <id>default-report</id>
                        <phase>prepare-package</phase>
                        <goals>
                            <goal>report</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>

c).   we need to run two commands while building our spring boot project 

                   > First command will be used to generate code coverage report by Jacoco plugin.
                            clean org.jacoco:jacoco-maven-plugin:prepare-agent install
                            
                   > Second command will be used to See our project code analysis on SonarQube dashboard. we also need to pass authorization token with 
                   sonar:sonar command . We will get this token from Sonarqube dashboard Click on My Account → Security → Enter Token Name and then 
                   click on Generate and will use same token value for -Dsonar.login 
                   
                            sonar:sonar -Dsonar.login=generated-token-value
                            
 d). build the project using the maven 
 
 ![image](https://user-images.githubusercontent.com/40369558/222709174-b4d837b1-b94a-4101-bbd3-d85e5c9f5aa7.png)
 
 
 e).  build the project using the sonar as admin credentiails (admin/admin) 
 
sonar:sonar 
-Dsonar.login=admin 
-Dsonar.password=admin

![image](https://user-images.githubusercontent.com/40369558/222710175-891d9319-4208-45b3-84f5-ef6d7db0b336.png)


Test the application : http://localhost:9000/dashboard?id=com.ps.blog%3Ablog-app
![image](https://user-images.githubusercontent.com/40369558/222710417-f193f7bb-e062-46ca-82cd-5793a37c9b91.png)




5).  Clean Code Development 

    Necessary changed were performed suggested by the tool(sonarqube), few are mentioned as below:
    -----------------------------------------------------------------------------------------------
    
    
1).  To remove all the unused codes(written but not using anywhere)
2).  To reomove the SOP, suggested for use the logger (log4j)
3).  To updated the pom.xml file and suggested for removed all the commented code.
4).  Lombook updated (for setter/getter)
5).  Suggest for private methods instead of public for security purpose.


![image](https://user-images.githubusercontent.com/40369558/222713703-755aed53-b95b-4d09-b046-cf69f663d946.png)


6). Build 

Maven is a build automation tool used primarily for Java projects. Maven can also be used to build and manage projects written in C#, Ruby, Scala, and other languages. The Maven project is hosted by the Apache Software Foundation, where it was formerly part of the Jakarta Project. 

Maven addresses two aspects of building software: how software is built and its dependencies. An XML file describes the software project being built, its dependencies on other external modules and components, the build order, directories, and required plug-ins. It comes with pre-defined targets for performing certain well-defined tasks such as compilation of code and its packaging. Maven dynamically downloads Java libraries and Maven plug-ins from one or more repositories such as the Maven 2 Central Repository, and stores them in a local cache. This local cache of downloaded artifacts can also be updated with artifacts created by local projects. 


In blog application, maven used as build tool (Project Object Model(POM))

![image](https://user-images.githubusercontent.com/40369558/222715104-8db6b391-9dce-4956-b191-96a26e9fbe3b.png)


Maven Dependencies Jar files
![image](https://user-images.githubusercontent.com/40369558/222715520-a675a55d-05ba-47e7-ac37-e61a1956dbdf.png)



7). Unit Test

Unit Testing is a crucial step in software design and implementation.
It not only improves the efficiency and effectiveness of the code, but it also makes the code more robust and reduces the regressions in future development and maintenance. Unit Testing is a methodology of testing source code for its fitment of use in production. We start out writing unit tests by creating various test cases to verify the behaviors of an individual unit of source code.

![image](https://user-images.githubusercontent.com/40369558/222716792-4e93400f-fab4-4f39-bb75-37d1e0850d6f.png)


Test using Mockito

![image](https://user-images.githubusercontent.com/40369558/222716966-bd4d5a64-ce4d-411d-869b-668ab8c55a30.png)



8).  Continuous Delivery

Continuous integration, delivery and deployment are practices that seek to speed up the process of releasing software by shortening feedback loops and automating repetitive tasks. These practices play a key role in making the agile principle of frequently delivering valuable, working software to users a reality. 

![image](https://user-images.githubusercontent.com/40369558/222718881-191cad50-3b67-46ca-b956-a5b0d470892a.png)






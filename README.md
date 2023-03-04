# Blogging-Application
Blogging Application for the demo purpose

About

A blogging platform is a service that's used to create and manage a blog so that you can publish your ideas and words online. 
A full-stack blog written in Java using Spring Boot and Reactjs, all the user athentication happened at server end. Once user register into the application then need to sign up for the post of blogs. ( Blog apps UI  component available at : https://github.com/psinha05/my-blog)

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

Frontend: (https://github.com/psinha05/my-blog)
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


@ Sequence Diagram of blog application 

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
          (For example, outside of a Bounded Context, an “add” could mean two different things, either 
          add a product to the cart or add a user)

        > Ubiquitous Language: It is a language, shared by the development team and the domain experts It is used by all
	  team members to connect all the   activities of the team with the software.
        
        > Building Blocks:  Domain-driven design also defines a number of high-level concepts that can be used to create,
	  express, and retrieve domain model within a Bounded Context.
        
        > Aggregate: Aggregates are collections of related Entities and Value Objects. Each Aggregate has an Entity that 
	   controls all access to the objects inside the boundary, this entity is the Aggregate Root. 
        
        > Services: The Domain Model requires certain actions or operations that are not directly related to an Entity or
	  a Value Object, in that case, such business logic can be implemented as a Service. Services are classes that offer 
	  stateless operations. 
        
        > Entity: An object that has a unique identity and consistent thread of continuity. The Identity is maintained via a 
	  unique key or a combination of keys.
        
        > Value Object: An immutable object that describes characteristics, and that does not possess any unique identity is 
	  called Value Objects.
        
        > Repositories: The repository is an interface that handles Read, Updates, and Delete operations. It hides the 
	  implementation details from the client. It operates as an abstraction layer over memory, file system, database, etc.
        
        > Factories: The repository is an interface that handles Read, Updates, and Delete operations. It hides the 
	  implementation details from the client. It operates as an abstraction layer over memory, file system, database, etc.
        
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
                            
                   > Second command will be used to See our project code analysis on SonarQube dashboard. we also need 
		      to pass authorization token with 
                   sonar:sonar command . We will get this token from Sonarqube dashboard Click on 
		         My Account → Security → Enter Token Name and then 
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
       
    
1).  To remove all the unused codes(written but not using anywhere)

2).  To reomove the SOP, suggested for use the logger (log4j)

3).  To updated the pom.xml file and suggested for removed all the commented code.

4).  Lombook updated (for setter/getter)

5).  Suggest for private methods instead of public for security purpose.



![image](https://user-images.githubusercontent.com/40369558/222713703-755aed53-b95b-4d09-b046-cf69f663d946.png)


6). Build 

Maven is a build automation tool used primarily for Java projects. Maven can also be used to build and manage projects 
written in C#, Ruby, Scala, and other languages. The Maven project is hosted by the Apache Software Foundation, where 
it was formerly part of the Jakarta Project. 

Maven addresses two aspects of building software: how software is built and its dependencies. An XML file describes the software
project being built, its dependencies on other external modules and components, the build order, directories, and required plug-ins.
It comes with pre-defined targets for performing certain well-defined tasks such as compilation of code and its packaging. Maven 
dynamically downloads Java libraries and Maven plug-ins from one or more repositories such as the Maven 2 Central Repository, 
and stores them in a local cache. This local cache of downloaded artifacts can also be updated with artifacts created by local projects. 


In blog application, maven used as build tool (Project Object Model(POM))

![image](https://user-images.githubusercontent.com/40369558/222715104-8db6b391-9dce-4956-b191-96a26e9fbe3b.png)


Maven Dependencies Jar files
![image](https://user-images.githubusercontent.com/40369558/222715520-a675a55d-05ba-47e7-ac37-e61a1956dbdf.png)



7). Unit Test

Unit Testing is a crucial step in software design and implementation.
It not only improves the efficiency and effectiveness of the code, but it also makes the code more robust and reduces the regressions 
in future development and maintenance. Unit Testing is a methodology of testing source code for its fitment of use in production. 
We start out writing unit tests by creating various test cases to verify the behaviors of an individual unit of source code.


![image](https://user-images.githubusercontent.com/40369558/222716792-4e93400f-fab4-4f39-bb75-37d1e0850d6f.png)


Test using Mockito

![image](https://user-images.githubusercontent.com/40369558/222716966-bd4d5a64-ce4d-411d-869b-668ab8c55a30.png)



8).  Continuous Delivery

Continuous integration, delivery and deployment are practices that seek to speed up the process of releasing software by shortening 
feedback loops and automating repetitive tasks. These practices play a key role in making the agile principle of frequently delivering 
valuable, working software to users a reality. 

![image](https://user-images.githubusercontent.com/40369558/222718881-191cad50-3b67-46ca-b956-a5b0d470892a.png)

used the jenkins pipeline for the blog apps( React component)
https://github.com/prats5/react-blog-app

![image](https://user-images.githubusercontent.com/40369558/222719796-b2ca1468-947a-4c39-a6f2-9fc6f54f5735.png)

# Pipeline Script
![image](https://user-images.githubusercontent.com/40369558/222719881-bede8aec-3662-42a5-9be1-c215d2603d3c.png)


For React build
![image](https://user-images.githubusercontent.com/40369558/222720010-58a91df9-99b6-47c4-888d-5f57bcc3d2d1.png)

#  Pipe line script for pull the docker image 
![image](https://user-images.githubusercontent.com/40369558/222720156-96887c66-9dc4-4eda-b2bd-bb7be4f0b125.png)

if image is not available on local system, pull the image from hub
![image](https://user-images.githubusercontent.com/40369558/222720388-6411978e-3794-4e43-ad54-7a74df5a188c.png)




![image](https://user-images.githubusercontent.com/40369558/222720217-bac72627-bfa6-41cc-91c2-fbbf3d3abad1.png)




9).  IDE

An integrated development environment (IDE) is a software application that provides comprehensive facilities to computer programmers
for software development. An IDE normally consists of at least a source code editor, build automation tools, and a debugger. 
Some IDEs, such as NetBeans and Eclipse, contain the necessary compiler, interpreter, or both.

For this project I have used the Spring Tool Suits(STS) version 4.17.2 and Visual Studio Code(VS Code) version 1.39.2

Version: 1.39.2 (user setup)

Commit: 6ab598523be7a800d7f3eb4d92d7ab9a66069390

Date: 2019-10-15T15:35:18.241Z

Electron: 4.2.10

Chrome: 69.0.3497.128

Node.js: 10.11.0

V8: 6.9.427.31-electron.0

OS: Windows_NT x64 10.0.19045


STS(V4.17.2)

![image](https://user-images.githubusercontent.com/40369558/222739691-13bf11e0-e832-47b6-8667-85ed54eea09e.png)



Visual Studio Code (V_1.39.2)

![image](https://user-images.githubusercontent.com/40369558/222739848-b03d2f96-5fd8-4790-b21a-205dd1eb42fd.png)



10). DSL(Domain specific language) 

A domain specific language is a language meant for use in the context of a particular domain. A domain could be a business 
context (eg: banking, insurance etc..) or an application context (eg, a web application, database etc..). In contrast a 
general –purpose language(GPL) can be used for a wide range of business problems and applications. It is created for a 
limited sphere of applicability  and use, but it’s powerful enough to represent and address the problems and solutions 
in that sphere. Ex : HTML, a language for web based domain application. 

There are two types of languages used in DSL:

a). Domain-specific language  (DSL) : the language in which a DSL is written or presented.

b). Host Language : the language in which a DSL is executed or processed. 

DSL examples

Some languages used for DSLs include:
    Web: HTML
    
    Shell: sh, Bash, CSH, and the likes for *nix; MS-DOS, Windows Terminal, PowerShell for Windows
    
    Markup languages: XML
    
    Modeling: UML
    
    Data management: SQL and its variants
    
    Business rules: Drools
    
    Hardware: Verilog, VHD
    
    Build tools: Maven, Gradle 
    
The purpose of a DSL is to capture or document the requirements and behavior of one domain. A DSL’s usage might be even narrower 
for particular aspects within the domain (e.g., commodities trading in finance).

DSL Pros and Cons

On the plus side, DSLs are powerful for capturing a domain’s attributes. It’s easy to learn and use.

On the downside, a DSL is narrowly used within the intended domain and purpose. DSL creators need domain knowledge as well as 
language-development knowledge, and individuals have both knowledge.

DSL software are open source options include  Xtext  and JetBrains MPS.

For the code snippets, I have used Apache Camel with a Spring Boot Application.

Apache Camel is a rule-based routing and mediation engine that provides a Java object-based implementation of the Enterprise 
Integration Patterns using an API (or declarative Java Domain Specific Language, (DSL)) to configure routing and mediation rules.

Steps:

a). In the Maven we need the camel dependency.Maven will be as follows- 

<dependency>
    <groupId>org.apache.camel</groupId>
    <artifactId>camel-spring-boot-starter</artifactId>
    <version>2.17.0</version>
</dependency>


b). Create the SpringBootHelloWorldApplication.java as below-

package com.ps

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHelloWorldApplication.class, args);
	}
}


c). To add class with the Camel routes, this routes will be started automatically. 

package com.ps


import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:C://inputFolder?noop=true").to("file:C://outputFolder");
	}
}

d). To keep the main thread blocked so that Camel stays up, add camel.springboot.main-run-controller=true to the application.properties file.
    camel.springboot.main-run-controller=true
    
![image](https://user-images.githubusercontent.com/40369558/222776757-34105571-0091-41b8-af03-efa5ca13fa8b.png)

This has moved the file from inputFolder to outputFolder based on route defined by the camel.

    
    
11). Functional Programming

functional programming is a programming paradigm where programs are constructed by applying and composing functions. It is a declarative 
programming paradigm in which function definitions are trees of expressions that map values to other values, rather than a sequence of 
imperative statements which update the running state of the program.

In functional programming, functions are treated as first-class citizens, meaning that they can be bound to names (including local identifiers),
passed as arguments, and returned from other functions, just as any other data type can. This allows programs to be written in a declarative 
and composable style, where small functions are combined in a modular manner. 

A number of aspects and paradigms are specific to functional programming, few of them have implemented code shown as below :


@ only final data structures :

Immutability is one of the core principal of functional programming  and it refers to the property that an entity can’t be modified after 
being instantiated. Java itself provides several built-in immutable type like String. Use of Final keyword is one of them.

Use of data structure (List, Array, Map), so that variable can’t be further initialized. Also class cannot be subclased and final methods 
can’t be overridden.

![image](https://user-images.githubusercontent.com/40369558/222756366-bb625115-2cc5-45df-8c6c-f9b37ef0f1f5.png)




@ side effect :

Functional programming is a pure function , a function is said  to be pure, if

•	No state

•	No side effect

•	Immutable variables

•	The return value of the function depends only on the input parameters passed to the function

![image](https://user-images.githubusercontent.com/40369558/222757045-f20afecb-24fd-4bab-b153-f324636e5b4e.png)

The return value of the sum() function only depends on the input parameters. Notice also that the sum() has no side effects, meaning it 
does not modify any state (variables) outside the function anywhere.



@ higher-order functions

A function is said to be a higher order function if at least one of the following conditions are met:

       > The function takes one or more functions as parameters.

       > The function returns another functions as result. 

![image](https://user-images.githubusercontent.com/40369558/222757926-a996a7db-a182-4b9e-b456-1894b4076415.png)

Use of higher-order function

     - The function will work as an instance of the object type.

     - We can easily store the function in the form of the variable.

     - We can store these functions in the data structure in the hash table, list etc.
     



@ functions as parameters and return values

Lambda expression is an anonymous function that takes in parameters and returns a value. It is called an anonymous function because it 
doesn’t require a name. 

Syntax : 
 (parameters1,  parameters 2, ….) ->  expression
 
(parameter1, parameter 2, ….) ->   {  body  }

![image](https://user-images.githubusercontent.com/40369558/222759011-f77f1e57-c927-429f-a531-cdc6e0f36b8b.png)



@ Anonymous function

Anonymous function are unnamed, and thus can’t be invoked or used anywhere but where they’re defined. Thus they are useful to do a small 
amount of functionality that doesn’t rise to the level of needing its own template. So, this means anonymous functions need to be 
implemented using closures. Lambda expressions are merely a more concise way to invoke these anonymous functions

A lambda expression represents an anonymous function and It comprises of a set of parameters, a lambda operator (->) and a function body.

Return Type

1.	When there is a single statement, the return type of the anonymous function is the same as that of the body expression.

2.	When there is more than one statement enclosed in curly brackets then the return type of the anonymous function is the same as 
the type of the value returned within the code block, or void if nothing is returned.

![image](https://user-images.githubusercontent.com/40369558/222764794-4c184644-c671-4d99-baec-e7bc9099dcc0.png)













This is ongoing, POC maven, spring, flex app. It's cribbed heavily from the integration samples.  I put it 
together to test the ease of adding flex into the mix of a enterprise-like architecture and workflow.  

Instruction to build & run (assuming you've got the sources downloaded).

1.  Create db schema.  You can try playing with the hibernate.hbm2ddl.auto propery in app-config.xml
       or run the ddl script in this folder.  Make sure you update the db credentials in jdbc.properties.
       
2.  In the project root, run:  mvn install;

3.  In ./java-web run: mvn jetty:run-war

TODOs:

1.  Get unit tests setup & working on both flex & java side.
2.  Get mvn jetty:run working in parent pom (http://docs.codehaus.org/display/JETTY/Multiple+WebApp+Source+Directory 
       should work, but it doesn't).
3.  Learn Flex best practices & organize the flex sources (implement mvc for flex).
4.  Exercise spring-security integration with flex views.

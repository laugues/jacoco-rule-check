# Jacoco Multi Module Threshold 
- Run `mvn clean verify install` 
- Go to  http://localhost:<PROT>/jacococoverage/examplejar1/target/site/jacoco/index.html
- See code coverage
- Rule check passed for all modules



# Increase code coverage rule
- Edit file ./example-jar1/pom.xml
- Change following code to your convenience. Example : COVEREDRATIO -> 0.50
```xml
<configuration>
    <rules>
        <rule>
            <element>PACKAGE</element>
            <limits>
                <limit>
                    <counter>LINE</counter>
                    <value>COVEREDRATIO</value>
                    <minimum>0.50</minimum>
                </limit>
                <limit>
                    <counter>BRANCH</counter>
                    <value>COVEREDRATIO</value>
                    <minimum>0.50</minimum>
                </limit>
            </limits>
        </rule>
    </rules>
</configuration>
```
- Run `mvn clean verify install`, build failed 
```
[WARNING] Rule violated for package com.laugues.example.jar1: lines covered ratio is 0.50, but expected minimum is 0.51
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary for jacoco-coverage 1.0.0-SNAPSHOT:
[INFO] 
[INFO] jacoco-coverage .................................... SUCCESS [  2.907 s]
[INFO] example-jar1 ....................................... FAILURE [ 15.280 s]
[INFO] example-jar2 ....................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  18.393 s
[INFO] Finished at: 2019-10-20T20:42:04+02:00
[INFO] ------------------------------------------------------------------------
```



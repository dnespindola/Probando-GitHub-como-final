cls
set dpro="D:\trabajos java POO\riegoscentro"
set djav=C:\"Program Files"\Java\jdk1.7.0_45
set dlib=%dpro%\lib

cd bin

set classpath=.
set classpath=%classpath%;%dlib%\jpox-enhancer-1.2.3.jar
set classpath=%classpath%;%dlib%\jdo2-api-2.0.jar
set classpath=%classpath%;%dlib%\asm-3.1.jar
set classpath=%classpath%;%dlib%\jpox-core-1.2.2.jar
set classpath=%classpath%;%dlib%\log4j-1.2.8.jar

rem ejecuta el enhancer de los .class de la persistencia

%djav%\bin\java -cp bin;%classpath% -Dlog4j.configuration=file:log4j.properties org.jpox.enhancer.JPOXEnhancer Dominio\*.jdo   

cd..
pause
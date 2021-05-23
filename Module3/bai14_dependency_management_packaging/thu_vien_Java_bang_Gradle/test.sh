rm -rf build/test/
cd src/main/
javac HelloWorld.java -d ../../build/test/ && echo 'Compiled HelloWorld class!'
cd ../test
javac HelloWorldTest.java -cp ../../build/test/ -d ../../build/test/ && echo 'Compiled HelloWorldTest class!'
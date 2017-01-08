rm -rf dist && mkdir dist # cleans dist directory
javac ./lib/*.java -d dist # compiles interfaces
javac ./*.java -cp dist -d dist # compiles classes
javac ./tests/*.java -cp dist -d dist # compiles tests
java -cp dist Launcher # runs tests
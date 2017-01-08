rm -rf dist && mkdir dist # cleans dist directory
javac ./lib/*.java -d dist # compiles interfaces
javac ./*.java -cp dist -d dist # compiles classes
java -cp dist Launcher # runs tests
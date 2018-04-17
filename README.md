# Rock-Paper-Scissor

It is a simple 2-player game of rock-paper-scissor using client-server model in Distributed Systems.

## How to run
1. Download all 4 .java files on your PC
2. Make sure that javac can be run where you have stored these files or change SET PATH= settings
3. Download server.bat and client.bat files and store them in the same folder as those .java files
4. Run server.bat file; this will do the following  
  a. compile all .java files  
  b. create stubs and skeletons  
  c. start rmiregistry  
  d. run server for our application
5. Run client.bat files twice to create 2 players
6. Server is running, both the clients are running and the game is ready to be played

## Game logic
-  rock beats scissor
-  scissor cuts paper
-  paper covers rock

# 2DTacticalRPG
This will have the most up to date executable .jar of the program for public testing without needing to compile the program. 

Compiled with OpenJDK 13 and OpenJFX 13.

Controls: 
	WASD to move character, move into an enemy to start a battle.
	Space bar to advance player turn or NPC turn, you will be prompted in the bottom part of the game screen.
	For DevMenu -> use Tilde when a map is being rendered (not in the Main_Menu/Game_Over states)

![Alt text](/ExampleScreenShots/gameExample.PNG?raw=true "Game Example")

![Alt text](/ExampleScreenShots/devMenuExample.PNG?raw=true "Dev Menu")

v0.2.0 Notes: added more functionality to the DevMenu including the ability to manually change gameState. 
	Added but not implemented a 'level selection' state to allow graphical selection of levels.
	When loading a new map the engine will now load .meta data to generate NPCs both allies and enemies

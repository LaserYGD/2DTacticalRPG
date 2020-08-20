# 2DTacticalRPG

Compiled with OpenJDK 13 and OpenJFX 13.

Controls: 
	WASD to move character, move into an enemy to start a battle.
	Space bar to advance player turn or NPC turn, you will be prompted in the bottom part of the game screen.
	For DevMenu -> use Tilde when a map is being rendered (not in the Main_Menu/Game_Over states)
DevMeu: 
	When in DevMenu you can check the EditMode box to 'pause' the game function and allow you to click a tile on the tileset, then draw onto the map with the mouse. A right click will delete the current tile. You can click and drag an area to paint the whole square/rectangle area.
	You can change the MapID with the '+' and '-' buttons if you go beyond the amount of maps loaded in memory it will auto randomly generate a map based on the currently loaded tilesets. Once you've created the map you can then 'save' the map you will need to provide .meta data to compliment the .dat file for the map.

![Alt text](/ExampleScreenShots/gameExample.PNG?raw=true "Game Example")

![Alt text](/ExampleScreenShots/devMenuExample.PNG?raw=true "Dev Menu")

v0.2.0 Notes: added more functionality to the DevMenu including the ability to manually change gameState. 
	Added but not implemented a 'level selection' state to allow graphical selection of levels.
	When loading a new map the engine will now load .meta data to generate NPCs both allies and enemies

# JGL

A simple Java game engine. JGL will set up a window and get your code running without you needing to deal with the JFrame setup or code timing. JGL helps keep your code uncluttered by forcing a separation of update logic and rendering logic. Both update code and rendering code run at 60hz, but they are never run at the same time, meaning that you don't have to worry about thread safety at all. Once JGL gets your window set up, you can write your game using the Graphics2D object passed to you, which is definitely capable of rendering a simple 2D game.

# Usage

JGL is composed of three classes:

- `JGLGame`: This is the class that you extend and write your game logic in. It contains a couple methods you will override, such as `update` and `render`, and also provides useful utilities such as `checkIfKeyIsDown` for simple keyboard input.
- `JGLGameProperties`: This is a simple class which holds some information about your game, such as its title (which becomes the title of the window) and its window's dimensions.
- `JGLGameController`: This is the class that controls actually starting your game.

Creating a game will typically consist of extending `JGLGame`, overriding and implementing its methods, and creating a main method that creates an instance of your game and starts it with `JGLGameController`. Please see `com.markaldrich.jgl.testGames.SampleGame1` for a sample game.

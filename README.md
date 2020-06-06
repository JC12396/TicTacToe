<h2> TicTacToe Final Project </h2>
<p></p>
<hr>
<li>PURPOSE OF PROJECT: Learning how to edit and use list arrays</li>
<li>Date: June 5, 2020</li>
<li>Author: Joseph Chalupa</li>
<hr>
<h3>How List Arrays Work:</h3>
<p>When you are using list arrays you normally need to import a few things to use them. Once you initialize the arrays you are able to use many differnt types of commands to edit and learn from the arrays. I personally used the .get() method and .set() method alot in my code. Otherwise array lists because pretty simple when you start to learn the basics and become easy to manipulate. </p>
<h3>Why I used List Arrays:</h3>
<p>Array lists felt more like a challenge and a learning opportunity for me. When I started learning array lists it felt like more maluable and easier to work with than multi-dimensional arrays. Soon enough I started to learn more commands and other ways to use array lists that helped my code. Overall it just felt better for me to use array lists.
<h3>How the Code Works:</h3>
<p>First I initailized the array lists as 3 different rows of squares so it looked like a tic-tac-toe board. First there is a for-loop to fill the rows with squares as a placeholder for the slot. Next the code asks you if you would like to play(1 for yes, 0 for no); If you enter 1 the game will start, if you enter 0 the code will execute System.exit(0); which will automatically end the code, also if you enter anything else other than 1 or 0 the code will also automatically end with System.exit(0). When you enter 1 to start the game will ask you where you would like to place your X. Once you do a Scanner variable saves that and finds the spot in the arrays and uses the .set(posistion, replacer) code to replace the square there with yours as long that it is a square. If you try to place in the same spot twice or place on the AI's spot it will tell you that you can't do that and end the game. After you make your move the AI will make a move and will follow the same conditions as you had to follow. The thing is with the AI is that it is in a while loop with a boolean so that it won't pick the same spot twice. Than at the end of the turn i have another method to check whether anyone has won yet and if not the while loop will continue until the variable turns = 10 or when the variable ticTacToeWin = true.</p>
<p></p>
<h2>Reflections</h2>
<p>Overall this project was a difficult due to not being in class everyday like usual, but it felt like a real learning experience for both coding and learning how to individually force myself to learn new thing I might've not been able to. Another good thing was the research for the new array lists I used which was a fun experience to try out for the first time. I would definitely want to expand on this project in my free time and i'm glad that I got to do this as a final project for CSA!</p>

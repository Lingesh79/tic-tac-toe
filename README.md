# tic-tac-toe
A classic tic tac toe game implemented in java with proper gui

Introduction 

The goal of the project is to implement TIC-TAC-TOE game. The game is represented by using GUI (Graphical User Interface). The game that is implemented has two modes single player mode and double player mode. Both the game modes single player mode and double player mode are implemented. In the single player mode user is supposed to play against computer. The moves that are to be made by the computer are also programmed. The moves made by the computer are designed in such a way that game results in a tie or computer wins the game.

Implementation 

•	JFrame : This is used to create a new window in which we implement the game.

•	JButton : This is used to create buttons which forms the grid blocks to play game.

•	ActionListener(this) : This is used to listen to action performed on button and if action performed on button (i.e.; on click of button) the actionPerformed() is triggered. 

•	actionPerformed(ActionEvent a) : This function is used to perform the required steps on occurrence of event(i.e.; to set the appropriate value for the button on which action is performed.

•	JOptionPane.showMessageDialog(framename, message) :  This function is used to create a dialog box which displays the required result (i.e.; to set whether X has won or O has won or game is drawn).

•	We use the above mentioned function to maintain a GUI based solution for both single and double player implementations of TIC-TAC-TOE.

•	We also use setText(), getText(), setBackground(), setFont(new Font(font attributes)), add(), and setSize(new Dimension(dimension attributes)) which are in-built functions of JFrame and JButton.

MINIMAX Algorithm

•	Minimax (sometimes MinMax or MM) is a decision rule used in artificial intelligence, decision theory, game theory, statistics and philosophy for minimizing the possible loss for a worst case (maximum loss) scenario.

•	When dealing with gains, it is referred to as "maximin"—to maximize the minimum gain.

•	Originally formulated for two-player game theory, covering both the cases where players take alternate moves and those where they make simultaneous moves, it has also been extended to more complex games and to general decision-making in the presence of uncertainty.

•	The Minimax is least effective in success rate but quicker than other algorithms like Expectimax and Alpha-Beta pruning which are much more efficient than the Minimax.

•	Time complexity of Minimax is O(n^d). 
n - Number of Moves in Game.
d – Depth of Search in the Game.


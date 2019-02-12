public class game_of_life {
    public static void gameOfLife(int[][] board) {
        int row = board.length, col = board[0].length;
        for(int i=0; i< row; i++){
            for(int j=0; j<col; j++){
                //count live neighbors
                int lives = getLives(board,i,j);
                //update cell
                if((board[i][j] & 1) == 1){
                    if(lives < 2 || lives > 3) board[i][j] = 1;
                    else board[i][j] = 3;
                }else{
                    if(lives == 3) board[i][j] = 2;
                    else board[i][j] = 0;
                }
            }
        }

        //get final result
        for(int i=0; i< row; i++){
            for(int j=0; j<col; j++){
                board[i][j] >>= 1;
            }
        }
    }

    public static int getLives(int[][] board, int i, int j){
        int lives = 0;
        for(int r=i-1;r<=i+1; r++){
            if(r<0 ||r>= board.length) continue;
            for(int c=j-1; c<=j+1; c++){
                if(r==i && c==j) continue;
                if(c<0 ||c>= board[0].length) continue;
                if((board[r][c] & 1) == 1) lives++;
            }
        }
        return lives;
    }

    public static void main(String[] args) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
    }
}

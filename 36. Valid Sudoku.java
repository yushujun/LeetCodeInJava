public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        for(int i = 0;i < len;i++){
            for(int j = 0;j < len;j++){
                char val = board[i][j];
                if(val == '.') continue;
                for(int k = i-1;k >= 0;k--)
                    if(board[k][j] == val) return false;
                for(int k = i+1;k < len;k++)
                    if(board[k][j] == val) return false;
                for(int l = j-1;l >= 0;l--)
                    if(board[i][l] == val) return false;
                for(int l = j+1;l < len;l++)
                    if(board[i][l] == val) return false;
                int row = i/3;
                int col = j/3;
                for(int x = 3*row;x<=3*row+2;x++){
                    for(int y = 3*col;y<=3*col+2;y++){
                        if(x == i && y == j) continue;
                        if(board[x][y] == board[i][j]) return false;
                    }
                }
            }
        }
        return true;
    }
}
time complexity:O(n^2)
space complexity:O(1)

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0;i < board.length;i++){
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();
            Set<Character> cube = new HashSet<>();
            for(int j = 0;j < board[0].length;j++){
                if(board[i][j] != '.' && !row.add(board[i][j])) return false;
                if(board[j][i] != '.' && !col.add(board[j][i])) return false;
                int rowIndex = (i/3)*3,colIndex = (i%3)*3;
                if(board[rowIndex+j/3][colIndex+j%3] != '.' && !cube.add(board[rowIndex+j/3][colIndex+j%3])) return false;
            }
        }
        return true;
    }
}
time complexity:O(n)
space complexity:O(1)

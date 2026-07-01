class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board.length % 3 != 0 || board[0].length % 3 != 0) return false;
        HashSet<Character> hashSet = new HashSet<>();
        // Check Rows
        for (char[] chars : board) {
            for (int j = 0; j < board[0].length; j++) {
                if (chars[j] == '.') continue;
                if (hashSet.contains(chars[j])) {
                    return false;
                }
                hashSet.add(chars[j]);
            }
            hashSet.clear();
        }

        // Check Columns
for (int i = 0; i < board[0].length; i++) {
    hashSet.clear();
    for (int j = 0; j < board.length; j++) {
        if (board[j][i] == '.') continue;
        if (!hashSet.add(board[j][i])) {
            return false;
        }
    }
}
        for (int row = 0; row < board.length; row+=3) {
            for (int col = 0; col < board[0].length; col+=3) {
                hashSet.clear();
                for (int k = row; k < row+3; k++) {
                    for (int l = col; l < col+3; l++) {
                        if (board[k][l] == '.') continue;
                        if (!hashSet.add(board[k][l])) return false;
                    }
                }
            }
        }
        return true;
    }
}

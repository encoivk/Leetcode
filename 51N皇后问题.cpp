class Solution {
public:
set<int>columnSet;
set<int>diagonalSet01;//左对角线
set<int>diagonalSet02;//右对角线
vector<int>queens;//下标为row-1
vector<vector<string>>result;

void backtrack(int N,int row) {
    if(row>N) {
        vector<string> board;
        for (int i = 0; i < N; i++) {
            string rowString = string(N, '.');
            rowString[queens[i]-1] = 'Q';
            board.push_back(rowString);
        }
        result.push_back(board);
        return;
        }
        for(int column=1;column<=N;column++)
        {
            bool inCol=columnSet.find(column)==columnSet.end();
            bool inDia01=diagonalSet01.find(row-column)==diagonalSet01.end();
            bool inDia02=diagonalSet02.find(row+column)==diagonalSet02.end();
            if(inCol&&inDia01&&inDia02) {
                columnSet.insert(column);
                diagonalSet01.insert(row-column);
                diagonalSet02.insert(row+column);
                queens.push_back(column);
                backtrack(N,row+1);
            }
            else {
                continue;
            }
            columnSet.erase(column);
            diagonalSet01.erase(row-column);
            diagonalSet02.erase(row+column);
            queens.pop_back();
        }
    }

vector<vector<string>> solveNQueens(int n) {
    backtrack(n,1);
    return result;
}
};
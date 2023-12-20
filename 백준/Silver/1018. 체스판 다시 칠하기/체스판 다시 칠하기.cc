#include <iostream>
#include <algorithm>
#include <string>

using namespace std;

string board[50];

string WB[8] = {
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW"
};
string BW[8] = {
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB",
        "BWBWBWBW",
        "WBWBWBWB"
};

int WB_cnt(int x, int y) {
    int cnt = 0;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (board[x + i][y + j] != WB[i][j])
                cnt++;
        }
    }

    return cnt;
}

int BW_cnt(int x, int y) {
    int cnt = 0;

    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (board[x + i][y + j] != BW[i][j])
                cnt++;
        }
    }

    return cnt;
}

int main()
{	
    int n, m;
    cin >> n >> m;
    cin.ignore();

    for (int i = 0; i < n; i++) {
        getline(cin, board[i]);
    }

    int minVal = 64;

    for (int i = 0; i + 8 <= n; i++) {
        for (int j = 0; j + 8 <= m; j++) {
            int temp = min(WB_cnt(i, j), BW_cnt(i, j));
            if (temp < minVal) minVal = temp;
        }
    }

    cout << minVal;

	return 0;
}
#include <iostream>

using namespace std;

int main()
{	
	int t;
	cin >> t;

	for (int i = 0; i < t; i++) {
		int money;
		cin >> money;

		int qCnt = money / 25;
		money %= 25;
		int dCnt = money / 10;
		money %= 10;
		int nCnt = money / 5;
		money %= 5;
		int pCnt = money / 1;

		cout << qCnt << " " << dCnt << " "
			<< nCnt << " " << pCnt << "\n";
	}

	return 0;
}
#include <iostream>
using namespace std;

int main()
{	
	int x, y, w, h;

	cin >> x >> y >> w >> h;

	int minNum = min(x, w - x);
	int minNum2 = min(y, h - y);

	cout << min(minNum, minNum2);
	
	return 0;
}
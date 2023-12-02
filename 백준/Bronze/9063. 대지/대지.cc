#include <iostream>
#include <cmath>
using namespace std;

int main()
{	
	int n;
	int minX, maxX, minY, maxY;

	cin >> n;
	
	for (int i = 0; i < n; i++) {
		int x, y;
		cin >> x >> y;

		if (i == 0) {
			minX = x, maxX = x;
			minY = y, maxY = y;
		}
		else {
			minX = min(minX, x);
			maxX = max(maxX, x);

			minY = min(minY, y);
			maxY = max(maxY, y);
		}
	}

	cout << (maxX - minX) * (maxY - minY);

	
	return 0;
}
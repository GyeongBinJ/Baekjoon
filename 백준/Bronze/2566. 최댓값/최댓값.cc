#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	int max = -1;
	int x, y, n;

	for (int i = 0; i < 9; i++) {
		for (int j = 0; j < 9; j++) {
			cin >> n;

			if (n > max) {
				max = n;
				x = i + 1;
				y = j + 1;
			}
		}
	}

	cout << max << "\n";
	cout << x << " " << y;

	return 0;
}
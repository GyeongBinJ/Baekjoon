#include <iostream>

using namespace std;

int main()
{
	int h, m, c;

	cin >> h >> m;
	cin >> c;

	int time = m + c;

	if (time >= 60) {
		h = h + (time / 60);
		time = time - 60 * (time / 60);

		if (h >= 24)
			h -= 24;
	}

	cout << h << " " << time;
	return 0;
}
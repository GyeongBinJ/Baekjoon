#include <iostream>

using namespace std;

int main()
{	
	int n;
	int cnt = 1;
	int range = 2;

	cin >> n;

	if (n == 1) {
		cout << 1;
	}
	else {
		while (range <= n) {
			range = range + (cnt * 6);
			cnt++;
		}
		cout << cnt;
	}

	return 0;
}
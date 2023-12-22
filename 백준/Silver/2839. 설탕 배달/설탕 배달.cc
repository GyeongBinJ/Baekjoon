#include <iostream>

using namespace std;

int main()
{	
	int n;
	cin >> n;

	int cnt = 0;

	while (1) {
		if (n % 5 == 0) {
			cnt += n / 5;
			cout << cnt;
			break;
		}
		else {
			n -= 3;
			cnt++;
		}

		if (n < 0) {
			cout << -1;
			break;
		}
	}

	return 0;
}
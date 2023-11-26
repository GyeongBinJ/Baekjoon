#include <iostream>
#include <cmath>
using namespace std;

int main()
{	
	int m, n;
	
	cin >> m >> n;

	int sum = 0;
	int minNum = n;

	for (int i = m; i <= n; i++) {
		bool isPrime = 1;

		if (i == 1) continue;

		for (int j = 2; j <= sqrt(i); j++) {
			if (i % j == 0) {
				isPrime = 0;
				break;
			}
		}

		if (isPrime) {
			sum += i;

			if (minNum > i) minNum = i;
		}
	}

	if (sum == 0) {
		cout << -1;
	}
	else {
		cout << sum << "\n" << minNum;
	}
	
	return 0;
}
#include <iostream>
#include <cmath>
using namespace std;

int main()
{	
	int n;
	cin >> n;

	int cnt = 0;

	for (int i = 0; i < n; i++) {
		int num;
		cin >> num;
		bool isPrime = true;

		if (num == 1) continue;

		for (int j = 2; j <= sqrt(num); j++) {
			if (num % j == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime) cnt++;
	}
	cout << cnt;
	return 0;
}
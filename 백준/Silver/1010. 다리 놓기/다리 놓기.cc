#include <iostream>

using namespace std;

int main()
{	
	int t;
	cin >> t;

	for (int i = 0; i < t; i++) {
		int n, m;
		cin >> n >> m;
		int result = 1, temp = 1;

		for (int j = m; j > m - n; j--) {
			result = result * j;
			result = result / temp++;
		}

		cout << result << "\n";
	}

	return 0;
} 
#include <iostream>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n;

	cin >> n;

	int result = 1;

	for (int i = 0; i < n; i++) {
		result *= 2;
	}

	cout << result;

	return 0;
}
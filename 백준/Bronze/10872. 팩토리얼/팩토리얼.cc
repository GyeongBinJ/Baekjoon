#include <iostream>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int n;
	int arr[13];

	cin >> n;

	for (int i = 0; i < 13; i++) {
		arr[i] = i + 1;
	}

	int result = 1;

	for (int i = 0; i < n; i++) {
		result *= arr[i];
	}

	cout << result;

	return 0;
}
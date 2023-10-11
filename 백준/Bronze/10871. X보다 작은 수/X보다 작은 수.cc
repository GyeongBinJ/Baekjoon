#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int n, x;

	cin >> n >> x;

	int arr[10000];

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	for (int i = 0; i < n; i++) {
		if (x > arr[i])
			cout << arr[i] << " ";
	}
		
	return 0;
}
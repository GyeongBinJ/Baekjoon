#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);

	int n, m;

	cin >> n >> m;

	int arr[100];

	for (int i = 1; i <= n; i++) {
		arr[i] = i;
	}

	int a, b;

	while (m--) {
		cin >> a >> b;

		for (int i = 0; i <= (b - a) / 2; i++) {
			swap(arr[a + i], arr[b - i]);
		}
	}

	for (int i = 1; i <= n; i++) {
		cout << arr[i] << " ";
	}

	return 0;
}
#include <iostream>
#include <algorithm>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, m;
	cin >> n;

	int *arr = new int[n];

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	sort(arr, arr + n);

	cin >> m;

	int num;
	for (int i = 0; i < m; i++) {
		cin >> num;

		// 이분 탐색, 리턴 타입 bool
		if (binary_search(arr, arr + n, num)) {
			cout << 1 << " ";
		}
		else {
			cout << 0 << " ";
		}
	}

	delete[] arr;

	return 0;
}
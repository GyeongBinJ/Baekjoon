#include <iostream>
#include <algorithm>

using namespace std;

int main()
{	
	int n, k;

	cin >> n >> k;

	int arr[1000] = { 0, };

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	// 내림차순 정렬
	sort(arr, arr + n, greater<int>());

	cout << arr[k - 1];

	return 0;
}
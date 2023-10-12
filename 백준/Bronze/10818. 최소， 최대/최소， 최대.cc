#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);

	int n;
	cin >> n;

	int arr[1000001];


	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}
	
	// sort 오름차순 정렬 sort(배열의 시작 주소, 배열의 마지막 주소)
	sort(arr, arr + n);

	cout << arr[0] << " " << arr[n - 1];

	return 0;
}
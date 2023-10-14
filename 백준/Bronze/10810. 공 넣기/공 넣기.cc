#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);

	int arr[101] = { 0, };

	int n, m;
	int start, end, val;

	cin >> n >> m;

	for (int i = 0; i < m; i++) {

		cin >> start >> end >> val;

		for (int j = start; j <= end; j++)
			arr[j] = val;
	}

	for (int i = 1; i <= n; i++) {
		cout << arr[i] << " ";
	}

	return 0;
}
#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);

	int n;

	cin >> n;

	double arr[1000];

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	double max = arr[0];

	for (int i = 1; i < n; i++) {
		if (max < arr[i])
			max = arr[i];
	}

	for (int i = 0; i < n; i++) {
		arr[i] = arr[i] / max * 100;
	}

	double sum = 0;

	for (int i = 0; i < n; i++) {
		sum += arr[i];
	}

	cout << sum / n << "";

	return 0;
}
#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);

	int arr[30];
	int arr2[28];

	for (int i = 0; i < 28; i++) {
		cin >> arr2[i];
	}

	for (int i = 0; i < 30; i++) {
		arr[i] = i + 1;
	}

	for (int i = 0; i < 30; i++) {
		for (int j = 0; j < 28; j++) {
			if (arr[i] == arr2[j])
				arr[i] = 0;
		}
	}

	for (int i = 0; i < 30; i++) {
		if (arr[i] != 0)
			cout << arr[i] << "\n";
	}

	return 0;
}
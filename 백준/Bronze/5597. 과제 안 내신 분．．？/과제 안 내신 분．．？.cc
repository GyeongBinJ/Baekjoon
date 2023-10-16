#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);

	int arr[31] = { 0, };
	int num;

	for (int i = 0; i < 28; i++) {
		cin >> num;
		arr[num] = 1;
	}

	for (int i = 1; i <= 30; i++) {
		if (!arr[i])
			cout << i << "\n";
	}

	return 0;
}
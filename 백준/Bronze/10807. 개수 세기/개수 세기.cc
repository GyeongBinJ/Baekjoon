#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	int num, v;
	cin >> num;

	int arr[101];

	for (int i = 0; i < num; i++) {
		cin >> arr[i];
	}

	int count = 0;
	cin >> v;

	for (int i = 0; i < num; i++) {
		if (arr[i] == v)
			count++;
	}

	cout << count;
		
	return 0;
}
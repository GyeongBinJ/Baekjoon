#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	string str;
	cin >> str;

	int arr[26] = { 0 };

	for (int i = 0; i < str.length(); i++) {
		if (str[i] < 97) arr[str[i] - 65]++;
		else arr[str[i] - 97]++;
	}

	int count = 0, max = 0;
	int index = 0;

	for (int i = 0; i < 26; i++) {
		if (max < arr[i]) {
			max = arr[i];
			index = i;
		}
	}

	for (int i = 0; i < 26; i++) {
		if (max == arr[i]) count++;
	}

	if (count > 1) cout << '?';
	else cout << (char)(index + 65);

	return 0;
}
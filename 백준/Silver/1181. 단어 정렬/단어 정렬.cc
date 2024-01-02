#include <iostream>
#include <algorithm>

using namespace std;

bool comp(string a, string b) {
	if (a.length() != b.length()) {
		return a.length() < b.length();
	}
	else {
		return a < b;
	}
}

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	cin >> n;

	string arr[20001];

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	sort(arr, arr + n, comp);

	for (int i = 0; i < n; i++) {
		if (arr[i] == arr[i - 1]) continue;
		cout << arr[i] << "\n";
	}

	return 0;
}
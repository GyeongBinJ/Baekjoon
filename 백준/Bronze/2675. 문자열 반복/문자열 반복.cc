#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	int t, r;
	string str;
	cin >> t;

	for (int i = 0; i < t; i++) {
		cin >> r >> str;

		for (int j = 0; j < str.length(); j++) {
			for (int k = 0; k < r; k++) {
				cout << str[j];
			}
		}

		cout << "\n";
	}

	return 0;
}
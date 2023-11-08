#include <iostream>
#include <string>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	int n;
	cin >> n;
	string str;

	int cnt = 0;
	
	for (int i = 0; i < n; i++) {
		cin >> str;
		
		bool alphabet[26] = { false };
		bool isGroupWord = true;

		for (int j = 0; j < str.length(); j++) {
			char ch = str[j];
			int index = ch - 'a';

			if (j > 0 && ch != str[j - 1] && alphabet[index]) {
				isGroupWord = false;
				break;
			}
			alphabet[index] = true;
		}

		if (isGroupWord) cnt++;
	}

	cout << cnt;

	return 0;
}
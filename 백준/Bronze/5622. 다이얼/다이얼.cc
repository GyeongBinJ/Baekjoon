#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	string str;
	int count = 0;

	cin >> str;

	for (int i = 0; i < str.length(); i++) {
		switch (str[i]) {
		case 'A': case 'B': case 'C': count += 3;
			break;
		case 'D': case 'E': case 'F': count += 4;
			break;
		case 'G': case 'H': case 'I': count += 5;
			break;
		case 'J': case 'K': case 'L': count += 6;
			break;
		case 'M': case 'N': case 'O': count += 7;
			break;
		case 'P': case 'Q': case 'R': case 'S': count += 8;
			break;
		case 'T': case 'U': case 'V': count += 9;
			break;
		case 'W': case 'X': case 'Y': case 'Z': count += 10;
			break;
		}
	}

	cout << count;
	return 0;
}
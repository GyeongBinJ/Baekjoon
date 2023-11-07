#include <iostream>
#include <string>
#include <vector>

using namespace std;

vector<string> croatian{ "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	int index;
	string str;
	cin >> str;

	for (int i = 0; i < croatian.size(); i++) {
		while (true) {
			index = str.find(croatian[i]);

			if (index == string::npos) break;
			str.replace(index, croatian[i].length(), "#");
		}
	}

	cout << str.length();

	return 0;
}
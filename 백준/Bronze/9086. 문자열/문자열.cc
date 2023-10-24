#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	int num;
	string str;

	cin >> num;

	for (int i = 0; i < num; i++) {
		cin >> str;
		cout << str.at(0) << str.at(str.length() - 1) << "\n";

	}

	return 0;
}
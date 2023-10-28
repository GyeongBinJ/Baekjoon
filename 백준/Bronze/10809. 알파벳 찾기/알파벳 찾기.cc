#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	string str;
	cin >> str;

	for (char ch = 'a'; ch <= 'z'; ch++) {
		cout << (int)str.find(ch) << " ";
	}

	return 0;
}
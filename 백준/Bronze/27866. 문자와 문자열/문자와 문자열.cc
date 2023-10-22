#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	string str;
	int i;

	cin >> str;
	cin >> i;

	cout << str.at(i - 1);

	return 0;
}
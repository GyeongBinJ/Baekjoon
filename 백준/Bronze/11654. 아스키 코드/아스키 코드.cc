#include <iostream>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	char ch;

	cin >> ch;
	cout << (int)ch;

	return 0;
}
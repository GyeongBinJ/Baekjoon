#include <iostream>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	int num;
	char ch;
	
	cin >> num;

	int sum = 0;

	for (int i = 0; i < num; i++) {
		cin >> ch;
		sum += (ch - '0');
	}

	cout << sum;

	return 0;
}
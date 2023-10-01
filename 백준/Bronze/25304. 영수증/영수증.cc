#include <iostream>

using namespace std;

int main()
{
	int price, n;
	cin >> price;
	cin >> n;

	int sum = 0;
	for (int i = 0; i < n; i++) {
		int a, b;
		cin >> a >> b;

		sum += a * b;
	}

	if (price == sum)
		cout << "Yes";
	else
		cout << "No";

	return 0;
}
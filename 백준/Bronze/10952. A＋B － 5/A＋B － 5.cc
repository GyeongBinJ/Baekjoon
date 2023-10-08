#include <iostream>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(0);

	int a, b;

	int sum = 1;

	while (sum != 0) {
		cin >> a >> b;
		sum = a + b;
		if (sum != 0) {
			cout << sum << "\n";
			}
	}
		

	return 0;
}
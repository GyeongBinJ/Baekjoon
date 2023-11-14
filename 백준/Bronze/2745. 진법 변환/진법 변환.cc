#include <iostream>
using namespace std;

int main()
{	
	string n;
	int b, sum = 0;

	cin >> n >> b;

	for (int i = 0; i < n.length(); i++) {
		if (n[i] >= '0' && n[i] <= '9') {
			sum = sum * b + (n[i] - '0');
		}
		else {
			sum = sum * b + (n[i] - 'A' + 10);
		}
	}

	cout << sum;
	return 0;
}
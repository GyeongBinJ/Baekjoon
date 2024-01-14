#include <iostream>
#include <algorithm>

using namespace std;

int gcd(int a, int b)
{
	if (b == 0) return a;
	else return gcd(b, a % b);
}

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int t;
	int a, b, num;

	cin >> t;

	for (int i = 0; i < t; i++) {
		cin >> a >> b;

		num = (a * b) / gcd(a, b);
		cout << num << "\n";
	}


	return 0;
}
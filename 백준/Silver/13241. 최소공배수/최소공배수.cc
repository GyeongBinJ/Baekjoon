#include <iostream>
#include <algorithm>

using namespace std;

int gcd(int a, int b)
{
	while (b != 0) {
		long r = a % b;

		a = b;
		b = r;
	}
	return a;
}

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	long a, b;
	cin >> a >> b;

	long n = gcd(a, b);

	cout << (a * b / n);

	return 0;
}
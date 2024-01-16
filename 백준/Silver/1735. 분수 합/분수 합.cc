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

void reFrac(int a, int b)
{
	int num = gcd(a, b);

	int reNum = a / num;
	int reDeno = b / num;

	cout << reNum << " " << reDeno;
}

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);
	
	int a, b, c, d;

	cin >> a >> b;
	cin >> c >> d;

	int num = a * d + b * c;
	int deno = b * d;

	reFrac(num, deno);

	return 0;
}
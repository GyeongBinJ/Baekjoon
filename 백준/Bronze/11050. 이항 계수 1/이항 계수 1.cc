#include <iostream>
using namespace std;

int factorial(int n)
{
	if (n <= 0)
		return 1;
	return n * factorial(n - 1);
}

int main()
{	
	int n, k;
	cin >> n >> k;

	cout << factorial(n) / (factorial(n - k) * factorial(k));

	return 0;
}
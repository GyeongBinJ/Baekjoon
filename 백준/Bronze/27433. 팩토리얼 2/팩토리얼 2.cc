#include <iostream>

using namespace std;

long factorial(int n)
{
	if (n <= 1) {
		return 1;
	}
	else {
		return factorial(n - 1) * n;
	}
}

int main()
{	
	ios::sync_with_stdio(false); cin.tie(nullptr);

	int n;
	cin >> n;

	cout << factorial(n);
	
	return 0;
} 
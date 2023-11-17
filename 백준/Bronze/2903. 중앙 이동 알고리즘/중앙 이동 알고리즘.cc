#include <iostream>
#include <cmath>

using namespace std;

int main()
{	
	int n;
	int point = 2;

	cin >> n;

	for (int i = 0; i < n; i++) {
		point += (int)pow(2, i);
	}

	cout << (int)pow(point, 2);
	
	return 0;
}
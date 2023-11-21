#include <iostream>

using namespace std;

int main()
{	
	int a, b, v;
	
	cin >> a >> b >> v;

	int distancePerDay = a - b;
	int cnt = (v - a) / distancePerDay + 1;

	if ((v - a) % distancePerDay != 0) cnt++;

	cout << cnt;

	return 0;
}
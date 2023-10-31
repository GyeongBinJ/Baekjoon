#include <iostream>
#include <string>
using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cout.tie(0);

	string a, b, reA, reB;

	cin >> a >> b;

	for (int i = 2; i >= 0; i--) {
		reA += a[i];
		reB += b[i];
	}

	cout << max(reA, reB);
	return 0;
}
#include <iostream>

using namespace std;

int main()
{	
	int n;
	cin >> n;

	int cnt = 1, sum = 0;

	while (true)
	{
		if (n <= cnt + sum) {
			if (cnt % 2 == 1) {
				cout << (cnt - (n - sum - 1)) << "/" << (n - sum);
				break;
			}
			else {
				cout << (n - sum) << "/" << (cnt - (n - sum - 1));
				break;
			}
		}
		else {
			sum += cnt;
			cnt++;
		}
	}

	return 0;
}
#include <iostream>
#include <algorithm>
#include <map>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, m;
	map<int, bool> map;

	cin >> n >> m;

	int num;

	for (int i = 0; i < n + m; i++) {
		cin >> num;

		if (map[num] == true) {
			map.erase(num);
		}
		else {
			map[num] = true;
		}
	}

	cout << map.size();

	return 0;
}
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;
vector<pair<int, int>> vec;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	cin >> n;

	int x, y;

	for (int i = 0; i < n; i++) {
		cin >> x >> y;
		vec.push_back({ x, y });
	}

	sort(vec.begin(), vec.end());

	for (int i = 0; i < n; i++) {
		cout << vec[i].first << " " << vec[i].second << "\n";
	}

	return 0;
}
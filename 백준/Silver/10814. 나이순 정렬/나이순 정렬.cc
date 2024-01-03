#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

vector<pair<int, string>> vec;

bool comp(const pair<int, string>& a, const pair<int, string>& b) {
	return a.first < b.first;
}

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n;
	cin >> n;

	int x;
	string str;

	for (int i = 0; i < n; i++) {
		cin >> x >> str;
		vec.push_back({ x, str });
	}

	stable_sort(vec.begin(), vec.end(), comp);

	for (int i = 0; i < n; i++) {
		cout << vec[i].first << " " << vec[i].second << "\n";
	}
	

	return 0;
}
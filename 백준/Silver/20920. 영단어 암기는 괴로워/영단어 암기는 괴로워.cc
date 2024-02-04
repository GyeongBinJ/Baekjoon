#include <iostream>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

bool compare(pair<int, string>& a, pair<int, string>& b)
{
	if (a.first == b.first) {
		if (a.second.length() == b.second.length()) {
			return a.second < b.second;
		}
		else {
			return a.second.length() > b.second.length();
		}
	}
	else {
		return a.first > b.first;
	}
}

int main()
{	
	ios::sync_with_stdio(false); cin.tie(nullptr);

	int n, m;
	map<string, int> wordCnt;
	string str;

	cin >> n >> m;

	while (n-- > 0) {
		cin >> str;

		if (str.length() < m) continue;
		wordCnt[str]++;
	}

	vector<pair<int, string>> vec;
	for (auto w : wordCnt) {
		vec.push_back({ w.second, w.first });
	}

	sort(vec.begin(), vec.end(), compare);

	for (auto w : vec) {
		cout << w.second << "\n";
	}


	return 0;
} 
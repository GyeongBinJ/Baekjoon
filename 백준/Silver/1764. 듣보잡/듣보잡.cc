#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, m;

	cin >> n >> m;

	vector<string> name, result;
	string str;

	for (int i = 0; i < n; i++) {
		cin >> str;
		name.push_back(str);
	}

	sort(name.begin(), name.end());

	for (int i = 0; i < m; i++) {
		cin >> str;
		if (binary_search(name.begin(), name.end(), str))
			result.push_back(str);
	}

	sort(result.begin(), result.end());

	cout << result.size() << "\n";

	for (auto a : result) {
		cout << a << "\n";
	}
	

	return 0;
}
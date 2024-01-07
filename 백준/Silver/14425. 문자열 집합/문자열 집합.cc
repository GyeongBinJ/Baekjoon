#include <iostream>
#include <set>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int n, m;
	set<string> s;
	string nStr, mStr;

	cin >> n >> m;

	for (int i = 0; i < n; i++) {
		cin >> nStr;
		s.insert(nStr);
	}

	int cnt = 0;

	for (int i = 0; i < m; i++) {
		cin >> mStr;
		if (s.find(mStr) != s.end())
			cnt++;
	}

	cout << cnt;

	return 0;
}
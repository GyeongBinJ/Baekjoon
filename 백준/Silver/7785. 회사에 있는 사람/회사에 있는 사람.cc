#include <iostream>
#include <map>

using namespace std;

int main()
{	
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	map<string, string, greater<string>> m;
	int n;
	string name, stat;

	cin >> n;

	for (int i = 0; i < n; i++) {
		cin >> name >> stat;

		if (stat == "enter")
			m[name] = stat;
		else m.erase(name);
	}

	for (auto a : m) {
		cout << a.first << "\n";
	}

	return 0;
}